package Ex1;
import java.math.BigDecimal;

public class Controller {
    public BigDecimal calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não-negativo.");
        }
        return fatorial(BigDecimal.valueOf(numero));
    }

    private BigDecimal fatorial(BigDecimal numero) {
        if (numero.equals(BigDecimal.ZERO)) {
            return BigDecimal.ONE;
        }
        return numero.multiply(fatorial(numero.subtract(BigDecimal.ONE)));
    }
}
