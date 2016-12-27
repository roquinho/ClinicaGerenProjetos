
package brr.upe.poo.clinica.persistencia;

import brr.upe.poo.clinica.entidades.Consultas;
import java.util.List;

/**
 *
 * @author manoel
 */
public interface InterfaceRepositorioConsultas {
   
    public void agendarConsulta(Consultas consulta);
    
    public List<Consultas> filtrarConsultaNomePaciente(String nomePaciente);
    
    public Consultas filtrarConsultaCpfPaciente(Long cpf);
    
    public void atualizarConsulta(Consultas consulta);
    
    public void deletarConsulta(Consultas consulta);
    
    public List<Consultas> filtrarNomeMedico(String nomeMedico);
}
