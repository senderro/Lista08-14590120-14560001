package Ex1;
import javax.swing.*;

import Ex2.TestableMessageDialog;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class View extends JFrame {
    private JTextField inputField;
    private JButton calcularButton;
    private JTextArea resultadoArea;
    private Controller controller;

    public View() {
        // Configurações da janela
        setTitle("Calculadora de Fatorial");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Inicializa o controller
        controller = new Controller();

        // Configurações dos componentes da interface
        inputField = new JTextField(10);
        calcularButton = new JButton("Calcular");
        resultadoArea = new JTextArea(10, 40);
        resultadoArea.setLineWrap(true);
        resultadoArea.setWrapStyleWord(true);
        resultadoArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(resultadoArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Adiciona ação ao botão
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularFatorial();
            }
        });

        // Layout da interface
        setLayout(new FlowLayout());
        add(new JLabel("Digite um número:"));
        add(inputField);
        add(calcularButton);
        add(scrollPane);
    }

    private void calcularFatorial() {
        try {
            int numero = Integer.parseInt(inputField.getText());
            BigDecimal resultado = controller.calcularFatorial(numero);
            resultadoArea.setText("Resultado: " + resultado.toString());
        } catch (NumberFormatException e) {
            TestableMessageDialog.showMessageDialog(this, "Por favor, digite um número inteiro válido.", "Erro de Formato", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            TestableMessageDialog.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            TestableMessageDialog.showMessageDialog(this, "Ocorreu um erro inesperado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public JTextField getInput() {
    	return inputField;
    }
    
    public JButton getButton() {
    	return calcularButton;
    }
    
    public JTextArea getArea() {
    	return resultadoArea;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new View().setVisible(true);
            }
        });
    }
}
