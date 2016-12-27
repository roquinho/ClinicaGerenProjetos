package brr.upe.poo.clinica.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pacientes implements Serializable {
	private String nome;
	private String dataNascimento;
	private String sexo;
	private Long cpf;
	private String endereco;
	private String telefone;
	private List<Consultas>consultas;
	private List<Exames>exames;
	
	 public Pacientes() {
		 this.consultas = new ArrayList<>();
                 this.exames = new ArrayList<>();
	 }
	 public Pacientes(Long cpf,String nome,String endereco,String telefone,String sexo,String dataNascimento) {             
		 this.endereco = endereco;
		 this.nome = nome;
		 this.telefone = telefone;		 
		 this.sexo = sexo;
                 this.cpf = cpf;
                 this.dataNascimento = dataNascimento;
	 }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.nome);
        hash = 73 * hash + Objects.hashCode(this.dataNascimento);
        hash = 73 * hash + Objects.hashCode(this.sexo);
        hash = 73 * hash + Objects.hashCode(this.cpf);
        hash = 73 * hash + Objects.hashCode(this.endereco);
        hash = 73 * hash + Objects.hashCode(this.telefone);
        hash = 73 * hash + Objects.hashCode(this.consultas);
        hash = 73 * hash + Objects.hashCode(this.exames);
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
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.consultas, other.consultas)) {
            return false;
        }
        if (!Objects.equals(this.exames, other.exames)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", consultas=" + consultas + ", exames=" + exames + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
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
           

}
