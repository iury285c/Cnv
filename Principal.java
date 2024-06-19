import javax.swing.*;
import java.util.Objects;

public class Principal {
    public static void main(String[] args) {

        do {
            try {
                EscolheConversor EscolheConversor = new EscolheConversor();
                EscolherValor EscolheValor = new EscolherValor();

                double valorSelecionado = EscolheValor.getValor();

                if (Objects.equals(EscolheConversor.getOpcaoSelecionada(), "Conversor de moedas")) {
                    EscolheMoedas EscolheMoedas = new EscolheMoedas();
                    new ConverteMoedas(valorSelecionado, EscolheMoedas.getOpcaoSelecionada());
                }
            } catch (NumberFormatException exception) {
                System.out.println(exception.getMessage());
                new TelaDeErro("O valor informado é inválido!");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                new TelaDeErro("Erro... Digite um valor válido!");
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja Continuar?") != 1);

        JOptionPane.showMessageDialog(null, "Programa finalizado com sucesso!");

        System.exit(0);
    }
}