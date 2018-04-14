package dados;
public class PaiAlunoProfessor {
    //Atributos
    
    protected String nome = "";
    protected String endereco = "";
    protected  int telefone = 0;
 
    // Construtores
    public PaiAlunoProfessor(){}
    public PaiAlunoProfessor(String nome, String endereco, int telefone) throws Exception{
        if(telefone <= 0)throw new Exception("Telefone não pode conter numeros negativos");
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public PaiAlunoProfessor (PaiAlunoProfessor objeto) throws Exception{
        this.nome = objeto.nome;
        this.endereco = objeto.endereco;
        this.telefone = objeto.telefone;
    }

    //Metodos
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(Integer telefone) throws Exception {
        if (telefone <= 0) throw new Exception("Telefone n�o pode conter numeros negativos");
        this.telefone = telefone;
    }
}

