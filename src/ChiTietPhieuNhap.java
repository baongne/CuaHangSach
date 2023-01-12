
public class ChiTietPhieuNhap {
    private String mapn;
    private String masach;
    private int slnhap;
    private long gianhap;
    private long thanhtien;

    public ChiTietPhieuNhap() {
    }

    public ChiTietPhieuNhap(String mapn, String masach, int slnhap, long gianhap, long thanhtien) {
        this.mapn = mapn;
        this.masach = masach;
        this.slnhap = slnhap;
        this.gianhap = gianhap;
        this.thanhtien = thanhtien;
    }

    public String getMapn() {
        return mapn;
    }
    

    public void setMapn(String mapn) {
        this.mapn = mapn;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public int getSlnhap() {
        return slnhap;
    }

    public void setSlnhap(int slnhap) {
        this.slnhap = slnhap;
    }

    public long getGianhap() {
        return gianhap;
    }

    public void setGianhap(long gianhap) {
        this.gianhap = gianhap;
    }

    public long getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(long thanhtien) {
        this.thanhtien = thanhtien;
    }

    @Override
    public String toString() {
        return "ChiTietPhieuNhap{" + "mapn=" + mapn + ", masach=" + masach + ", slnhap=" + slnhap + ", gianhap=" + gianhap + ", thanhtien=" + thanhtien + '}';
    }
    
    
    public void xuat(){
        System.out.println("Ma phieu nhap la:"+this.mapn);
        System.out.println("Ma sach:"+this.masach);
        System.out.println("So luong nhap:"+this.slnhap);
        System.out.println("Gia nhap:"+this.gianhap);
        System.out.println("Thanh tien:"+this.thanhtien);
        
    }
}
