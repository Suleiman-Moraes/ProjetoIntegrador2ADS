package persistencia;

import dados.Turma;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class TurmaDAO {
    //Atributos
    private String nomeDoArquivo = "";
    
    //Construtor
    public TurmaDAO(String nomeDoArquivo){
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public void incluir(Turma objeto, String disciplina, String curso) throws Exception {
        try {
            DisciplinaDAO disci = new DisciplinaDAO(disciplina);
            CursoDAO cur = new CursoDAO(curso);
            if(cur.visualizar(objeto.getCodigoDoCurso()) == null)throw new Exception("Curso inválido.");
            if(disci.visualizar(objeto.getCodigoDaDisciplina(), curso) == null)throw new Exception("Disciplina inválido.");
            
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
    public ArrayList<Turma> recuperar(String disciplina, String curso) throws Exception {
        try {
            DisciplinaDAO disci = new DisciplinaDAO(disciplina);
            CursoDAO cur = new CursoDAO(curso);
            
            ArrayList<Turma> lista = new ArrayList<Turma>();
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);
            
            String linha = "";
            
            while((linha = caixaDaguaDeLeitura.readLine()) != null){
                Turma objetoAux = new Turma();
                objetoAux.materializar(linha);
                if(cur.visualizar(objetoAux.getCodigoDoCurso()) == null)throw new Exception("Curso inválido.");
                if(disci.visualizar(objetoAux.getCodigoDaDisciplina(), curso) == null)throw new Exception("Disciplina inválido.");
                lista.add(objetoAux);
            }
            
            caixaDaguaDeLeitura.close();
            
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    public Turma visualizar(String nome) throws Exception {
        try {
            Turma objeto = null;
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);
            
            String linha = "";
            
            while((linha = caixaDaguaDeLeitura.readLine()) != null){
                Turma objetoAux = new Turma();
                objetoAux.materializar(linha);
                if(objetoAux.getDiasDaSemana().toLowerCase().equals(nome.toLowerCase())){
                    objeto = new Turma(objetoAux);
                    caixaDaguaDeLeitura.close();
                    return objeto;
                } 
                if(objetoAux.getHorarioEntrada().toLowerCase().equals(nome.toLowerCase())){
                    objeto = new Turma(objetoAux);
                    caixaDaguaDeLeitura.close();
                    return objeto;
                }
                if(objetoAux.getSemestre().toLowerCase().equals(nome.toLowerCase())){
                    objeto = new Turma(objetoAux);
                    caixaDaguaDeLeitura.close();
                    return objeto;
                }
                if(objetoAux.getHorarioSaida().toLowerCase().equals(nome.toLowerCase())){
                    objeto = new Turma(objetoAux);
                    caixaDaguaDeLeitura.close();
                    return objeto;
                }
            }
            
            caixaDaguaDeLeitura.close();
            
            return null;
        } catch (Exception e) {
            throw e;
        }
    }

    public void excluir(String nome, String disciplina, String curso) throws Exception {
        try {
            ArrayList<Turma> lista = this.recuperar(disciplina, curso);
            //Cria o arquivo
            FileWriter criaArquivo = new FileWriter(nomeDoArquivo);
            //Cria a caixa dagua
            BufferedWriter caixaDagua = new BufferedWriter(criaArquivo);
            
            for (int posicao = 0; posicao < lista.size(); posicao++) {
                Turma aux = lista.get(posicao);
                
                if(!aux.getDiasDaSemana().toLowerCase().equals(nome.toLowerCase()) && !aux.getHorarioEntrada().toLowerCase().equals(nome.toLowerCase()) && !aux.getSemestre().toLowerCase().equals(nome.toLowerCase()) && !aux.getHorarioSaida().toLowerCase().equals(nome.toLowerCase())) caixaDagua.write(aux.desmaterializar() + "\n");
            }
            
            caixaDagua.close();
        } catch (Exception e) {
        }
    }

    public void alterar(String nome, Turma novo, String disciplina, String curso) throws Exception {
        try {
            ArrayList<Turma> lista = this.recuperar(disciplina, curso);
            //Cria o arquivo
            FileWriter criaArquivo = new FileWriter(nomeDoArquivo);
            //Cria a caixa dagua
            BufferedWriter caixaDagua = new BufferedWriter(criaArquivo);
            
            for (int posicao = 0; posicao < lista.size(); posicao++) {
                Turma aux = lista.get(posicao);
                if(aux.getDiasDaSemana().toLowerCase().equals(nome.toLowerCase())) caixaDagua.write(aux.desmaterializar() + "\n");
                else if(aux.getHorarioEntrada().toLowerCase().equals(nome.toLowerCase())) caixaDagua.write(aux.desmaterializar() + "\n");
                else if(aux.getHorarioSaida().toLowerCase().equals(nome.toLowerCase())) caixaDagua.write(aux.desmaterializar() + "\n");
                else if(aux.getSemestre().toLowerCase().equals(nome.toLowerCase())) caixaDagua.write(aux.desmaterializar() + "\n");
                else caixaDagua.write(aux.desmaterializar() + "\n");
            }
            
            caixaDagua.close();
        } catch (Exception e) {
        }
    }
}
