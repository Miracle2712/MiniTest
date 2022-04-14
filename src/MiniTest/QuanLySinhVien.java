package MiniTest;

public class QuanLySinhVien implements QuanLy<SinhVien>{
    private SinhVien[] danhSach = new SinhVien[3];
    private int size = 0 ;


    @Override
    public void them(SinhVien sinhVien) {
        danhSach[size] = sinhVien;
        size++;
    }

    @Override
    public void sua(String name, SinhVien sinhVien) {
        if (timKiem(name) != -1)
            danhSach[timKiem(name)] = sinhVien;
    }

    @Override
    public int timKiem(String name) {
        for(int i=0; i<size; i++){
            if(name == danhSach[i].getTen()){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void hienThi() {
        for (int i=0; i<size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("-----------------------------------");

    }

    public static void main(String[] args) {
        QuanLySinhVien ql = new QuanLySinhVien();
        SinhVien sv1 = new SinhVien( "s20" , "Hoàng" ,21,10);
        SinhVien sv2 = new SinhVien( "s15" , "Nam" ,22,9);
        ql.them(sv1);
        ql.them(sv2);
        ql.hienThi();
        SinhVien sv3 = new SinhVien("s11" , "Minh" ,22,8);
        ql.them(sv3);
        ql.hienThi();
    }

}
