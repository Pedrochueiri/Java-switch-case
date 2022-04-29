package br.com.fiap;

public class Televisor {
	private int volume;
	private int canal;
	
	public Televisor() {
		
	}
	public Televisor(int volume, int canal) {
		setCanal(canal);
		setVolume(volume);
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		try {
			if (volume >= 0 && volume <= 10) {
				this.volume = volume;
			} else {
				throw new Exception("Opção de volume esta errada (0-10)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		try {
			if (canal == 2 || canal == 4 || canal == 5 || canal == 13) {
				this.canal = canal;
			} else {
				throw new Exception("Opção de volume esta errada (2,4,5 e 13)");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void aumentarVolume() {
		volume++;
	}
	public void diminuirVolume() {
		volume--;
	}
}
