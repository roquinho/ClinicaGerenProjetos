
package br.upe.poo.clinica.persistencia;

import br.upe.poo.clinica.entidades.Pacientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RepositorioPacientes implements InterfaceRepositorioPacientes{
    
        private Connection conexao;
	private PreparedStatement stm;
        private ResultSet rs;
        
 
    @Override
    public void cadastrarPaciente(Pacientes paciente) {
      this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
        try{
          String sql = "insert into pacientes"+"(nome,telefone,endereco,cpf,sexo,data_nascimento)"+"values(?,?,?,?,?,?)";
	 
          
            this.stm=conexao.prepareStatement(sql);

     this.stm.setString(1,((Pacientes) paciente).getNome());
     this.stm.setString(2,((Pacientes) paciente).getTelefone());
     this.stm.setString(3,((Pacientes) paciente).getEndereco());
     this.stm.setLong(4,((Pacientes) paciente).getCpf());
     this.stm.setString(5,((Pacientes) paciente).getSexo());
     this.stm.setString(6,((Pacientes) paciente).getDataNascimento());
     
        this.stm.execute();        
        this.stm.close();
        this.conexao.close();
        
        }catch(SQLException e) {
          try {
              throw new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioPacientes.class.getName()).log(Level.SEVERE, null, ex);
          }
        }        

    }
        
    @Override
    public Pacientes buscarPacienteCpf(Long cpf) {
      this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
       Pacientes paciente = new Pacientes();
        try{	    	 
	  String sql = "select * from pacientes";	    	
	    this.stm = conexao.prepareStatement(sql);
	        this.rs = stm.executeQuery();
       		    while(this.rs.next()){	 				
	 		if(cpf.equals(this.rs.getLong("cpf"))){	 			
	 		        paciente.setNome(this.rs.getString("nome"));
	         		paciente.setEndereco(this.rs.getString("endereco"));
	 			paciente.setCpf(this.rs.getLong("cpf"));
	 			paciente.setTelefone(this.rs.getString("telefone"));
	 			paciente.setSexo(this.rs.getString("sexo"));
                                paciente.setDataNascimento(this.rs.getString("data_nascimento"));
	 				}
	 					 				
	 			}
	 			this.stm.close();
	 			this.rs.close();
                                this.conexao.close();
        }catch(SQLException e) {
          try {
              throw  new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioPacientes.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
          
        return paciente;
    }

    @Override
    public List<Pacientes> buscarPacienteNome(String nome) {
     this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
       List<Pacientes>pacientes = new ArrayList();
         try{	    	 
	  String sql = "select * from pacientes where nome like ?";
          
        this.stm = conexao.prepareStatement(sql);
        this.stm.setString(1,'%'+ nome+'%');
        this.rs = stm.executeQuery();
                   
       		    while(this.rs.next()){
                        
                            Pacientes paciente = new Pacientes();
	 		        paciente.setNome(this.rs.getString("nome"));
	         		paciente.setEndereco(this.rs.getString("endereco"));
	 			paciente.setCpf(this.rs.getLong("cpf"));
	 			paciente.setTelefone(this.rs.getString("telefone"));
	 			paciente.setSexo(this.rs.getString("sexo"));
                                paciente.setDataNascimento(this.rs.getString("data_nascimento"));
                                  pacientes.add(paciente);
	 				}	 					 				
	 			
	 			this.stm.close();
	 			this.rs.close();
                                this.conexao.close();
        }catch(SQLException e) {
          try {
              throw  new Exception(e.getMessage());
          } catch (Exception ex) {
              Logger.getLogger(RepositorioPacientes.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
         
         
        return pacientes;
    }

    @Override
    public void atualizarPaciente(Pacientes paciente) {
       this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica");
         try{
	    String sql = "update pacientes set nome=?,"+"endereco=?,"+"sexo=?,"+"telefone=?,"+"cpf=?,"+"data_nascimento=? "+"where cpf=?";
	       this.stm = conexao.prepareStatement(sql);
               
	         this.stm.setString(1, paciente.getNome());
	    	 this.stm.setString(2, paciente.getEndereco());
	    	 this.stm.setString(3, paciente.getSexo());
	    	 this.stm.setString(4, paciente.getTelefone());
	    	 this.stm.setLong(5,paciente.getCpf());
                 this.stm.setString(6,paciente.getDataNascimento());
	    	 this.stm.setLong(7,paciente.getCpf());
	    			     
	    	    this.stm.execute();
	            this.stm.close();
                    this.conexao.close();
         }catch(SQLException e) {
           try {
               throw new Exception(e.getMessage());
           } catch (Exception ex) {
               Logger.getLogger(RepositorioPacientes.class.getName()).log(Level.SEVERE, null, ex);
           }
         }
	    	
    }

    @Override
    public void deletarPaciente(Pacientes paciente) {
       this.conexao = new ConexaoBancoDeDados().conectar("root", "12345","localhost", "clinica"); 
         try{
	    	String sql = "select * from pacientes";	
		 	this.stm = conexao.prepareStatement(sql);
		 	 this.rs=stm.executeQuery();		 	
		 	  while(this.rs.next()){		  		
	    	            if(paciente.getCpf().equals(this.rs.getLong("cpf"))){	    			    
	    	                String sqlexcluir = "delete from pacientes where cpf =?" ;	    	
	    	                  this.stm = conexao.prepareStatement(sqlexcluir);				
	    	                          this.stm.setLong(1,paciente.getCpf());
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
               Logger.getLogger(RepositorioPacientes.class.getName()).log(Level.SEVERE, null, ex);
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
