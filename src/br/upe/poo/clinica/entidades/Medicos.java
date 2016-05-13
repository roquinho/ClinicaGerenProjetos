package br.upe.poo.clinica.entidades;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Medicos implements Serializable {
    
	private String nome;
	private long cpf;
	private String endereco;
	private long telefone;
	private String loginNome;
	private String senha;
	private long crm;
	private List<Pacientes>pacientes;
	private List<Consultas>consultas;
	private List<Exames>exames;
	private List<ResultadosExames>resultadosExames;
	private List<Especialidades>especialidades;
	
	 public Medicos() {
		 
	 }
	 public Medicos(String nome,String senha,String endereco,long telefone,String login,long crm) {
		 this.endereco = endereco;
		 this.nome = nome;
		 this.telefone = telefone;
		 this.senha = senha;
		 this.loginNome = login;
		 this.crm = crm;		 
	 }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + (int) (this.cpf ^ (this.cpf >>> 32));
        hash = 97 * hash + Objects.hashCode(this.endereco);
        hash = 97 * hash + (int) (this.telefone ^ (this.telefone >>> 32));
        hash = 97 * hash + Objects.hashCode(this.loginNome);
        hash = 97 * hash + Objects.hashCode(this.senha);
        hash = 97 * hash + (int) (this.crm ^ (this.crm >>> 32));
        hash = 97 * hash + Objects.hashCode(this.pacientes);
        hash = 97 * hash + Objects.hashCode(this.consultas);
        hash = 97 * hash + Objects.hashCode(this.exames);
        hash = 97 * hash + Objects.hashCode(this.resultadosExames);
        hash = 97 * hash + Objects.hashCode(this.especialidades);
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
        final Medicos other = (Medicos) obj;
        if (this.cpf != other.cpf) {
            return false;
        }
        if (this.telefone != other.telefone) {
            return false;
        }
        if (this.crm != other.crm) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.loginNome, other.loginNome)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.pacientes, other.pacientes)) {
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
        if (!Objects.equals(this.especialidades, other.especialidades)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Medicos{" + "nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", loginNome=" + loginNome + ", senha=" + senha + ", crm=" + crm + ", pacientes=" + pacientes + ", consultas=" + consultas + ", exames=" + exames + ", resultadosExames=" + resultadosExames + ", especialidades=" + especialidades + '}';
    }
         
         
         
         
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
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
	public long getCrm() {
		return crm;
	}
	public void setCrm(long crm) {
		this.crm = crm;
	}

	public List<Pacientes> getPacientes() {
		return pacientes;
	}
	public void setPacientes(List<Pacientes> pacientes) {
		this.pacientes = pacientes;
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

	public List<Especialidades> getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(List<Especialidades> especialidades) {
		this.especialidades = especialidades;
	}
		
}
