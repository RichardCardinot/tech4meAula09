package classes;

public class Contato {
    private int codigo;
    private String nome;
    private String telefone;

    public Contato() {
        
    }

    public Contato(String nome, String telefone, int codigo) {
        setNome(nome);
        setTelefone(telefone);
        setCodigo(codigo);
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}