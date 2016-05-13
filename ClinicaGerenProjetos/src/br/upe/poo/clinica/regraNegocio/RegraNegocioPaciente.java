
package br.upe.poo.clinica.regraNegocio;

import br.upe.poo.clinica.entidades.Pacientes;
import br.upe.poo.clinica.persistencia.InterfaceRepositorioPacientes;
import br.upe.poo.clinica.persistencia.RepositorioPacientes;

import java.util.List;


public class RegraNegocioPaciente implements InterfaceRegraNegocioPacientes{
    
     private InterfaceRepositorioPacientes rp;
    
     public RegraNegocioPaciente() {
         rp = new RepositorioPacientes();
     }
     
     
    @Override
    public void cadastrarPaciente(Pacientes paciente)throws RegraNegocioPacientesCadastrarException {
        if(paciente == null) {
            throw new RegraNegocioPacientesCadastrarException();
        }
        if(paciente.getNome()== null) {
            throw new RegraNegocioPacientesCadastrarException();
        }
        if(paciente.getCpf()==null) {
            throw new RegraNegocioPacientesCadastrarException();
        }
        if(paciente.getCpf().length()>11) {
            throw new RegraNegocioPacientesCadastrarException();
        }

        else {
            rp.cadastrarPaciente(paciente);
        }
            }

    @Override
    public Pacientes buscarPacienteCpf(String cpf) throws RegraNegocioPacienteBuscarPacienteException {
        Pacientes paciente = null;
        
       if(cpf == null){
           throw new RegraNegocioPacienteBuscarPacienteException();
       }
       if(cpf.length()>11) {
           throw new RegraNegocioPacienteBuscarPacienteException();
       }
       if(cpf.length()<11) {
           throw new RegraNegocioPacienteBuscarPacienteException();
       }
       else {
          paciente = rp.buscarPacienteCpf(cpf);
       }       
        return paciente;
    }

    @Override
    public List<Pacientes> buscarPacienteNome(String nome) throws RegraNegocioPacienteBuscarPacienteException {
          List<Pacientes> listaPacientes = null;
        if(nome == null) {
          throw new RegraNegocioPacienteBuscarPacienteException();
        }
        else {
            listaPacientes = rp.buscarPacienteNome(nome);
        }
        return listaPacientes;
    }

    @Override
    public void atualizarPaciente(Pacientes paciente)throws RegraNegocioAtualizarPacientesException{
       if(paciente == null) {
            throw new RegraNegocioAtualizarPacientesException();
        }
        if(paciente.getNome()== null) {
            throw new RegraNegocioAtualizarPacientesException();
        }
        if(paciente.getCpf()==null) {
            throw new RegraNegocioAtualizarPacientesException();
        }
        if(paciente.getCpf().length()>11) {
            throw new RegraNegocioAtualizarPacientesException();
        }
        if(paciente.getCpf().length()<11) {
            throw new RegraNegocioAtualizarPacientesException();
        }
        
        else {
            rp.atualizarPaciente(paciente);
        }
        
    }

    @Override
    public void deletarPaciente(Pacientes paciente)throws RegraNegocioDeletarPacientesException{
       if(paciente == null) {
           throw new RegraNegocioDeletarPacientesException();
       }
       else {
           rp.deletarPaciente(paciente);
       }
       }
       
}
