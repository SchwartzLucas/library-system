package br.com.library.domain.enums;

public enum EStatusEmprestimo {
    EMPRESTADO(1, "Emprestado"),
    DISPONIVEL(2, "Disponível"),
    TOTALMENTE_EMPRESTADO(3, "Totalmente emprestado");

    private final int status;
    private final String descricao;

    EStatusEmprestimo(int status, String descricao) {
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
