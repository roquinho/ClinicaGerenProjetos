package br.upe.poo.clinica.entidades;

import java.io.Serializable;
import java.util.Objects;


public class ResultadosExames implements Serializable {
 
      private Pacientes paciente;
      private Long ID;
      private Medicos medico;
      private Exames exame;

      public ResultadosExames() {
          
      }
      
      public ResultadosExames(Exames exame){
          this.exame = exame;
      }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.paciente);
        hash = 17 * hash + Objects.hashCode(this.ID);
        hash = 17 * hash + Objects.hashCode(this.medico);
        hash = 17 * hash + Objects.hashCode(this.exame);
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
        final ResultadosExames other = (ResultadosExames) obj;
        if (!Objects.equals(this.paciente, other.paciente)) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.medico, other.medico)) {
            return false;
        }
        if (!Objects.equals(this.exame, other.exame)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResultadosExames{" + "paciente=" + paciente + ", ID=" + ID + ", medico=" + medico + ", exame=" + exame + '}';
    }

      
    
    
    public Exames getExame() {
        return exame;
    }

    public void setExame(Exames exame) {
        this.exame = exame;
    }
    
 
    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }
      
 
    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }
    
}
