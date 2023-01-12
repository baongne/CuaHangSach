
import java.io.File;
import java.util.Scanner;

public class BanHang {

    public static String xuat() {

        Scanner ip = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.printf("Nhap vao 0 de xuat hoa don!\n");
        System.out.print("Moi ban nhap ma sach:");
        String id = ip.nextLine();

        return id;
    }

    public static String KiemTra(String id, DanhSachSach dss,DanhSachChiTietHoaDon dscthd,String mahd,DanhSachSach sgk, DanhSachSach stk, DanhSachSach truyen) {

        int i = Integer.parseInt(id);

        if (dss.Kiemtratontai(id) == true && i != 0) {
            return id;
        } else if (dss.Kiemtratontai(id) == false && i != 0) {
            System.out.println("Ma sach ban nhap khong ton tai!");
            sai(dss,dscthd,mahd,sgk, stk,truyen);
        } else if (i == 0) {
            return "0";

        }
        return null;
    }

    public static void sai(DanhSachSach dss,DanhSachChiTietHoaDon dscthd,String mahd, DanhSachSach sgk, DanhSachSach stk, DanhSachSach truyen) {
        System.out.println("Yeu cau ban nhap lai ma sach!");
        String id = xuat();
        KiemTra(id, dss, dscthd, mahd,sgk, stk,truyen);

        System.out.println("Tong tien la:" + Tong(KiemTra(id, dss,dscthd, mahd,sgk, stk,truyen), dss,dscthd,mahd));
        System.exit(0);
    }

    public static int SoLuong() {
        int i;
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap so luong sach can mua: ");
        i = ip.nextInt();
        return i;
    }

    public static long Tong(String masach, DanhSachSach dss,DanhSachChiTietHoaDon dscthd,String mahd) {
        
        int h = Integer.parseInt(masach);DanhSachSach truyen = new DanhSachSach();
        File f = new File("\\OOP-Java\\CuaHangSach\\data\\truyen.txt");
        truyen.docDuLieuTuFileTruyen(f);

        DanhSachSach sgk = new DanhSachSach();
        File a = new File("\\OOP-Java\\CuaHangSach\\data\\SGK.txt");
        sgk.docDuLieuTuFileSGK(a);

        DanhSachSach stk = new DanhSachSach();
        File b = new File("\\OOP-Java\\CuaHangSach\\data\\STK.txt");
        stk.docDuLieuTuFileSTK(b);
        if (h == 0) {
            return 0;
        }

        if(dss.Kiemtratontai(masach)== false)
        {
            System.out.println("Ma sach ban vua nhap khong dung!!");
            return Tong(xuat(), dss,dscthd,mahd);
        }
        long gb = dss.Kiemtragiaban(masach);
        
        String tensach=dss.Kiemtratensach(masach);
        int i = Integer.parseInt(masach);
        if (dss.Kiemtratontai(masach) == false) {
            System.out.println("Ma sach ban nhap khong ton tai!");
            sai(dss,dscthd, mahd,sgk, stk,truyen);

            System.exit(0);
        }

        if (i == 0) {
            return 0;
        } else {
            
            int sl = SoLuong();

            int slcheck = dss.checkDSS(sgk, stk, truyen, masach, sl);
            truyen.ghiDuLieuXuongFile(f);
            sgk.ghiDuLieuXuongFile(a);
            stk.ghiDuLieuXuongFile(b);
            long tongtien = (long) slcheck * gb;
            System.out.println("\nMa sach la:" + masach + "| Ten sach:"+tensach+" | So luong:" + slcheck + " | Don gia:" + gb + " | Thanh tien:" + tongtien);
            ChiTietHoaDon ct1=new ChiTietHoaDon(mahd,masach,tensach,slcheck,gb,tongtien);
            dscthd.them(ct1);
            File c = new File("\\OOP-Java\\CuaHangSach\\data\\cthd.txt");
            
            dscthd.ghiDuLieuXuongFile(c);
            
            
            String id = xuat();         
            return Tong(id, dss,dscthd,mahd) + tongtien ;

        }

    }
    

   
    public static String MaHoadon(){
        DanhSachHoaDon dshd=new DanhSachHoaDon();
        File q = new File("\\OOP-Java\\CuaHangSach\\data\\hoadon.txt");
        dshd.docDuLieuTuFile(q);
        
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap Ma hoa don:");
        String mahd = ip.nextLine();
         
            
            if (dshd.KTR(mahd) == true) {
                System.out.println("Ma hoa don da ton tai!");
                return  MaHoadon(); 
            }
            if (dshd.KTR(mahd) == false) {
                
                return mahd; 
            }
        return null;
    }
   
    public static String Makh(DanhSachKhachHang dskh,String hokh, String tenkh){
        return  dskh.LayMakh(hokh, tenkh);
    }
     public static String Manv(DanhSachNhanVien dsnv,String honv, String tennv){
        return  dsnv.LayManv(honv, tennv);
    }
    

    public static void NgayLapHD(int ngay, int thang, int nam) {
        System.out.println("Ngay lap hoa don:" + ngay + "/" + thang + "/" + nam);

    }

    public static int Checkngay() {
        Scanner ip = new Scanner(System.in);
        int ngay;
        
        System.out.print("Ngay lap: ");
        ngay = ip.nextInt();

        if (ngay > 31 || ngay < 1) {
            System.out.println("Ngay nhap sai , nhap lai");
            return Checkngay();

        } else {
            return ngay;
        }
    }

    public static int Checkthang() {

        Scanner ip = new Scanner(System.in);

        int thang;
        System.out.print("Thang lap:");
        thang = ip.nextInt();

        if (thang > 12 || thang < 1) {
            System.out.println("Nhap sai thang, vui long nhap lai");
            return Checkthang();

        } else {
            return thang;
        }
    }

    public static int Checknam() {

        Scanner ip = new Scanner(System.in);

        int nam;
        System.out.print("Nam lap:");
        nam = ip.nextInt();

        if (nam > 99999 || nam < 1) {
            System.out.println("Nhap sai nam, vui long nhap lai");
            return Checknam();

        } else {
            return nam;
        }
    }

    public static void main(String[] args) {
        
        
        DanhSachSach dss1 = new DanhSachSach();
        File dss1F = new File("\\OOP-Java\\CuaHangSach\\data\\truyen.txt");
        dss1.docDuLieuTuFileTruyen(dss1F);

        DanhSachSach dss2 = new DanhSachSach();
        File a = new File("\\OOP-Java\\CuaHangSach\\data\\SGK.txt");
        dss2.docDuLieuTuFileSGK(a);

        DanhSachSach dss3 = new DanhSachSach();
        File b = new File("\\OOP-Java\\CuaHangSach\\data\\STK.txt");
        dss3.docDuLieuTuFileSTK(b);

        DanhSachSach dss = new DanhSachSach();
        dss.gopdss(dss1, dss2, dss3);
        
        DanhSachHoaDon dshd = new DanhSachHoaDon();
        
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        File l = new File("\\OOP-Java\\CuaHangSach\\data\\nhanvien.txt");
        dsnv.docDuLieuTuFile(l);
        DanhSachKhachHang dskh = new DanhSachKhachHang();
        File f = new File("\\OOP-Java\\CuaHangSach\\data\\khachhang.txt");
        
        dskh.docDuLieuTuFile(f);
        DanhSachChiTietHoaDon dscthd=new DanhSachChiTietHoaDon();
        int g = 0;
        System.out.println("___________________Mua Hang___________________");
        Scanner ip = new Scanner(System.in);
        String mahd = MaHoadon();
        System.out.print("Nhap Ho nhan vien ban hang:");
        String honv = ip.nextLine();
        System.out.print("Nhap Ten nhan vien ban hang:");
        String tennv = ip.nextLine();
        System.out.print("Nhap Ho khach hang:");
        String hokh = ip.nextLine();
        System.out.print("Nhap Ten khach hang:");
        String tenkh = ip.nextLine();
       
        
        int ngay = Checkngay();
        int thang = Checkthang();
        int nam = Checknam();
        long p=Tong(xuat(), dss,dscthd,mahd);
        System.out.println("____________________________________\n");
        System.out.println("***************************************Hoa Don***************************************");
        //HoaDon(dshd, mahd);
        System.out.println("Ma hoa don la:"+mahd);
        System.out.println("Ma nhan vien la:"+Manv(dsnv, honv, tennv));
        System.out.println("Ma khach hang"+ " la:"+Makh(dskh, hokh, tenkh));  
        NgayLapHD(ngay, thang, nam);
        dscthd.xuat();
        System.out.println("Tong tien hoa don la:" + p);
                  
        System.out.println("____________________________________\n");
        HoaDon hd=new HoaDon(mahd,ngay,thang,nam,Manv(dsnv, honv, tennv),Makh(dskh, hokh, tenkh), (int) p);
        dshd.them(hd);
        
        File hodo = new File("\\OOP-Java\\CuaHangSach\\data\\hoadon.txt");
        dshd.docDuLieuTuFile(hodo);
        dshd.ghiDuLieuXuongFile(hodo);
        File c = new File("\\OOP-Java\\CuaHangSach\\data\\chitiethoadon.txt");
            dscthd.docDuLieuTuFile(c);
            
            dscthd.ghiDuLieuXuongFile(c);
            
        test.menu();
    }
































    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
    
}



































































































































