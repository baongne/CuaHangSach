
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;


public class PhieuNhap implements Comparable<PhieuNhap>,Serializable{
    private String mapn;
    private String mancc;
    private int ngay;
    private int thang;
    private int nam; 
    private String manv;
    private int dongia;
    private int soluong;

    public PhieuNhap() {
    }

    public PhieuNhap(String mapn, String mancc, int ngay, int thang, int nam, String manv, int dongia,int soluong) {
        this.mapn = mapn;
        this.mancc = mancc;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.manv = manv;
        this.dongia = dongia;
        this.soluong = soluong;
        
    }
    
    public PhieuNhap(PhieuNhap x) {
        mapn=x.mapn;
        ngay=x.ngay;
        thang=x.thang;
        nam=x.nam;
        manv=x.manv;
        mancc=x.mancc;
        dongia=x.dongia;
        soluong = x.soluong;
    }

    public PhieuNhap(String mapn) {
        this.mapn = mapn;
    }

    public String getMapn() {
        return mapn;
    }

    public void setMapn(String mapn) {
        this.mapn = mapn;
    }

    public String getMancc() {
        return mancc;
    }

    public void setMancc(String mancc) {
        this.mancc = mancc;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public int getdongia() {
        return dongia;
    }

    public void setdongia(int dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ma phieu nhap la:");
        mapn=sc.nextLine();
        System.out.println("ma nha cung cap la:");
        mancc=sc.nextLine();
        System.out.println("Ngay la:");
        ngay=sc.nextInt();
        System.out.println("Thang la:");
        thang=sc.nextInt();
        System.out.println("nam la:");
        nam=sc.nextInt();
        sc.nextLine();
        System.out.println("ma nhan vien la:");
        manv=sc.nextLine();
        System.out.println("don gia la:");
        dongia=sc.nextInt();
        soluong=sc.nextInt();
        
    }
    @Override
    public String toString() {
        return "" + "Ma phieu nhap:" + mapn + "| Ma nha cung cap:" + mancc + "| Ngay nhap:" + ngay + "/" + thang + "/" + nam + "| Ma nhan vien:" + manv + "| Don gia:" + dongia + "| So luong:"+ soluong+'|';
    }

    @Override
    public int compareTo(PhieuNhap o) {
        return this.mapn.compareTo(o.mapn);
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
        final PhieuNhap other = (PhieuNhap) obj;
        return Objects.equals(this.mapn, other.mapn);
    }
    
    
}
