package br.ufba.depositomonografia.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;

import br.ufba.depositomonografia.dominio.TipoIdentificacao;

@Entity
@Table(name = "identificacao")
public class Identificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "deposito_id")
    private Deposito deposito;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoIdentificacao tipo;

    private String descricao;

    public Identificacao() {
    }

    public Identificacao(Deposito deposito, TipoIdentificacao tipo, String descricao) {
        this.deposito = deposito;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public TipoIdentificacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoIdentificacao tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
