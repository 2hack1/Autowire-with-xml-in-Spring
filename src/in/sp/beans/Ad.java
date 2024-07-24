package in.sp.beans;

public class Ad {

	private String hname;
	private String hno;
	
//	public void setHname(String hname) {
//		this.hname=hname;
//	}
//	public void setHno(String hno) {
//		this.hno=hno;}
	
	
	public Ad(String hname, String hno) {
		this.hname = hname;
		this.hno = hno;
	}

	@Override
	public String toString() {
		return "Ad [hname=" + hname + ", hno=" + hno + "]";
	}
	
	


}
