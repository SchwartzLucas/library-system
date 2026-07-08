package br.com.library.domain.enums;

public enum EStatusLivro {

    EMPRESTADO(1, "Emprestado"),
    DISPONIVEL(1, "Disponivel");

    private final int status;
    private final String descricao;

    EStatusLivro(int status, String descricao) {
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
