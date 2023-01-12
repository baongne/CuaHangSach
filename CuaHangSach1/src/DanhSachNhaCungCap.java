
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

class DanhSachNhaCungCap extends NhaCungCap {

    NhaCungCap[] dsncc = new NhaCungCap[0];
    int n;

    public DanhSachNhaCungCap() {
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
//nhập n từ bàn phím dùng scanner 
        System.out.println("nhap n:");
        n = sc.nextInt();

//nhập n sv như sau
        dsncc = new NhaCungCap[n];

        for (int i = 0; i < n; i++) {

            dsncc[i] = new NhaCungCap();

            dsncc[i].nhap();
        }

    }

    public void xuat() {

        for (int i = 0; i < n; i++) {
            System.out.print("Nha cung cap " + i + " la:\n");
            System.out.println(dsncc[i]);

        }
    }

    public void them() {
        System.out.println("Nha cung cap can them:");
        n = dsncc.length;

        dsncc = Arrays.copyOf(dsncc, n + 1);

        dsncc[n] = new NhaCungCap();

        dsncc[n].nhap();

        n++;

    }

    public void them(NhaCungCap x) {

        n = dsncc.length;

        dsncc = Arrays.copyOf(dsncc, n + 1);

        dsncc[n] = new NhaCungCap(x);
        n++;

    }

    public void xoaTheoSTT() {
        Scanner sc = new Scanner(System.in);
        n = dsncc.length;
        System.out.println("nhap j:");
        int j = sc.nextInt();
        for (int i = j; i < n - 1; i++) {
            dsncc[i] = dsncc[i + 1];

        }
        dsncc = Arrays.copyOf(dsncc, n - 1);
        n--;
    }

    public void xoaTheoMa() {
        Scanner sc = new Scanner(System.in);
        n = dsncc.length;
        System.out.println("nhap ma:");
        String ma = sc.nextLine();
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (dsncc[i].getMancc().equalsIgnoreCase(ma)) {
                index = i;
                for (int j = index; j < n - 1; j++) {
                    dsncc[j] = dsncc[j + 1];
                }
            }
        }
        dsncc = Arrays.copyOf(dsncc, n - 1);
        n--;
    }

    public void SuaNhaCungCap() {

        Scanner sc = new Scanner(System.in);

        n = dsncc.length;
        System.out.println("Ma nha cung cap can sua:");
        String manhacungcap = sc.nextLine();

        System.out.println("ma nha cung cap:");
        String mancc = sc.nextLine();
        System.out.println("ten nha cung cap:");
        String tenncc = sc.nextLine();
        System.out.println("so dien thoai:");
        long sdt = sc.nextLong();
        System.out.println("dia chi:");
        String diachi = sc.nextLine();
        for (int j = 0; j < n; j++) 
            if (manhacungcap.equals(dsncc[j].getMancc())) {
                dsncc[j].setMancc(mancc);
                dsncc[j].setTenncc(tenncc);
                dsncc[j].setSdt(sdt);
                dsncc[j].setDiachi(diachi);

            }
        

    }

    public void TimkiemMancc() {
        Scanner sc = new Scanner(System.in);
        n = dsncc.length;
        System.out.println("Ma nha cung cap:");
        int d = 0;
        String mancc = sc.nextLine();
        for (int i = 0; i < n; i++) 
            if (mancc.equals(dsncc[i].getMancc()) == true) {
                System.out.println("nha cung cap can tim la:");
                System.out.println(dsncc[i]);
                d++;
            }
            if (d == 0) {
                System.out.println("Khong co ma nha cung cap can tim!");
            }

        
    }

    public void KiemtratontaiMancc() {
        Scanner sc = new Scanner(System.in);
        n = dsncc.length;
        System.out.println("Ma nha cung cap:");
        int d = 0;
        String mancc = sc.nextLine();
        for (int i = 0; i < n; i++) 
            if (mancc.equals(dsncc[i].getMancc()) == true) {
                System.out.println("nha cung cap co ton tai!");
                System.out.println(dsncc[i]);
                d++;
            }
            if (d == 0) {
                System.out.println("Khong ton tai nha cung cap can tim!");
            }

        
    }
     public void ghiDuLieuXuongFile(File file) {
        try {
            OutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (NhaCungCap NCC : dsncc) {
                oos.writeObject(NCC);

            }
            
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void docDuLieuTuFile(File f) {
        try {
            InputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
          

            while (fis.available() > 0) {
                NhaCungCap obj = (NhaCungCap) ois.readObject();
                them(obj);
                
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

}






































































































































































































































}
