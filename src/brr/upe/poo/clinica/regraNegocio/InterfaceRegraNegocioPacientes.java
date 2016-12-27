
package brr.upe.poo.clinica.regraNegocio;

import brr.upe.poo.clinica.entidades.Pacientes;
import java.util.List;


public interface InterfaceRegraNegocioPacientes {
    
    public void cadastrarPaciente(Pacientes paciente)throws ExceptionRegraNegocioPacientesCadastrar;
    
    public Pacientes buscarPacienteCpf(Long cpf)throws ExceptionRegraNegocioPacienteBuscarPaciente;
    
    public List<Pacientes> buscarPacienteNome(String nome)throws ExceptionRegraNegocioPacienteBuscarPaciente;
    
    public void atualizarPaciente(Pacientes paciente)throws ExceptionRegraNegocioAtualizarPacientes;
    
    public void deletarPaciente(Pacientes paciente)throws ExceptionRegraNegocioDeletarPacientes;
    
}
