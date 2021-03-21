package parametreliSuperKullanımı;

public class Hacker extends ZekiInsan {
	public Hacker(int par) {
		//super(30);
		super(par+5);
		System.out.println("Hacker yapılandırıcı: "+par);
	}

	public static void main(String[] args) {
		Hacker hck = new Hacker(5);

	}

}
