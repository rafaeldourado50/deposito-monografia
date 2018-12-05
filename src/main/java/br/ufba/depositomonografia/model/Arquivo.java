package br.ufba.depositomonografia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "arquivo")
public class Arquivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tipo_arquivo_id")
    private TipoArquivo tipoArquivo;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "deposito_id")
    private Deposito deposito;

    @NotNull
    private Byte arquivo;

    private String descricao;

    private String formato;

    public Arquivo() {
    }

    public Arquivo(TipoArquivo tipoArquivo, Deposito deposito, Byte arquivo, String descricao, String formato) {
        this.tipoArquivo = tipoArquivo;
        this.deposito = deposito;
        this.arquivo = arquivo;
        this.descricao = descricao;
        this.formato = formato;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoArquivo getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(TipoArquivo tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public Byte getArquivo() {
        return arquivo;
    }

    public void setArquivo(Byte arquivo) {
        this.arquivo = arquivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
