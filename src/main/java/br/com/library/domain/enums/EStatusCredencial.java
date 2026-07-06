package br.com.library.domain.enums;

public enum EStatusCredencial {

    EM_DIA(1, "Em dia"),
    VENCIDO(1, "Vencido");

    private final int status;
    private final String descricao;

    EStatusCredencial(int status, String descricao) {
        this.status = status;
        this.descricao = descricao;
    }

    public int getStatus() {
        return status;
    }

    public String getDescricao() {
        return descricao;
    }
}
