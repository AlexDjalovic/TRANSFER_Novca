package BANKA;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Racun k1=new Racun("K1",100, 3000);
		Racun k2=new Racun("K2", 2500, 6000);
		Uplatnica u1=new Uplatnica(k1, k2, 400,	 new Datum(24,6,2017));
		System.out.println(k1);
		Banka b=new Banka();
		Racun ja=new Racun("banka",60000,1200000);
		b.dodaj(u1);
		System.out.println(b.getZbirka());
	//b.odradiZahteve();
		
		/*u1.izvrsi();
		System.out.println(k1);
	System.out.println(k2); //ovo je deo kada se samo uplatnica izvrsava, sto nije dobro jer ne ide preko banke
	System.out.println("moja dobit od konkretne tran"+b.mojaDobit());
	System.out.println("stanje na bankinom racunu je "+b.stanje);*/
	KreditniZahtev kz=new KreditniZahtev(k1, ja,500, new Datum(25,6,2017));
	
	//kz.izvrsi();
	b.dodaj(kz);
	System.out.println(b.getZbirka());
	
Uplatnica u2=new Uplatnica(ja,k1,400,new Datum (25,6,2017));//ako stavim 2016 nece mi ga ubaciti u niz
	b.dodaj(u2);
	System.out.println(b.getZbirka());
	
	KreditniZahtev kz2=new KreditniZahtev(k2, ja, 250, new Datum(23,5,2017));//ako godina je pre poslednje unesene
	//godine nece da unese u ovom slucaju 2016.nece, ali moze da se unese i 23.05.iste godine
	b.dodaj(kz2);
	System.out.println(b.getZbirka());
	b.odradiZahteve();
	
	System.out.println(k2);//dobro
	System.out.println(k1);//dobro
	System.out.println(ja);//dobro
	//System.out.println("moja dobit od konkretne tran"+b.mojaDobit());
	System.out.println("stanje na bankinom racunu je "+b.getStanje());
	System.out.println(b.getZbirka());//dobro
	}

}
