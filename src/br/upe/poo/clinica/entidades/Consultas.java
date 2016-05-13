package br.upe.poo.clinica.entidades;


import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;
public class Consultas implements Serializable {
    
        private Long NumeroConsulta;
	private Date diaConsulta;
	private Date horaConsulta;
	private Especialidades tipoEspecialidade;
	private Pacientes paciente;
	private boolean situacaoConsulta;
	private DadosConsultas dadosConsulta;
	private Medicos medico;
	
            public Consultas() {
                
            }
	    public Consultas(Pacientes paciente,Date diaConsulta,Date horaConsulta,Especialidades especialidade,Medicos medico) {
                this.diaConsulta = diaConsulta;
	    	this.horaConsulta = horaConsulta;
                this.tipoEspecialidade = especialidade;
	    	this.paciente = paciente;
                this.medico = medico;	    		  
	    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.NumeroConsulta);
        hash = 83 * hash + Objects.hashCode(this.diaConsulta);
        hash = 83 * hash + Objects.hashCode(this.horaConsulta);
        hash = 83 * hash + Objects.hashCode(this.tipoEspecialidade);
        hash = 83 * hash + Objects.hashCode(this.paciente);
        hash = 83 * hash + (this.situacaoConsulta ? 1 : 0);
        hash = 83 * hash + Objects.hashCode(this.dadosConsulta);
        hash = 83 * hash + Objects.hashCode(this.medico);
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
        final Consultas other = (Consultas) obj;
        if (this.situacaoConsulta != other.situacaoConsulta) {
            return false;
        }
        if (!Objects.equals(this.NumeroConsulta, other.NumeroConsulta)) {
            return false;
        }
        if (!Objects.equals(this.diaConsulta, other.diaConsulta)) {
            return false;
        }
        if (!Objects.equals(this.horaConsulta, other.horaConsulta)) {
            return false;
        }
        if (!Objects.equals(this.tipoEspecialidade, other.tipoEspecialidade)) {
            return false;
        }
        if (!Objects.equals(this.paciente, other.paciente)) {
            return false;
        }
        if (!Objects.equals(this.dadosConsulta, other.dadosConsulta)) {
            return false;
        }
        if (!Objects.equals(this.medico, other.medico)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Consultas{" + "NumeroConsulta=" + NumeroConsulta + ", diaConsulta=" + diaConsulta + ", horaConsulta=" + horaConsulta + ", tipoEspecialidade=" + tipoEspecialidade + ", paciente=" + paciente + ", situacaoConsulta=" + situacaoConsulta + ", dadosConsulta=" + dadosConsulta  + ", medico=" + medico + '}';
    }

                
                public Long getNumeroConsulta() {
                    return NumeroConsulta;
                 }

                public void setNumeroConsulta(Long NumeroConsulta) {
                    this.NumeroConsulta = NumeroConsulta;
                 }
		public Date getDiaConsulta() {
			return diaConsulta;
		}
		public void setDiaConsulta(Date diaConsulta) {
			this.diaConsulta = diaConsulta;
		}
                
		public Date getHoraConsulta() {
			return horaConsulta;
		}
		public void setHoraConsulta(Date horaConsulta) {
			this.horaConsulta = horaConsulta;
		}
                
		public Especialidades getTipoEspecialidade() {
			return tipoEspecialidade;
		}
		public void setTipoEspecialidade(Especialidades tipoEspecialidade) {
			this.tipoEspecialidade = tipoEspecialidade;
		}

		public Pacientes getPaciente() {
			return paciente;
		}
		public void setPaciente(Pacientes paciente) {
			this.paciente = paciente;
		}
		public boolean getSituacaoConsulta() {
			return situacaoConsulta;
		}
		public void setSituacaoConsulta(boolean situacaoConsulta) {
			this.situacaoConsulta = situacaoConsulta;
		}
                
		public DadosConsultas getDadosConsulta() {
			return dadosConsulta;
		}
		public void setDadosConsulta(DadosConsultas dadosConsulta) {
			this.dadosConsulta = dadosConsulta;
		}
                
		public Medicos getMedico() {
			return medico;
		}
		public void setMedico(Medicos medico) {
			this.medico = medico;
		}
	    

}
