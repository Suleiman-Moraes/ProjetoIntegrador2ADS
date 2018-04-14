
package dados;

import interfaces.TratandoDados;
import java.util.ArrayList;

public class Professor extends PaiAlunoProfessor implements TratandoDados{
    // ATRIBUTOS
    private String titulacaoMaxima = "";
    private ArrayList<String> curso = new ArrayList<>();

    //Construtor
    public Professor(){}

    public Professor(String nome, String endereco, int telefone, String titulacaoMaxima, ArrayList<String> curso) throws Exception {
        super(nome, endereco, telefone);
        this.titulacaoMaxima = titulacaoMaxima;
        for (int i = 0; i < curso.size(); i++) {
            this.curso.add(curso.get(i));
        }
    }
    public Professor(PaiAlunoProfessor objeto, String titulacaoMaxima, ArrayList<String> curso) throws Exception {
        super(objeto);
        this.titulacaoMaxima = titulacaoMaxima;
        for (int i = 0; i < curso.size(); i++) {
            this.curso.add(curso.get(i));
        }
    }
    public Professor(Professor objeto) throws Exception {
        super(objeto);
        for (int i = 0; i < objeto.curso.size(); i++) {
            this.curso.add(objeto.curso.get(i));
        }
        this.titulacaoMaxima = objeto.titulacaoMaxima;
    }

    //Metodos
    public String getTitulacaoMaxima() {
        return titulacaoMaxima;
    }
    public ArrayList<String> getCurso() {
        return curso;
    }
    public void setTitulacaoMaxima(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }
    public void setCurso(ArrayList<String> curso) {
        this.curso = curso;
    }
    public void setCurso(String curso) {
        this.curso.add(curso);
    }
    public void removeCurso(){
        curso.remove(curso.size()-1);
    }

    @Override
    public void materializar(String texto) throws Exception {
        String vetorString[] = texto.split(";");
        
        nome = vetorString[0];
        endereco = vetorString[1];
        telefone = Integer.parseInt(vetorString[2]);
        titulacaoMaxima = vetorString[3];
        for (int i = 4; i < vetorString.length; i++)
            curso.add(vetorString[i]);
    }

    @Override
    public String desmaterializar() {
        String tudo = ""+nome+";"+endereco+";"+telefone+";"+titulacaoMaxima;
        for (int i = 0; i < curso.size(); i++) tudo +=";" + curso.get(i);
        return tudo;
    }
}

