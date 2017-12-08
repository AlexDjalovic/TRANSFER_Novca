package BANKA;

public class Datum {

	private int god,mes,dan;
	public Datum(int d,int m,int g){
		god=g;dan=d;mes=m;
	}
	public int getDan(){
		return dan;
	}
	public int getMes(){
		return mes;
	}
	public int getGod(){
		return god;
	}
	public boolean novijiOd(Datum d){
		if(d.getGod()<=god||//ako ovde stavim= onda mogu iste godine da unosim
				(d.getGod()==god&&d.getMes()<mes)||
				(d.getGod()==god&&d.getMes()==mes&&d.getDan()<dan))//ovde ako kod dana stavim = onda mogu samo isti dan, nista pre tog dana ni meseca ni godine
			//ako u ovom trecem nema=onda ne mogu da unesem ni 2 zahteva koja imaju isti dan podnosenja
				return true;
		 return false;
	}
	public String toString(){
		return dan+":"+mes+":"+god;
	}
}
