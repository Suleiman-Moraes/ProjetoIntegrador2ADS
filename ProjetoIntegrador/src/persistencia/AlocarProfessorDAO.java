package persistencia;

import dados.AlocarProfessor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class AlocarProfessorDAO {
    //Atributos
    private String nomeDoArquivo = "";
    private String disciplina = "";
    private String curso = "";
    private String turma = "";

    //Construtor
    public AlocarProfessorDAO(String nomeDoArquivo, String disciplina, String curso, String turma) {
        this.nomeDoArquivo = nomeDoArquivo;
        this.curso = curso;
        this.disciplina = disciplina;
        this.turma = turma;
    }

    public void incluir(AlocarProfessor objeto) throws Exception {
        try {
            DisciplinaDAO disci = new DisciplinaDAO(disciplina);
            CursoDAO cur = new CursoDAO(curso);
            TurmaDAO turm = new TurmaDAO(turma);
            if(cur.visualizar(objeto.getCodigoDoCurso()) == null)throw new Exception("Curso inválido.");
            if(disci.visualizar(objeto.getCodigoDaDisciplina(), curso) == null)throw new Exception("Disciplina inválido.");
            if(turm.visualizar(objeto.getSemestreDaTurma())== null)throw new Exception("Turma inválido.");
            
            //Cria o arquivo
            FileWriter cria = new FileWriter(nomeDoArquivo, true);
            //Cria a caixa dagua
            BufferedWriter caixa = new BufferedWriter(cria);
            //Escreve no arqivo
            caixa.write(objeto.desmaterializar() + "\n");
            //fecha o arquivo
            caixa.close();
        } catch (Exception e) {
            throw e;
        }
    }
    public ArrayList<AlocarProfessor> recuperar() throws Exception {
        try {
            DisciplinaDAO disci = new DisciplinaDAO(disciplina);
            CursoDAO cur = new CursoDAO(curso);
            TurmaDAO turm = new TurmaDAO(turma);
            
            ArrayList<AlocarProfessor> lista = new ArrayList<AlocarProfessor>();
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);
            
            String linha = "";
            
            while((linha = caixaDaguaDeLeitura.readLine()) != null){
                AlocarProfessor objetoAux = new AlocarProfessor();
                objetoAux.materializar(linha);
                if(cur.visualizar(objetoAux.getCodigoDoCurso()) == null)throw new Exception("Curso inválido.");
                if(disci.visualizar(objetoAux.getCodigoDaDisciplina(), curso) == null)throw new Exception("Disciplina inválido.");
                if(turm.visualizar(objetoAux.getSemestreDaTurma()) == null)throw new Exception("Turma inválido.");
                lista.add(objetoAux);
            }
            
            caixaDaguaDeLeitura.close();
            
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    public AlocarProfessor visualizar(String nome) throws Exception {
        try {
            AlocarProfessor objeto = null;
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);
            
            String linha = "";
            
            while((linha = caixaDaguaDeLeitura.readLine()) != null){
                AlocarProfessor objetoAux = new AlocarProfessor();
                objetoAux.materializar(linha);
                if(objetoAux.getSemestreDaTurma() == nome){
                    objeto = new AlocarProfessor(objetoAux);
                    caixaDaguaDeLeitura.close();
                    CursoDAO cur = new CursoDAO(curso);
                    TurmaDAO tur = new TurmaDAO(turma);
                    DisciplinaDAO dic = new DisciplinaDAO(disciplina);
                    if(cur.visualizar(objetoAux.getCodigoDoCurso()) == null)throw new Exception("Curso inválido.");
                    if(tur.visualizar(objetoAux.getSemestreDaTurma()) == null)throw new Exception("Turma inválido.");
                    if(cur.visualizar(objetoAux.getCodigoDaDisciplina()) == null)throw new Exception("Disciplina inválido.");
                    return objeto;
                }
            }
            
            caixaDaguaDeLeitura.close();
            
            return null;
        } catch (Exception e) {
            throw e;
        }
    }

    public void excluir(String nome) throws Exception {
        try {
            ArrayList<AlocarProfessor> lista = this.recuperar();
            //Cria o arquivo
            FileWriter criaArquivo = new FileWriter(nomeDoArquivo);
            //Cria a caixa dagua
            BufferedWriter caixaDagua = new BufferedWriter(criaArquivo);
            
            for (int posicao = 0; posicao < lista.size(); posicao++) {
                AlocarProfessor aux = lista.get(posicao);
                
                if(aux.getSemestreDaTurma() != nome) caixaDagua.write(aux.desmaterializar() + "\n");
            }
            
            caixaDagua.close();
        } catch (Exception e) {
        }
    }

    public void alterar(String nome, AlocarProfessor novo) throws Exception {
        try {
            ArrayList<AlocarProfessor> lista = this.recuperar();
            //Cria o arquivo
            FileWriter criaArquivo = new FileWriter(nomeDoArquivo);
            //Cria a caixa dagua
            BufferedWriter caixaDagua = new BufferedWriter(criaArquivo);
            
            for (int posicao = 0; posicao < lista.size(); posicao++) {
                AlocarProfessor aux = lista.get(posicao);
                if(aux.getSemestreDaTurma() == nome) caixaDagua.write(novo.desmaterializar() + "\n");
                else caixaDagua.write(aux.desmaterializar() + "\n");
            }
            
            caixaDagua.close();
        } catch (Exception e) {
        }
    }
}