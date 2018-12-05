package br.ufba.depositomonografia.model;

import br.ufba.depositomonografia.dominio.Idioma;
import br.ufba.depositomonografia.dominio.Pais;
import br.ufba.depositomonografia.dominio.PermissaoAcesso;
import br.ufba.depositomonografia.dominio.TipoDocumento;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "deposito")
public class Deposito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Coleção é uma informação obrigatória.")
    @ManyToOne
    @JoinColumn(name = "colecao_id")
    private Colecao colecao;

    @NotNull(message = "Tipo do Documento é uma informação obrigatória.")
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_documento")
    private TipoDocumento tipoDocumento;

    @Column(name = "multiplos_arquivos")
    private Boolean multiplosArquivos;

    @NotNull(message = "O Nome do Autor é uma informação obrigatória.")
    @NotBlank(message = "O Nome do Autor não pode ser vazio.")
    @Column(name = "autor_nome")
    private String autorNome;

    @NotNull(message = "O Sobrenome do Autor é uma informação obrigatória.")
    @NotBlank(message = "O Sobrenome do Autor não pode ser vazio.")
    @Column(name = "autor_sobrenome")
    private String autorSobrenome;

    @NotNull(message = "Orientador é uma informação obrigatória.")
    @ManyToOne
    @JoinColumn(name = "orientador_id")
    private Professor orientador;

    @NotNull(message = "Título é uma informação obrigatória.")
    @NotBlank(message = "Título não pode ser vazio.")
    @Column(name = "titulo")
    private String titulo;

    @Column(name = "mes_defesa")
    private Integer mesDefesa;

    @Column(name = "dia_defesa")
    private Integer diaDefesa;

    @NotNull(message = "Ano de Defesa é uma informação obrigatória.")
    @Column(name = "ano_defesa")
    private Integer anoDefesa;

    @NotNull(message = "País é uma informação obrigatória.")
    @Enumerated(EnumType.STRING)
    @Column(name = "pais")
    private Pais pais;

    @NotNull(message = "Idioma é uma informação obrigatória.")
    @Enumerated(EnumType.STRING)
    @Column(name = "idioma")
    private Idioma idioma;

    @Column(name = "agencia_fomento")
    private String agenciaFomento;

    @NotNull(message = "Permissão de Acesso é uma informação obrigatória.")
    @Enumerated(EnumType.STRING)
    @Column(name = "permissao_acesso")
    private PermissaoAcesso permissaoAcesso;

    public Deposito() {

    }

    public Deposito(Colecao colecao, TipoDocumento tipoDocumento, Boolean multiplosArquivos,
                    String autorNome, String autorSobrenome, Professor orientador, String titulo,
                    Integer mesDefesa, Integer diaDefesa, Integer anoDefesa, Pais pais, Idioma idioma,
                    String agenciaFomento, PermissaoAcesso permissaoAcesso) {
        this.colecao = colecao;
        this.tipoDocumento = tipoDocumento;
        this.multiplosArquivos = multiplosArquivos;
        this.autorNome = autorNome;
        this.autorSobrenome = autorSobrenome;
        this.orientador = orientador;
        this.titulo = titulo;
        this.mesDefesa = mesDefesa;
        this.diaDefesa = diaDefesa;
        this.anoDefesa = anoDefesa;
        this.pais = pais;
        this.idioma = idioma;
        this.agenciaFomento = agenciaFomento;
        this.permissaoAcesso = permissaoAcesso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Colecao getColecao() {
        return colecao;
    }

    public void setColecao(Colecao colecao) {
        this.colecao = colecao;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Boolean getMultiplosArquivos() {
        return multiplosArquivos;
    }

    public void setMultiplosArquivos(Boolean multiplosArquivos) {
        this.multiplosArquivos = multiplosArquivos;
    }

    public String getAutorNome() {
        return autorNome;
    }

    public void setAutorNome(String autorNome) {
        this.autorNome = autorNome;
    }

    public String getAutorSobrenome() {
        return autorSobrenome;
    }

    public void setAutorSobrenome(String autorSobrenome) {
        this.autorSobrenome = autorSobrenome;
    }

    public Professor getOrientador() {
        return orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getMesDefesa() {
        return mesDefesa;
    }

    public void setMesDefesa(Integer mesDefesa) {
        this.mesDefesa = mesDefesa;
    }

    public Integer getDiaDefesa() {
        return diaDefesa;
    }

    public void setDiaDefesa(Integer diaDefesa) {
        this.diaDefesa = diaDefesa;
    }

    public Integer getAnoDefesa() {
        return anoDefesa;
    }

    public void setAnoDefesa(Integer anoDefesa) {
        this.anoDefesa = anoDefesa;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public String getAgenciaFomento() {
        return agenciaFomento;
    }

    public void setAgenciaFomento(String agenciaFomento) {
        this.agenciaFomento = agenciaFomento;
    }

    public PermissaoAcesso getPermissaoAcesso() {
        return permissaoAcesso;
    }

    public void setPermissaoAcesso(PermissaoAcesso permissaoAcesso) {
        this.permissaoAcesso = permissaoAcesso;
    }
}
