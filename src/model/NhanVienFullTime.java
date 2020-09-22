package model;

public class NhanVienFullTime extends NhanVien{
    int ngayLamThem;
    int loaiChucVu;

    public NhanVienFullTime(String ten) {
        super(ten);
        this.loaiChucVu = NHAN_VIEN_LINH;
    }

    public NhanVienFullTime(String ten, int ngayLamThem) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = NHAN_VIEN_LINH;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }


    protected String LoaiNhanVien() {
        if (this.loaiChucVu == NHAN_VIEN_LINH) return "Lính";
        return "Sếp";
    }

    public void tinhLuong() {
        if (this.loaiChucVu == NHAN_VIEN_SEP) {
            System.out.println("Lương của Sếp "+this.ten +" = " + (NHAN_VIEN_FULL_TIME_SEP+ this.ngayLamThem*LUONG_LAM_THEM_MOI_NGAY));
        }else if (this.loaiChucVu == NHAN_VIEN_LINH){
            System.out.println("Lương của nhân viên full time "+ this.ten+"= " + (NHAN_VIEN_FULL_TIME_LINH+this.ngayLamThem*LUONG_LAM_THEM_MOI_NGAY));
        }
    }


}
