package conversor;

import javax.swing.JOptionPane;

public class ConverteTemperatura {
	public void Converte(double valor, String opcao) {
		switch (opcao) {
		case "De Celsius para Fahrenheit":
			JOptionPane.showMessageDialog(null, String.format("%.0fº Celsius equivalem a aproximadamente %.0fº Fahrenheit", valor, (valor * 9 / 5) + 32));
			break;
		case "De Celsius para Kelvin":
			JOptionPane.showMessageDialog(null, String.format("%.0fº Celsius equivalem a aproximadamente %.2f Kelvins", valor, valor + 273.15));
			break;
		case "De Fahrenheit para Celsius":
			JOptionPane.showMessageDialog(null, String.format("%.0fº Fahrenheit equivalem a aproximadamente %.0fº Celsius", valor, (valor - 32) * 5 / 9));
			break;
		case "De Kelvin para Celsius":
			JOptionPane.showMessageDialog(null, String.format("%.2f Kelvins equivalem a aproximadamente %.0fº Celsius", valor, valor - 273.15));
			break;
		}
	}
}
