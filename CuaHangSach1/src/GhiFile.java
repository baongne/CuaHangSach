import java.io.File;

public class GhiFile {

    public static void main(String args[]) {
        // Danh Sach Tai Khoan
        DanhSachTaiKhoan dstk = new DanhSachTaiKhoan();
        File d = new File("\\OOP-Java\\CuaHangSach\\data\\login.txt");
        dstk.docDuLieuTuFile(d);

        // Khach hang
        DanhSachKhachHang dskh = new DanhSachKhachHang();
        KhachHang kh0 = new KhachHang("0", "0", "0", "0", 0);
        dskh.them(kh0);
        KhachHang kh1 = new KhachHang("001", "Le", "Manh", "Q.10 TP.HCM", 19001000);
        dskh.them(kh1);
        KhachHang kh2 = new KhachHang("002", "Nguyen", "Cuong", "Q.11 TP.HCM", 19001001);
        dskh.them(kh2);
        KhachHang kh3 = new KhachHang("003", "Tran", "Anh", "Q.10 TP.HCM", 19001002);
        dskh.them(kh3);
        KhachHang kh4 = new KhachHang("004", "Mai", "Duc", "Q.4 TP.HCM", 19001003);
        dskh.them(kh4);
        KhachHang kh5 = new KhachHang("005", "Ly", "Khoi", "Q.9 TP.HCM", 19001004);
        dskh.them(kh5);
        KhachHang kh6 = new KhachHang("006", "Nguyen", "Manh", "Q.10 TP.HCM", 19001005);
        dskh.them(kh6);
        KhachHang kh7 = new KhachHang("007", "Nguyen", "Mai", "Q.1 TP.HCM", 19001006);
        dskh.them(kh7);
        KhachHang kh8 = new KhachHang("008", "Tran", "Vu", "Q.Binh Thanh TP.HCM", 19001007);
        dskh.them(kh8);
        KhachHang kh9 = new KhachHang("009", "Le", "Cuong", "Q.5 TP.HCM", 19001008);
        dskh.them(kh9);
        KhachHang kh10 = new KhachHang("010", "Nguyen", "Anh", "Q.5 TP.HCM", 19001009);
        dskh.them(kh10);
        File f = new File("\\OOP-Java\\CuaHangSach\\data\\khachhang.txt");
        dskh.ghiDuLieuXuongFile(f);

        // Hoa Don
        DanhSachHoaDon dshd = new DanhSachHoaDon();
        /*HoaDon hd1 = new HoaDon("001", 2, 4, 2022, "002", "004", 30000);
        dshd.them(hd1);
        HoaDon hd2 = new HoaDon("002", 2, 4, 2022, "002", "001", 50000);
        dshd.them(hd2);
        HoaDon hd3 = new HoaDon("003", 3, 4, 2022, "004", "009", 22000);
        dshd.them(hd3);
        HoaDon hd4 = new HoaDon("004", 3, 4, 2022, "004", "010", 46000);
        dshd.them(hd4);
        HoaDon hd5 = new HoaDon("005", 4, 4, 2022, "006", "002", 15000);
        dshd.them(hd5);
        HoaDon hd6 = new HoaDon("006", 4, 4, 2022, "006", "001", 300000);
        dshd.them(hd6);
        HoaDon hd7 = new HoaDon("007", 5, 4, 2022, "008", "007", 78000);
        dshd.them(hd7);
        HoaDon hd8 = new HoaDon("008", 5, 4, 2022, "008", "008", 93000);
        dshd.them(hd8);
        HoaDon hd9 = new HoaDon("009", 6, 4, 2022, "010", "003", 13000);
        dshd.them(hd9);
        HoaDon hd10 = new HoaDon("010", 6, 4, 2022, "010", "001", 40000);
        dshd.them(hd10);
        HoaDon hd11 = new HoaDon("011", 7, 4, 2022, "001", "010", 80000);
        dshd.them(hd11);
        HoaDon hd12 = new HoaDon("012", 7, 4, 2022, "001", "006", 10000);
        dshd.them(hd12);
        HoaDon hd13 = new HoaDon("013", 8, 4, 2022, "003", "003", 20000);
        dshd.them(hd13);
        HoaDon hd14 = new HoaDon("014", 8, 4, 2022, "003", "005", 95000);
        dshd.them(hd14);
        HoaDon hd15 = new HoaDon("015", 9, 4, 2022, "005", "006", 118000);
        dshd.them(hd15);
        HoaDon hd16 = new HoaDon("016", 9, 4, 2022, "005", "002", 8000);
        dshd.them(hd16);
        HoaDon hd17 = new HoaDon("017", 10, 4, 2022, "007", "008", 5000);
        dshd.them(hd17);
        HoaDon hd18 = new HoaDon("018", 10, 4, 2022, "007", "010", 20000);
        dshd.them(hd18);
        HoaDon hd19 = new HoaDon("019", 11, 4, 2022, "009", "004", 45000);
        dshd.them(hd19);
        HoaDon hd20 = new HoaDon("020", 11, 4, 2022, "009", "006", 31000);
        dshd.them(hd20);
        HoaDon hd21 = new HoaDon("021", 12, 4, 2022, "002", "005", 9000);
        dshd.them(hd21);
        HoaDon hd22 = new HoaDon("022", 12, 4, 2022, "002", "008", 10000);
        dshd.them(hd22);*/
        File j = new File("\\OOP-Java\\CuaHangSach\\data\\hoadon.txt");
        dshd.docDuLieuTuFile(j);

        // Nha Cung Cap
        DanhSachNhaCungCap dsncc = new DanhSachNhaCungCap();
        NhaCungCap ncc1 = new NhaCungCap("001", "Le", 19001000, "100 Ly Thuong Kiet");
        dsncc.them(ncc1);
        NhaCungCap ncc2 = new NhaCungCap("002", "Ha", 19001001, "101 Hong Bang");
        dsncc.them(ncc2);
        NhaCungCap ncc3 = new NhaCungCap("003", "Vu", 19001002, "102 Lu Gia");
        dsncc.them(ncc3);
        NhaCungCap ncc4 = new NhaCungCap("004", "Duong", 19001003, "103 Ly Thai To");
        dsncc.them(ncc4);
        NhaCungCap ncc5 = new NhaCungCap("005", "Tran", 19001004, "104 An Duong Vuong");
        dsncc.them(ncc5);
        NhaCungCap ncc6 = new NhaCungCap("006", "Lam", 19001005, "105 Ly Thuong Kiet");
        dsncc.them(ncc6);
        NhaCungCap ncc7 = new NhaCungCap("007", "Nam", 19001006, "106 Nguyen Cuu Van");
        dsncc.them(ncc7);
        NhaCungCap ncc8 = new NhaCungCap("008", "Anh", 19001007, "107 Ly Thuong Kiet");
        dsncc.them(ncc8);
        NhaCungCap ncc9 = new NhaCungCap("009", "Binh", 19001008, "108 Ly Thai To");
        dsncc.them(ncc9);
        NhaCungCap ncc10 = new NhaCungCap("0010", "Ngoc", 19001009, "109 An Duong Vuong");
        dsncc.them(ncc10);
        File k = new File("\\OOP-Java\\CuaHangSach\\data\\nhacungcap.txt");
        dsncc.ghiDuLieuXuongFile(k);

        // Nhan Vien
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        NhanVien nv1 = new NhanVien("001", "Le", "Manh", "Nam", "101 Ton Duc Thang", 19001000, "Quan ly");
        dsnv.them(nv1);
        NhanVien nv2 = new NhanVien("002", "Pham", "Phuong", "Nu", "102 Ton Duc Thang", 19001001, "Nhan vien");
        dsnv.them(nv2);
        NhanVien nv3 = new NhanVien("003", "Nguyen", "Duc", "Nam", "100 Nguyen Cuu Van", 19001002, "Nhan vien");
        dsnv.them(nv3);
        NhanVien nv4 = new NhanVien("004", "Truong", "Mai", "Nu", "103 Dien Bien Phu", 190010003, "Nhan vien");
        dsnv.them(nv4);
        NhanVien nv5 = new NhanVien("005", "Tran", "Quynh", "Nu", "105 Hong Bang", 19001004, "Nhan vien");
        dsnv.them(nv5);
        NhanVien nv6 = new NhanVien("006", "Le", "Manh", "Nam", "106 Ton Duc Thang", 19001005, "Nhan vien");
        dsnv.them(nv6);
        NhanVien nv7 = new NhanVien("007", "Nguyen", "Giang", "Nu", "107 3/2", 19001006, "Nhan vien");
        dsnv.them(nv7);
        NhanVien nv8 = new NhanVien("008", "Nguyen", "Long", "Nam", "108 Ly Thuong Kiet", 19001007, "Nhan vien");
        dsnv.them(nv8);
        NhanVien nv9 = new NhanVien("009", "Truong", "Phong", "Nam", "109 Ton Duc Thang", 190010008, "Nhan vien");
        dsnv.them(nv9);
        NhanVien nv10 = new NhanVien("010", "Nguyen", "Anh", "Nu", "110 Lu Gia", 19001009, "Nhan vien");
        dsnv.them(nv10);
        File l = new File("\\OOP-Java\\CuaHangSach\\data\\nhanvien.txt");
        dsnv.ghiDuLieuXuongFile(l);

        // Phieu Nhap
        DanhSachPhieuNhap dspn = new DanhSachPhieuNhap();
        PhieuNhap pn1 = new PhieuNhap("001", "001", 10, 01, 2010, "001", 10000, 12);
        dspn.them(pn1);
        PhieuNhap pn2 = new PhieuNhap("002", "002", 11, 02, 2011, "002", 20000, 23);
        dspn.them(pn2);
        PhieuNhap pn3 = new PhieuNhap("003", "003", 12, 03, 2012, "003", 9000, 12);
        dspn.them(pn3);
        PhieuNhap pn4 = new PhieuNhap("004", "004", 13, 04, 2013, "004", 5000, 12);
        dspn.them(pn4);
        PhieuNhap pn5 = new PhieuNhap("005", "005", 14, 05, 2014, "005", 8000, 12);
        dspn.them(pn5);
        PhieuNhap pn6 = new PhieuNhap("006", "006", 10, 01, 2010, "006", 9000, 12);
        dspn.them(pn6);
        PhieuNhap pn7 = new PhieuNhap("007", "007", 11, 02, 2011, "007", 5000, 20);
        dspn.them(pn7);
        PhieuNhap pn8 = new PhieuNhap("008", "008", 12, 03, 2012, "008", 9000, 12);
        dspn.them(pn8);
        PhieuNhap pn9 = new PhieuNhap("009", "009", 13, 04, 2013, "009", 10000, 12);
        dspn.them(pn9);
        PhieuNhap pn10 = new PhieuNhap("010", "010", 14, 05, 2014, "010", 5000, 12);
        dspn.them(pn10);
        File a = new File("\\OOP-Java\\CuaHangSach\\data\\phieunhap.txt");
        dspn.ghiDuLieuXuongFile(a);

        // Danh Sach Sach
        DanhSachSach dss1 = new DanhSachSach();
        
        TruyenTranh s1 = new TruyenTranh("001", "Doremon", 60, 5000, 10000, "Bao", 2000, "19001000", "Quan", "Tap 4");
        dss1.themTruyen(s1);
        TruyenTranh s2 = new TruyenTranh("002", "Conan", 70, 8000, 20000, "Anh", 2002, "19001001", "Quan", "Tap 10");
        dss1.themTruyen(s2);
        TruyenTranh s12 = new TruyenTranh("009", "Doremon", 90, 5000, 10000, "Bao", 2000, "19001000", "Quan", "Tap 5");
        dss1.themTruyen(s12);
        File truyen = new File("\\OOP-Java\\CuaHangSach\\data\\truyen.txt");
        dss1.ghiDuLieuXuongFile(truyen);
        
        DanhSachSach dss2 = new DanhSachSach();
        SachGiaoKhoa s6 = new SachGiaoKhoa("003", "Dia li", 60, 2000, 9000, "Le", 2004, "19001004", "Huong", "Lop 6");
        dss2.themSGK(s6);
        SachGiaoKhoa s7 = new SachGiaoKhoa("004", "Toan", 80, 2000, 5000, "Le", 2004, "19001004", "Dat", "Lop 7");
        dss2.themSGK(s7);
        SachGiaoKhoa s8 = new SachGiaoKhoa("005", " Ngu Van", 60, 3000, 8000, "Le", 2004, "19001004", "Nhat", "Lop 8");
        dss2.themSGK(s8);
        SachGiaoKhoa s9 = new SachGiaoKhoa("006", "Toan", 70, 5000, 9000, "Le", 2004, "19001004", "Nhat", "Lop 9");
        dss2.themSGK(s9);
        SachGiaoKhoa s13 = new SachGiaoKhoa("010", "Lich su", 80, 2000, 5000, "Le", 2004, "19001004", "Thang", "Lop 9");
        dss2.themSGK(s13);
        File SGK = new File("\\OOP-Java\\CuaHangSach\\data\\SGK.txt");
        dss2.ghiDuLieuXuongFile(SGK);
        
        DanhSachSach dss3 = new DanhSachSach();
        SachThamKhao s10 = new SachThamKhao("007", "Cac bai toan hinh hoc", 60, 5000, 9000, "Le", 2004, "19001004", "Hang","Mon Toan");
        dss3.themSTK(s10);
        SachThamKhao s11 = new SachThamKhao("008", "Van mau", 100, 5000, 9000, "Le", 2004, "19001004", "Thang", "Mon Van");
        dss3.themSTK(s11);
        
        
        File stk = new File("\\OOP-Java\\CuaHangSach\\data\\STK.txt");
        dss3.ghiDuLieuXuongFile(stk);

       
        System.out.println("-----------------------------------------");
        DanhSachSach dssALL = new DanhSachSach();
        dssALL.gopdss(dss1, dss2, dss3);
        dssALL.xuatHET();
        // Chi tiet hoa don
        DanhSachChiTietHoaDon dscthd = new DanhSachChiTietHoaDon();

        File c = new File("\\OOP-Java\\CuaHangSach\\data\\chitiethoadon.txt");
        

        dscthd.docDuLieuTuFile(c);

    }
}

