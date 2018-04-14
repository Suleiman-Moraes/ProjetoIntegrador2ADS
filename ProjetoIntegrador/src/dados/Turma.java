package dados;

import interfaces.TratandoDados;


public class Turma implements TratandoDados{
    //Atributos
    private int ano = 0;
    private String semestre = "";
    private String diasDaSemana = "";
    private String horarioEntrada = "";
    private String horarioSaida = "";
    private int codigoDaDisciplina = 0;
    private int codigoDoCurso = 0;
    
    //private ArrayList<>
    
    //Construtor
    public Turma(){}
    public Turma(int ano, String semestre, String diasDaSemana, String horarioEntrada, String horarioSaida, int codigoDoCurso, int codigoDaDisciplina) throws Exception{
        if(ano > 10000 && ano < 0)throw new Exception("Ano não pode ser negativo, nem ter mais que 4 caracteres.");
        this.ano = ano;
        this.semestre = semestre;
        this.diasDaSemana = diasDaSemana;
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
        this.codigoDaDisciplina = codigoDaDisciplina;
        this.codigoDoCurso = codigoDoCurso;
    }
    public Turma(Turma objeto) {
        this.ano = objeto.ano;
        this.semestre = objeto.semestre;
        this.diasDaSemana = objeto.diasDaSemana;
        this.horarioEntrada = objeto.horarioEntrada;
        this.horarioSaida = objeto.horarioSaida;
        this.codigoDaDisciplina = objeto.codigoDaDisciplina;
        this.codigoDoCurso = objeto.codigoDoCurso;
    }

    //Metodos

    public int getAno() {
        return ano;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getDiasDaSemana() {
        return diasDaSemana;
    }

    public String getHorarioEntrada() {
        return horarioEntrada;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }

    public int getCodigoDaDisciplina() {
        return codigoDaDisciplina;
    }

    public int getCodigoDoCurso() {
        return codigoDoCurso;
    }

    public void setAno(int ano) throws Exception {
        if(ano > 10000 && ano < 0)throw new Exception("Ano não pode ser negativo, nem ter mais que 4 caracteres.");
        this.ano = ano;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public void setDiasDaSemana(String diasDaSemana) {
        this.diasDaSemana = diasDaSemana;
    }

    public void setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public void setCodigoDaDisciplina(int codigoDaDisciplina) {
        this.codigoDaDisciplina = codigoDaDisciplina;
    }

    public void setCodigoDoCurso(int codigoDoCurso) {
        this.codigoDoCurso = codigoDoCurso;
    }

    @Override
    public void materializar(String texto) throws Exception {
        String vetorString[] = texto.split(";");
        
        ano = Integer.parseInt(vetorString[0]);
        semestre = vetorString[1];
        diasDaSemana = vetorString[2];
        horarioEntrada = vetorString[3];
        horarioSaida = vetorString[4];
        codigoDoCurso = Integer.parseInt(vetorString[5]);
        codigoDaDisciplina = Integer.parseInt(vetorString[6]);
        
   }

    @Override
    public String desmaterializar() {
        String tudo = ""+ano+";"+semestre+";"+diasDaSemana+";"+horarioEntrada+";"+horarioSaida+";"+codigoDoCurso+";"+codigoDaDisciplina;
        
        return tudo;
    }
}
