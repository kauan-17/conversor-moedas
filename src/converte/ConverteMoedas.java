package converte;

import javax.swing.JOptionPane;

public class ConverteMoedas extends Conversor {

    public ConverteMoedas(double valor, String op) {
        converter(valor, op);

        String msg = String.format("O valor convertido é de %s %.2f", super.simboloConversao, super.valorConvertido);

        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public void converter(double valor, String op) {


    	//Cotação do dia 02/02/2023
        switch (op) {
            case "De BRL/Reais para USD/Dólares" -> {
                super.simboloConversao = "U$";
                super.valorConvertido = valor / 5.05;
            }
            case "De BRL/Reais para EUR/Euros" -> {
                super.simboloConversao = "€";
                super.valorConvertido = valor / 5.50;
            }
            case "De BRL/Reais para GBP/Libras Esterlinas" -> {
                super.simboloConversao = "£";
                super.valorConvertido = valor / 6.17;
            }
            case "De BRL/Reais para ARS/Peso Argentino" -> {
                super.simboloConversao = "$";
                super.valorConvertido = valor / 0.027;
            }
            case "De BRL/Reais para CLP/Peso Chileno" -> {
                super.simboloConversao = "CLP";
                super.valorConvertido = valor / 0.0065;
            }
            case "De USD/Dólares para BRL/Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 5.05;
            }
            case "De EUR/Euros para BRL/Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 5.50;
            }
            case "De GBP/Libras Esterlinas para BRL/Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 6.17;
            }
            case "De ARS/Peso Argentino para BRL/Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 0.027;
            }
            case "De CLP/Peso Chileno para BRL/Reais" -> {
                super.simboloConversao = "R$";
                super.valorConvertido = valor * 0.0065;
            }
        }
    }
}