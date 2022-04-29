package br.com.fiap;

import javax.swing.JOptionPane;

public class UsaTelevisor {
	public static void main(String[] args) {
		int volume, escolha;
		int canal;
		String aux;
		Televisor T1;
		
		try {
			aux = JOptionPane.showInputDialog(null, "Digite o volume que deseja");
			volume = Integer.parseInt(aux);
			
			aux = JOptionPane.showInputDialog(null, "Digite o canal que deseja");
			canal = Integer.parseInt(aux);
			
			T1 = new Televisor(volume , canal);
			
			JOptionPane.showMessageDialog(null, "Canal: " + T1.getCanal() + 
					"\nVolume: " + T1.getVolume());
			
			aux = JOptionPane.showInputDialog("Escolha uma ação \n (1) Aumentar Volume \n (2) Diminuir Volume \n (3) Trocar de canal");
			escolha = Integer.parseInt(aux);
			
			switch (escolha) {
			case 1:
				T1.aumentarVolume();
				break;
			case 2:
				T1.diminuirVolume();
				break;
			case 3:
				aux = JOptionPane.showInputDialog(null, "Digite o canal que deseja");
				canal = Integer.parseInt(aux);
				T1.setCanal(canal);
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção inválida");
				break;
			}
			
			JOptionPane.showMessageDialog(null, "Canal: " + T1.getCanal() + 
					"\nVolume: " + T1.getVolume());
			
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
