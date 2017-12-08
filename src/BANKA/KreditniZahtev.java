package BANKA;

public class KreditniZahtev extends ZahtevZaTransfer{

	//private static final double PROVIZIJA=5;
	public KreditniZahtev(Racun pr, Racun up, double iz, Datum dp) {
		super(pr, up, iz, dp);
		
	}

	@Override
	public String vrsta() {
		
		return "Kreditni zahtev ";
	}

	@Override
	public double provizija() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public void izvrsi() {
		// TODO Auto-generated method stub
		primalac.promeniStanje(iznos-iznos*provizija()/100);//mora ovde kroz 100 jer je provizija final
		uplatilac.promeniStanje(-iznos);
	}

}
