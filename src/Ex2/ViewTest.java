package Ex2;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;

import Ex1.View;

/**
 * Este é um conjunto de testes para a classe View.
 * 
 * Passos para executar os testes:
 * 1. Certifique-se de que todas as classes necessárias (View, TestableOptionPane) estejam no pacote correto.
 * 2. Verifique se você tem a biblioteca JUnit 5 incluída no seu projeto.
 * 3. Para rodar os testes, utilize seu ambiente de desenvolvimento ou uma ferramenta de linha de comando que suporte JUnit 5.
 * 4. Cada teste verifica um cenário específico:
 *    - testFatorial: Testa o cálculo do fatorial de 100.
 *    - testNegative: Testa a entrada de um número negativo.
 *    - testFatorialInvalid: Testa a entrada de um valor inválido (não numérico).
 * Altere os valores nesses três métodos a fim de testar a calculadora. Mude tanto os valores dos inputs quanto os valores esperados no AssertEquals
 * 5. Observe os resultados dos testes para garantir que a funcionalidade está correta.
 * 
 * Diferença entre esta categoria de teste e os testes tradicionais usando JUnit:
 * - Estes testes envolvem a interface gráfica do usuário e verificam a interação do usuário com a interface. 
 *   Eles simulam ações do usuário, como clicar em botões e inserir texto em campos de entrada.
 * - Os testes tradicionais com JUnit geralmente focam em métodos que retornam valores ou expressões (booleanas inclusive), verificando se os métodos retornam os resultados esperados 
 *   dados certos inputs, sem envolver a interface gráfica.
 *  
 *  Para confirmar o que foi dito acima, basta alterar os valores do setText nos métodos presentes, evidenciando
 *  que esse arquivo de teste envolve o contato direto na calculadora em vez de um JUnit com retorno de valor esperado.
 */


public class ViewTest {
	
	View calculadora = new View();
	JButton button = calculadora.getButton();
	JTextField inputField = calculadora.getInput();
	JTextArea result = calculadora.getArea();

    @Test
    public void testFatorial() throws InterruptedException {
    	inputField.setText("100");
    	button.doClick();
    	Thread.sleep(1000);
    	assertEquals("Resultado: 93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000", result.getText());
    	
    	
    }
    
    @Test
    public void testNegative() throws InterruptedException {
    	inputField.setText("-10");
    	button.doClick();
    	Thread.sleep(1000);
    	assertEquals("O número deve ser não-negativo.", TestableMessageDialog.getLastMessage());
    	}
    
    @Test
    public void testFatorialInvalid() throws InterruptedException, InvocationTargetException {
        SwingUtilities.invokeAndWait(() -> {
            inputField.setText("ab");
            button.doClick();
        });
        Thread.sleep(1000);
        assertEquals("Por favor, digite um número inteiro válido.", TestableMessageDialog.getLastMessage());
    }
    
    
}
