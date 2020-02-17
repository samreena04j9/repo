package capgemini;

public enum Month {
	JAN(31),FEB(29),MAR(31),APR(30);
	
	private int nod;
	private Month(int nod){
		this.nod=nod;
	}
	public int getNod() {
		return nod;
	}

}
