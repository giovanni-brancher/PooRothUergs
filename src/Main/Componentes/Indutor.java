package Main.Componentes;

public class Indutor extends Componente {
    private String tipoIndutor;
    private Float indutancia;

    public Indutor(
            Integer id, 
            String descricao, 
            Integer quantidade,
            String tipoIndutor,
            Float indutancia
    ) {
        super.setId(id);
        super.setDescricao(descricao);
        super.setQuantidade(quantidade);
        this.tipoIndutor = tipoIndutor;
        this.indutancia = indutancia;
    }
    
    public String getTipoIndutor() {
        return tipoIndutor;
    }

    public void setTipoIndutor(String tipoIndutor) {
        this.tipoIndutor = tipoIndutor;
    }

    public Float getIndutancia() {
        return indutancia;
    }

    public void setIndutancia(Float indutancia) {
        this.indutancia = indutancia;
    }
}
