//Dikdörtgen hesabı yaptığımız örneğimizi gönderilen parametrenin 
/*negatif olması durumunu denetleyen ve bu durumda sıfır atayan bir kısıtı getter
 * ve setter yöntemleri ile ekleyiniz.
 */
public class KapsullemeOdev1 {

	public static void main(String[] args) {
		kapsullemeOdev1Hesap dd1 = new kapsullemeOdev1Hesap();
		//dd1.en=5.0;
		//dd1.boy=10.0;
		dd1.setEn(-5.0);
		dd1.setBoy(10.0);
		
		System.out.println("En değişkeni:"+dd1.getEn());
		System.out.println("Boy değişkeni:"+dd1.getBoy());
		System.out.println("\n");
		
		if(dd1.getEn()<0) {
			System.out.println("En değişkeni negatif olamaz!");
			System.out.println("En değişkenine 0 atanıyor!");
			dd1.setEn(0.0);
		}if(dd1.getBoy()<0) {
			System.out.println("Boy değişkeni negatif olamaz!");
			System.out.println("Boy değişkenine 0 atanıyor!");
			dd1.setBoy(0.0);
		}else {
			dd1.getEn();
			dd1.getBoy();
		}	
		
		System.out.println("En değişkeni:"+dd1.getEn());
		System.out.println("Boy değişkeni:"+dd1.getBoy());
		System.out.println("\n");
		System.out.println("Dikdörtgenin alanı:"+dd1.DikdortgenAlani());

	}

}
