package BANKA;

public class Uplatnica extends ZahtevZaTransfer {

	//public static final double PROVIZIJA=10;
	public Uplatnica(Racun pr, Racun up, double iz, Datum dp) {
		super(pr, up, iz, dp);
		
	}

	@Override
	public String vrsta() {
		// TODO Auto-generated method stub
		return "Uplatnica";
	}


	@Override
	public double provizija() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public void izvrsi() {
		// TODO Auto-generated method stub
		uplatilac.promeniStanje(-iznos-iznos*provizija()/100);//provizija se naplacuje zato se smanjuje iznos sredstava uz smanjenje
		primalac.promeniStanje(iznos);
	}

}
