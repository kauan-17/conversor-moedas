package escolhe;

import javax.swing.JOptionPane;

public class EscolheValor {

    private final String valor;
    public EscolheValor() {
        valor = JOptionPane.showInputDialog(null, "Insira um valor: ");
    }

    public double getValor() throws NumberFormatException {
        return Double.parseDouble(this.valor);
    }
}
