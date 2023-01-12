
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;


public class DanhSachSach extends Sach{
    Sach[] dss = new Sach[0];
    int n;
    
    
    
    public void nhapN() {
        Scanner sc = new Scanner(System.in);
//nhập n từ bàn phím dùng scanner 
        System.out.println("nhap n:");
        n = sc.nextInt();

//nhập n sv như sau
        dss = new Sach[n];

        for (int i = 0; i < n; i++) {

            dss[i] = new Sach();

            dss[i].nhap();
        }

    }

    public void xuatALL() {

        for (int i = 0; i < n; i++) {
            System.out.print("Sach " + i + " la:\n");
            System.out.println(dss[i]);
            

        }
    }
    public void xoaALL() {
        dss = Arrays.copyOf(dss,0);
        
    }

    public void them() {
        System.out.println("Sach can them:");
        n = dss.length;

        dss = Arrays.copyOf(dss, n + 1);

        dss[n] = new Sach();

        dss[n].nhap();

        n++;

    }
    public int Leng(){
        int i = dss.length;
        return i;
    }
    public void gopdss(DanhSachSach dssTruyen, DanhSachSach dssSGK, DanhSachSach dssSTK){
        int TruyenLength = dssTruyen.Leng();
        int SGKLength = dssSGK.Leng();
        int STKLength = dssSTK.Leng();
        
        for(int i = 0; i <TruyenLength; ++i)
        {
            n = dss.length;
            dss = Arrays.copyOf(dss, n + 1);
            dss[n] = dssTruyen.dss[i];
            n++;
        }
        for(int i = 0; i <SGKLength; ++i)
        {
            n = dss.length;
            dss = Arrays.copyOf(dss, n + 1);
            dss[n] = dssSGK.dss[i];
            n++;
        }
        for(int i = 0; i <STKLength; ++i)
        {
            n = dss.length;
            dss = Arrays.copyOf(dss, n + 1);
            dss[n] = dssSTK.dss[i];
            n++;
        }
        
        
        
    }

    public void them(Sach x) {

        n = dss.length;

        dss = Arrays.copyOf(dss, n + 1);

        dss[n] = new Sach(x);
        n++;

    }
    public void themSGK(SachGiaoKhoa x) {

        n = dss.length;

        dss = Arrays.copyOf(dss, n + 1);

        dss[n] = new SachGiaoKhoa(x);

        n++;

    }

    public void themSTK(SachThamKhao x) {

        n = dss.length;

        dss = Arrays.copyOf(dss, n + 1);

        dss[n] = new SachThamKhao(x);
        n++;

    }
    public void themTruyen(TruyenTranh x) {

        n = dss.length;

        dss = Arrays.copyOf(dss, n + 1);

        dss[n] = new TruyenTranh(x);
        n++;

    }
    public void xoaTheoSTT() {
        Scanner sc = new Scanner(System.in);
        n = dss.length;
        System.out.println("nhap j:");
        int j = sc.nextInt();
        for (int i = j; i < n - 1; i++) {
            dss[i] = dss[i + 1];

        }
        dss = Arrays.copyOf(dss, n - 1);
        n--;
    }

    public void xoaTheoMa() {
        Scanner sc = new Scanner(System.in);
        n = dss.length;
        System.out.println("nhap ma:");
        String ma = sc.nextLine();
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (dss[i].getMasach().equalsIgnoreCase(ma)) {
                index = i;
                for (int j = index; j < n - 1; j++) {
                    dss[j] = dss[j + 1];
                }
            }
        }
        dss = Arrays.copyOf(dss, n - 1);
        n--;
    }

    public void SuaSach() {
        int f=traPOSI();
       
          
            dss[f].SuaSach();
        }
       
        
              
        

    
    public void xuatHET() {
        n = dss.length;
        for (int i = 0; i < n; i++) {
            System.out.print("sach tt "+ i +": ");
            dss[i].xuat();
        }
    }
    public int traPOSI(){
        Scanner sc = new Scanner(System.in);
        int i;
        
        n = dss.length;
        int d=0;
        System.out.println("Ma sach can sua:");
        String maSach = sc.nextLine();
        for(i = 0;i <n; i++)
        {
            if (maSach.equals(dss[i].getMasach())== true) {
                d++;
                return i;
            }
        }
        
        if (d == 0) {
            System.out.println("Ma sach ban vua nhap khong ton tai o vung du lieu sach ban vua nhap!!");
            return traPOSI();
        }
        return 0;        
    }

    public void TimkiemMasach() {
        Scanner sc = new Scanner(System.in);
        n = dss.length;
        System.out.println("Ma sach:");
        int d = 0;
        String masach = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (masach.equals(dss[i].getMasach()) == true) {
                System.out.println("Sach can tim la:");
                System.out.println(dss[i]);
                d++;
            }
        }
        if (d == 0) {
            System.out.println("Khong co ma sach can tim!");
        }

    }

    public void KiemtratontaiMasach() {
        Scanner sc = new Scanner(System.in);
        n = dss.length;
        System.out.println("Ma sach:");
        int d = 0;
        String masach = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (masach.equals(dss[i].getMasach()) == true) {
                System.out.println("Sach co ton tai!");
                System.out.println(dss[i]);
                d++;
            }
        }
        if (d == 0) {
            System.out.println("Khong ton tai sach can tim!");
        }

    }

    public boolean Kiemtratontai(String masach) {

        n = dss.length;

        for (int i = 0; i < n; i++) {
            if (masach.equals(dss[i].getMasach()) == true) {
                return true;

            }
        }
        return false;
    }

    public String KiemtraMaSach() {
        Scanner sc = new Scanner(System.in);
        n = dss.length;
        int d=0;
        System.out.println("Nhap ma sach: ");
        String masach= sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (masach.equals(dss[i].getMasach()) == true) {
                d++;
                return dss[i].getMasach();
            }
        }
        if (d == 0) {
            System.out.println("Khong co ma sach trong danh sach!");
            return KiemtraMaSach();
        }
        return null;

    }

    public long Kiemtragiaban(String masach) {

        n = dss.length;

        for (int i = 0; i < n; i++) {
            if (masach.equals(dss[i].getMasach()) == true) {
                return dss[i].getGiaban();

            }
        }
        return 0;

    }
    public long Kiemtragianhap(String masach) {

        n = dss.length;

        for (int i = 0; i < n; i++) {
            if (masach.equals(dss[i].getMasach()) == true) {
                return dss[i].getGianhap();

            }
        }
        return 0;

    }

    public String Kiemtratensach(String masach) {

        n = dss.length;

        for (int i = 0; i < n; i++) {
            if (masach.equals(dss[i].getMasach()) == true) {
                return dss[i].getTensach();

            }
        }
        return "Khong co ten sach!";

    }
    
    public int checkDSS(DanhSachSach sgk, DanhSachSach stk, DanhSachSach truyen, String id, int sl){
        for(int i = 0; i <sgk.dss.length;i++)
        {
            if (sgk.Kiemtratontai(id) == true) {
                return sgk.TruSlTon(id, sl);
            }
        }
        for(int i = 0; i <stk.dss.length;i++)
        {
            if (stk.Kiemtratontai(id) == true) {
                return stk.TruSlTon(id, sl);
            }
        }
        for(int i = 0; i <truyen.dss.length;i++)
        {
            if (truyen.Kiemtratontai(id) == true) {
                return truyen.TruSlTon(id, sl);
            }
        }
        return sl;
  
    }

    public int TruSlTon(String masach, int sl) {

        Scanner sc = new Scanner(System.in);
        n = dss.length;

        int k=0;

        for (int i = 0; i < n; i++) {
            if (masach.equals(dss[i].getMasach()) == true) {
                int t = dss[i].getSlton();
                for (int j = 0; j < sl; j++) {
                    dss[i].setSlton(dss[i].getSlton() - 1);
                    k++;
                    if(dss[i].getSlton()== 0){
                        
                        
                        System.out.println("Mat hang hien co : "+k);
                        System.out.println("Ban co muon lay voi so luong nay khong ?");
                        System.out.println("1. co");
                        System.out.println("2. khong");
                        System.out.print("Ban muon: ");
                        int h = sc.nextInt();
                        if (h==1) {
                            System.out.println("So luong hang hien co:" + dss[i].getSlton());
                            return k;
                        }
                        if (h==2) {
                            dss[i].setSlton(k);
                            System.out.println("So luong hang con lai trong kho:" + dss[i].getSlton());
                            return TruSlTon(masach, BanHang.SoLuong());
                        }
                    }
                  
                    
                }
                System.out.println("So luong hang hien co:" + dss[i].getSlton());
            
        }

    }
        return sl;
    }
     public void LaySlTon(String masach) {

        Scanner sc = new Scanner(System.in);
        n = dss.length;
        
        for (int i = 0; i < n; i++) {
            if (masach.equals(dss[i].getMasach()) == true) {
                
                System.out.println("So Luong Ton:" + dss[i].getSlton());
            }
        }

    }
     public int LuaChonThem() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap lua chon loai sach muon them: ");
        System.out.println("1. Sach giao khoa.");
        System.out.println("2. Sach tham khao.");
        System.out.println("3. Them truyen");
        System.out.print("Ban muon: ");
        int i = ip.nextInt();
        
        if(i ==1)
        {
            return 1;
            
        }else if (i == 2) {
            return 2;
        }else if (i == 3) {
            return 3;
        }else{
            System.out.println("Lua chon ban nhap khong dung!!");
            LuaChonThem();
        }
        return 0;
        
    }
     public int LuaChonSua() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap lua chon loai sach muon sua: ");
        System.out.println("1. Sach giao khoa.");
        System.out.println("2. Sach tham khao.");
        System.out.println("3. Them truyen");
        System.out.print("Ban muon: ");
        int i = ip.nextInt();
        
        if(i ==1)
        {
            return 1;
            
        }else if (i == 2) {
            return 2;
        }else if (i == 3) {
            return 3;
        }else{
            System.out.println("Lua chon ban nhap khong dung!!");
            LuaChonThem();
        }
        return 0;
     }
    
     public int LuaChonTimKiem() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap lua chon loai sach muon Tim kiem: ");
        System.out.println("1. Sach giao khoa.");
        System.out.println("2. Sach tham khao.");
        System.out.println("3. Them truyen");
        System.out.print("Ban muon: ");
        int i = ip.nextInt();
        
        if(i ==1)
        {
            return 1;
            
        }else if (i == 2) {
            return 2;
        }else if (i == 3) {
            return 3;
        }else{
            System.out.println("Lua chon ban nhap khong dung!!");
            LuaChonThem();
        }
        return 0;
        
    }
     public int LuaChonKiemTra() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap lua chon loai sach muon kiem tra: ");
        System.out.println("1. Sach giao khoa.");
        System.out.println("2. Sach tham khao.");
        System.out.println("3. Them truyen");
        System.out.print("Ban muon: ");
        int i = ip.nextInt();
        
        if(i ==1)
        {
            return 1;
            
        }else if (i == 2) {
            return 2;
        }else if (i == 3) {
            return 3;
        }else{
            System.out.println("Lua chon ban nhap khong dung!!");
            LuaChonThem();
        }
        return 0;
        
    }
          public int LuaChonXoa() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap lua chon loai sach muon xoa: ");
        System.out.println("1. Sach giao khoa.");
        System.out.println("2. Sach tham khao.");
        System.out.println("3. Them truyen");
        System.out.print("Ban muon: ");
        int i = ip.nextInt();
        
        if(i ==1)
        {
            return 1;
            
        }else if (i == 2) {
            return 2;
        }else if (i == 3) {
            return 3;
        }else{
            System.out.println("Lua chon ban nhap khong dung!!");
            LuaChonThem();
        }
        return 0;
        
    }
     public void themSGK(){
         Scanner sc = new Scanner(System.in);
         System.out.println("ma sach la:");
         String masach1=sc.nextLine();
         System.out.println("ten sach la:");
         String tensach1=sc.nextLine();
         System.out.println("so luong ton la:");
         int slton1=sc.nextInt();
         System.out.println("gia nhap la:");
         long gianhap1=sc.nextLong();
         System.out.println("gia ban la:");
         long giaban1=sc.nextLong();
         sc.nextLine();
         System.out.println("nha xuat ban la:");
         String nhaxb1=sc.nextLine();
         System.out.println("nam xuat ban la:");
         int namxb1=sc.nextInt();
         sc.nextLine(); 
         System.out.println("ma tac gia la:");
         String matg1=sc.nextLine();
         System.out.println("ten tac gia la:");
         String tentg1=sc.nextLine();
         
        System.out.print("Nhap lop: ");
        String lop = sc.nextLine(); 

        SachGiaoKhoa sgk = new SachGiaoKhoa(masach1, tensach1, slton1, gianhap1, giaban1, nhaxb1, namxb1, matg1, tentg1, lop);
        
         themSGK(sgk);
         
    }
    
    public void themTRUYEN(){

         Scanner sc = new Scanner(System.in);
         System.out.println("ma sach la:");
         String masach2=sc.nextLine();
         System.out.println("ten sach la:");
         String tensach2=sc.nextLine();
         System.out.println("so luong ton la:");
         int slton2=sc.nextInt();
         System.out.println("gia nhap la:");
         long gianhap2=sc.nextLong();
         System.out.println("gia ban la:");
         long giaban2=sc.nextLong();
         sc.nextLine();
         System.out.println("nha xuat ban la:");
         String nhaxb2=sc.nextLine();
         System.out.println("nam xuat ban la:");
         int namxb2=sc.nextInt();
         sc.nextLine(); 
         System.out.println("ma tac gia la:");
         String matg2=sc.nextLine();
         System.out.println("ten tac gia la:");
         String tentg2=sc.nextLine();
         
        System.out.print("Truyen co tap so la : ");
        String tap = sc.nextLine(); 

        TruyenTranh truyen = new TruyenTranh(masach2, tensach2, slton2, gianhap2, giaban2, nhaxb2, namxb2, matg2, tentg2, tap);
        themTruyen(truyen);
    }
        public void themSTK(){
        int n = dss.length;
        dss = Arrays.copyOf(dss, n + 1);
         Scanner sc = new Scanner(System.in);
         System.out.println("ma sach la:");
         String masach3=sc.nextLine();
         System.out.println("ten sach la:");
         String tensach3=sc.nextLine();
         System.out.println("so luong ton la:");
         int slton3=sc.nextInt();
         System.out.println("gia nhap la:");
         long gianhap3=sc.nextLong();
         System.out.println("gia ban la:");
         long giaban3=sc.nextLong();
         sc.nextLine();
         System.out.println("nha xuat ban la:");
         String nhaxb3=sc.nextLine();
         System.out.println("nam xuat ban la:");
         int namxb3=sc.nextInt();
         sc.nextLine(); 
         System.out.println("ma tac gia la:");
         String matg3=sc.nextLine();
         System.out.println("ten tac gia la:");
         String tentg3=sc.nextLine();
         
        System.out.print("Sach tham khao the loai: ");
        String tap = sc.nextLine();

        SachThamKhao stk = new SachThamKhao(masach3, tensach3, slton3, gianhap3, giaban3, nhaxb3, namxb3, matg3, tentg3, tap);
            themSTK(stk);
    }

    public void ghiDuLieuXuongFile(File file) {
        try {
            OutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            n = dss.length;
            for (int i = 0; i < n; i++) {
                oos.writeObject(dss[i]);

            }

            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void docDuLieuTuFileSGK(File f) {
        try {
            InputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                SachGiaoKhoa obj = (SachGiaoKhoa) ois.readObject();
                themSGK(obj);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void docDuLieuTuFileTruyen(File f) {
        try {
            InputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                TruyenTranh obj = (TruyenTranh) ois.readObject();
                themTruyen(obj);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void docDuLieuTuFileSTK(File f) {
        try {
            InputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                SachThamKhao obj = (SachThamKhao) ois.readObject();
                themSTK(obj);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
