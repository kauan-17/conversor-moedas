package escolhe;

import javax.swing.JOptionPane;

public class EscolheConversor {

    private final String[] opcoes = { "Conversor de moedas"};
    private final int opcaoSelecionada;
    public EscolheConversor() {

       opcaoSelecionada = JOptionPane.showOptionDialog(null, "Selecione o conversor:",
               "Conversores", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
               opcoes, opcoes[0]);
    }

    public String getOpcaoSelecionada() {
        return this.opcoes[this.opcaoSelecionada];
    }
}
