package Enums;

public enum TipoCapacitor {
    ELETROLITICO("E"), POLIESTER("P"), CERAMICO("C"), TANTALO("T");
    
    public String tipoCapacitor;
    TipoCapacitor(String valor) {
        tipoCapacitor = valor;
    }
}
