
package interfaces;

import dados.Turma;

public interface ITurma {
    void alterar(Turma turma, String dados)throws Exception;
    void alterar(Turma turma, Integer ano)throws Exception;
    void remover(String dados)throws Exception;
    void remover(Integer ano)throws Exception;
    Turma visualizar(String dados)throws Exception;
    Turma visualizar(Integer ano)throws Exception;
    void adicionar(Turma turma)throws Exception;
}
