
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;


public class NhanVien implements Comparable<NhanVien>,Serializable{
    private String manv;
    private String ho;
    private String ten;
    private String gioitinh;
    private String diachi;
    private long sdt;
    private String chucvu;
    
    public NhanVien(){
        
    }

    public NhanVien(String manv, String ho, String ten, String gioitinh, String diachi, long sdt, String chucvu) {
        this.manv = manv;
        this.ho = ho;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.chucvu = chucvu;
    }
    public NhanVien(NhanVien x){
        manv=x.manv;
        ho=x.ho;
        ten=x.ten;
        gioitinh=x.gioitinh;
        diachi=x.diachi;
        sdt=x.sdt;
        chucvu=x.chucvu;
    }

    public NhanVien(String manv){
        this.manv=manv;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public long getSdt() {
        return sdt;
    }

    public void setSdt(long sdt) {
        this.sdt = sdt;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma nhan vien:");
        manv = sc.nextLine();
        sc.nextLine();
        System.out.println("nhap ho:");
        ho = sc.nextLine();
        System.out.println("nhap ten:");
        ten = sc.nextLine();
        System.out.println("nhap gioitinh:");
        gioitinh = sc.nextLine();
        System.out.println("nhap diachi:");
        diachi = sc.nextLine();
        System.out.println("nhap sdt:");
        sdt = sc.nextLong();
        sc.nextLine();
        System.out.println("nhap chucvu:");
        chucvu = sc.nextLine();
    }

    @Override
    public String toString() {
        return "" + "Ma nhan vien:" + manv + "| Ho:" + ho + "| Ten:" + ten + "| Gioi tinh:" + gioitinh + "| Dia chi:" + diachi + "| SDT:" + sdt + "| Chuc vu:" + chucvu + "";
    }
    
    public void xuat() {
        System.out.println("ma sinh vien la:" + this.manv);
        System.out.println("ho ten sinh vien la:" + this.ho + " " + this.ten);
        System.out.println("so dien thoai la:" + this.sdt);
        System.out.println("Gioi tinh la: "+this.gioitinh);
        System.out.println("Dia chi la: "+this.diachi );
        System.out.println("Chuc vu la: "+this.chucvu);
    }

    @Override
    public int compareTo(NhanVien o) {
            return this.manv.compareTo(o.manv);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NhanVien other = (NhanVien) obj;
        return Objects.equals(this.manv, other.manv);
    }
    
}
