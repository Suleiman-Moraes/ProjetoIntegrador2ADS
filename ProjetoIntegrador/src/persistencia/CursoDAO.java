package persistencia;

import dados.Curso;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class CursoDAO {
    //Atributos
    private String nomeDoArquivo = "";
    
    //Construtor
    public CursoDAO(String nomeDoArquivo){
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public void incluir(Curso objeto) throws Exception {
        try {
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
    public ArrayList<Curso> recuperar() throws Exception {
        try {
            ArrayList<Curso> lista = new ArrayList<Curso>();
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);
            
            String linha = "";
            
            while((linha = caixaDaguaDeLeitura.readLine()) != null){
                Curso objetoAux = new Curso();
                objetoAux.materializar(linha);
                lista.add(objetoAux);
            }
            
            caixaDaguaDeLeitura.close();
            
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    public Curso visualizar(int codigo) throws Exception {
        try {
            Curso objeto = null;
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);
            
            String linha = "";
            
            while((linha = caixaDaguaDeLeitura.readLine()) != null){
                Curso objetoAux = new Curso();
                objetoAux.materializar(linha);
                if(objetoAux.getCodigo() == codigo){
                    objeto = new Curso(objetoAux);
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

    public void excluir(int codigo) throws Exception {
        try {
            ArrayList<Curso> lista = this.recuperar();
            //Cria o arquivo
            FileWriter criaArquivo = new FileWriter(nomeDoArquivo);
            //Cria a caixa dagua
            BufferedWriter caixaDagua = new BufferedWriter(criaArquivo);
            
            for (int posicao = 0; posicao < lista.size(); posicao++) {
                Curso aux = lista.get(posicao);
                
                if(aux.getCodigo() != codigo) caixaDagua.write(aux.desmaterializar() + "\n");
            }
            
            caixaDagua.close();
        } catch (Exception e) {
        }
    }

    public void alterar(int codigo, Curso novo) throws Exception {
        try {
            ArrayList<Curso> lista = this.recuperar();
            //Cria o arquivo
            FileWriter criaArquivo = new FileWriter(nomeDoArquivo);
            //Cria a caixa dagua
            BufferedWriter caixaDagua = new BufferedWriter(criaArquivo);
            
            for (int posicao = 0; posicao < lista.size(); posicao++) {
                Curso aux = lista.get(posicao);
                if(aux.getCodigo() == codigo) caixaDagua.write(novo.desmaterializar() + "\n");
                else caixaDagua.write(aux.desmaterializar() + "\n");
            }
            
            caixaDagua.close();
        } catch (Exception e) {
        }
    }
}
