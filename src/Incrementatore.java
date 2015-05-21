public class Incrementatore extends Thread {
	Scatola scatola;
	String nome;

	Incrementatore(Scatola scatola, String nome) {
		this.scatola = scatola;
		this.nome = nome;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			//synchronized (scatola) {
			{
				int valorePrima = scatola.quantita;
				System.out.println(nome + " prima: " + valorePrima);
				scatola.quantita++;
				int valoreDopo = scatola.quantita;
				if (valoreDopo == valorePrima + 1)
					System.out.println(nome + "  dopo: " + valoreDopo);
				else
					System.out
							.println(nome + "  dopo: " + valoreDopo + "<====");
			}
			
			try {
				sleep(1000);
			} catch (InterruptedException ie) {
				System.err.println(ie.getMessage());
			}
		}
	}
}
