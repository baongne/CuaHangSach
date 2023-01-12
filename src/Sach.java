import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Sach implements Comparable<Sach>, Serializable {

    String masach;
    String tensach;
    int slton;
    long gianhap;
    long giaban;
    String nhaxb;
    int namxb;
    String matg;
    String tentg;
    
   

    public Sach() {
    }

    public Sach(String masach, String tensach, int slton, long gianhap, long giaban, String nhaxb, int namxb, String matg, String tentg) {
        this.masach = masach;
        this.tensach = tensach;
        this.slton = slton;
        this.gianhap = gianhap;
        this.giaban = giaban;
        this.nhaxb = nhaxb;
        this.namxb = namxb;
        this.matg = matg;
        this.tentg = tentg;
 
    }

    public Sach(Sach x) {
        masach = x.masach;
        tensach = x.tensach;
        slton = x.slton;
        gianhap = x.gianhap;
        giaban = x.giaban;
        nhaxb = x.nhaxb;
        namxb = x.namxb;
        matg = x.matg;
        tentg = x.tentg;

    }

    public Sach(String masach) {
        this.masach = masach;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSlton() {
        return slton;
    }

    public void setSlton(int slton) {
        this.slton = slton;
    }

    public long getGianhap() {
        return gianhap;
    }

    public void setGianhap(long gianhap) {
        this.gianhap = gianhap;
    }

    public long getGiaban() {
        return giaban;
    }

    public void setGiaban(long giaban) {
        this.giaban = giaban;
    }

    public String getNhaxb() {
        return nhaxb;
    }

    public void setNhaxb(String nhaxb) {
        this.nhaxb = nhaxb;
    }

    public int getNamxb() {
        return namxb;
    }

    public void setNamxb(int namxb) {
        this.namxb = namxb;
    }

    public String getMatg() {
        return matg;
    }

    public void setMatg(String matg) {
        this.matg = matg;
    }

    public String getTentg() {
        return tentg;
    }

    public void setTentg(String tentg) {
        this.tentg = tentg;
    }


    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ma sach la:");
        masach = sc.nextLine();
        System.out.println("ten sach la:");
        tensach = sc.nextLine();
        System.out.println("so luong ton la:");
        slton = sc.nextInt();
        System.out.println("gia nhap la:");
        gianhap = sc.nextLong();
        System.out.println("gia ban la:");
        giaban = sc.nextLong();
        sc.nextLine();
        System.out.println("nha xuat ban la:");
        nhaxb = sc.nextLine();
        System.out.println("nam xuat ban la:");
        namxb = sc.nextInt();
        sc.nextLine();
        System.out.println("ma tac gia la:");
        matg = sc.nextLine();
        System.out.println("ten tac gia la:");
        tentg = sc.nextLine();


    }

    @Override
    public String toString() {
        return "" + "Ma sach:" + masach + "| Ten sach:" + tensach + "| So luong ton:" + slton + "| Gia nhap:" + gianhap + "| Gia ban:" + giaban + "| Nha xuat ban:" + nhaxb + "| Nam xuat ban:" + namxb + "| Ma tac gia:" + matg + "| Ten tac gia:" + tentg + "";
    }

    public void xuat() {
        System.out.println("" + "Ma sach:" + masach + "| Ten sach:" + tensach + "| So luong ton:" + slton + "| Gia nhap:" + gianhap + "| Gia ban:" + giaban + "| Nha xuat ban:" + nhaxb + "| Nam xuat ban:" + namxb + "| Ma tac gia:" + matg + "| Ten tac gia:" + tentg + "|");
        /*System.out.println("ma sach la:" + this.masach);
        System.out.println("ten sach la:" + this.tensach);
        System.out.println("so luong ton la:" + this.slton);
        System.out.println("gia nhapla:" + this.gianhap);
        System.out.println("gia ban la:" + this.giaban);
        System.out.println("nha xuat ban la:" + this.nhaxb);
        System.out.println("nam xuat ban la:" + this.namxb);
        System.out.println("ma tac gia la:" + this.matg);
        System.out.println("ten tac gia la:" + this.tentg);*/
    }
    
    
     public void SuaSach()
     {
         Scanner sc = new Scanner(System.in);

        System.out.println("ma sach la:");
        String masachS = sc.nextLine();
        System.out.println("ten sach la:");
        String tensachS = sc.nextLine();
        System.out.println("so luong ton la:");
        int sltonS = sc.nextInt();
        System.out.println("gia nhap la:");
        long gianhapS = sc.nextLong();
        System.out.println("gia ban la:");
        long giabanS = sc.nextLong();
        sc.nextLine();
        System.out.println("nha xuat ban la:");
        String nhaxbS = sc.nextLine();
        System.out.println("nam xuat ban la:");
        int namxbS = sc.nextInt();
        sc.nextLine();
        System.out.println("ma tac gia la:");
        String matgS = sc.nextLine();
        System.out.println("ten tac gia la:");
        String tentgS = sc.nextLine();

        setMasach(masachS);
        setTensach(tensachS);
        setSlton(sltonS);
        setGianhap(gianhapS);
        setGiaban(giabanS);
        setNhaxb(nhaxbS);
        setNamxb(namxbS);
        setMatg(matgS);
        setTentg(tentgS);
              
      
     }
    @Override
    public int compareTo(Sach o) {
        return this.masach.compareTo(o.masach);

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
        final Sach other = (Sach) obj;
        return Objects.equals(this.masach, other.masach);
    }
    

    

    
}
    
