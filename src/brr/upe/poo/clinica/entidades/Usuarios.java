
package brr.upe.poo.clinica.entidades;

import java.util.Objects;

/**
 *
 * @author manoel
 */
public class Usuarios {
  
    private String nome;
    private String senha;
    private String tipoUsuario;
    private String cpf;
       public Usuarios() {           
       }
       
       public Usuarios(String nome , String senha, String tipoUsuario,String cpf) {
           this.nome = nome;
           this.senha = senha;
           this.tipoUsuario = tipoUsuario;
           this.cpf = cpf;
       }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.senha);
        hash = 37 * hash + Objects.hashCode(this.tipoUsuario);
        hash = 37 * hash + Objects.hashCode(this.cpf);
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
        final Usuarios other = (Usuarios) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.tipoUsuario, other.tipoUsuario)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nome=" + nome + ", senha=" + senha + ", tipoUsuario=" + tipoUsuario + ", cpf=" + cpf + '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
       
}
