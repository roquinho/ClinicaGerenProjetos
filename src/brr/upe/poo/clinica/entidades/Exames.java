package brr.upe.poo.clinica.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Exames implements Serializable {
    
	private String dataExame;
	private String horaExame;
	private String tipoExame;
	private Pacientes paciente;
	private ResultadosExames resultadoExame;
	private Consultas consulta; 
        
	 public Exames() {
          this.paciente = new Pacientes();
          this.consulta = new Consultas();
	 }
         
	 public Exames(String tipoExame,String dataExame,String horaExame,Pacientes paciente) {
                 this.tipoExame = tipoExame;
                 this.dataExame = dataExame;
                 this.horaExame = horaExame;
                 this.paciente = paciente;
	 }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.dataExame);
        hash = 89 * hash + Objects.hashCode(this.horaExame);
        hash = 89 * hash + Objects.hashCode(this.tipoExame);
        hash = 89 * hash + Objects.hashCode(this.paciente);
        hash = 89 * hash + Objects.hashCode(this.resultadoExame);
        hash = 89 * hash + Objects.hashCode(this.consulta);
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
        if (!Objects.equals(this.dataExame, other.dataExame)) {
            return false;
        }
        if (!Objects.equals(this.horaExame, other.horaExame)) {
            return false;
        }
        if (!Objects.equals(this.tipoExame, other.tipoExame)) {
            return false;
        }
        if (!Objects.equals(this.paciente, other.paciente)) {
            return false;
        }
        if (!Objects.equals(this.resultadoExame, other.resultadoExame)) {
            return false;
        }
        if (!Objects.equals(this.consulta, other.consulta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Exames{" + "dataExame=" + dataExame + ", horaExame=" + horaExame + ", tipoExame=" + tipoExame + ", paciente=" + paciente + ", resultadoExame=" + resultadoExame + ", consulta=" + consulta + '}';
    }

    public String getDataExame() {
        return dataExame;
    }

    public void setDataExame(String dataExame) {
        this.dataExame = dataExame;
    }

    public String getHoraExame() {
        return horaExame;
    }

    public void setHoraExame(String horaExame) {
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

    public ResultadosExames getResultadoExame() {
        return resultadoExame;
    }

    public void setResultadoExame(ResultadosExames resultadoExame) {
        this.resultadoExame = resultadoExame;
    }

    public Consultas getConsulta() {
        return consulta;
    }

    public void setConsulta(Consultas consulta) {
        this.consulta = consulta;
    }

    
    	

}
