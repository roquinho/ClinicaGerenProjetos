
package br.upe.poo.clinica.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoDeDados {
    
    private Connection conexao;
	private String usuario;
	private String senha;
	private String host;
	private String nomeBanco;
	
	         public ConexaoBancoDeDados() {
				
			}

public Connection conectar(String usuario,String senha,String host,String nomeBanco){
	        
    
		        this.host=host;
		        this.senha = senha;
		        this.usuario = usuario;
                        this.nomeBanco = nomeBanco;
	        	
	        	String url = "jdbc:mysql://" + this.host + "/" + this.nomeBanco;
	        	
	        	try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {					
					System.out.println(e.getMessage()+ "erro");
				}
	        	
	        	try {
					this.conexao = DriverManager.getConnection(url, this.usuario, this.senha);
					System.out.println("conectado");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println("nao conectou");
				}
	        
	        	return conexao;
	        }

	     public Connection desconectar(){
	    	 try {
				this.conexao.close();
				   System.out.println("conexao fechada");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	    	    return this.conexao;
	    	   
	     }

}
