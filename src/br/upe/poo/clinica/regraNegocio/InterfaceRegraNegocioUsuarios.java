
package br.upe.poo.clinica.regraNegocio;

import br.upe.poo.clinica.entidades.Usuarios;

/**
 *
 * @author manoel
 */
public interface InterfaceRegraNegocioUsuarios {
    
    public void cadastrarUsuario(Usuarios usuario)throws ExceptionRegraNegocioCadastrarUsuarios;
    
    public Usuarios buscarUsuarioSenhaNome(String senha,String nome)throws ExceptionRegraNegociofiltrarUsuarios;
    
    public void atualizarUsuario(Usuarios usuario)throws ExceptionRegraNegocioAtualizarUsuarios;
    
    public void deletarUsuario(Usuarios usuario)throws ExceptionRegraNegocioDeletarUsuarios;
}
