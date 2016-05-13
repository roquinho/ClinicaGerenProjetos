package br.upe.poo.clinica.entidades;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Especialidades implements Serializable {
	private String AreaMedicina;
	private List<Medicos>medicosAreaMedicina;
	private List<Exames>examesPossiveis;
        private Long numeroIdEspecialidade;
	  
	   public Especialidades() {
		   
	   }
	   public Especialidades(List<Medicos>listaMedicos,List<Exames>listaExames) {		   
                   this.medicosAreaMedicina = listaMedicos;
                   this.examesPossiveis = listaExames;
 	   }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.AreaMedicina);
        hash = 59 * hash + Objects.hashCode(this.medicosAreaMedicina);
        hash = 59 * hash + Objects.hashCode(this.examesPossiveis);
        hash = 59 * hash + Objects.hashCode(this.numeroIdEspecialidade);
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
        final Especialidades other = (Especialidades) obj;
        if (!Objects.equals(this.AreaMedicina, other.AreaMedicina)) {
            return false;
        }
        if (!Objects.equals(this.medicosAreaMedicina, other.medicosAreaMedicina)) {
            return false;
        }
        if (!Objects.equals(this.examesPossiveis, other.examesPossiveis)) {
            return false;
        }
        if (!Objects.equals(this.numeroIdEspecialidade, other.numeroIdEspecialidade)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Especialidades{" + "AreaMedicina=" + AreaMedicina + ", medicosAreaMedicina=" + medicosAreaMedicina + ", examesPossiveis=" + examesPossiveis + ", numeroIdEspecialidade=" + numeroIdEspecialidade + '}';
    }


        public Long getNumeroIdEspecialidade() {
                return numeroIdEspecialidade;
        }
        public void setNumeroIdEspecialidade(Long numeroIdEspecialidade) {
               this.numeroIdEspecialidade = numeroIdEspecialidade;
        }          
	public String getAreaMedicina() {
		return AreaMedicina;
	}
	public void setAreaMedicina(String areaMedicina) {
		AreaMedicina = areaMedicina;
	}
        
	public List<Medicos> getMedicosAreaMedicina() {
		return medicosAreaMedicina;
	}
	public void setMedicosAreaMedicina(List<Medicos> medicosAreaMedicina) {
		this.medicosAreaMedicina = medicosAreaMedicina;
	}
        
	public List<Exames> getExamesPossiveis() {
		return examesPossiveis;
	}
	public void setExamesPossiveis(List<Exames> examesPossiveis) {
		this.examesPossiveis = examesPossiveis;
	}
      
}
  
