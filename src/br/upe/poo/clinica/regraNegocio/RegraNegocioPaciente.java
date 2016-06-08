
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
    public void cadastrarPaciente(Pacientes paciente)throws ExceptionRegraNegocioPacientesCadastrar {
        if(paciente == null) {
            throw new ExceptionRegraNegocioPacientesCadastrar();
        }
        if(paciente.getNome()== null) {
            throw new ExceptionRegraNegocioPacientesCadastrar();
        }
        if(paciente.getCpf()==null) {
            throw new ExceptionRegraNegocioPacientesCadastrar();
        }
        if(paciente.equals(rp.buscarPacienteCpf(paciente.getCpf()))) {
            throw new ExceptionRegraNegocioPacientesCadastrar();
        } 
        else {
            rp.cadastrarPaciente(paciente);
        }
            }

    @Override
    public Pacientes buscarPacienteCpf(Long cpf) throws ExceptionRegraNegocioPacienteBuscarPaciente {
        Pacientes paciente = null;
        
       if(cpf == null){
           throw new ExceptionRegraNegocioPacienteBuscarPaciente();
       }
       else {
          paciente = rp.buscarPacienteCpf(cpf);
       }       
        return paciente;
    }

    @Override
    public List<Pacientes> buscarPacienteNome(String nome) throws ExceptionRegraNegocioPacienteBuscarPaciente {
          List<Pacientes> listaPacientes = null;
        if(nome == null) {
          throw new ExceptionRegraNegocioPacienteBuscarPaciente();
        }
        else {
            listaPacientes = rp.buscarPacienteNome(nome);
        }
        return listaPacientes;
    }

    @Override
    public void atualizarPaciente(Pacientes paciente)throws ExceptionRegraNegocioAtualizarPacientes{
       if(paciente == null) {
            throw new ExceptionRegraNegocioAtualizarPacientes();
        }
        if(paciente.getNome()== null) {
            throw new ExceptionRegraNegocioAtualizarPacientes();
        }
        if(paciente.getCpf()==null) {
            throw new ExceptionRegraNegocioAtualizarPacientes();
        }
        if(paciente.equals(rp.buscarPacienteCpf(paciente.getCpf()))==true) {
            throw new ExceptionRegraNegocioAtualizarPacientes();
        }
        else {
            rp.atualizarPaciente(paciente);
        }
        
    }

    @Override
    public void deletarPaciente(Pacientes paciente)throws ExceptionRegraNegocioDeletarPacientes{
       if(paciente == null) {
           throw new ExceptionRegraNegocioDeletarPacientes();
       }
       if(paciente.equals(rp.buscarPacienteCpf(paciente.getCpf()))==false) {
           throw new ExceptionRegraNegocioDeletarPacientes();
        }
       else {
           rp.deletarPaciente(paciente);
       }
       }
       
}
