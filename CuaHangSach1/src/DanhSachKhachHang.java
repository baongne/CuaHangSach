

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

class DanhSachKhachHang extends KhachHang {

    KhachHang[] dskh = new KhachHang[0];
    int n;

    public DanhSachKhachHang() {
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
//nhập n từ bàn phím dùng scanner 
        System.out.println("nhap n:");
        n = sc.nextInt();

//nhập n sv như sau
        dskh = new KhachHang[n];

        for (int i = 0; i < n; i++) {

            dskh[i] = new KhachHang();

            dskh[i].nhap();
        }

    }

    @Override
    public void xuat() {

        for (int i = 0; i < n; i++) {
            System.out.print("Khach hang " + i + " la:\n");
            System.out.println(dskh[i]);

        }
    }
  

    public void them() {
        System.out.println("Khach hang can them:");
        n = dskh.length;

        dskh = Arrays.copyOf(dskh, n + 1);

        dskh[n] = new KhachHang();

        dskh[n].nhap();

        n++;

    }

    public void them(KhachHang x) {

        n = dskh.length;

        dskh = Arrays.copyOf(dskh, n + 1);

        dskh[n] = new KhachHang(x);
        n++;

    }

    public void xoaTheoSTT() {
        Scanner sc = new Scanner(System.in);
        n = dskh.length;
        System.out.println("nhap j:");
        int j = sc.nextInt();
        for (int i = j; i < n - 1; i++) {
            dskh[i] = dskh[i + 1];

        }
         dskh = Arrays.copyOf(dskh, n - 1);
        n--;
    }

    public void xoaTheoMa() {
        Scanner sc = new Scanner(System.in);
        n = dskh.length;
        System.out.println("nhap ma:");
        String ma = sc.nextLine();
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (dskh[i].getMakh().equalsIgnoreCase(ma)) {
                index = i;
                for (int j = index; j < n - 1; j++) {
                    dskh[j] = dskh[j + 1];
                }
            }
        }
         dskh = Arrays.copyOf(dskh, n - 1);
        n--;
    }

    public void SuaKhachHang() {

        Scanner sc = new Scanner(System.in);

        n = dskh.length;
        System.out.println("Ma khach hang can sua:");
        String makhachhang = sc.nextLine();

        System.out.println("ma khach hang:");
         String makh=sc.nextLine();
         sc.nextLine();
         System.out.println("ho:");
         String ho=sc.nextLine();
         System.out.println("ten:");
         String ten=sc.nextLine();
         System.out.println("dia chi:");
         String diachi=sc.nextLine();
         System.out.println("so dien thoai:");
         long sdt=sc.nextLong();
        for (int j = 0; j < n; j++) 
            if (makhachhang.equals(dskh[j].getMakh())) {
                dskh[j].setMakh(makh);
                dskh[j].setHo(ho);
                dskh[j].setTen(ten);
                dskh[j].setDiachi(diachi);
                dskh[j].setSdt(sdt);
                

            }
        

    }
    public String KtrMaKH() {
        Scanner sc = new Scanner(System.in);
        n = dskh.length;
        
        int d=0;
        
        System.out.println("Nhap ma khach hang: ");
        String MaNV= sc.nextLine();
        
        for(int i=0;i<n;i++)
            if(MaNV.equals(dskh[i].getMakh())==true){
                  d++;
                return dskh[i].getMakh();
            }
            if(d==0){
                System.out.println("Khong co ma khach hang trong danh sach!");
                return KtrMaKH();
            }
        return null;
            
        
    }

    public void TimkiemMakh() {
        Scanner sc = new Scanner(System.in);
        n = dskh.length;
        System.out.println("Ma khach hang:");
        int d = 0;
        String makh = sc.nextLine();
        for (int i = 0; i < n; i++) 
            if (makh.equals(dskh[i].getMakh()) == true) {
                System.out.println("Khach hang can tim la:");
                System.out.println(dskh[i]);
                d++;
            }
            if (d == 0) {
                System.out.println("Khong co ma khach hang can tim!");
            }

        
    }

    public void KiemtratontaiMakh() {
        Scanner sc = new Scanner(System.in);
        n = dskh.length;
        System.out.println("Ma khach hang:");
        int d = 0;
        String makh = sc.nextLine();
        for (int i = 0; i < n; i++) 
            if (makh.equals(dskh[i].getMakh()) == true) {
                System.out.println("Khach hang co ton tai!");
                System.out.println(dskh[i]);
                d++;
            }
            if (d == 0) {
                System.out.println("Khong ton tai khach hang can tim!");
            }

        
    }
    
    public String LayMakh(String ho,String ten) {
        Scanner sc = new Scanner(System.in);
        n = dskh.length;
        
         int d=0;
        
        for(int i=0;i<n;i++)
            if(ho.equals(dskh[i].getHo())==true || ten.equals(dskh[i].getTen())==true){
                d++;
                return dskh[i].getMakh();
                
                
            }
            if(d==0){
                System.out.println("Khong co ma khach hang trong danh sach!");
                return "0";
            }
        return null;
            
        
    }
    public void ghiDuLieuXuongFile(File file) {
        try {
            OutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (KhachHang KH : dskh) {
                oos.writeObject(KH);

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
                KhachHang obj = (KhachHang) ois.readObject();
                them(obj);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

}






































































































































































































}
