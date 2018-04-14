package interfaces;

import dados.Professor;

public interface ICadastrarProfessor {
    void remover(String nome)throws Exception;
    Professor visualizar(String nome)throws Exception;
    void alterar(String nome, Professor professor)throws Exception;
    void adicionar(Professor professor)throws Exception;
}
