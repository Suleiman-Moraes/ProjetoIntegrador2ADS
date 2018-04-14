
package persistencia;

import dados.Disciplina;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class DisciplinaDAO {
    
    //Atributos
    private String nomeDoArquivo = "";
    
    //Construtor
    public DisciplinaDAO(String nomeDoArquivo){
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public void incluir(Disciplina objeto, String curso) throws Exception {
        try {
            
            CursoDAO cur = new CursoDAO(curso);
            if(cur.visualizar(objeto.getCodigoDoCurso()) == null)throw new Exception("Curso inv�lido.");
            
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
    public ArrayList<Disciplina> recuperar(String curso) throws Exception {
        try {
            
            ArrayList<Disciplina> lista = new ArrayList<Disciplina>();
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);
            
            String linha = "";
            
            while((linha = caixaDaguaDeLeitura.readLine()) != null){
                Disciplina objetoAux = new Disciplina();
                objetoAux.materializar(linha);
               CursoDAO cur = new CursoDAO(curso);
            if(cur.visualizar(objetoAux.getCodigoDoCurso()) == null)throw new Exception("Curso inv�lido.");
                lista.add(objetoAux);
            }
            
            caixaDaguaDeLeitura.close();
            
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    public Disciplina visualizar(int codigo, String curso) throws Exception {
        try {
            Disciplina objeto = null;
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);
            
            String linha = "";
            
            while((linha = caixaDaguaDeLeitura.readLine()) != null){
                Disciplina objetoAux = new Disciplina();
                objetoAux.materializar(linha);
                if(objetoAux.getCodigo() == codigo){
                    objeto = new Disciplina(objetoAux);
                    caixaDaguaDeLeitura.close();
                    CursoDAO cur = new CursoDAO(curso);
                    if(cur.visualizar(objetoAux.getCodigoDoCurso()) == null)throw new Exception("Curso inválido.");
                    return objeto;
                }   
            }
            
            caixaDaguaDeLeitura.close();
            
            return null;
        } catch (Exception e) {
            throw e;
        }
    }

    public void excluir(int codigo,  String curso) throws Exception {
        try {
            ArrayList<Disciplina> lista = this.recuperar(curso);
            //Cria o arquivo
            FileWriter criaArquivo = new FileWriter(nomeDoArquivo);
            //Cria a caixa dagua
            BufferedWriter caixaDagua = new BufferedWriter(criaArquivo);
            
            for (int posicao = 0; posicao < lista.size(); posicao++) {
                Disciplina aux = lista.get(posicao);
                
                if(aux.getCodigo() != codigo) caixaDagua.write(aux.desmaterializar() + "\n");
            }
            
            caixaDagua.close();
        } catch (Exception e) {
        }
    }

    public void alterar(int codigo, Disciplina novo, String curso) throws Exception {
        try {
            ArrayList<Disciplina> lista = this.recuperar(curso);
            //Cria o arquivo
            FileWriter criaArquivo = new FileWriter(nomeDoArquivo);
            //Cria a caixa dagua
            BufferedWriter caixaDagua = new BufferedWriter(criaArquivo);
            
            for (int posicao = 0; posicao < lista.size(); posicao++) {
                Disciplina aux = lista.get(posicao);
                if(aux.getCodigo() == codigo) caixaDagua.write(novo.desmaterializar() + "\n");
                else caixaDagua.write(aux.desmaterializar() + "\n");
            }
            
            caixaDagua.close();
        } catch (Exception e) {
        }
    }
}