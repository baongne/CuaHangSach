

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

class DanhSachChiTietHoaDon extends ChiTietHoaDon {

    ChiTietHoaDon[] dscthd = new ChiTietHoaDon[0];
    int n;

    public DanhSachChiTietHoaDon() {
    }

    @Override
    public void nhap() {
        
        Scanner sc = new Scanner(System.in);
//nhập n từ bàn phím dùng scanner 
        System.out.println("nhap n:");
        n = sc.nextInt();

//nhập n sv như sau
        dscthd = new ChiTietHoaDon[n];

        for (int i = 0; i < n; i++) {

            dscthd[i] = new ChiTietHoaDon();

            dscthd[i].nhap();
        }

    }

    @Override
    public void xuat() {

        for (int i = 0; i < n; i++) {
           
            System.out.println(dscthd[i]);

        }
    }

    public void them() {
        System.out.println("Chi tiet hoa don can them:");
        n = dscthd.length;

        dscthd = Arrays.copyOf(dscthd, n + 1);

        dscthd[n] = new ChiTietHoaDon();

        dscthd[n].nhap();

        n++;

    }

    public void them(ChiTietHoaDon x) {

        n = dscthd.length;

        dscthd = Arrays.copyOf(dscthd, n + 1);

        dscthd[n] = new ChiTietHoaDon(x);
        n++;

    }
    public int Laysl(){
        return dscthd.length;
    }
    
    public void xoaTheoSTT() {
        Scanner sc = new Scanner(System.in);
        n = dscthd.length;
        System.out.println("nhap j:");
        int j = sc.nextInt();
        for (int i = j; i < n - 1; i++) {
            dscthd[i] = dscthd[i + 1];

        }
        dscthd = Arrays.copyOf(dscthd, n - 1);
        n--;
    }

    public void xoaTheoMa() {
        Scanner sc = new Scanner(System.in);
        n = dscthd.length;
        System.out.println("nhap ma:");
        String ma = sc.nextLine();
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (dscthd[i].getMahd().equalsIgnoreCase(ma)) {
                index = i;
                for (int j = index; j < n - 1; j++) {
                    dscthd[j] = dscthd[j + 1];
                }
            }
        }
        dscthd = Arrays.copyOf(dscthd, n - 1);
        n--;
    }

    public void SuaChiTietHoaDon() {

        Scanner sc = new Scanner(System.in);

        n = dscthd.length;
        System.out.println("Ma Chi tiet hoa don can sua:");
        String machitiethoadon = sc.nextLine();

        System.out.println("Ma hoa don la:");
        String mahd=sc.nextLine();
        System.out.println("Ma sach la:");
        String masach=sc.nextLine();
        System.out.println("so luong la:");
        int soluong=sc.nextInt();
        System.out.println("Thanh tien la:");
        long thanhtien=sc.nextLong();
        System.out.println("Don gia la:");
        long dongia=sc.nextLong();
        for (int j = 0; j < n; j++) 
            if (machitiethoadon.equals(dscthd[j].getMahd())) {
                dscthd[j].setMahd(mahd);
                dscthd[j].setMasp(masach);
                dscthd[j].setSoluong(soluong);
                dscthd[j].setThanhtien(thanhtien);
                dscthd[j].setDongia(dongia);
                

            }
        

    }

    public void TimkiemMacthd() {
        Scanner sc = new Scanner(System.in);
        n = dscthd.length;
        System.out.println("Ma Chi tiet hoa don:");
        int d = 0;
        String macthd = sc.nextLine();
        for (int i = 0; i < n; i++) 
            if (macthd.equals(dscthd[i].getMahd()) == true) {
                System.out.println("Chi tiet hoa don can tim la:");
                System.out.println(dscthd[i]);
                d++;
            }
            if (d == 0) {
                System.out.println("Khong co ma Chi tiet hoa don can tim!");
            }

        
    }

    public void KiemtratontaiMacthd() {
        Scanner sc = new Scanner(System.in);
        n = dscthd.length;
        System.out.println("Ma Chi tiet hoa don:");
        int d = 0;
        String macthd = sc.nextLine();
        for (int i = 0; i < n; i++) 
            if (macthd.equals(dscthd[i].getMahd()) == true) {
                System.out.println("Chi tiet hoa don co ton tai!");
                System.out.println(dscthd[i]);
                d++;
            }
            if (d == 0) {
                System.out.println("Khong ton tai Chi tiet hoa don can tim!");
            }

        
    }
    public String KiemtraMacthd() {
        File c = new File("\\OOP-Java\\CuaHangSach\\data\\chitiethoadon.txt");
        
        
        Scanner sc = new Scanner(System.in);
        n = dscthd.length;
        System.out.println("Ma hoa don:");
        int d = 0;
        String macthd = sc.nextLine();
        for (int i = 0; i < n; i++) 
            if (macthd.equals(dscthd[i].getMahd()) == true) {
         d++;
                return dscthd[i].getMahd();
               
            }
            if (d == 0) {
                System.out.println("Da co chi tiet hoa don can tim!");
                return KiemtraMacthd();
            }
        return null;

        
    }
 public void ghiDuLieuXuongFile(File file) {
        try {
            OutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (ChiTietHoaDon CTHD : dscthd) {
                oos.writeObject(CTHD);

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
                ChiTietHoaDon obj = (ChiTietHoaDon) ois.readObject();
                them(obj);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

}





























































































































































}
