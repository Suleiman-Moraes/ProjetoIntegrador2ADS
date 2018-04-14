package dados;

public class Aluno extends PaiAlunoProfessor {

    //Atributos
    private int matricula = 0;
    private String situacao = "";
    private String curso = "";

    //Construtor
    public Aluno() {
    }

    public Aluno(String nome, String endereco, int telefone, String curso, int matricula, String situacao) throws Exception {
        super(nome, endereco, telefone);
        if (matricula <= 0) {
            throw new Exception("Matricula não pode ser menor ou igual a zero.");
        }
        this.matricula = matricula;
        this.situacao = situacao;
        this.curso = curso;
    }

    public Aluno(Aluno objeto) throws Exception {
        super(objeto);
        this.matricula = objeto.matricula;
        this.situacao = objeto.situacao;
        this.curso = objeto.curso;
    }

    //Metodos
    public int getMatricula() {
        return matricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(int matricula) throws Exception {
        if (matricula <= 0) {
            throw new Exception("Matricula não pode ser menor ou igual a zero.");
        }
        this.matricula = matricula;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void materializar(String texto) throws Exception {
        String vetorString[] = texto.split(";");

        nome = vetorString[0];
        endereco = vetorString[1];
        telefone = Integer.parseInt(vetorString[2]);
        curso = vetorString[3];
        matricula = Integer.parseInt(vetorString[4]);
        situacao = vetorString[5];
    }

    public String desmaterializar() {
        String tudo = "" + nome + ";" + endereco + ";" + telefone + ";" + curso + ";" + matricula + ";" + situacao;
        return tudo;
    }
}
