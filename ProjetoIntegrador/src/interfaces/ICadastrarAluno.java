package interfaces;

import dados.Aluno;

public interface ICadastrarAluno {
    void remover(String nome)throws Exception;
    Aluno visualizar(String nome)throws Exception;
    void alterar(String nome,Aluno aluno)throws Exception;
    void adicionar(Aluno aluno)throws Exception;
}
