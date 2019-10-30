
public class juomaAutomaatti {

	// ALUSTETAAN MUUTTUJAT

	private int teet�;
	private int kahvia;
	private int kaakaota;

	// KONSTRUKTORIT

	public juomaAutomaatti() {
		teet� = 50;
		kahvia = 50;
		kaakaota = 50;
	}

	public juomaAutomaatti(int uusiTee, int uusiKahvi, int uusiKaakao) {
		teet� = uusiTee;
		kahvia = uusiKahvi;
		kaakaota = uusiKaakao;
	}

	// METODIT

	public void valmistaKahvi() {

		int Todenn�k�isyys = (int) (Math.random() * 100 + 1);

		if (onnistuuko(Todenn�k�isyys)) {

			if (kahvia >= 10) {

				kahvia = kahvia - 10;

				System.out.println("Odota hetki, Kahvisi valmistuu.");
			} else {
				System.out.println("Kahvia ei ole en�� j�ljell�! T�yt� s�ili�.");
			}

		} else {
			System.out.println("Ei onnistu, kiitos kuitenkin maksustasi.");
		}
	}

	public void valmistaTee() {

		int Todenn�k�isyys = (int) (Math.random() * 100 + 1);

		if (onnistuuko(Todenn�k�isyys)) {

			if (teet� >= 10) {

				teet� = teet� - 10;
				System.out.println("Odota hetki, Teesi valmistuu.");
			}

			else {
				System.out.println("Teet� ei ole en�� j�ljell�! T�yt� s�ili�.");
			}
		} else {
			System.out.println("Ei onnistu, kiitos kuitenkin maksustasi.");
		}
	}

	public void valmistaKaakao() {

		int Todenn�k�isyys = (int) (Math.random() * 100 + 1);

		if (onnistuuko(Todenn�k�isyys)) {

			if (kaakaota >= 10) {

				kaakaota = kaakaota - 10;

				System.out.println("Odota hetki, Kaakaosi valmistuu.");
			} else {
				System.out.println("Kaakaota ei ole en�� j�ljell�! T�yt� s�ili�.");
			}
		} else {
			System.out.println("Ei onnistu, kiitos kuitenkin maksustasi.");
		}
	}

	// BOOLEAN METODI ONNISTUMISEN ARVON TESTAAMISELLE

	public static boolean onnistuuko(int uusiTodenn�k�isyys) {

		if (uusiTodenn�k�isyys > 25)
			return true;
		else
			return false;
	}

	// toString JA GETTERIT & SETTERIT

	public String toString() {
		return "Kahvia j�ljell�: " + kahvia + " -- Teet� j�ljell�: " + teet� + " -- Kaakaota j�ljell�: " + kaakaota;
	}

	public int getTeet�() {
		return teet�;
	}

	public void setTeet�(int teet�) {
		this.teet� = teet�;
	}

	public int getKahvia() {
		return kahvia;
	}

	public void setKahvia(int kahvia) {
		this.kahvia = kahvia;
	}

	public int getKaakaota() {
		return kaakaota;
	}

	public void setKaakaota(int kaakaota) {
		this.kaakaota = kaakaota;
	}

}
