package persistencia;

import dados.Aluno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class AlunoDAO {

    //Atributos
    private String nomeDoArquivo = "";

    //Construtor
    public AlunoDAO(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public void incluir(Aluno objeto) throws Exception {
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

    public ArrayList<Aluno> recuperar() throws Exception {
        try {
            ArrayList<Aluno> lista = new ArrayList<Aluno>();
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);

            String linha = "";

            while ((linha = caixaDaguaDeLeitura.readLine()) != null) {
                Aluno objetoAux = new Aluno();
                objetoAux.materializar(linha);
                lista.add(objetoAux);
            }

            caixaDaguaDeLeitura.close();

            return lista;
        } catch (Exception e) {
            throw e;
        }
    }

    public Aluno visualizar(int matricula) throws Exception {
        try {
            Aluno objeto = null;
            //Le o arquivo
            FileReader lerParanaue = new FileReader(nomeDoArquivo);
            //Caixa dagua de leitura
            BufferedReader caixaDaguaDeLeitura = new BufferedReader(lerParanaue);

            String linha = "";

            while ((linha = caixaDaguaDeLeitura.readLine()) != null) {
                Aluno objetoAux = new Aluno();
                objetoAux.materializar(linha);
                if (objetoAux.getMatricula() == matricula) {
                    objeto = new Aluno(objetoAux);
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

    public void excluir(int matricula) throws Exception {
        try {
            ArrayList<Aluno> lista = this.recuperar();
            //Cria o arquivo
            FileWriter criaArquivo = new FileWriter(nomeDoArquivo);
            //Cria a caixa dagua
            BufferedWriter caixaDagua = new BufferedWriter(criaArquivo);

            for (int posicao = 0; posicao < lista.size(); posicao++) {
                Aluno aux = lista.get(posicao);

                if (aux.getMatricula() != matricula) {
                    caixaDagua.write(aux.desmaterializar() + "\n");
                }
            }

            caixaDagua.close();
        } catch (Exception e) {
        }
    }

    public void alterar(int matricula, Aluno novo) throws Exception {
        try {
            ArrayList<Aluno> lista = this.recuperar();
            //Cria o arquivo
            FileWriter criaArquivo = new FileWriter(nomeDoArquivo);
            //Cria a caixa dagua
            BufferedWriter caixaDagua = new BufferedWriter(criaArquivo);

            for (int posicao = 0; posicao < lista.size(); posicao++) {
                Aluno aux = lista.get(posicao);
                if (aux.getMatricula() == matricula) {
                    caixaDagua.write(novo.desmaterializar() + "\n");
                } else {
                    caixaDagua.write(aux.desmaterializar() + "\n");
                }
            }
            caixaDagua.close();
        } catch (Exception e) {
        }
    }
}
