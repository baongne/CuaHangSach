

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

class DanhSachHoaDon extends HoaDon {

    HoaDon[] dshd = new HoaDon[0];
    int n;

    public DanhSachHoaDon() {
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
//nhập n từ bàn phím dùng scanner 
        System.out.println("nhap n:");
        n = sc.nextInt();

//nhập n sv như sau
        dshd = new HoaDon[n];

        for (int i = 0; i < n; i++) {

            dshd[i] = new HoaDon();

            dshd[i].nhap();
        }

    }

    @Override
    public void xuat() {

        for (int i = 0; i < n; i++) {
            System.out.print("Hoa don " + i + " la:\n");
            System.out.println(dshd[i]);

        }
    }
    public void Tongtien(){
         long tong=0;
         for (int i = 0; i < n; i++) {
            tong=tong+dshd[i].getTongtien();
        }
         System.out.println("Tong tien tat ca hoa don la:"+tong);
    }
    public long TongtienLONG(){
         long tong=0;
         for (int i = 0; i < n; i++) {
            tong=tong+dshd[i].getTongtien();
        }
         return tong;
    }
    
    public long Tongtienngay(int day, int month, int year){
         long tong=0;
        for (int i = 0; i < n; i++) {
            if (dshd[i].getNgay() == day && dshd[i].getThang()== month &&dshd[i].getNam() == year) {
                tong=tong+dshd[i].getTongtien();
                System.out.println(dshd[i]);
            }  
        }
        return tong;
    }
    public long TongtienThang(int month, int year){
         long tong=0;
        for (int i = 0; i < n; i++) {
            if (dshd[i].getThang()== month &&dshd[i].getNam() == year) {
                tong=tong+dshd[i].getTongtien();
                System.out.println(dshd[i]);
            }  
        }
        return tong;
    }
    public long TongtienTheoMaNV(String manv){
         long tong=0;
        for (int i = 0; i < n; i++) {
            if (manv.equals(dshd[i].getManv())==true) {
                tong=tong+dshd[i].getTongtien();
                System.out.println(dshd[i]);
            }  
        }
        return tong;
    }
     public int Laysl(){
        return dshd.length;
    }
     public long TongtienTheoMaKH(String makh){
         long tong=0;
        for (int i = 0; i < n; i++) {
            if (makh.equals(dshd[i].getMakh())==true) {
                tong=tong+dshd[i].getTongtien();
                System.out.println(dshd[i]);
            }  
        }
        return tong;
    }
   
  
    public void them() {
        System.out.println("Hoa Don can them:");
        n = dshd.length;

        dshd = Arrays.copyOf(dshd, n + 1);

        dshd[n] = new HoaDon();

        dshd[n].nhap();

        n++;

    }

    public void them(HoaDon x) {

        n = dshd.length;

        dshd = Arrays.copyOf(dshd, n + 1);

        dshd[n] = new HoaDon(x);
        n++;

    }
     

    public void xoaTheoSTT() {
        Scanner sc = new Scanner(System.in);
        n = dshd.length;
        System.out.println("nhap j:");
        int j = sc.nextInt();
        for (int i = j; i < n - 1; i++) {
            dshd[i] = dshd[i + 1];

        }

        dshd = Arrays.copyOf(dshd, n - 1);

       
        
        n--;
    }

    public void xoaTheoMa() {
        Scanner sc = new Scanner(System.in);
        n = dshd.length;
        System.out.println("nhap ma:");
        String ma = sc.nextLine();
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (dshd[i].getMahd().equalsIgnoreCase(ma)) {
                index = i;
                for (int j = index; j < n - 1; j++) {
                    dshd[j] = dshd[j + 1];
                }
            }
        }
         dshd = Arrays.copyOf(dshd, n - 1);

       
        
        n--;
        
    }

    public void SuaHoaDon() {

        Scanner sc = new Scanner(System.in);

        n = dshd.length;
        System.out.println("Ma hoa don can sua:");
        String mahoadon = sc.nextLine();

        System.out.println("Ma hoa don:");
        String mahd = sc.nextLine();
        int ngay=BanHang.Checkngay();
        int thang=BanHang.Checkthang();
        int nam=BanHang.Checknam();
         
        System.out.println("ma nhan vien la:");
        String manv = sc.nextLine();
       
        System.out.println("ma khach hang:");
        String makh = sc.nextLine();
        System.out.println("Tong tien:");
        int tongtien = sc.nextInt();
        for (int j = 0; j < n; j++) {
            if (mahoadon.equals(dshd[j].getMahd())) {
                dshd[j].setMahd(mahd);
                dshd[j].setNgay(ngay);
                dshd[j].setThang(thang);
                dshd[j].setNam(nam);
                dshd[j].setManv(manv);
                dshd[j].setMakh(makh);
                dshd[j].setTongtien(tongtien);

            }
        }

    }

    public void TimkiemMahd() {
        Scanner sc = new Scanner(System.in);
        n = dshd.length;
        System.out.println("Ma hoa don:");
        int d = 0;
        String mahd = sc.nextLine();
        for (int i = 0; i < n; i++) 
            if (mahd.equals(dshd[i].getMahd()) == true) {
                System.out.println("Hoa don can tim la:");
                System.out.println(dshd[i]);
                d++;
            }
            if (d == 0) {
                System.out.println("Khong co ma hoa don can tim!");
            }

        
    }

    public void KiemtratontaiMahd() {
        Scanner sc = new Scanner(System.in);
        n = dshd.length;
        System.out.println("Ma hoa don:");
        int d = 0;
        String mahd = sc.nextLine();
        for (int i = 0; i < n; i++) 
            if (mahd.equals(dshd[i].getMahd()) == true) {
                System.out.println("Hoa don co ton tai!");
                System.out.println(dshd[i]);
                d++;
            }
            if (d == 0) {
                System.out.println("Khong ton tai hoa don can tim!");
            }

        
    }
     
     
     public boolean KTR(String mahd) {
        
        n = dshd.length;
      
        int d = 0;
        
        for (int i = 0; i < n; i++) 
            if (mahd.equals(dshd[i].getMahd()) == true) {
                d++;
               return true;
               
               
            }
            if (d == 0) {
                return false;
            }
        return false;

        
    }
     public void XuatMahoadon() {
        Scanner sc = new Scanner(System.in);
        n = dshd.length;
      
   
      
        for (int i = 0; i < n; i++) 
            {
                System.out.print("Ma Hoa don :"+dshd[i].getMahd());
               
                
            }
          

        
    }
     
     
 public void ghiDuLieuXuongFile(File file) {
        try {
            OutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (HoaDon HD : dshd) {
                oos.writeObject(HD);
                
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
                HoaDon obj = (HoaDon) ois.readObject();
                them(obj);
                
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

}

    

























































































































































































































































}
