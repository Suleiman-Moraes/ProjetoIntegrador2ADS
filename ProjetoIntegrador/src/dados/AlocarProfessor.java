package dados;

import interfaces.TratandoDados;

public class AlocarProfessor implements TratandoDados{
    //Atributos
    private int codigoDaDisciplina = 0;
    private int codigoDoCurso = 0; 
    private String semestreDaTurma = "";
    private String nomeDoProfessor = "";
    
    //Construtor
    public AlocarProfessor(){}
    public AlocarProfessor(int codigoDaDisciplina, int codigoDoCurso, String semestreDaTurma, String nomeDoProfessor){
        this.codigoDaDisciplina = codigoDaDisciplina;
        this.codigoDoCurso = codigoDoCurso;
        this.semestreDaTurma = semestreDaTurma;
        this.nomeDoProfessor = nomeDoProfessor;
    }
    public AlocarProfessor(AlocarProfessor professor){
        this.codigoDaDisciplina = professor.codigoDaDisciplina;
        this.codigoDoCurso = professor.codigoDoCurso;
        this.semestreDaTurma = professor.semestreDaTurma;
        this.nomeDoProfessor = professor.nomeDoProfessor;
    }
    
    //Metodos

    public int getCodigoDaDisciplina(){return codigoDaDisciplina;}
    public int getCodigoDoCurso(){return codigoDoCurso;}
    public String getSemestreDaTurma(){return semestreDaTurma;}
    public String getNomeDoProfessor(){return nomeDoProfessor;}
    public void setCodigoDaDisciplina(int codigoDaDisciplina){this.codigoDaDisciplina = codigoDaDisciplina;}
    public void setCodigoDoCurso(int codigoDoCurso){this.codigoDoCurso = codigoDoCurso;}
    public void setSemestreDaTurma(String semestreDaTurma){this.semestreDaTurma = semestreDaTurma;}
    public void setNomeDoProfessor(String nomeDoProfessor){this.nomeDoProfessor = nomeDoProfessor;}

    @Override
    public void materializar(String texto) throws Exception {
        String vetorString[] = texto.split(";");
        
        codigoDaDisciplina = Integer.parseInt(vetorString[0]);
        codigoDoCurso = Integer.parseInt(vetorString[1]);
        semestreDaTurma = vetorString[2];
        nomeDoProfessor = vetorString[3];
    }

    @Override
    public String desmaterializar() {
        return "" + codigoDaDisciplina + ";" + codigoDoCurso + ";" + semestreDaTurma + ";" +nomeDoProfessor;
    }
}
