
public class IncrementoConcorrente {

	public static void main(String[] args) {
		Scatola s = new Scatola();
		
		Incrementatore i1 = new Incrementatore(s, "i1");
		Incrementatore i2 = new Incrementatore(s, "i2");
		i1.start();
		i2.start();
	}

}
