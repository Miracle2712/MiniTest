package MiniTest;

public class SinhVien extends Nguoi{

    private int diem;

    public SinhVien(String ma, String ten, int tuoi, int diem) {
        super(ma, ten, tuoi);
        this.diem = diem;
    }

    public SinhVien(int diem) {
        this.diem = diem;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "XeMay{ Tên là : " + getTen() +
                ", Tuổi : " + getTuoi() +
                " , Điểm = " + getDiem() +
                '}';
    }
}
