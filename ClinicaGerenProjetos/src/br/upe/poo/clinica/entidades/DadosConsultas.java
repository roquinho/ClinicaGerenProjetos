package br.upe.poo.clinica.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class DadosConsultas implements Serializable {
  private Date inicioConsulta;
  private Date fimConsulta;
  private Consultas consulta;
  private Long IdDadosConsulta;
  
    public DadosConsultas() {
        
    }
    
    public DadosConsultas(Consultas consultas) {
        this.consulta = consultas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.inicioConsulta);
        hash = 71 * hash + Objects.hashCode(this.fimConsulta);
        hash = 71 * hash + Objects.hashCode(this.consulta);
        hash = 71 * hash + Objects.hashCode(this.IdDadosConsulta);
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
        final DadosConsultas other = (DadosConsultas) obj;
        if (!Objects.equals(this.inicioConsulta, other.inicioConsulta)) {
            return false;
        }
        if (!Objects.equals(this.fimConsulta, other.fimConsulta)) {
            return false;
        }
        if (!Objects.equals(this.consulta, other.consulta)) {
            return false;
        }
        if (!Objects.equals(this.IdDadosConsulta, other.IdDadosConsulta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DadosConsultas{" + "inicioConsulta=" + inicioConsulta + ", fimConsulta=" + fimConsulta + ", consulta=" + consulta + ", IdDadosConsulta=" + IdDadosConsulta + '}';
    }

    
    
    
    public Long getIdDadosConsulta() {
        return IdDadosConsulta;
    }

    public void setIdDadosConsulta(Long IdDadosConsulta) {
        this.IdDadosConsulta = IdDadosConsulta;
    }
  
   
    public Consultas getConsulta() {
        return consulta;
    }

    public void setConsulta(Consultas consulta) {
        this.consulta = consulta;
    }
    
  public Date getInicioConsulta() {
      return this.inicioConsulta;
  }
  public void setInicioConsulta(Date inicioConsulta) {
      this.inicioConsulta = inicioConsulta;
  }
  public Date GetFimConsulta() {
      return this.fimConsulta;
  }
  public void setFimConsulta(Date fimConsulta) {
      this.fimConsulta = fimConsulta;
  }
  
}
