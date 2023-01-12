
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;


public class NhaCungCap implements Comparable<NhaCungCap>,Serializable {
    private String mancc;
    private String tenncc;
    private long sdt;
    private String diachi;

    public NhaCungCap() {
    }

    public NhaCungCap(String mancc, String tenncc, long sdt, String diachi) {
        this.mancc = mancc;
        this.tenncc = tenncc;
        this.sdt = sdt;
        this.diachi = diachi;
    }
    public NhaCungCap(NhaCungCap x){
        mancc=x.mancc;
        tenncc=x.tenncc;
        sdt=x.sdt;
        diachi=x.diachi;
    }

    public NhaCungCap(String mancc) {
        this.mancc = mancc;
    }

    public String getMancc() {
        return mancc;
    }

    public void setMancc(String mancc) {
        this.mancc = mancc;
    }

    public String getTenncc() {
        return tenncc;
    }

    public void setTenncc(String tenncc) {
        this.tenncc = tenncc;
    }

    public long getSdt() {
        return sdt;
    }

    public void setSdt(long sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ma nha cung cap:");
        mancc=sc.nextLine();
        System.out.println("ten nha cung cap:");
        tenncc=sc.nextLine();
        System.out.println("so dien thoai:");
        sdt=sc.nextLong();
        sc.nextLine();
        System.out.println("dia chi:");
        diachi=sc.nextLine();
    }
    public void xuat() {
        System.out.println("ma nha cung cap la:" + this.mancc);
        System.out.println("ho ten sinh vien la:"+this.tenncc);
        System.out.println("so dien thoai la:" + this.sdt);
        System.out.println("Dia chi la: "+this.diachi );
      
    }

    @Override
    public String toString() {
        return "" + "Ma nha cung cap:" + mancc + "| Ten nha cung cap:" + tenncc + "| SDT:" + sdt + "| Dia chi:" + diachi + "";
    }
    
    @Override
    public int compareTo(NhaCungCap o) {
            return this.mancc.compareTo(o.mancc);
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
        final NhaCungCap other = (NhaCungCap) obj;
        return Objects.equals(this.mancc, other.mancc);
    }
    
}
