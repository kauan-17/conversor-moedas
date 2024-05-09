package principal;


import converte.ConverteMoedas;
import erro.TelaErro;
import escolhe.*;

import java.util.Objects;
import javax.swing.JOptionPane;

public class TelaPrincipal {
    public static void main(String[] args) {

        do {
            try {
                EscolheConversor EscolheConversor = new EscolheConversor();
                EscolheValor EscolheValor = new EscolheValor();

                double valorSelecionado = EscolheValor.getValor();

                if (Objects.equals(EscolheConversor.getOpcaoSelecionada(), "Conversor de moedas")) {
                    EscolheMoedas EscolheMoedas = new EscolheMoedas();
                    new ConverteMoedas(valorSelecionado, EscolheMoedas.getOpcaoSelecionada());
                }
            } catch (NumberFormatException exception) {
                System.out.println(exception.getMessage());
                new TelaErro("O valor informado é inválido!");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                new TelaErro("Erro... Digite um valor válido!");
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?") != 1);

        JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso!");

        System.exit(0);
    }
}
