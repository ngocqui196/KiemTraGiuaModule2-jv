package model;

public class NhanVienPassTime  extends NhanVien{
    int gioLamViec;

    public NhanVienPassTime(String ten, int gioLamViec) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }

    @Override
    protected String loaiNhanVien() {
        return "Nhân viên thời vụ.";
    }

    public void tinhLuong() {
        System.out.println("Lương nhân viên part time "+this.ten+"+ " + this.gioLamViec * LUONG_NHAN_VIEN_LAM_THEM_MOI_GIO);
    }
}
