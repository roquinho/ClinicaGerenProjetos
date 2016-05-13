
package br.upe.poo.clinica.regraNegocio;

import br.upe.poo.clinica.entidades.Pacientes;
import java.util.List;


public interface InterfaceRegraNegocioPacientes {
    
    public void cadastrarPaciente(Pacientes paciente)throws RegraNegocioPacientesCadastrarException;
    
    public Pacientes buscarPacienteCpf(String cpf)throws RegraNegocioPacienteBuscarPacienteException;
    
    public List<Pacientes> buscarPacienteNome(String nome)throws RegraNegocioPacienteBuscarPacienteException;
    
    public void atualizarPaciente(Pacientes paciente)throws RegraNegocioAtualizarPacientesException;
    
    public void deletarPaciente(Pacientes paciente)throws RegraNegocioDeletarPacientesException;
    
}
