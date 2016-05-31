
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
        if(consulta == null) {System.out.println("entro aqui 1");
            throw new ExceptionRegraNegocioAgendarConsultas();
              
        }
        if(consulta.getPaciente().getNome() == null) {System.out.println("entro aqui 2");
            throw new ExceptionRegraNegocioAgendarConsultas();
        }
        if(consulta.getPaciente().getCpf() == null) {System.out.println("entro aqui 3");
            throw new ExceptionRegraNegocioAgendarConsultas();
        }
        if(consulta.getHoraConsulta()== null) {System.out.println("entro aqui 4");
            throw new ExceptionRegraNegocioAgendarConsultas();
        }
        if(consulta.getDiaConsulta()== null) {System.out.println("entro aqui 5");
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
        else {
            rc.atualizarConsulta(consulta);
        }
    }

    @Override
    public void deletarConsulta(Consultas consulta) throws ExceptionRegraNegocioDeletarConsultas {
        if(consulta == null) {
            throw new ExceptionRegraNegocioDeletarConsultas();
        }
        else {
            rc.deletarConsulta(consulta);
        }
    }
    
}
