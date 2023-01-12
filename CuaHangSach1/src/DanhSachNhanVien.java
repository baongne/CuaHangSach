
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

class DanhSachNhanVien extends NhanVien {

    NhanVien[] dsnv = new NhanVien[0];
    int n;

    public DanhSachNhanVien() {
    }

    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
//nhập n từ bàn phím dùng scanner 
        System.out.println("nhap n:");
        n = sc.nextInt();

//nhập n sv như sau
        dsnv = new NhanVien[n];

        for (int i = 0; i < n; i++) {

            dsnv[i] = new NhanVien();

            dsnv[i].nhap();
        }

    }

    @Override
    public void xuat() {

        for (int i = 0; i < n; i++) {
            System.out.print("Nhan Vien " + i + " la:\n");
            System.out.println(dsnv[i]);

        }
    }

    public void them() {
        System.out.println("Nhan Vien can them:");
        n = dsnv.length;

        dsnv = Arrays.copyOf(dsnv, n + 1);

        dsnv[n] = new NhanVien();

        dsnv[n].nhap();

        n++;

    }

    public void them(NhanVien x) {

        n = dsnv.length;

        dsnv = Arrays.copyOf(dsnv, n + 1);

        dsnv[n] = new NhanVien(x);
        n++;

    }

    public void xoaTheoSTT() {
        Scanner sc = new Scanner(System.in);
        n = dsnv.length;
        System.out.println("nhap j:");
        int j = sc.nextInt();
        for (int i = j; i < n - 1; i++) {
            dsnv[i] = dsnv[i + 1];

        }
         dsnv = Arrays.copyOf(dsnv, n - 1);
        n--;
    }

    public void xoaTheoMa() {
        Scanner sc = new Scanner(System.in);
        n = dsnv.length;
        System.out.println("nhap ma:");
        String ma = sc.nextLine();
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (dsnv[i].getManv().equalsIgnoreCase(ma)) {
                index = i;
                for (int j = index; j < n - 1; j++) {
                    dsnv[j] = dsnv[j + 1];
                }
            }
        }
         dsnv = Arrays.copyOf(dsnv, n - 1);
        n--;
    }

    public void SuaNhanVien() {

        Scanner sc = new Scanner(System.in);

        n = dsnv.length;

        System.out.println("Ma nhan vien can sua:");
        String maNhanvien = sc.nextLine();
        System.out.println("Ma nhan vien:");
        String manv = sc.nextLine();
        System.out.println("Ho:");
        String ho = sc.nextLine();
        System.out.println("Ten:");
        String ten = sc.nextLine();
        System.out.println("Gioi Tinh:");
        String gioitinh = sc.nextLine();
        System.out.println("Dia chi:");
        String diachi = sc.nextLine();
        System.out.println("Chuc vu:");
        String chucvu = sc.nextLine();
        System.out.println("sdt:");
        long sdt = sc.nextLong();
        for (int j = 0; j < n; j++) {
            if (maNhanvien.equals(dsnv[j].getManv())) {

                dsnv[j].setManv(manv);
                dsnv[j].setHo(ho);
                dsnv[j].setTen(ten);
                dsnv[j].setGioitinh(gioitinh);
                dsnv[j].setDiachi(diachi);
                dsnv[j].setChucvu(chucvu);
                dsnv[j].setSdt(sdt);

            }
        }

    }

    public void TimkiemManv() {
        Scanner sc = new Scanner(System.in);
        n = dsnv.length;
         System.out.println("Ma nhan vien:");
         int d=0;
        String manv = sc.nextLine();
        for(int i=0;i<n;i++)
            if(manv.equals(dsnv[i].getManv())==true){
                System.out.println("Nhan vien can tim la:");
                System.out.println(dsnv[i]);
                d++;
            }
            if(d==0){
                System.out.println("Không có mã nhân viên cần tìm!");
            }
            
        
    }
     public String LayManv(String ho,String ten) {
        Scanner sc = new Scanner(System.in);
        n = dsnv.length;
        
         int d=0;
        
        for(int i=0;i<n;i++)
            if(ho.equals(dsnv[i].getHo())==true || ten.equals(dsnv[i].getTen())==true){
                  d++;
                return dsnv[i].getManv();
                
              
            }
            if(d==0){
                System.out.println("Khong co ma nhan vien trong danh sach!");
                return "0";
            }
        return null;
            
        
    }
     public String KtrMaNV() {
        Scanner sc = new Scanner(System.in);
        n = dsnv.length;
        
        int d=0;
        
        System.out.println("Nhap ma nhan vien: ");
        String MaNV= sc.nextLine();
        
        for(int i=0;i<n;i++)
            if(MaNV.equals(dsnv[i].getManv())==true){
                  d++;
                return dsnv[i].getManv();
            }
            if(d==0){
                System.out.println("Khong co ma nhan vien trong danh sach!");
                return KtrMaNV();
            }
        return null;
            
        
    }
    
    public void KiemtratontaiManv() {
        Scanner sc = new Scanner(System.in);
        n = dsnv.length;
         System.out.println("Ma nhan vien:");
         int d=0;
        String manv = sc.nextLine();
        for(int i=0;i<n;i++)
            if(manv.equals(dsnv[i].getManv())==true){
                System.out.println("Nhan vien co ton tai!");
                System.out.println(dsnv[i]);
                d++;
            }
            if(d==0){
                System.out.println("Khong ton tai nhan vien can tim!");
            }
            
        
    }
   public void ghiDuLieuXuongFile(File file) {
        try {
            OutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (NhanVien NV : dsnv) {
                oos.writeObject(NV);

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
                NhanVien obj = (NhanVien) ois.readObject();
                them(obj);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }  
   














































































































}































