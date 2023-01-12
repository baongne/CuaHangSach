
import java.io.File;
import java.util.Scanner;


public class MainDanhSachChiTietHoaDon {
    public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
        DanhSachChiTietHoaDon dscthd=new DanhSachChiTietHoaDon();
        File f = new File("\\OOP-Java\\CuaHangSach\\data\\chitiethoadon.txt");
        dscthd.docDuLieuTuFile(f);
        int luaChon = 0;
       do{
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1.Tao Moi danh sach chi tiet hoa don\n"
                    + "2.Them chi tiet hoa don vao danh sach.\n"
                    + "3.In danh sach chi tiet hoa don ra man hinh.\n"
                    + "4.Kiem tra chi tiet hoa don co ton tai trong danh sach hay khong, dua tren ma hoa don.\n"
                    + "5. Xoa mot chi tiet hoa don ra khoi danh sách dua tren ma hoa don.\n"
                    + "6.Xoa mot chi tiet hoa don ra khoi danh sach dua tren STT .\n" 
                    + "7.Sua chi tiet hoa don.\n"
                    + "8.Tim kiem chi tiet hoa don dua theo ma chi tiet hoa don. \n"
                    + "9.Luu Danh Sach.\n"
                    + "0.Thoat khoi chuong trinh.\n"
                    + "Ban muon lam gi:"); 
            luaChon = sc.nextInt();
            sc.nextLine();

               switch (luaChon) {
                   case 1:
                       dscthd.nhap();
                       break;
                   case 2:
                       dscthd.them();
                       break;
                   case 3:
                       dscthd.xuat();
                       break;
                   case 4:
                       dscthd.KiemtratontaiMacthd();
                       break;
                   case 5:
                       dscthd.xoaTheoMa();
                       break;
                   case 6:
                       dscthd.xoaTheoSTT();
                       break;
                   case 7:
                       dscthd.SuaChiTietHoaDon();
                       break;
                   case 8:
                       dscthd.TimkiemMacthd();
                       break;
                   case 9:
                       dscthd.ghiDuLieuXuongFile(f);
                       
                       break;
               }
            
            }while(luaChon!=0);
        
        
    }
}