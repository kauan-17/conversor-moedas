package escolhe;

import javax.swing.JOptionPane;


public class EscolheMoedas {

    private final String opcaoSelecionada;

    public EscolheMoedas() {
        String[] opcoes = {
                "De BRL/Reais para USD/Dólares",
                "De BRL/Reais para EUR/Euros",
                "De BRL/Reais para GBP/Libras Esterlinas",
                "De BRL/Reais para ARS/Peso Argentino",
                "De BRL/Reais para CLP/Peso Chileno",
                "De USD/Dólares para BRL/Reais",
                "De EUR/Euros para BRL/Reais",
                "De GBP/Libras Esterlinas para BRL/Reais",
                "De ARS/Peso Argentino para BRL/Reais",
                "De CLP/Peso Chileno para BRL/Reais"
        };
        opcaoSelecionada = (String)JOptionPane.showInputDialog(null, "Escolha a opção de conversão de moeda desejada:",
                "Moedas", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
    }

    public String getOpcaoSelecionada() {
        return this.opcaoSelecionada;
    }
}


