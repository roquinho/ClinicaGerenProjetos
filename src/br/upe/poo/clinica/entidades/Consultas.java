package br.upe.poo.clinica.entidades;


import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Objects;
public class Consultas implements Serializable {
    
        private Long numeroConsulta;
	private Date diaConsulta;
	private Date horaConsulta;
	private Pacientes paciente;
	private boolean situacaoConsulta;
	private DadosConsultas dadosConsulta;
	private Medicos medico;
        private List<Exames> exames;
	
            public Consultas() {
                
            }
	    public Consultas(Long numeroConsulta,Pacientes paciente,Date diaConsulta,Date horaConsulta,Medicos medico) {
                this.diaConsulta = diaConsulta;
	    	this.horaConsulta = horaConsulta;
	    	this.paciente = paciente;
                this.medico = medico;
                this.numeroConsulta = numeroConsulta;
	    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.numeroConsulta);
        hash = 17 * hash + Objects.hashCode(this.diaConsulta);
        hash = 17 * hash + Objects.hashCode(this.horaConsulta);
        hash = 17 * hash + Objects.hashCode(this.paciente);
        hash = 17 * hash + (this.situacaoConsulta ? 1 : 0);
        hash = 17 * hash + Objects.hashCode(this.dadosConsulta);
        hash = 17 * hash + Objects.hashCode(this.medico);
        hash = 17 * hash + Objects.hashCode(this.exames);
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
        if (!Objects.equals(this.numeroConsulta, other.numeroConsulta)) {
            return false;
        }
        if (!Objects.equals(this.diaConsulta, other.diaConsulta)) {
            return false;
        }
        if (!Objects.equals(this.horaConsulta, other.horaConsulta)) {
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
        if (!Objects.equals(this.exames, other.exames)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Consultas{" + "NumeroConsulta=" + numeroConsulta + ", diaConsulta=" + diaConsulta + ", horaConsulta=" + horaConsulta + ", paciente=" + paciente + ", situacaoConsulta=" + situacaoConsulta + ", dadosConsulta=" + dadosConsulta + ", medico=" + medico + ", exames=" + exames + '}';
    }
    
                public Long getNumeroConsulta() {
                    return numeroConsulta;
                 }

                public void setNumeroConsulta(Long numeroConsulta) {
                    this.numeroConsulta = numeroConsulta;
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

                public List<Exames> getExames() {
                         return exames;
                }

                public void setExames(List<Exames> exames) {
                         this.exames = exames;
                }
	        

}
