package persistencia;

import dados.Professor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ProfessorDAO {
    //Atributos
    private String nomeDoArquivo = "";
    
    //Construtor
    public ProfessorDAO(String nomeDoArquivo){
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public void incluir(Professor objeto) throws Exception {
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
    public ArrayList<Professor> recuperar() throws Exception {
        try {
            ArrayList<Professor> lista = new ArrayList<Professor>();
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);
            
            String linha = "";
            
            while((linha = caixaDaguaDeLeitura.readLine()) != null){
                Professor objetoAux = new Professor();
                objetoAux.materializar(linha);
                lista.add(objetoAux);
            }
            
            caixaDaguaDeLeitura.close();
            
            return lista;
        } catch (Exception e) {
            throw e;
        }
    }
    public Professor visualizar(String nome) throws Exception {
        try {
            Professor objeto = null;
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);
            
            String linha = "";
            
            while((linha = caixaDaguaDeLeitura.readLine()) != null){
                Professor objetoAux = new Professor();
                objetoAux.materializar(linha);
                if(objetoAux.getNome().toLowerCase().equals(nome.toLowerCase())){
                    objeto = new Professor(objetoAux);
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

    public void excluir(String nome) throws Exception {
        try {
            ArrayList<Professor> lista = this.recuperar();
            //Cria o arquivo
            FileWriter criaArquivo = new FileWriter(nomeDoArquivo);
            //Cria a caixa dagua
            BufferedWriter caixaDagua = new BufferedWriter(criaArquivo);
            
            for (int posicao = 0; posicao < lista.size(); posicao++) {
                Professor aux = lista.get(posicao);
                
                if(!aux.getNome().toLowerCase().equals(nome.toLowerCase())) caixaDagua.write(aux.desmaterializar() + "\n");
            }
            
            caixaDagua.close();
        } catch (Exception e) {
        }
    }

    public void alterar(String nome, Professor novo) throws Exception {
        try {
            ArrayList<Professor> lista = this.recuperar();
            //Cria o arquivo
            FileWriter criaArquivo = new FileWriter(nomeDoArquivo);
            //Cria a caixa dagua
            BufferedWriter caixaDagua = new BufferedWriter(criaArquivo);
            
            for (int posicao = 0; posicao < lista.size(); posicao++) {
                Professor aux = lista.get(posicao);
                if(aux.getNome().toLowerCase().equals(nome.toLowerCase())) caixaDagua.write(novo.desmaterializar() + "\n");
                else caixaDagua.write(aux.desmaterializar() + "\n");
            }
            
            caixaDagua.close();
        } catch (Exception e) {
        }
    }
}
