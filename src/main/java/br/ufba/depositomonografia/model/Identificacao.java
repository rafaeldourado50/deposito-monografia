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

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "identificacao")
@Getter
@EqualsAndHashCode(exclude = {"deposito"})
@NoArgsConstructor
@AllArgsConstructor
public class Identificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Setter
    @ManyToOne
    @JoinColumn(name = "deposito_id")
    private Deposito deposito;

    @NotNull
    @Setter
    @Enumerated(EnumType.STRING)
    private TipoIdentificacao tipo;

    @Setter
    private String descricao;
}
