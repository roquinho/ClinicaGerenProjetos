
package br.upe.poo.clinica.persistencia;

import br.upe.poo.clinica.entidades.Consultas;
import br.upe.poo.clinica.entidades.Exames;
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
public class RepositorioExames implements InterfaceRepositorioExames{

        private Connection conexao;
	private PreparedStatement stm;
        private ResultSet rs;
        
          public RepositorioExames() {
              
          }
        
    @Override
    public void agendarExame(Exames exame) {
      this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
        try{
          String sql = "insert into exames"+"(nome_paciente,cpf_paciente,hora_exame,dia_exame,tipo_exame)"+"values(?,?,?,?,?)";	
            
          this.stm=conexao.prepareStatement(sql);

     this.stm.setString(1,((Exames) exame).getPaciente().getNome());
     this.stm.setLong(2,((Exames) exame).getPaciente().getCpf());
     this.stm.setString(3,((Exames) exame).getHoraExame());
     this.stm.setString(4,((Exames) exame).getDataExame());
     this.stm.setString(5,((Exames) exame).getTipoExame());
     
        this.stm.execute();        
        this.stm.close();
        this.conexao.close();
        
        }catch(SQLException e) {
          try {
              throw new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioExames.class.getName()).log(Level.SEVERE, null, ex);
          }
        }        
        
  
    }

    @Override
    public Exames filtrarExameCpfPaciente(Long cpf) {
        this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
      Exames exame = new Exames();
        try{	    	 
	  String sql = "select * from exames";	    	
	    this.stm = conexao.prepareStatement(sql);
	        this.rs = stm.executeQuery();
       		    while(this.rs.next()){	 				
	 		if(cpf.equals(this.rs.getLong("cpf_paciente"))){	 			
	 		        exame.getPaciente().setNome(this.rs.getString("nome_paciente"));
	         		exame.getPaciente().setCpf(this.rs.getLong("cpf_paciente"));
	 			exame.setHoraExame(this.rs.getString("hora_exame"));
	 			exame.setDataExame(this.rs.getString("dia_exame"));
	 			exame.setTipoExame(this.rs.getString("tipo_exame"));
	 				}
	 					 				
	 			}
	 			this.stm.close();
	 			this.rs.close();
                                this.conexao.close();
        }catch(SQLException e) {
          try {
              throw  new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioExames.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
        return exame;
    }

    @Override
    public List<Exames> filtrarExameNomePaciente(String nome) {
      this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
       List<Exames>exames = new ArrayList();
         try{	    	 
	  String sql = "select * from exames where nome_paciente like ?";
          
        this.stm = conexao.prepareStatement(sql);
        this.stm.setString(1,'%'+ nome+'%');
        this.rs = stm.executeQuery();
                   
       		    while(this.rs.next()){
                        
                            Exames exame = new Exames();
	 		        exame.getPaciente().setNome(this.rs.getString("nome_paciente"));
	         		exame.getPaciente().setCpf(this.rs.getLong("cpf_paciente"));
	 			exame.setHoraExame(this.rs.getString("hora_exame"));
	 			exame.setDataExame(this.rs.getString("dia_exame"));
	 			exame.setTipoExame(this.rs.getString("tipo_exame"));
	 				exames.add(exame);
	 				}	 					 				
	 			
	 			this.stm.close();
	 			this.rs.close();
                                this.conexao.close();
        }catch(SQLException e) {
          try {
              throw  new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioExames.class.getName()).log(Level.SEVERE, null, ex);
          }
        }         
        return exames;
    }

    @Override
    public void atualizarExame(Exames exame) {
        this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
         try{
	    String sql = "update Exames set hora_exame=?,"+"dia_exame=? ,tipo_exame=?"+"where cpf_paciente=?";
	       this.stm = conexao.prepareStatement(sql);
        
     this.stm.setString(1,((Exames) exame).getHoraExame());
     this.stm.setString(2,((Exames) exame).getDataExame());
     this.stm.setString(3,((Exames) exame).getTipoExame());
     this.stm.setLong(4, ((Exames) exame).getPaciente().getCpf());
     
        this.stm.execute();        
        this.stm.close();
        this.conexao.close();
        
        }catch(SQLException e) {
          try {
              throw new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioExames.class.getName()).log(Level.SEVERE, null, ex);
          }
        }        
        
  
    }

    @Override
    public void deletarExame(Exames exame) {
        this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica"); 
         try{
	    	String sql = "select * from exames";	
		 	this.stm = conexao.prepareStatement(sql);
		 	 this.rs=stm.executeQuery();		 	
		 	  while(this.rs.next()){		  		
	    	            if(exame.getPaciente().getCpf().equals(this.rs.getLong("cpf_paciente"))){	    			    
	    	                String sqlexcluir = "delete from exames where cpf_paciente =?" ;	    	
	    	                  this.stm = conexao.prepareStatement(sqlexcluir);				
	    	                          this.stm.setLong(1,exame.getPaciente().getCpf());
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
               Logger.getLogger(RepositorioExames.class.getName()).log(Level.SEVERE, null, ex);
           }

         }
    }
    
    
}
