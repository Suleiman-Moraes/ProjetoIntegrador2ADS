package dados;
public class PaiCursoDisciplina {
    //Atributos
    protected int codigo = 0;
    protected String descricao = "";
    
    //Construtor
    public PaiCursoDisciplina(){}
    public PaiCursoDisciplina(int codigo, String descricao) throws Exception{
        if(codigo > 10000 && codigo < 0)throw new Exception("Código não pode ser negativo, nem ter mais que 4 caracteres.");
        this.codigo = codigo;
        this.descricao = descricao;
    }
    public PaiCursoDisciplina(PaiCursoDisciplina objeto){
        this.codigo = objeto.codigo;
        this.descricao = objeto.descricao;
    }
    
    //Metodos

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCodigo(int codigo) throws Exception {
        if(codigo > 10000 && codigo < 0)throw new Exception("Código não pode ser negativo, nem ter mais que 4 caracteres.");
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
