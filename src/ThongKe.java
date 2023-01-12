
import java.io.File;
import java.util.Scanner;



public class ThongKe {
    public static int Menu(){
       Scanner ip = new Scanner(System.in);
        System.out.println("------------------------- Thong Ke ------------------------- ");
        System.out.println("1. Thong ke tong tien tat ca hoa don.");
        System.out.println("2. Thong ke tong tien cac hoa don theo ngay.");
        System.out.println("3. Thong ke tong tien cac hoa don theo thang.");
        System.out.println("4. Thong ke tong tien cac hoa don theo ma nhan vien.");
        System.out.println("5. Thong ke tong tien cac hoa don theo ma khach hang.");
        System.out.println("6. Thong ke so luong ton kho theo ma san pham.");
        System.out.println("7. Thong ke dong tien hien co.");
        
        System.out.println("0. Quay ve menu.");
        System.out.print("Ban muon lam gi: ");
        int i = ip.nextInt();
        System.out.println("------------------------- Thong Ke ------------------------- ");
        return i;
    }
    public static void TKall(){
        DanhSachHoaDon dshd=new DanhSachHoaDon();
        File q = new File("\\OOP-Java\\CuaHangSach\\data\\hoadon.txt");
        dshd.docDuLieuTuFile(q);
        
        System.out.println("Danh sach hoa don da thanh toan ngay hom nay!");
        dshd.xuat();
        dshd.Tongtien();
    }
    public static void TKday(){
        DanhSachHoaDon dshd=new DanhSachHoaDon();
        File q = new File("\\OOP-Java\\CuaHangSach\\data\\hoadon.txt");
        dshd.docDuLieuTuFile(q);
       
        int day = BanHang.Checkngay();
        int month = BanHang.Checkthang();
        int year = BanHang.Checknam();
        System.out.println("Danh sach hoa don da thanh toan theo ngay "+ day +"/"+month+"/"+year+" : "+dshd.Tongtienngay(day, month, year));
        
        
    }
    public static void TKthang(){
        DanhSachHoaDon dshd=new DanhSachHoaDon();
        File q = new File("\\OOP-Java\\CuaHangSach\\data\\hoadon.txt");
        dshd.docDuLieuTuFile(q);
   
        int month = BanHang.Checkthang();
        int year = BanHang.Checknam();
        System.out.println("Danh sach hoa don da thanh toan theo thang "+month+"/"+year+" : "+dshd.TongtienThang(month, year));
        
        
    }
    public static void TKmanv(){
        DanhSachHoaDon dshd=new DanhSachHoaDon();
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        File q = new File("\\OOP-Java\\CuaHangSach\\data\\hoadon.txt");
        dshd.docDuLieuTuFile(q);
        
        File l = new File("\\OOP-Java\\CuaHangSach\\data\\nhanvien.txt");
        dsnv.docDuLieuTuFile(l);
        
   
        String Manv = dsnv.KtrMaNV();
        System.out.println("Danh sach hoa don da thanh toan theo ma nhan vien : "+dshd.TongtienTheoMaNV(Manv));
        
        
        
    }
    
    public static void TKdongtien(){
        DanhSachHoaDon dshd=new DanhSachHoaDon();
        
        DanhSachPhieuNhap dspn = new DanhSachPhieuNhap(); 
        
        DanhSachSach dss1 = new DanhSachSach();
        File f = new File("\\OOP-Java\\CuaHangSach\\data\\truyen.txt");
        dss1.docDuLieuTuFileTruyen(f);

        DanhSachSach dss2 = new DanhSachSach();
        File a = new File("\\OOP-Java\\CuaHangSach\\data\\SGK.txt");
        dss2.docDuLieuTuFileSGK(a);

        DanhSachSach dss3 = new DanhSachSach();
        File b = new File("\\OOP-Java\\CuaHangSach\\data\\STK.txt");
        dss3.docDuLieuTuFileSTK(b);

        DanhSachSach dss = new DanhSachSach();
        dss.gopdss(dss1, dss2, dss3);
        
        
        File q = new File("\\OOP-Java\\CuaHangSach\\data\\hoadon.txt");
        dshd.docDuLieuTuFile(q);
        
        File h = new File("\\OOP-Java\\CuaHangSach\\data\\phieunhap.txt");
        dspn.docDuLieuTuFile(h);
        
        System.out.println("Tong tien da chi la : " + dspn.TongTien());
  
        System.out.println("Tong tien da thu la : "+ dshd.TongtienLONG());
        
        long i = (long)dspn.TongTien() + dshd.TongtienLONG();
        
        System.out.println("Dong tien hien co la : "+ i +"VND");
        
        
        
    }
     public static void TKmakh(){
        DanhSachHoaDon dshd=new DanhSachHoaDon();
        DanhSachKhachHang dskh=new DanhSachKhachHang();
        File q = new File("\\OOP-Java\\CuaHangSach\\data\\hoadon.txt");
        dshd.docDuLieuTuFile(q);
        
        File l = new File("\\OOP-Java\\CuaHangSach\\data\\khachhang.txt");
        dskh.docDuLieuTuFile(l);
        
   
        String Makh = dskh.KtrMaKH();
        System.out.println("Danh sach hoa don da thanh toan theo ma khach hang: "+dshd.TongtienTheoMaKH(Makh));
        
        
        
    }
     public static void TKSlTon(){
        DanhSachSach dss1 = new DanhSachSach();
        File f = new File("\\OOP-Java\\CuaHangSach\\data\\truyen.txt");
        dss1.docDuLieuTuFileTruyen(f);

        DanhSachSach dss2 = new DanhSachSach();
        File a = new File("\\OOP-Java\\CuaHangSach\\data\\SGK.txt");
        dss2.docDuLieuTuFileSGK(a);

        DanhSachSach dss3 = new DanhSachSach();
        File b = new File("\\OOP-Java\\CuaHangSach\\data\\STK.txt");
        dss3.docDuLieuTuFileSTK(b);

        DanhSachSach dss = new DanhSachSach();
        dss.gopdss(dss1, dss2, dss3);
        DanhSachKhachHang dskh=new DanhSachKhachHang();
        
        String masach= dss.KiemtraMaSach();
 
        dss.LaySlTon(masach);
        
    }
    
    public static void main(String args[]){
        int i =Menu();
        if (i == 0) {
            test.main(args);
        }
        if (i == 1) {
            TKall();
            ThongKe.main(args);
        }
        if (i == 2) {
            TKday();
            ThongKe.main(args);
        }
        if (i == 3) {
            TKthang();
            ThongKe.main(args);
        }
        if (i == 4) {
            TKmanv();
            ThongKe.main(args);
        }
        if (i == 5) {
            TKmakh();
            ThongKe.main(args);
        }
        if (i == 6) {
            TKSlTon();
            ThongKe.main(args);
        }
        if (i == 7) {
            TKdongtien();
            ThongKe.main(args);
        }
       
        
    }










}













































































































































































































