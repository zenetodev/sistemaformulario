package model;

public class Usuario{
    private int id;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String senha;

    public Usuario(int id, String nomeCompleto, String cpf, String email, String senha) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }


    public String obterDados(){
        return "Os dados são: " + "\n ID: " + getId() + 
                                    "\n Nome: " + getNomeCompleto() + 
                                    "\n Email: " + getEmail() + 
                                    "\n CPF: "  + getCpf(); 
    }


    public int getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    
}