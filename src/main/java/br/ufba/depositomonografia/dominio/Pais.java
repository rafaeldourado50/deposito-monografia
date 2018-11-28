package br.ufba.depositomonografia.dominio;

public enum Pais {

    BRASIL("brasil", "Brasil"),
    AFRICA_DO_SUL("africa do sul", "África do Sul"),
    ALEMANHA("alemanha", "Alemanha"),
    ANGOLA("angola", "Angola"),
    ARGENTINA("argentina", "Argentina"),
    AUSTRALIA("australia", "Austrália"),
    AUSTRIA("austria", "Áustria"),
    BELGICA("belgica", "Bélgica"),
    BOLIVIA("bolivia", "Bolívia"),
    CANADA("canada", "Canadá"),
    CHILE("chile", "Chile"),
    CHINA("china", "China"),
    COLOMBIA("colombia", "Colômbia"),
    ESPANHA("espanha", "Espanha"),
    ESTADOS_UNIDOS("estados unidos", "Estados Unidos"),
    FRANCA("franca", "França"),
    GRA_BRETANHA("gra-bretanha", "Grã-Bretanha"),
    HOLANDA("holanda", "Holanda"),
    ITALIA("italia", "Itália"),
    MEXICO("mexico", "México"),
    PORTUGAL("portugal", "Portugal"),
    SUICA("suica", "Suiça"),
    URUGUAI("uruguai", "Uruguai");

    private String valor;
    private String descricao;

    Pais(String valor, String descricao) {
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
