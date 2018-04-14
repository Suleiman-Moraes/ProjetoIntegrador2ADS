package dados;

import interfaces.ITurma;
import interfaces.TratandoDados;
import java.util.ArrayList;

public class Disciplina extends PaiCursoDisciplina implements TratandoDados{
    //Atributos
    private int cargaHoraria = 0;
    private String ementa = "";
    private String bibliografia = "";
    private String preRequisitos = "";
    private int codigoDoCurso = 0;
    
    
    //Construtor
    public Disciplina(){}
    public Disciplina(int codigo, String descricao, int cargaHoraria, String ementa, String bibliografia, String preRequisitos, int codigoDOCurso) throws Exception {
        super(codigo, descricao);
        if(cargaHoraria > 10000 && cargaHoraria < 0)throw new Exception("Carga Hor�ria n�o pode ser negativo, nem ter mais que 4 caracteres.");
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.bibliografia = bibliografia;
        this.preRequisitos = preRequisitos;
        this.codigoDoCurso = codigoDOCurso;
    }
    public Disciplina(Disciplina objeto) {
        super(objeto);
        this.cargaHoraria = objeto.cargaHoraria;
        this.ementa = objeto.ementa;
        this.bibliografia = objeto.bibliografia;
        this.preRequisitos = objeto.preRequisitos;
        this.codigoDoCurso = objeto.codigoDoCurso;
        
    }
    
    //Metodos

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public String getPreRequisitos() {
        return preRequisitos;
    }

    public void setCargaHoraria(int cargaHoraria) throws Exception {
        if(cargaHoraria > 10000 && cargaHoraria < 0)throw new Exception("Carga Hor�ria n�o pode ser negativo, nem ter mais que 4 caracteres.");
        this.cargaHoraria = cargaHoraria;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public void setPreRequisitos(String preRequisitos) {
        this.preRequisitos = preRequisitos;
    }
    
    @Override
    public void materializar(String texto) throws Exception {
        String vetorString[] = texto.split(";");
        
        codigo = Integer.parseInt(vetorString[0]);
        descricao = vetorString[1];
        cargaHoraria = Integer.parseInt(vetorString[2]);
        ementa = vetorString[3];
        bibliografia = vetorString[4];
        preRequisitos = vetorString[5];
        codigoDoCurso = Integer.parseInt(vetorString[6]);
    }

    @Override
    public String desmaterializar() {
        String tudo = ""+codigo+";"+descricao+";"+cargaHoraria+";"+ementa+";"+bibliografia+";"+preRequisitos+";"+codigoDoCurso;
        return tudo;
    }

    public int getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public void setCodigoDoCurso(int codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }
}