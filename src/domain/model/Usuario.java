package domain.model;

import domain.enums.EStatusCredencial;
import domain.enums.ETipoUsuario;

public class Usuario {

    private int id;
    private String nome;
    private String cpf;
    private String email;
    private ETipoUsuario tipoUsuario;
    private CredencialInstitucional credencialInstitucional;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ETipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(ETipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public CredencialInstitucional getCredencialInstitucional() {
        return credencialInstitucional;
    }

    public void setCredencialInstitucional(CredencialInstitucional credencialInstitucional) {
        this.credencialInstitucional = credencialInstitucional;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                ", credencialInstitucional=" + credencialInstitucional +
                '}';
    }
}
