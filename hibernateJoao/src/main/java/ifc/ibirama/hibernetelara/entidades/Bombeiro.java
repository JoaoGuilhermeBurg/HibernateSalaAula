/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernetelara.entidades;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author aluno
 */
    @Entity
        @Table (name = "Bombeiro")
public class Bombeiro {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "bom_id")
    private Integer id;
        @Column(name = "bom_cpf")
    private String cpf;
        @Column(name = "dataNascimento")
    private LocalDate dataNascimento;
        @Column(name = "bom_data")
    private Date data;
        @Column(name = "bom_NomeCompleto")
    private String NomeCompleto;
        @Column(name = "bom_nomeGuerra")
    private String nomeGuerra;

    public Bombeiro() {

    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the dataNascimento
     */
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the NomeCompleto
     */
    public String getNomeCompleto() {
        return NomeCompleto;
    }

    /**
     * @param NomeCompleto the NomeCompleto to set
     */
    public void setNomeCompleto(String NomeCompleto) {
        this.NomeCompleto = NomeCompleto;
    }

    /**
     * @return the nomeGuerra
     */
    public String getNomeGuerra() {
        return nomeGuerra;
    }

    /**
     * @param nomeGuerra the nomeGuerra to set
     */
    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bombeiro) {
            Bombeiro aux = (Bombeiro) obj;
            if ((aux.getId() != null) || (aux.getCpf() != null)) {

                if ((aux.getId().equals(this.id)) && (aux.getCpf().equals(this.cpf))) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
