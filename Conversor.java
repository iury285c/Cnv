import java.io.IOException;

public abstract class Conversor {
    protected double valorConvertido;
    protected String simboloConversao;

    public abstract void converter(double valor, String op) throws IOException, InterruptedException;

}
