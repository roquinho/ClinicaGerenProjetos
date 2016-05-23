
package br.upe.poo.clinica.persistencia;

import br.upe.poo.clinica.entidades.Pacientes;
import java.util.List;


public interface InterfaceRepositorioPacientes {
    
    public void cadastrarPaciente(Pacientes paciente);
    
    public Pacientes buscarPacienteCpf(Long cpf);
    
    public List<Pacientes> buscarPacienteNome(String nome);
    
    public void atualizarPaciente(Pacientes paciente);
    
    public void deletarPaciente(Pacientes paciente);
    
    
}
