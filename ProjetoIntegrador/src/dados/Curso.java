package dados;

import interfaces.TratandoDados;

public class Curso extends PaiCursoDisciplina implements TratandoDados{
    //Atributos
    private Coordenador coordenado = null;
    
    //Contrutor
    public Curso(){}
    public Curso(int codigo, String descricao, Coordenador coordenado) throws Exception {
        super(codigo, descricao);
        this.coordenado = coordenado;
    }
    public Curso(int codigo, String descricao, String nome) throws Exception {
        super(codigo, descricao);
        this.coordenado = new Coordenador(nome);
    }
    public Curso(Curso objeto) {
        super(objeto);
        this.coordenado = objeto.coordenado;
    }

    //Metodos
    public Coordenador getCoordenado() {
        return coordenado;
    }
    public void setCoordenado(Coordenador coordenado) {
        this.coordenado = coordenado;
    }

    @Override
    public void materializar(String texto) throws Exception {
        String vetorString[] = texto.split(";");
        
        codigo = Integer.parseInt(vetorString[0]);
        descricao = vetorString[1];
        coordenado = new Coordenador(vetorString[2]);
    }

    @Override
    public String desmaterializar() {
        String tudo = ""+codigo+";"+descricao+";"+coordenado.getNome();
        return tudo;
    }
}
