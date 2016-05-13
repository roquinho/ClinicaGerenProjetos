package br.upe.poo.clinica.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Exames implements Serializable {

    
        private Long IDExame;
	private Date dataExame;
	private Date horaExame;
	private String tipoExame;
	private Pacientes paciente;
	private Medicos medico;
	private ResultadosExames resultadoExame;
        private Especialidades especialidade;
	 
	 public Exames() {
		 
	 }
         
	 public Exames(String tipoExame,Especialidades especialidades) {
                 this.tipoExame = tipoExame;
                 this.especialidade = especialidades;
	 }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.IDExame);
        hash = 37 * hash + Objects.hashCode(this.dataExame);
        hash = 37 * hash + Objects.hashCode(this.horaExame);
        hash = 37 * hash + Objects.hashCode(this.tipoExame);
        hash = 37 * hash + Objects.hashCode(this.paciente);
        hash = 37 * hash + Objects.hashCode(this.medico);
        hash = 37 * hash + Objects.hashCode(this.resultadoExame);
        hash = 37 * hash + Objects.hashCode(this.especialidade);
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
        final Exames other = (Exames) obj;
        if (!Objects.equals(this.tipoExame, other.tipoExame)) {
            return false;
        }
        if (!Objects.equals(this.IDExame, other.IDExame)) {
            return false;
        }
        if (!Objects.equals(this.dataExame, other.dataExame)) {
            return false;
        }
        if (!Objects.equals(this.horaExame, other.horaExame)) {
            return false;
        }
        if (!Objects.equals(this.paciente, other.paciente)) {
            return false;
        }
        if (!Objects.equals(this.medico, other.medico)) {
            return false;
        }
        if (!Objects.equals(this.resultadoExame, other.resultadoExame)) {
            return false;
        }
        if (!Objects.equals(this.especialidade, other.especialidade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Exames{" + "IDExame=" + IDExame + ", dataExame=" + dataExame + ", horaExame=" + horaExame + ", tipoExame=" + tipoExame + ", paciente=" + paciente + ", medico=" + medico + ", resultadoExame=" + resultadoExame + ", especialidade=" + especialidade + '}';
    }

    

         public Long getIDExame() {
                 return IDExame;
          }
         public void setIDExame(Long IDExame) {
                this.IDExame = IDExame;
          }
	public Date getDataExame() {
		return dataExame;
	  }
	public void setDataExame(Date dataExame) {
		this.dataExame = dataExame;
	}
	public Date getHoraExame() {
		return horaExame;
	}
	public void setHoraExame(Date horaExame) {
		this.horaExame = horaExame;
	}
	public String getTipoExame() {
		return tipoExame;
	}
	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}

	public Pacientes getPaciente() {
		return paciente;
	}
	public void setPaciente(Pacientes paciente) {
		this.paciente = paciente;
	}
        
	public Medicos getMedico() {
		return medico;
	}
	public void setMedico(Medicos medico) {
		this.medico = medico;
	}
        
	public ResultadosExames getResultadoExame() {
		return resultadoExame;
	}
	public void setResultadoExame(ResultadosExames resultadoExame) {
		this.resultadoExame = resultadoExame;
	}
        
        public Especialidades getEspecialidade() {
               return especialidade;
        }

        public void setEspecialidade(Especialidades especialidade) {
               this.especialidade = especialidade;
        }
        
	 
	

}
