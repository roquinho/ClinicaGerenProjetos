
package brr.upe.poo.clinica.persistencia;

import brr.upe.poo.clinica.entidades.Usuarios;

/**
 *
 * @author manoel
 */
public interface InterfaceRepositorioUsuarios {
   
    public void cadastrarUsuario(Usuarios usuario);
    
    public Usuarios buscarUsuarioSenhaNome(String senha,String nome);
    
    public Usuarios filtrarUsuarioCpf(String cpf);
    
    public void atualizarUsuario(Usuarios usuario);
    
    public void deletarUsuario(Usuarios usuario);
}
