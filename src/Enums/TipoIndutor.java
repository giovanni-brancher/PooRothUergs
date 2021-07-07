package Enums;

public enum TipoIndutor {
    BOBINA("B"), TOROIDAL("T"), CERAMICA_MULTICAMADA("C"), FILME("F");
    
    public String tipoIndutor;
    TipoIndutor(String valor) {
        tipoIndutor = valor;
    }
}
