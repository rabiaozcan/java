
public class dhesap {

	public static void main(String[] args) {
		Dikdortgen dd1 = new Dikdortgen();
		dd1.en=5.0;
		dd1.boy=10.0;
		System.out.println("Dikdörtgenin alanı:"+dd1.DikdortgenAlani());

	}

}

//dikdörtgen sınıfında yer alan en boy değişkenleri private 
/* olursa dhesap çalışmaz ancak protected olursa değişkenlere erişebileceğinden 
 * çalışır.
 */
