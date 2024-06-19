import javax.swing.*;

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
                "De USD/Dólares para EUR/Euros",
                "De USD/Dólares ARS/Peso Argentino",
                "De USD/Dólares para CLP/Peso Chileno",
                "De USD/Dólares GBP/Libras Esterlinas",
                "De EUR/Euros para BRL/Reais",
                "De EUR/Euros GBP/Libras Esterlinas",
                "De EUR/Euros ARS/Peso Argentino",
                "De EUR/Euros CLP/Peso Chileno",
                "De EUR/Euros USD/Dólares",
                "De GBP/Libras Esterlinas para BRL/Reais",
                "De GBP/Libras Esterlinas USD/Dólares",
                "De GBP/Libras Esterlinas EUR/Euros",
                "De GBP/Libras Esterlina CLP/Peso Chileno",
                "De GBP/Libras Esterlina USD/Dólares",
                "De ARS/Peso Argentino EUR/Euros",
                "De ARS/Peso Argentino USD/Dólares",
                "De ARS/Peso Argentino para BRL/Reais",
                "De ARS/Peso Argentino GBP/Libras Esterlinas",
                "De ARS/Peso Argentino CLP/Peso Chileno",
                "De CLP/Peso Chileno para BRL/Reais",
                "De CLP/Peso Chileno  ARS/Peso Argentino",
                "De CLP/Peso Chileno GBP/Libras Esterlinas",
                "De CLP/Peso Chileno USD/Dólares",
                "De CLP/Peso Chileno EUR/Euros",
        };
        opcaoSelecionada = (String) JOptionPane.showInputDialog(null, "Escolha a opção de conversão de moeda desejada:",
                "Moedas", JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
    }

    public String getOpcaoSelecionada() {
        return this.opcaoSelecionada;
    }
}
