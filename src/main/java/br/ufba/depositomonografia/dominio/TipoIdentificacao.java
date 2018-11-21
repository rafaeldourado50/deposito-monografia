package br.ufba.depositomonografia.dominio;

public enum TipoIdentificacao {

    ISSN("issn", "ISSN"),
    OTHER("other", "Outro"),
    URI("uri", "URI"),
    ISBN("isbn", "ISBN");

    TipoIdentificacao(String valor, String descricao) {

    }
}
