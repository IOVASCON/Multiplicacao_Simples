package MultiplicacaoSimples;  // Declara o pacote da classe

import java.awt.*;  // Importa classes necessárias para a criação da interface gráfica
import javax.swing.*;     // Importa classes para gerenciar layout

public class MultiplicacaoSimples extends JFrame {

    private final JTextField inputAField;  // Campo de texto para o primeiro número
    private final JTextField inputBField;  // Campo de texto para o segundo número
    private final JLabel resultLabel;      // Rótulo para exibir o resultado

    public MultiplicacaoSimples() {
        // Configuração da janela principal
        setTitle("Multiplicação Simples");  // Define o título da janela
        setSize(400, 200);  // Define o tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Define a operação padrão ao fechar a janela
        setLocationRelativeTo(null);  // Centraliza a janela na tela

        // Painel principal
        JPanel panel = new JPanel();  // Cria um novo painel
        panel.setLayout(new GridLayout(4, 2));  // Define o layout do painel como uma grade de 4 linhas e 2 colunas

        // Componentes da interface gráfica
        panel.add(new JLabel("Primeiro número:"));  // Adiciona um rótulo para o primeiro número
        inputAField = new JTextField();  // Cria o campo de texto para o primeiro número
        panel.add(inputAField);  // Adiciona o campo de texto ao painel

        panel.add(new JLabel("Segundo número:"));  // Adiciona um rótulo para o segundo número
        inputBField = new JTextField();  // Cria o campo de texto para o segundo número
        panel.add(inputBField);  // Adiciona o campo de texto ao painel

        JButton calculateButton = new JButton("Calcular");  // Cria um botão para calcular
        panel.add(calculateButton);  // Adiciona o botão ao painel

        resultLabel = new JLabel("Resultado: ");  // Cria um rótulo para exibir o resultado
        panel.add(resultLabel);  // Adiciona o rótulo ao painel

        // Ação do botão Calcular
        calculateButton.addActionListener(e -> calculateProduct());  // Usando expressão lambda para definir a ação do botão

        add(panel);  // Adiciona o painel à janela principal
    }

    // Método para calcular o produto dos números inseridos
    private void calculateProduct() {
        try {
            // Leitura dos valores de entrada
            int a = Integer.parseInt(inputAField.getText());  // Lê o primeiro número do campo de texto
            int b = Integer.parseInt(inputBField.getText());  // Lê o segundo número do campo de texto

            // Cálculo do produto
            int PROD = a * b;  // Calcula o produto

            // Exibição do resultado
            resultLabel.setText("Resultado: " + PROD);  // Exibe o resultado no rótulo
        } catch (NumberFormatException e) {
            // Tratamento de erro para entradas inválidas
            JOptionPane.showMessageDialog(this, "Por favor, insira dois números inteiros válidos.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Criação e exibição da interface gráfica
        SwingUtilities.invokeLater(() -> new MultiplicacaoSimples().setVisible(true));  // Usando expressão lambda para criar e exibir a janela principal
    }
}
