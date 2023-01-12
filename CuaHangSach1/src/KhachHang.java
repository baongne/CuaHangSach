
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class KhachHang implements Comparable<KhachHang>, Serializable {

    private String makh;
    private String ho;
    private String ten;
    private String diachi;
    private long sdt;

    public KhachHang() {
    }

    public KhachHang(String makh, String ho, String ten, String diachi, long sdt) {
        this.makh = makh;
        this.ho = ho;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public KhachHang(KhachHang x) {
        makh = x.makh;
        ho = x.ho;
        ten = x.ten;
        diachi = x.diachi;
        sdt = x.sdt;

    }

    public KhachHang(String makh) {
        this.makh = makh;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
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

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ma khach hang:");
        makh = sc.nextLine();
        System.out.println("ho:");
        ho = sc.nextLine();
        System.out.println("ten:");
        ten = sc.nextLine();
        System.out.println("dia chi:");
        diachi = sc.nextLine();
        System.out.println("so dien thoai:");
        sdt = sc.nextLong();
    }

    @Override
    public String toString() {
        return "" + "Ma khach hang:" + makh + "| Ho:" + ho + "| Ten:" + ten + "| Dia chi:" + diachi + "| SDT:" + sdt
                + "";
    }

    public void xuat() {
        System.out.println("ma khach hang la:" + this.makh);
        System.out.println("ho ten khach hang la:" + this.ho + " " + this.ten);
        System.out.println("so dien thoai la:" + this.sdt);
        System.out.println("Dia chi la: " + this.diachi);

    }

    @Override
    public int compareTo(KhachHang o) {
        return this.makh.compareTo(o.makh);
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
        final KhachHang other = (KhachHang) obj;
        return Objects.equals(this.makh, other.makh);
    }

}
