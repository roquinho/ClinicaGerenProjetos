
package brr.upe.poo.clinica.regraNegocio;

import brr.upe.poo.clinica.entidades.Usuarios;
import brr.upe.poo.clinica.persistencia.InterfaceRepositorioUsuarios;
import brr.upe.poo.clinica.persistencia.RepositorioUsuarios;

/**
 *
 * @author manoel
 */
public class RegraNegocioUsuarios implements InterfaceRegraNegocioUsuarios {

     private InterfaceRepositorioUsuarios ru;
     
     public RegraNegocioUsuarios() {
         this.ru = new RepositorioUsuarios();
     }
    @Override
    public void cadastrarUsuario(Usuarios usuario) throws ExceptionRegraNegocioCadastrarUsuarios {
       if(usuario == null) {
           throw new ExceptionRegraNegocioCadastrarUsuarios();
       }
       if(usuario.getCpf()==null) {
           throw new ExceptionRegraNegocioCadastrarUsuarios();
       }
       if(usuario.getSenha()==null) {
           throw new ExceptionRegraNegocioCadastrarUsuarios();
       }
       if(usuario.getTipoUsuario()==null) {
           throw new ExceptionRegraNegocioCadastrarUsuarios();
       }
       if(ru.filtrarUsuarioCpf(usuario.getCpf())!=null) {
           throw new ExceptionRegraNegocioCadastrarUsuarios();
       }
       else {
          ru.cadastrarUsuario(usuario);
       }
    }

    @Override
    public Usuarios buscarUsuarioSenhaNome(String senha, String nome) throws ExceptionRegraNegociofiltrarUsuarios {
        Usuarios usuario = new Usuarios();
        if(senha == null) {
            throw new ExceptionRegraNegociofiltrarUsuarios();
        }
        if(nome == null) {
            throw new ExceptionRegraNegociofiltrarUsuarios();
        }
        else {
           usuario = ru.buscarUsuarioSenhaNome(senha, nome);
        }
        return usuario;
    }
    @Override
    public Usuarios filtrarUsuarioCpf(String cpf) throws ExceptionRegraNegociofiltrarUsuarios {
       Usuarios usuario = new Usuarios();
         if(cpf == null) {
             throw new ExceptionRegraNegociofiltrarUsuarios();
         }
         else {
            usuario = ru.filtrarUsuarioCpf(cpf);
         }
         return usuario;
    }

    @Override
    public void atualizarUsuario(Usuarios usuario) throws ExceptionRegraNegocioAtualizarUsuarios {
        if(usuario == null) {
           throw new ExceptionRegraNegocioAtualizarUsuarios();
       }
       if(usuario.getCpf()==null) {
           throw new ExceptionRegraNegocioAtualizarUsuarios();
       }
       if(usuario.getSenha()==null) {
           throw new ExceptionRegraNegocioAtualizarUsuarios();
       }
       if(usuario.getTipoUsuario()==null) {
           throw new ExceptionRegraNegocioAtualizarUsuarios();
       }
       if(ru.filtrarUsuarioCpf(usuario.getCpf())==null) {
           throw new ExceptionRegraNegocioAtualizarUsuarios();
       }
       else {
          ru.atualizarUsuario(usuario);
       }
    }

    @Override
    public void deletarUsuario(Usuarios usuario) throws ExceptionRegraNegocioDeletarUsuarios {
        if(usuario == null) {
            throw new ExceptionRegraNegocioDeletarUsuarios();
        }
       if(ru.filtrarUsuarioCpf(usuario.getCpf())==null) {
           throw new ExceptionRegraNegocioDeletarUsuarios();
       }
        else {
            ru.deletarUsuario(usuario);
        }
    }


    
}
