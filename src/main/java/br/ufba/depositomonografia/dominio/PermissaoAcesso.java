package br.ufba.depositomonografia.dominio;

public enum PermissaoAcesso {

    ACESSO_ABERTO("acesso aberto", "Acesso aberto"),
    UM_MES("1 mes", "Embargado: 1 mês"),
    TRES_MESES("3 meses", "Embargado: 3 meses"),
    SEIS_MESES("6 meses", "Embargado: 6 meses"),
    UM_ANO("1 ano", "Embargado: 1 ano"),
    CINCO_ANOS("5 anos", "Embargado: 5 anos"),
    DEZ_ANOS("10 anos", "Embargado: 10 anos"),
    RESTRITO("restrito", "Restrito");

    private String valor;
    private String descricao;

    PermissaoAcesso(String valor, String descricao) {
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
