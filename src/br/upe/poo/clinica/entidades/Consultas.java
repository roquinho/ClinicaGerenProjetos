package br.upe.poo.clinica.entidades;


import java.io.Serializable;
import java.util.List;
import java.util.Objects;
public class Consultas implements Serializable {
    
	private String diaConsulta;
	private String horaConsulta;
	private Pacientes paciente;
	private boolean situacaoConsulta;
	private DadosConsultas dadosConsulta;
	private Medicos medico;
        private List<Exames> exames;
	
            public Consultas() {
                this.paciente = new Pacientes();
                this.medico = new Medicos();
            }
	    public Consultas(Pacientes paciente,String diaConsulta,String horaConsulta,Medicos medico) {
                this.diaConsulta = diaConsulta;
	    	this.horaConsulta = horaConsulta;
	    	this.paciente = paciente;
                this.medico = medico;
	    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.diaConsulta);
        hash = 97 * hash + Objects.hashCode(this.horaConsulta);
        hash = 97 * hash + Objects.hashCode(this.paciente);
        hash = 97 * hash + Objects.hashCode(this.dadosConsulta);
        hash = 97 * hash + Objects.hashCode(this.medico);
        hash = 97 * hash + Objects.hashCode(this.exames);
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
        return "Consultas{" + "diaConsulta=" + diaConsulta + ", horaConsulta=" + horaConsulta + ", paciente=" + paciente + ", situacaoConsulta=" + situacaoConsulta + ", dadosConsulta=" + dadosConsulta + ", medico=" + medico + ", exames=" + exames + '}';
    }
  
		public String getDiaConsulta() {
			return diaConsulta;
		}
		public void setDiaConsulta(String diaConsulta) {
			this.diaConsulta = diaConsulta;
		}
                
		public String getHoraConsulta() {
			return horaConsulta;
		}
		public void setHoraConsulta(String horaConsulta) {
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
