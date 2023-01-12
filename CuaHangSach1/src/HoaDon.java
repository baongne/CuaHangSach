
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;


public class HoaDon implements Comparable<HoaDon>,Serializable {
    private String mahd;
    private int ngay;
    private int thang;
    private int nam;
    private String manv;
    private String makh;
    private long tongtien;
    
    public HoaDon(){
           
    }

    public HoaDon(String mahd, int ngay,int thang,int nam, String manv, String makh, int tongtien) {
        this.mahd = mahd;
        this.ngay = ngay;
        this.thang=thang;
        this.nam=nam;
        this.manv = manv;
        this.makh = makh;
        this.tongtien = tongtien;
    }

    public HoaDon(HoaDon x) {
        mahd=x.mahd;
        ngay=x.ngay;
        thang=x.thang;
        nam=x.nam;
        manv=x.manv;
        makh=x.makh;
        tongtien=x.tongtien;
    }

    public HoaDon(String mahd){
        this.mahd=mahd;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
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

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public long getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma hoa don:");
        mahd=sc.nextLine();
        System.out.println("Ngay:");
        ngay=sc.nextInt();
        System.out.println("Thang:");
        thang=sc.nextInt();
        System.out.println("Nam:");
        nam=sc.nextInt();
        sc.nextLine();
        System.out.println("ma nhan vien la:");
        manv=sc.nextLine();
        System.out.println("ma khach hang:");
        makh=sc.nextLine();
        System.out.println("Tong tien:");
        tongtien=sc.nextInt();
         
    }
    @Override
    public String toString() {
        return "" + "Ma hoa don:" + mahd + "| Ngay lap:" + ngay +"/"+thang+"/"+nam+ "| manv:" + manv + "| makh:" + makh + "| tongtien:" + tongtien + "";
    }
    public void xuat(){
        System.out.print("Ma hoa don la: "+this.mahd);
        System.out.print("\t Ngay lap: "+this.ngay+"/"+this.thang+"/"+this.nam);
        System.out.print("\t Ma nhan vien la: "+this.manv);
        System.out.print("\t ma khach hang la: "+this.makh);
        System.out.print("\t Tong tien la:"+this.tongtien);
        System.out.println("\n");
    }

    @Override
    public int compareTo(HoaDon o) {
        return this.mahd.compareTo(o.mahd);
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
        final HoaDon other = (HoaDon) obj;
        return Objects.equals(this.mahd, other.mahd);
    }

 
}
