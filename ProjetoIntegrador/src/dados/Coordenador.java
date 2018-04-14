package dados;
public class Coordenador {
    //Atributos
    private String nome = "";
    
    //contrutor
    public Coordenador(){}
    public Coordenador(String nome){this.nome = nome;}
    public Coordenador(Coordenador objeto){this.nome = objeto.nome;}
    
    //Metodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
