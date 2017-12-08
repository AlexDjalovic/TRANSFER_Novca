package BANKA;

public class Racun {
	private static int jagid=0;
	private int id=++jagid;
	private double stanje,minus;
	private String ime;
	
	public Racun(String ime,double stanje,double minus){
		this.stanje=stanje;
		this.minus=minus;
		this.ime=ime;
	}
	public double getStanje(){
		return stanje;
	}
	public double minus(){
		return minus;
	}
	public void promeniStanje(double iznos){
		if(stanje+iznos>minus)
			try {
				throw new GprekoracenMinus();
			} catch (GprekoracenMinus e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		stanje+=iznos;
	}

	public String toString(){
		return ime+" "+getStanje();
	}
}
