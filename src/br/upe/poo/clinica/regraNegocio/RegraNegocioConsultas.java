
package br.upe.poo.clinica.regraNegocio;

import br.upe.poo.clinica.entidades.Consultas;
import br.upe.poo.clinica.persistencia.InterfaceRepositorioConsultas;
import br.upe.poo.clinica.persistencia.RepositorioConsultas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manoel
 */
public class RegraNegocioConsultas implements InterfaceRegaNegocioConsultas {
   
       private InterfaceRepositorioConsultas rc;
        
         public RegraNegocioConsultas() {
             this.rc = new RepositorioConsultas();
         }
         
    @Override
    public void agendarConsulta(Consultas consulta) throws ExceptionRegraNegocioAgendarConsultas {
        if(consulta == null) {
            throw new ExceptionRegraNegocioAgendarConsultas();              
        }
        if(consulta.getPaciente().getNome() == null) {
            throw new ExceptionRegraNegocioAgendarConsultas();
        }
        if(consulta.getPaciente().getCpf() == null) {
            throw new ExceptionRegraNegocioAgendarConsultas();
        }
        if(consulta.getHoraConsulta()== null) {
            throw new ExceptionRegraNegocioAgendarConsultas();
        }
        if(consulta.getDiaConsulta()== null) {
            throw new ExceptionRegraNegocioAgendarConsultas();
        }
        if(consulta.equals(rc.filtrarConsultaCpfPaciente(consulta.getPaciente().getCpf()))) {
            throw new ExceptionRegraNegocioAgendarConsultas();
        }
        else {
            consulta.getPaciente().getConsultas().add(consulta);
            consulta.getMedico().getConsultas().add(consulta);
            rc.agendarConsulta(consulta);            
        }
        
    }

    @Override
    public List<Consultas> filtrarConsultaNomePaciente(String nomePaciente) throws ExceptionRegraNegocioFiltrarConsultas {
        List<Consultas>consultas = new ArrayList<>();
        
        if(nomePaciente == null) {
         throw new ExceptionRegraNegocioFiltrarConsultas();
    }
       else {
           consultas = rc.filtrarConsultaNomePaciente(nomePaciente);
    }
        return consultas;
    }
    
    @Override
    public Consultas filtrarConsultaCpfPaciente(Long cpf) throws ExceptionRegraNegocioFiltrarConsultas {
        Consultas consulta = new Consultas();
          if(cpf == null) {
              throw new ExceptionRegraNegocioFiltrarConsultas();
          }
          else {
              consulta = rc.filtrarConsultaCpfPaciente(cpf);
          }
          return consulta;
    }

    @Override
    public void atualizarConsulta(Consultas consulta) throws ExceptionRegraNegocioAtualizarConsultas {
       if(consulta == null) {
            throw new ExceptionRegraNegocioAtualizarConsultas();
        }
        if(consulta.getPaciente().getNome() == null) {
            throw new ExceptionRegraNegocioAtualizarConsultas();
        }
        if(consulta.getPaciente().getCpf() == null) {
            throw new ExceptionRegraNegocioAtualizarConsultas();
        }
        if(consulta.getHoraConsulta()== null) {
            throw new ExceptionRegraNegocioAtualizarConsultas();
        }
        if(consulta.getDiaConsulta()== null) {
            throw new ExceptionRegraNegocioAtualizarConsultas();
        }
        if(consulta.equals(rc.filtrarConsultaCpfPaciente(consulta.getPaciente().getCpf()))==true) {
            throw new ExceptionRegraNegocioAtualizarConsultas();
        }
        else {
            rc.atualizarConsulta(consulta);
        }
    }

    @Override
    public void deletarConsulta(Consultas consulta) throws ExceptionRegraNegocioDeletarConsultas {
        if(consulta == null) {
            throw new ExceptionRegraNegocioDeletarConsultas();
        }
        if(consulta.equals(rc.filtrarConsultaCpfPaciente(consulta.getPaciente().getCpf()))==false) {
            throw new ExceptionRegraNegocioDeletarConsultas();
        }
        else {
            rc.deletarConsulta(consulta);
        }
    }

    @Override
    public List<Consultas> filtrarNomeMedico(String nomeMedico) throws ExceptionRegraNegocioFiltrarConsultas {
       List<Consultas>consultas = new ArrayList<>();
        
        if(nomeMedico == null) {
         throw new ExceptionRegraNegocioFiltrarConsultas();
    }
       else {
           consultas = rc.filtrarNomeMedico(nomeMedico);
    }
        return consultas;
 
    }
    
}
