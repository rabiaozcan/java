
public class dhesapKapsulleme {
	public static void main(String[] args) {
		DikdortgenKapsulleme dd1 = new DikdortgenKapsulleme();
		//dd1.en=5.0;
		//dd1.boy=10.0;
		dd1.setEn(5.0);
		dd1.setBoy(10.0);
		System.out.println("Dikdörtgenin alanı:"+dd1.DikdortgenAlani());
		System.out.println("En değişkeni:"+dd1.getEn());
		System.out.println("Boy değişkeni:"+dd1.getBoy());

	}

}

/* get ve set metodu public olduğu için
 * rpivate tanımlanmış get ve set değişkenlerine get ve set ile erişilebilir
 */
/* set değişken atama, get değişken çekme 
*/