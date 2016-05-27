
package br.upe.poo.clinica.persistencia;

import br.upe.poo.clinica.entidades.Medicos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manoel
 */
public class RepositorioMedicos implements InterfaceRepositorioMedicos {

        private Connection conexao;
	private PreparedStatement stm;
        private ResultSet rs;
        
    @Override
    public void cadastrarMedicos(Medicos medico) {
        this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
          try{
          String sql = "insert into medicos"+"(nome,telefone,endereco,cpf,crm,especialidade)"+"values(?,?,?,?,?,?)";
	
            this.stm=conexao.prepareStatement(sql);

     this.stm.setString(1,((Medicos) medico).getNome());
     this.stm.setString(2,((Medicos) medico).getTelefone());
     this.stm.setString(3,((Medicos) medico).getEndereco());
     this.stm.setLong(4,((Medicos) medico).getCpf());
     this.stm.setLong(5,((Medicos) medico).getCrm());
     this.stm.setString(6,((Medicos) medico).getEspecialidade());
     
        this.stm.execute();        
        this.stm.close();
        this.conexao.close();
        
        }catch(SQLException e) {
          try {
              throw new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioMedicos.class.getName()).log(Level.SEVERE, null, ex);
          }
        }        

    }

    @Override
    public Medicos buscarMedicoCpf(Long cpf) {
        this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
         Medicos medico = new Medicos();
        try{	    	 
	  String sql = "select * from medicos";	    	
	    this.stm = conexao.prepareStatement(sql);
	        this.rs = stm.executeQuery();
       		    while(this.rs.next()){	 				
	 		if(cpf.equals(this.rs.getLong("cpf"))){	 			
	 		        medico.setNome(this.rs.getString("nome"));
	         		medico.setEndereco(this.rs.getString("endereco"));
	 			medico.setCpf(this.rs.getLong("cpf"));
	 			medico.setTelefone(this.rs.getString("telefone"));
	 			medico.setCrm(this.rs.getLong("crm"));
                                medico.setEspecialidade(this.rs.getString("especialidade"));
	 				}
	 					 				
	 			}
	 			this.stm.close();
	 			this.rs.close();
                                this.conexao.close();
        }catch(SQLException e) {
          try {
              throw  new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioMedicos.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
          
        return medico;
    }

    @Override
    public List<Medicos> buscarMedicoNome(String nome) {
        this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
       List<Medicos>medicos = new ArrayList();
         try{	    	 
	  String sql = "select * from medicos where nome like ?";
          
        this.stm = conexao.prepareStatement(sql);
        this.stm.setString(1,'%'+ nome+'%');
        this.rs = stm.executeQuery();
                   
       		    while(this.rs.next()){
                        
                            Medicos medico = new Medicos();
	 		        medico.setNome(this.rs.getString("nome"));
	         		medico.setEndereco(this.rs.getString("endereco"));
	 			medico.setCpf(this.rs.getLong("cpf"));
	 			medico.setTelefone(this.rs.getString("telefone"));
	 			medico.setCrm(this.rs.getLong("crm"));
                                medico.setEspecialidade(this.rs.getString("especialidade"));
                                  medicos.add(medico);
	 				}	 					 				
	 			
	 			this.stm.close();
	 			this.rs.close();
                                this.conexao.close();
        }catch(SQLException e) {
          try {
              throw  new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioMedicos.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
         
         
        return medicos;
    }

    @Override
    public void atualizarMedico(Medicos medico) {
        this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
         try{
	    String sql = "update medicos set nome=?,"+"endereco=?,"+"crm=?,"+"telefone=?,"+"especialidade=? "+"where cpf=?";
	       this.stm = conexao.prepareStatement(sql);
               
	         this.stm.setString(1, medico.getNome());
	    	 this.stm.setString(2, medico.getEndereco());
	    	 this.stm.setLong(3, medico.getCrm());
	    	 this.stm.setString(4, medico.getTelefone());
                 this.stm.setString(5, medico.getEspecialidade());
	    	 this.stm.setLong(6, medico.getCpf());
	    			     
	    	    this.stm.execute();
	            this.stm.close();
                    this.conexao.close();
         }catch(SQLException e) {
           try {
               throw new Exception(e.getMessage());
           } catch (Exception ex) {
               Logger.getLogger(RepositorioMedicos.class.getName()).log(Level.SEVERE, null, ex);
           }
         }
	    	
    }

    @Override
    public void deletarMedico(Medicos medico) {
        this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica"); 
         try{
	    	String sql = "select * from medicos";	
		 	this.stm = conexao.prepareStatement(sql);
		 	 this.rs=stm.executeQuery();		 	
		 	  while(this.rs.next()){		  		
	    	            if(medico.getCpf().equals(this.rs.getLong("cpf"))){	    			    
	    	                String sqlexcluir = "delete from medicos where cpf =?" ;	    	
	    	                  this.stm = conexao.prepareStatement(sqlexcluir);				
	    	                          this.stm.setLong(1,medico.getCpf());
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
               Logger.getLogger(RepositorioMedicos.class.getName()).log(Level.SEVERE, null, ex);
           }

         }
    }

    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    public PreparedStatement getStm() {
        return stm;
    }

    public void setStm(PreparedStatement stm) {
        this.stm = stm;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
    
}
