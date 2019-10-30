
public class juomaAutomaatti {

	// ALUSTETAAN MUUTTUJAT

	private int teetä;
	private int kahvia;
	private int kaakaota;

	// KONSTRUKTORIT

	public juomaAutomaatti() {
		teetä = 50;
		kahvia = 50;
		kaakaota = 50;
	}

	public juomaAutomaatti(int uusiTee, int uusiKahvi, int uusiKaakao) {
		teetä = uusiTee;
		kahvia = uusiKahvi;
		kaakaota = uusiKaakao;
	}

	// METODIT

	public void valmistaKahvi() {

		int Todennäköisyys = (int) (Math.random() * 100 + 1);

		if (onnistuuko(Todennäköisyys)) {

			if (kahvia >= 10) {

				kahvia = kahvia - 10;

				System.out.println("Odota hetki, Kahvisi valmistuu.");
			} else {
				System.out.println("Kahvia ei ole enää jäljellä! Täytä säiliö.");
			}

		} else {
			System.out.println("Ei onnistu, kiitos kuitenkin maksustasi.");
		}
	}

	public void valmistaTee() {

		int Todennäköisyys = (int) (Math.random() * 100 + 1);

		if (onnistuuko(Todennäköisyys)) {

			if (teetä >= 10) {

				teetä = teetä - 10;
				System.out.println("Odota hetki, Teesi valmistuu.");
			}

			else {
				System.out.println("Teetä ei ole enää jäljellä! Täytä säiliö.");
			}
		} else {
			System.out.println("Ei onnistu, kiitos kuitenkin maksustasi.");
		}
	}

	public void valmistaKaakao() {

		int Todennäköisyys = (int) (Math.random() * 100 + 1);

		if (onnistuuko(Todennäköisyys)) {

			if (kaakaota >= 10) {

				kaakaota = kaakaota - 10;

				System.out.println("Odota hetki, Kaakaosi valmistuu.");
			} else {
				System.out.println("Kaakaota ei ole enää jäljellä! Täytä säiliö.");
			}
		} else {
			System.out.println("Ei onnistu, kiitos kuitenkin maksustasi.");
		}
	}

	// BOOLEAN METODI ONNISTUMISEN ARVON TESTAAMISELLE

	public static boolean onnistuuko(int uusiTodennäköisyys) {

		if (uusiTodennäköisyys > 25)
			return true;
		else
			return false;
	}

	// toString JA GETTERIT & SETTERIT

	public String toString() {
		return "Kahvia jäljellä: " + kahvia + " -- Teetä jäljellä: " + teetä + " -- Kaakaota jäljellä: " + kaakaota;
	}

	public int getTeetä() {
		return teetä;
	}

	public void setTeetä(int teetä) {
		this.teetä = teetä;
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
