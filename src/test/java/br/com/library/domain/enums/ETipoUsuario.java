package br.com.library.domain.enums;

public enum ETipoUsuario {


    COMUM(1, "Comum"),
    ESTUDANTE(2, "Estudante"),
    PROFESSOR(3, "Professor");

    private final int status;
    private final String descricao;

    ETipoUsuario(int status, String descricao) {
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
