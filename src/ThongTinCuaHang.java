
import java.io.File;

public class ThongTinCuaHang {

    public static void main(String args[]){
         //Danh Sach Tai Khoan
        DanhSachTaiKhoan dstk = new DanhSachTaiKhoan();
        File d = new File("\\OOP-Java\\CuaHangSach\\data\\login.txt");
        dstk.docDuLieuTuFile(d);
        System.out.println("----------------Danh sach Tai Khoan-------------------");
        dstk.xuat();
        System.out.println("\n_____________________________________________________________________\n");
        
        //Khach hang
        DanhSachKhachHang dskh = new DanhSachKhachHang();
        
        File f = new File("\\OOP-Java\\CuaHangSach\\data\\khachhang.txt");
        dskh.docDuLieuTuFile(f);
        System.out.println("----------------Danh sach Khach Hang-------------------");
        dskh.xuat();
        System.out.println("\n_____________________________________________________________________\n");

        //Hoa Don
        DanhSachHoaDon dshd = new DanhSachHoaDon();
        File j = new File("\\OOP-Java\\CuaHangSach\\data\\hoadon.txt");
        dshd.docDuLieuTuFile(j);
        System.out.println("----------------Danh sach Hoa Don-------------------");
        dshd.xuat();
        System.out.println("\n_____________________________________________________________________\n");

        //Nha Cung Cap
        DanhSachNhaCungCap dsncc = new DanhSachNhaCungCap();
        
        File k = new File("\\OOP-Java\\CuaHangSach\\data\\nhacungcap.txt");
        dsncc.docDuLieuTuFile(k);
        System.out.println("----------------Danh sach Nha Cung Cap-------------------");
        dsncc.xuat();
        System.out.println("\n_____________________________________________________________________\n");

        //Nhan Vien
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        
        File l = new File("\\OOP-Java\\CuaHangSach\\data\\nhanvien.txt");
        dsnv.docDuLieuTuFile(l);
        System.out.println("----------------Danh sach Nhan Vien-------------------");
        dsnv.xuat();
        System.out.println("\n_____________________________________________________________________\n");

        //Phieu Nhap
        DanhSachPhieuNhap dspn = new DanhSachPhieuNhap();
       
        File a = new File("\\OOP-Java\\CuaHangSach\\data\\phieunhap.txt");
        dspn.docDuLieuTuFile(a);
        System.out.println("----------------Danh sach Phieu Nhap-------------------");
        dspn.xuat();
        System.out.println("\n_____________________________________________________________________\n");
        
        //Danh Sach Sach
        DanhSachSach dss1 = new DanhSachSach();
        
        File tt = new File("\\OOP-Java\\CuaHangSach\\data\\truyen.txt");
        dss1.docDuLieuTuFileTruyen(tt);
        
         DanhSachSach dss2 = new DanhSachSach();
        
        File SGK = new File("\\OOP-Java\\CuaHangSach\\data\\SGK.txt");
        dss2.docDuLieuTuFileSGK(SGK);
        
         DanhSachSach dss3 = new DanhSachSach();
        
        File stk = new File("\\OOP-Java\\CuaHangSach\\data\\STK.txt");
        dss3.docDuLieuTuFileSTK(stk);
        System.out.println("----------------Danh sach Sach-------------------");
        DanhSachSach dss = new DanhSachSach();
        dss.gopdss(dss1, dss2, dss3);
        dss.xuatHET();
        
        System.out.println("\n_____________________________________________________________________\n");

        //Chi tiet hoa don
        DanhSachChiTietHoaDon dscthd = new DanhSachChiTietHoaDon();
        File c = new File("\\OOP-Java\\CuaHangSach\\data\\chitiethoadon.txt");
        dscthd.docDuLieuTuFile(c);
        System.out.println("----------------Danh sach CHi Tiet Hoa Don-------------------");
        dscthd.xuat();
        System.out.println("\n_____________________________________________________________________\n");

       test.menu();

    }
}
