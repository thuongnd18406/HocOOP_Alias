package dangthuongngo.com.model;

public class NhanVien implements Cloneable{
	private int ma;
	private String ten;
	public NhanVien(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	
	@Override
	public String toString() {
		return "NhanVien [ma=" + ma + ", ten=" + ten + "]";
	}

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	//private double 
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public NhanVien copy()
	{
		try {
			return (NhanVien) this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
