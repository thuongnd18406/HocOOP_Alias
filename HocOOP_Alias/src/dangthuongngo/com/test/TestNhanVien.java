package dangthuongngo.com.test;

import dangthuongngo.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVien nv1=new NhanVien(1, "Obama");
		NhanVien nv2 =new NhanVien(2,"Putin");
		nv1=nv2;
		nv2.setTen("Kim Jong Un");
		System.out.println("Tên Nhân Viên 1="+nv1.getTen());
		nv1.setTen("Hồ cẫm đào");
		System.out.println("Tên Nhân Viên 1="+nv2.getTen());
		NhanVien nv3 =new NhanVien(3, "Ông Thanh");
		NhanVien nv4 =new NhanVien(4, "Ông Hùng");
		nv3=nv4.copy();
		System.out.println("Tên Nhân viên 3 "+nv3.getTen());
	}

}
