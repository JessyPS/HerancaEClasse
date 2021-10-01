import java.util.List;

public enum OpcoesMenu {

    SANDUICHES(1), MASSAS(2), BOLOS(3), FECHAR(4), SAIR(0);

    private final int valorOpcao;
    OpcoesMenu(int valor) {
        valorOpcao = valor;
    }

    public int getValorOpcao(){
        return valorOpcao;
    }

}
