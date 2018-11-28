package br.ufba.depositomonografia.dominio;

public enum Idioma {

    PT("pt_BR", "Português"),
    EN("en", "Inglês"),
    FR("fr", "Francês"),
    ES("es", "Espanhol"),
    DE("de", "Alemão"),
    CA("ca", "Catalão"),
    NL("nl", "Holandês"),
    IT("it", "Italiano"),
    LA("la", "Latim");

    private String valor;
    private String descricao;

    Idioma(String valor, String descricao) {
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
