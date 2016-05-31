/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author manoel
 */
@Entity
@Table(name = "medicos", catalog = "clinica", schema = "")
@NamedQueries({
    @NamedQuery(name = "Medicos.findAll", query = "SELECT m FROM Medicos m"),
    @NamedQuery(name = "Medicos.findByNome", query = "SELECT m FROM Medicos m WHERE m.nome = :nome"),
    @NamedQuery(name = "Medicos.findByTelefone", query = "SELECT m FROM Medicos m WHERE m.telefone = :telefone"),
    @NamedQuery(name = "Medicos.findByCrm", query = "SELECT m FROM Medicos m WHERE m.crm = :crm"),
    @NamedQuery(name = "Medicos.findByEndereco", query = "SELECT m FROM Medicos m WHERE m.endereco = :endereco"),
    @NamedQuery(name = "Medicos.findByEspecialidade", query = "SELECT m FROM Medicos m WHERE m.especialidade = :especialidade"),
    @NamedQuery(name = "Medicos.findByCpf", query = "SELECT m FROM Medicos m WHERE m.cpf = :cpf")})
public class Medicos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "CRM")
    private BigInteger crm;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "ESPECIALIDADE")
    private String especialidade;
    @Id
    @Basic(optional = false)
    @Column(name = "CPF")
    private Long cpf;

    public Medicos() {
    }

    public Medicos(Long cpf) {
        this.cpf = cpf;
    }

    public Medicos(Long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public BigInteger getCrm() {
        return crm;
    }

    public void setCrm(BigInteger crm) {
        BigInteger oldCrm = this.crm;
        this.crm = crm;
        changeSupport.firePropertyChange("crm", oldCrm, crm);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        String oldEspecialidade = this.especialidade;
        this.especialidade = especialidade;
        changeSupport.firePropertyChange("especialidade", oldEspecialidade, especialidade);
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        Long oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicos)) {
            return false;
        }
        Medicos other = (Medicos) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InterfaceGrafica.Medicos[ cpf=" + cpf + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
