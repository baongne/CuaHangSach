

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

class DanhSachPhieuNhap extends PhieuNhap {

    PhieuNhap[] dspn = new PhieuNhap[0];
    int n;

    public DanhSachPhieuNhap() {
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
//nhập n từ bàn phím dùng scanner 
        System.out.println("nhap n:");
        n = sc.nextInt();

//nhập n sv như sau
        dspn = new PhieuNhap[n];

        for (int i = 0; i < n; i++) {

            dspn[i] = new PhieuNhap();

            dspn[i].nhap();
        }

    }

    public void xuat() {

        for (int i = 0; i < n; i++) {
            System.out.print("Phieu nhap " + i + " la:\n");
            System.out.println(dspn[i]);

        }
    }
    public int TongTien() {
        int tong = 0;
         for (int i = 0; i < n; i++) {
             tong = tong - (dspn[i].getSoluong() * dspn[i].getdongia());
        }
        return tong;
    }

    public void them() {
        System.out.println("Phieu nhap can them:");
        n = dspn.length;

        dspn = Arrays.copyOf(dspn, n + 1);

        dspn[n] = new PhieuNhap();

        dspn[n].nhap();

        n++;

    }

    public void them(PhieuNhap x) {

        n = dspn.length;

        dspn = Arrays.copyOf(dspn, n + 1);

        dspn[n] = new PhieuNhap(x);
        n++;

    }

    public void xoaTheoSTT() {
        Scanner sc = new Scanner(System.in);
        n = dspn.length;
        System.out.println("nhap j:");
        int j = sc.nextInt();
        for (int i = j; i < n - 1; i++) {
            dspn[i] = dspn[i + 1];

        }
        dspn = Arrays.copyOf(dspn, n - 1);
        n--;
    }

    public void xoaTheoMa() {
        Scanner sc = new Scanner(System.in);
        n = dspn.length;
        System.out.println("nhap ma:");
        String ma = sc.nextLine();
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (dspn[i].getMapn().equalsIgnoreCase(ma)) {
                index = i;
                for (int j = index; j < n - 1; j++) {
                    dspn[j] = dspn[j + 1];
                }
            }
        }
        dspn = Arrays.copyOf(dspn, n - 1);
        n--;
    }

    public void SuaPhieuNhap() {

        Scanner sc = new Scanner(System.in);

        n = dspn.length;
        System.out.println("Ma phieu nhap can sua:");
        String maphieunhap = sc.nextLine();

        System.out.println("ma phieu nhap la:");
        String mapn=sc.nextLine();
        System.out.println("ma nha cung cap la:");
        String mancc=sc.nextLine();
        int ngay=BanHang.Checkngay();
        int thang=BanHang.Checkthang();
        int nam=BanHang.Checknam();
        System.out.println("ma nhan vien la:");
        String manv=sc.nextLine();
        System.out.println("ma phieu nhap la:");
        int tongtien=sc.nextInt();
         System.out.println("don gia la:");
        int dongia=sc.nextInt();
        System.out.println("so luong la:");
        int soluong=sc.nextInt();
        
        for (int j = 0; j < n; j++) {
            if (maphieunhap.equals(dspn[j].getMapn())) {
                dspn[j].setMapn(mapn);
                dspn[j].setMancc(mancc);
                dspn[j].setNgay(ngay);
                dspn[j].setThang(thang);
                dspn[j].setNam(nam);
                dspn[j].setManv(manv);
                dspn[j].setMapn(mapn);
                dspn[j].getdongia();
                dspn[j].getSoluong();

            }
        }

    }

    public void TimkiemMapn() {
        Scanner sc = new Scanner(System.in);
        n = dspn.length;
        System.out.println("Ma phieu nhap:");
        int d = 0;
        String mapn = sc.nextLine();
        for (int i = 0; i < n; i++) 
            if (mapn.equals(dspn[i].getMapn()) == true) {
                System.out.println("Phieu nhap can tim la:");
                System.out.println(dspn[i]);
                d++;
            }
            if (d == 0) {
                System.out.println("Khong co ma phieu nhap can tim!");
            }

        
    }

    public void KiemtratontaiMapn() {
        Scanner sc = new Scanner(System.in);
        n = dspn.length;
        System.out.println("Ma phieu nhap:");
        int d = 0;
        String mapn = sc.nextLine();
        for (int i = 0; i < n; i++) 
            if (mapn.equals(dspn[i].getMapn()) == true) {
                System.out.println("Phieu nhap co ton tai!");
                System.out.println(dspn[i]);
                d++;
            }
            if (d == 0) {
                System.out.println("Khong ton tai phieu nhap can tim!");
            }

        }
  public void ghiDuLieuXuongFile(File file) {
        try {
            OutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (PhieuNhap PN : dspn) {
                oos.writeObject(PN);

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
                PhieuNhap obj = (PhieuNhap) ois.readObject();
                them(obj);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    
   

}

 public void abcTongTienNhaCungCap(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap ma nha cung cap:");
        String mancc=sc.nextLine();
        int tong=0;
        int d = 0;
        for(int i=0;i<n;i++){
            if(mancc.equals(dspn[i].getMancc())==true){
                tong+=(dspn[i].getSoluong()*dspn[i].getdongia());
                d++;
                
            }
        if(d==0){
                System.out.println("Khong co ma nha cung cap can tim!");
               
            }
        }
        System.out.println("Tong tien theo ma nha cung cap la:"+tong);
        
    }




















































































































































































































































}
