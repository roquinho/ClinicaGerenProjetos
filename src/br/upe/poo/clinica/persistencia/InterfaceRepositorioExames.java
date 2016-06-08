
package br.upe.poo.clinica.persistencia;

import br.upe.poo.clinica.entidades.Exames;
import java.util.List;

/**
 *
 * @author manoel
 */
public interface InterfaceRepositorioExames {
    
    public void agendarExame(Exames exame);
    
    public Exames filtrarExameCpfPaciente(Long cpf);
    
    public List<Exames> filtrarExameNomePaciente(String nome);
    
    public void atualizarExame(Exames exame);
    
    public void deletarExame(Exames exame);
    
}
