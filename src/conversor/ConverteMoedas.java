package conversor;

import javax.swing.JOptionPane;

public class ConverteMoedas {
	
	public void Converte(double valor, String opcao) {
		switch (opcao) {
		case "De Reais para D�lar":
			JOptionPane.showMessageDialog(null, String.format("Voc� tem $ %.2f D�lares", valor / 5.2));
			break;
		case "De Reais para Euro":
			JOptionPane.showMessageDialog(null, String.format("Voc� tem $ %.2f Euros", valor / 5.53));
			break;
		case "De Reais para Libra":
			JOptionPane.showMessageDialog(null, String.format("Voc� tem $ %.2f Libras", valor / 6.34));
			break;
		case "De D�lar para Reais":
			JOptionPane.showMessageDialog(null, String.format("Voc� tem R$ %.2f Reais", valor * 5.2));
			break;
		case "De Euro para Reais":
			JOptionPane.showMessageDialog(null, String.format("Voc� tem R$ %.2f Reais", valor * 5.53));
			break;
		case "De Libra para Reais":
			JOptionPane.showMessageDialog(null, String.format("Voc� tem R$ %.2f Reais", valor * 6.34));
			break;
		}
	}
}
