
package br.upe.poo.clinica.persistencia;

import br.upe.poo.clinica.entidades.Usuarios;

/**
 *
 * @author manoel
 */
public interface InterfaceRepositorioUsuarios {
   
    public void cadastrarUsuario(Usuarios usuario);
    
    public Usuarios buscarUsuarioSenhaNome(String senha,String nome);
}
