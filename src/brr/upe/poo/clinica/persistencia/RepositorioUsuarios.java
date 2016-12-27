
package brr.upe.poo.clinica.persistencia;

import brr.upe.poo.clinica.entidades.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manoel
 */
public class RepositorioUsuarios implements InterfaceRepositorioUsuarios{
 
        private Connection conexao;
	private PreparedStatement stm;
        private ResultSet rs;
        
          public RepositorioUsuarios() {
              
          }
        
    @Override
    public void cadastrarUsuario(Usuarios usuario) {
        this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
        try{
          String sql = "insert into usuarios"+"(nome,cpf,senha,tipo_usuario)"+"values(?,?,?,?)";
	
            this.stm=conexao.prepareStatement(sql);
     this.stm.setString(1,((Usuarios) usuario).getNome());
     this.stm.setString(2,((Usuarios) usuario).getCpf());
     this.stm.setString(3,((Usuarios) usuario).getSenha());
     this.stm.setString(4,((Usuarios) usuario).getTipoUsuario());
         
        this.stm.execute();        
        this.stm.close();
        this.conexao.close();
        
        }catch(SQLException e) {
          try {
              throw new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioUsuarios.class.getName()).log(Level.SEVERE, null, ex);
          }
        }        
     
    }

    @Override
    public Usuarios buscarUsuarioSenhaNome(String senha,String nome) {
        this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
       Usuarios usuario = new Usuarios();
        try{	    	 
	  String sql = "select * from usuarios";	    	
	    this.stm = conexao.prepareStatement(sql);
	        this.rs = stm.executeQuery();
       		    while(this.rs.next()){	 				
	 		if(senha.equals(this.rs.getString("senha"))){
                             if(nome.equals(this.rs.getString("nome"))) {
	 		        usuario.setNome(this.rs.getString("nome"));
	         		usuario.setSenha(this.rs.getString("senha"));
	 			usuario.setCpf(this.rs.getString("cpf"));
	 			usuario.setTipoUsuario(this.rs.getString("tipo_usuario"));
                        }
                        }
	 					 				
	 			}
	 			this.stm.close();
	 			this.rs.close();
                                this.conexao.close();
        }catch(SQLException e) {
          try {
              throw  new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioUsuarios.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
          
        return usuario;
    }
    
    @Override
    public Usuarios filtrarUsuarioCpf(String cpf) {
       this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
        Usuarios usuario = new Usuarios();
         try{	    	 
	  String sql = "select * from usuarios";	    	
	    this.stm = conexao.prepareStatement(sql);
	        this.rs = stm.executeQuery();
       		    while(this.rs.next()){	 				
	 		if(cpf.equals(this.rs.getString("cpf"))){	 
                                usuario.setNome(this.rs.getString("nome"));
	         		usuario.setSenha(this.rs.getString("senha"));
	 			usuario.setCpf(this.rs.getString("cpf"));
	 			usuario.setTipoUsuario(this.rs.getString("tipo_usuario"));        
                                   }
                    }
                                this.stm.close();
	 			this.rs.close();
                                this.conexao.close();
        }catch(SQLException e) {
          try {
              throw  new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioUsuarios.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
          
        return usuario;
    }

    @Override
    public void atualizarUsuario(Usuarios usuario) {
       this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
         try{
	    String sql = "update usuarios set nome=?,"+"senha=?,"+"tipo_usuario=?"+"where cpf=?";
	       this.stm = conexao.prepareStatement(sql);
               
               this.stm=conexao.prepareStatement(sql);
     this.stm.setString(1,((Usuarios) usuario).getNome());    
     this.stm.setString(2,((Usuarios) usuario).getSenha());
     this.stm.setString(3,((Usuarios) usuario).getTipoUsuario());
     this.stm.setString(4,((Usuarios) usuario).getCpf());
         
        this.stm.execute();        
        this.stm.close();
        this.conexao.close();
        
        }catch(SQLException e) {
          try {
              throw new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioUsuarios.class.getName()).log(Level.SEVERE, null, ex);
          }
        }        
     
       
    }

    @Override
    public void deletarUsuario(Usuarios usuario) {
        this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica"); 
         try{
	    	String sql = "select * from usuarios";	
		 	this.stm = conexao.prepareStatement(sql);
		 	 this.rs=stm.executeQuery();		 	
		 	  while(this.rs.next()){		  		
	    	            if(usuario.getCpf().equals(this.rs.getString("cpf"))){	    			    
	    	                String sqlexcluir = "delete from usuarios where cpf =?" ;	    	
	    	                  this.stm = conexao.prepareStatement(sqlexcluir);				
	    	                          this.stm.setString(1,usuario.getCpf());
			                    this.stm.execute();
                             }
                          }
	    	                               this.stm.close();
		 	                          this.rs.close();
                          
                          this.conexao.close();
         }catch(SQLException e) {
           try {
               throw new Exception(e.getMessage());
           } catch (Exception ex) {
               Logger.getLogger(RepositorioUsuarios.class.getName()).log(Level.SEVERE, null, ex);
           }

         }
	
    }
    
}
