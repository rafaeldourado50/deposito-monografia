package br.ufba.depositomonografia.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "colecao")
@Getter
@EqualsAndHashCode(of = {"id"})
@ToString
public class Colecao {

    @Id
    private Integer id;

    @NotNull
    @Setter
    private String descricao;
}
