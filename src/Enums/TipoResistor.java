package Enums;

public enum TipoResistor {
    FIXO("F"), VARIAVEL("V");
    
    public String tipoResistor;
    TipoResistor(String valor) {
        tipoResistor = valor;
    }
}
