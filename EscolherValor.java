import javax.swing.*;

public class EscolherValor {

    private final String valor;
    public EscolherValor() {
        valor = JOptionPane.showInputDialog(null, "Insira um valor: ");
    }

    public double getValor() throws NumberFormatException {
        return Double.parseDouble(this.valor);
    }

}

