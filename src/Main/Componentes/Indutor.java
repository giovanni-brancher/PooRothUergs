package Main.Componentes;

import Enums.TipoIndutor;

public class Indutor extends Componente {
    private TipoIndutor tipoIndutor;
    private Float indutancia;

    public TipoIndutor getTipoIndutor() {
        return tipoIndutor;
    }

    public void setTipoIndutor(TipoIndutor tipoIndutor) {
        this.tipoIndutor = tipoIndutor;
    }

    public Float getIndutancia() {
        return indutancia;
    }

    public void setIndutancia(Float indutancia) {
        this.indutancia = indutancia;
    }
}
