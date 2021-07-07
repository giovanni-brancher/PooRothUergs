package Main.Componentes;

public class Capacitor extends Componente {
    private String tipoCapacitor;
    private Float capacitancia;

    public Capacitor(
            Integer id, 
            String descricao, 
            Integer quantidade,
            String tipoCapacitor,
            Float capacitancia
    ) {
        super.setId(id);
        super.setDescricao(descricao);
        super.setQuantidade(quantidade);
        this.tipoCapacitor = tipoCapacitor;
        this.capacitancia = capacitancia;
    }
    
    public String getTipoCapacitor() {
        return tipoCapacitor;
    }

    public void setTipoCapacitor(String tipoCapacitor) {
        this.tipoCapacitor = tipoCapacitor;
    }

    public Float getCapacitancia() {
        return capacitancia;
    }

    public void setCapacitancia(Float capacitancia) {
        this.capacitancia = capacitancia;
    }
}
