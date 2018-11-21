package br.ufba.depositomonografia.model;

import javax.persistence.*;

import javax.validation.constraints.NotNull;

import br.ufba.depositomonografia.dominio.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "deposito")
@Getter
@EqualsAndHashCode(exclude = {"colecao"})
@NoArgsConstructor
@AllArgsConstructor
public class Deposito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Setter
    @ManyToOne
    @JoinColumn(name = "colecao_id")
    private Colecao colecao;

    @NotNull
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_documento")
    private TipoDocumento tipoDocumento;

    @Setter
    @Column(name = "multiplos_arquivos")
    private Boolean multiplosArquivos;

    @NotNull
    @Setter
    @Column(name = "autor_nome")
    private String autorNome;

    @NotNull
    @Setter
    @Column(name = "autor_sobrenome")
    private String autorSobrenome;

    @Setter
    @Column(name = "orientador_nome")
    private String orientadorNome;

    @Setter
    @Column(name = "orientador_sobrenome")
    private String orientadorSobrenome;

    @NotNull
    @Setter
    @Column(name = "titulo")
    private String titulo;

    @Setter
    @Column(name = "mes_defesa")
    private Integer mesDefesa;

    @Setter
    @Column(name = "dia_defesa")
    private Integer diaDefesa;

    @NotNull
    @Setter
    @Column(name = "ano_defesa")
    private Integer anoDefesa;

    @NotNull
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "pais")
    private Pais pais;

    @NotNull
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "idioma")
    private Idioma idioma;

    @Setter
    @Column(name = "agencia_fomento")
    private String agenciaFomento;

    @NotNull
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "permissao_acesso")
    private PermissaoAcesso permissaoAcesso;
}
