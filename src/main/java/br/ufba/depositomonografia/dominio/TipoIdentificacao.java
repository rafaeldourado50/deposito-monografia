package br.ufba.depositomonografia.dominio;

public enum TipoIdentificacao {

    ISSN("issn", "ISSN"),
    OTHER("other", "Outro"),
    URI("uri", "URI"),
    ISBN("isbn", "ISBN");

    private String valor;
    private String descricao;

    TipoIdentificacao(String valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
