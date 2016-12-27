
package brr.upe.poo.clinica.regraNegocio;

import brr.upe.poo.clinica.entidades.Exames;
import java.util.List;

/**
 *
 * @author manoel
 */
public interface InterfaceRegraNegocioExames {
    
    public void agendarExame(Exames exame)throws ExceptionRegraNegocioAgendarExame;
    
    public Exames filtrarExameCpfPaciente(Long cpf)throws ExceptionRegraNegocioFiltrarExame;
    
    public List<Exames> filtrarExameNomePaciente(String nome)throws ExceptionRegraNegocioFiltrarExame;
    
    public void atualizarExame(Exames exame)throws ExceptionRegraNegocioAtualizarExames;
    
    public void deletarExame(Exames exame)throws ExceptionRegraNegocioDeletarExames;
    
}
