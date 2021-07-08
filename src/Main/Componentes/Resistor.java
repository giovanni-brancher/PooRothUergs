package Main.Componentes;

public class Resistor extends Componente {
    private String tipoResistor;
    private Float resistencia;

    public Resistor(
            Integer id, 
            String descricao, 
            Integer quantidade,
            String tipoResistor,
            Float resistencia
    ) {
        super.setId(id);
        super.setDescricao(descricao);
        super.setQuantidade(quantidade);
        this.tipoResistor = tipoResistor;
        this.resistencia = resistencia;
    }
    
    public String getTipoResistor() {
        return tipoResistor;
    }

    public void setTipoResistor(String tipoResistor) {
        this.tipoResistor = tipoResistor;
    }

    public Float getResistencia() {
        return resistencia;
    }

    public void setResistencia(Float resistencia) {
        this.resistencia = resistencia;
    }
}
