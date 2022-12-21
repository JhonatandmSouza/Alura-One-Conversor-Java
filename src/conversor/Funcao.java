package conversor;

import javax.swing.JOptionPane;

public class Funcao {
	
	ConverteMoedas moedas = new ConverteMoedas();
	ConverteTemperatura temperatura = new ConverteTemperatura();
	
	public void IniciaConversao() {
		String input;
		double valorRecebido;
		
		String opcoes = JOptionPane.showInputDialog(
				null, 
				"Escolha um opção", 
				"Menu", 
				JOptionPane.PLAIN_MESSAGE, 
				null, 
				new Object[]{"Conversor de Moedas", "Conversor de Temperatura"}, 
				"Escolha").toString();
		
		switch (opcoes) {
		case "Conversor de Moedas":
			input = JOptionPane.showInputDialog("Insira um valor");
			valorRecebido = Double.parseDouble(input);
			ConverteMoedas(valorRecebido);
			ContinuaPrograma();		
			break;
		case "Conversor de Temperatura":
			input = JOptionPane.showInputDialog("Insira um valor");
			valorRecebido = Double.parseDouble(input);
			ConverteTemperatura(valorRecebido);
			ContinuaPrograma();
			break;
		}
	}
	
	public void ContinuaPrograma() {
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		if(JOptionPane.OK_OPTION == resposta) {
			IniciaConversao();
		} else {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
		}
	}
	
	public void ConverteMoedas(double valorRecebido) {
		String opcao = JOptionPane.showInputDialog(
				null, 
				"Escolha a moeda para a qual você deseja converter seu dinheiro", 
				"Moedas",
				JOptionPane.PLAIN_MESSAGE,
				null,
				new Object[]{
						"De Reais para Dólar", 
						"De Reais para Euro", 
						"De Reais para Libra",
						"De Dólar para Reais",
						"De Euro para Reais",
						"De Libra para Reais"},
				"Escolha").toString();
		moedas.Converte(valorRecebido, opcao);	
	}
	
	public void ConverteTemperatura(double valorRecebido) {
		String opcao = JOptionPane.showInputDialog(
				null, 
				"Escolha o tipo de conversão de temperatura", 
				"Temperaturas",
				JOptionPane.PLAIN_MESSAGE,
				null,
				new Object[]{
						"De Celsius para Fahrenheit", 
						"De Celsius para Kelvin", 
						"De Fahrenheit para Celsius",
						"De Kelvin para Celsius"},
				"Escolha").toString();
		temperatura.Converte(valorRecebido, opcao);	
	}

}
