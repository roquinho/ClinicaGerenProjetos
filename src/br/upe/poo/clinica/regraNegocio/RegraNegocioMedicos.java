
package br.upe.poo.clinica.regraNegocio;

import br.upe.poo.clinica.entidades.Medicos;
import br.upe.poo.clinica.persistencia.InterfaceRepositorioMedicos;
import br.upe.poo.clinica.persistencia.RepositorioMedicos;
import java.util.List;

/**
 *
 * @author manoel
 */
public class RegraNegocioMedicos implements InterfaceRegraNegocioMedicos {
     private InterfaceRepositorioMedicos rm;
     
       public RegraNegocioMedicos() {
           this.rm = new RepositorioMedicos();
       }
    
    @Override
    public void cadastrarMedicos(Medicos medico) throws ExceptionRegraNegocioCadastrarMedicos {
        if(medico == null) {
            throw new ExceptionRegraNegocioCadastrarMedicos();
        }
        if(medico.getNome()== null) {
            throw new ExceptionRegraNegocioCadastrarMedicos();
        }
        if(medico.getCpf()==null) {
            throw new ExceptionRegraNegocioCadastrarMedicos();
        }
        if(medico.getCrm()==null) {
            throw new ExceptionRegraNegocioCadastrarMedicos();
        }
        if(medico.equals(rm.buscarMedicoCpf(medico.getCpf()))) {
            throw new ExceptionRegraNegocioCadastrarMedicos();
        }
        else {
           rm.cadastrarMedicos(medico);
        }
    }

    @Override
    public Medicos buscarMedicoCpf(Long cpf) throws ExceptionRegraNegocioBuscarMedicos {
        Medicos medico = new Medicos();
        if(cpf == null){
           throw new ExceptionRegraNegocioBuscarMedicos();
       }
       else {
          medico = rm.buscarMedicoCpf(cpf);
       }       
        return medico;
    }

    @Override
    public List<Medicos> buscarMedicoNome(String nome) throws ExceptionRegraNegocioBuscarMedicos {
        List<Medicos> listaMedicos = null;
        if(nome == null) {
          throw new ExceptionRegraNegocioBuscarMedicos();
        }
        else {
            listaMedicos = rm.buscarMedicoNome(nome);
        }
        return listaMedicos;
    }

    @Override
    public void atualizarMedico(Medicos medico) throws ExceptionRegraNegocioAtualizarMedicos {
        if(medico == null) {
            throw new ExceptionRegraNegocioAtualizarMedicos();
        }
        if(medico.getNome()== null) {
            throw new ExceptionRegraNegocioAtualizarMedicos();
        }
        if(medico.getCpf()==null) {
            throw new ExceptionRegraNegocioAtualizarMedicos();
        }
        if(medico.getCrm()==null) {
            throw new ExceptionRegraNegocioAtualizarMedicos();
        }
        if(medico.equals(rm.buscarMedicoCpf(medico.getCpf()))==false) {
            throw new ExceptionRegraNegocioAtualizarMedicos();
        }   
        else {
            rm.atualizarMedico(medico);
        }
       
    }

    @Override
    public void deletarMedico(Medicos medico) throws ExceptionRegraNegocioDeletarMedicos {
        if(medico == null) {
           throw new ExceptionRegraNegocioDeletarMedicos();
       }
        if(medico.equals(rm.buscarMedicoCpf(medico.getCpf()))==false) {
            throw new ExceptionRegraNegocioDeletarMedicos();
        }
       else {
           rm.deletarMedico(medico);
       }
       }
       

    public InterfaceRepositorioMedicos getRm() {
        return rm;
    }

    public void setRm(InterfaceRepositorioMedicos rm) {
        this.rm = rm;
    }

}
