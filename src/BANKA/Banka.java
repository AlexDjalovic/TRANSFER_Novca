package BANKA;

import java.util.ArrayList;


public class Banka {
	private double stanje;
	//private Racun prim,up;
	private ArrayList<ZahtevZaTransfer>zbirka;
	public Banka(){
		
		zbirka=new ArrayList<ZahtevZaTransfer>();
	}

	public boolean dodaj(ZahtevZaTransfer zzt){//noviji zahtevi na kraj
		for(int i=0;i<zbirka.size();i++){
		if(!zzt.getDpodnosenja().novijiOd(zbirka.get(i).getDpodnosenja())) return false;
		}
		
			zbirka.add(zzt);return true;
	}
	//ako se javi stariji zahtev nece moci da bude smesten u listu

	public ZahtevZaTransfer uzmiPrvog(){
		if(zbirka.isEmpty())return null;
		return zbirka.get(0);
	}
	public void odradiZahteve(){
		while(!zbirka.isEmpty()){
			ZahtevZaTransfer zzt=uzmiPrvog();//uzmi prvi dokument u redu
		 zzt.izvrsi();//odradi sta pisse i promeni stanja
		 double zarada=zzt.getIznos()*zzt.provizija()/100; //izracunaj kokretnu zaradu od konkretnog dokumenta
		 System.out.println("kamata je "+zarada);
		 stanje+=zarada;//promeni moje stanje na racunu
		 zbirka.remove(0);}//izbrisi prvog i oslobodi da na to mesto dodje drugi dokument 
		//pa ponovi sve u krug zato postoji while petlja
	}
	/*public double mojaDobit(){
		double x=0;
	
		for(ZahtevZaTransfer zzt:zbirka){
			System.out.println("jjjj");
			x=zzt.getIznos()*zzt.provizija()/100;
		}
		stanje+=x;
		return x;
	}*/

	public ArrayList<ZahtevZaTransfer> getZbirka() {
		return zbirka;
	}

	public double getStanje() {
		return stanje;
	}
	
}
