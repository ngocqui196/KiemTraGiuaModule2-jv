package model;

public class Main {
    public static void main(String[] args) {
        NhanVienFullTime nhanVien1 = new NhanVienFullTime("Diễn",22);
        nhanVien1.setLoaiChucVu(1);
        NhanVienFullTime nhanVien2 = new NhanVienFullTime("Tưởng", 13);
        NhanVienFullTime nhanVien3 = new NhanVienFullTime("Kim",0);

        NhanVienPassTime nhanVien4 = new NhanVienPassTime("Long",132);

        nhanVien1.tinhLuong();
        nhanVien2.tinhLuong();
        nhanVien3.tinhLuong();
        nhanVien4.tinhLuong();
    }
}
