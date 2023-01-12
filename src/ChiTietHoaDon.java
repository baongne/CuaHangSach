

import java.io.Serializable;

import java.util.Objects;
import java.util.Scanner;


public class ChiTietHoaDon implements Comparable<ChiTietHoaDon>,Serializable {
    private String mahd;
    private String masach;
    private String tensach;
    private int soluong;
    private long thanhtien;
    private long dongia;
   
    
    public ChiTietHoaDon(){
        
    }

    public ChiTietHoaDon(String mahd, String masach,String tensach, int soluong, long dongia, long thanhtien) {
        this.mahd = mahd;
        this.masach = masach;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
        this.dongia = dongia;
        this.tensach = tensach;
    }
    public ChiTietHoaDon(ChiTietHoaDon x){
        mahd=x.mahd ;
        masach=x.masach ;
        soluong=x.soluong ;
        thanhtien=x.thanhtien ;
        dongia=x.dongia ;
        tensach=x.tensach;
    }

    public ChiTietHoaDon(String mahd) {
        this.mahd = mahd;
    }
     public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }


    public String getMahd() {
        return mahd;
    }

   
    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasp(String masach) {
        this.masach = masach;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public long getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(long thanhtien) {
        this.thanhtien = thanhtien;
    }

    public long getDongia() {
        return dongia;
    }

    public void setDongia(long dongia) {
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        return "" + "Ma hoa don:" + mahd + "| Ma sach:" + masach + "| Ten sach:" +tensach+ " | So luong:" + soluong + "| Don gia:" + dongia + "| Thanh tien:" + thanhtien + "";
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma hoa don la:");
        mahd=sc.nextLine();
        System.out.println("Ma sach la:");
        masach=sc.nextLine();
        System.out.println("Ten sach la:");
        tensach=sc.nextLine();
        System.out.println("so luong la:");
        soluong=sc.nextInt();
        System.out.println("Thanh tien la:");
        thanhtien=sc.nextLong();
        System.out.println("Don gia la:");
        dongia=sc.nextLong();
    }
    
    public void xuat(){
        System.out.println("-------------------------------------------");
        System.out.println("Ma hoa don la:"+this.mahd);
        System.out.println("Ma sach la:"+this.masach);
        System.out.println("Ten sach la:"+this.tensach);
        System.out.println("So luong:"+this.soluong);
        System.out.println("don gia:"+this.dongia);
        System.out.println("Thanh tien:"+this.thanhtien);
        System.out.println("-------------------------------------------");
        
                  
    }

    @Override
   public int compareTo(ChiTietHoaDon o) {
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
        final ChiTietHoaDon other = (ChiTietHoaDon) obj;
        return Objects.equals(this.mahd, other.mahd);
    }

   
}
