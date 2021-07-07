package Main.Componentes;

import Enums.TipoResistor;

public class Resistor extends Componente {
    private TipoResistor tipoResistor;
    private Float resistancia;

    public TipoResistor getTipoResistor() {
        return tipoResistor;
    }

    public void setTipoResistor(TipoResistor tipoResistor) {
        this.tipoResistor = tipoResistor;
    }

    public Float getResistancia() {
        return resistancia;
    }

    public void setResistancia(Float resistancia) {
        this.resistancia = resistancia;
    }
}
