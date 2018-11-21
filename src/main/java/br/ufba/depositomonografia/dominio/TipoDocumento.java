package br.ufba.depositomonografia.dominio;

public enum TipoDocumento {

    INICIACAO_CIENTIFICA("Trabalhos de conclusão de Iniciação científica"),
    GRADUACAO("Trabalhos de conclusão de Graduação"),
    MONOGRAFIAS("Monografias de Especialização"),
    DISSERTACOES("Dissertações de Mestrado (defendida e aprovada por banca especializada)"),
    EXAMES("Exames de Qualificação de Doutoramento"),
    TESES("Teses de Doutoramento (defendida e aprovada por banca especializada)"),
    POS_DOUTORADO("Trabalhos de conclusão de pós doutorado"),
    OUTRA_NATUREZA("Trabalhos de conclusão de outra natureza");

    TipoDocumento(String descricao) {

    }
}
