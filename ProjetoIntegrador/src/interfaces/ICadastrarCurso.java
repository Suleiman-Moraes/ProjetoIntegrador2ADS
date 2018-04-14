
package interfaces;

import dados.Disciplina;

public interface ICadastrarCurso {
    void alterar(Disciplina disciplina, Integer codigo)throws Exception;
    void remover(Integer codigo)throws Exception;
    Disciplina visualizar(Integer codigo)throws Exception;
    void adicionar(Disciplina disciplina)throws Exception;
}
