
package br.upe.poo.clinica.persistencia;

import br.upe.poo.clinica.entidades.Medicos;
import java.util.List;

/**
 *
 * @author manoel
 */
public interface InterfaceRepositorioMedicos {
    
    public void cadastrarMedicos(Medicos medico);
    
    public Medicos buscarMedicoCpf(Long cpf);
    
    public List<Medicos> buscarMedicoNome(String nome);
    
    public void atualizarMedico(Medicos medico);
    
    public void deletarMedico(Medicos medico);
}
