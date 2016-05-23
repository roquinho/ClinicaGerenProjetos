
package br.upe.poo.clinica.regraNegocio;

import br.upe.poo.clinica.entidades.Pacientes;
import java.util.List;

public class FachadaImplementa implements Fachada {
    private InterfaceRegraNegocioPacientes pacientes;
     
      public FachadaImplementa(){
          pacientes = new RegraNegocioPaciente();
      }

    @Override
    public void cadastrarPaciente(Pacientes paciente) throws RegraNegocioPacientesCadastrarException {
       pacientes.cadastrarPaciente(paciente);
    }

    @Override
    public Pacientes buscarPacienteCpf(Long cpf) throws RegraNegocioPacienteBuscarPacienteException {
        return pacientes.buscarPacienteCpf(cpf);
    }

    @Override
    public List<Pacientes> buscarPacienteNome(String nome) throws RegraNegocioPacienteBuscarPacienteException {
       return pacientes.buscarPacienteNome(nome);
    }

    @Override
    public void atualizarPaciente(Pacientes paciente) throws RegraNegocioAtualizarPacientesException {
        pacientes.atualizarPaciente(paciente);
    }

    @Override
    public void deletarPaciente(Pacientes paciente) throws RegraNegocioDeletarPacientesException {
        pacientes.deletarPaciente(paciente);
    }
    
}
