package br.ufba.depositomonografia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "programa_pos_graduacao")
@Getter
@EqualsAndHashCode(exclude = {"deposito"})
@NoArgsConstructor
@AllArgsConstructor
public class ProgramaPosGraduacao {

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
    private String nome;
}