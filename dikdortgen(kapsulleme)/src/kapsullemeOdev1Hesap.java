
public class kapsullemeOdev1Hesap {
	private double en, boy;
	public double getEn() {
		return en;
	}
	public void setEn(double en) {
		this.en = en;
	}
	public double getBoy() {
		return boy;
	}
	public void setBoy(double boy) {
		this.boy = boy;
	}
	public double DikdortgenAlani() {
		/*if(en < 0.0 || boy < 0.0) {
			return 0 ;
		}else {
			return  en*boy;
		}*/
		return en*boy;
	}

}
