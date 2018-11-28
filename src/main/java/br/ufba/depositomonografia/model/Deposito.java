package br.ufba.depositomonografia.model;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.ufba.depositomonografia.dominio.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "deposito")
@EqualsAndHashCode(exclude = {"colecao"})
@NoArgsConstructor
@AllArgsConstructor
public class Deposito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Coleção é uma informação obrigatória.")
    @Setter
    @ManyToOne
    @JoinColumn(name = "colecao_id")
    private Colecao colecao;

    @NotNull(message = "Tipo do Documento é uma informação obrigatória.")
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_documento")
    private TipoDocumento tipoDocumento;

    @Setter
    @Column(name = "multiplos_arquivos")
    private Boolean multiplosArquivos;

    @NotNull(message = "O Nome do Autor é uma informação obrigatória.")
    @NotBlank(message = "O Nome do Autor não pode ser vazio.")
    @Setter
    @Column(name = "autor_nome")
    private String autorNome;

    @NotNull(message = "O Sobrenome do Autor é uma informação obrigatória.")
    @NotBlank(message = "O Sobrenome do Autor não pode ser vazio.")
    @Setter
    @Column(name = "autor_sobrenome")
    private String autorSobrenome;

    @Setter
    @Column(name = "orientador_nome")
    private String orientadorNome;

    @Setter
    @Column(name = "orientador_sobrenome")
    private String orientadorSobrenome;

    @NotNull(message = "Título é uma informação obrigatória.")
    @NotBlank(message = "Título não pode ser vazio.")
    @Setter
    @Column(name = "titulo")
    private String titulo;

    @Setter
    @Column(name = "mes_defesa")
    private Integer mesDefesa;

    @Setter
    @Column(name = "dia_defesa")
    private Integer diaDefesa;

    @NotNull(message = "Ano de Defesa é uma informação obrigatória.")
    @Setter
    @Column(name = "ano_defesa")
    private Integer anoDefesa;

    @NotNull(message = "País é uma informação obrigatória.")
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "pais")
    private Pais pais;

    @NotNull(message = "Idioma é uma informação obrigatória.")
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "idioma")
    private Idioma idioma;

    @Setter
    @Column(name = "agencia_fomento")
    private String agenciaFomento;

    @NotNull(message = "Permissão de Acesso é uma informação obrigatória.")
    @Setter
    @Enumerated(EnumType.STRING)
    @Column(name = "permissao_acesso")
    private PermissaoAcesso permissaoAcesso;

    public Long getId() {
        return id;
    }

    public Colecao getColecao() {
        return colecao;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public Boolean getMultiplosArquivos() {
        return multiplosArquivos;
    }

    public String getAutorNome() {
        return autorNome;
    }

    public String getAutorSobrenome() {
        return autorSobrenome;
    }

    public String getOrientadorNome() {
        return orientadorNome;
    }

    public String getOrientadorSobrenome() {
        return orientadorSobrenome;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getMesDefesa() {
        return mesDefesa;
    }

    public Integer getDiaDefesa() {
        return diaDefesa;
    }

    public Integer getAnoDefesa() {
        return anoDefesa;
    }

    public Pais getPais() {
        return pais;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public String getAgenciaFomento() {
        return agenciaFomento;
    }

    public PermissaoAcesso getPermissaoAcesso() {
        return permissaoAcesso;
    }
}
