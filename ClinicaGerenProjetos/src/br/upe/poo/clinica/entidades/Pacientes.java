package br.upe.poo.clinica.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

public class Pacientes implements Serializable {
	private String nome;
	private int idade;
	private Date dataNascimento;
	private String sexo;
	private String cpf;
	private String endereco;
	private String telefone;
	private String loginNome;
	private String senha;
	private Medicos medicos;
	private List<Consultas>consultas;
	private List<Exames>exames;
	private List<ResultadosExames>resultadosExames;
	
	 public Pacientes() {
		 
	 }
	 public Pacientes(String nome,String endereco,String telefone,String sexo,String cpf) {
             
		 this.endereco = endereco;
		 this.nome = nome;
		 this.telefone = telefone;		 
		 this.sexo = sexo;
		 this.cpf = cpf;		 
	 }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + this.idade;
        hash = 41 * hash + Objects.hashCode(this.dataNascimento);
        hash = 41 * hash + Objects.hashCode(this.sexo);
        hash = 41 * hash + Objects.hashCode(this.cpf);
        hash = 41 * hash + Objects.hashCode(this.endereco);
        hash = 41 * hash + Objects.hashCode(this.telefone);
        hash = 41 * hash + Objects.hashCode(this.loginNome);
        hash = 41 * hash + Objects.hashCode(this.senha);
        hash = 41 * hash + Objects.hashCode(this.medicos);
        hash = 41 * hash + Objects.hashCode(this.consultas);
        hash = 41 * hash + Objects.hashCode(this.exames);
        hash = 41 * hash + Objects.hashCode(this.resultadosExames);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pacientes other = (Pacientes) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.loginNome, other.loginNome)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.medicos, other.medicos)) {
            return false;
        }
        if (!Objects.equals(this.consultas, other.consultas)) {
            return false;
        }
        if (!Objects.equals(this.exames, other.exames)) {
            return false;
        }
        if (!Objects.equals(this.resultadosExames, other.resultadosExames)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", loginNome=" + loginNome + ", senha=" + senha + ", medicos=" + medicos + ", consultas=" + consultas + ", exames=" + exames + ", resultadosExames=" + resultadosExames + '}';
    }
         
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
        
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getLoginNome() {
		return loginNome;
	}
	public void setLoginNome(String loginNome) {
		this.loginNome = loginNome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
        
        
	public Medicos getMedicos() {
		return medicos;
	}
	public void setMedicos(Medicos medicos) {
		this.medicos = medicos;
	}
        
	public List<Consultas> getConsultas() {
		return consultas;
	}
	public void setConsultas(List<Consultas> consultas) {
		this.consultas = consultas;
	}
        
	public List<Exames> getExames() {
		return exames;
	}
	public void setExames(List<Exames> exames) {
		this.exames = exames;
	}
        
	public List<ResultadosExames> getResultadosExames() {
		return resultadosExames;
	}
	public void setResultadosExames(List<ResultadosExames> resultadosExames) {
		this.resultadosExames = resultadosExames;
	}
	
}
