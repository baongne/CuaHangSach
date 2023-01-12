
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;


public class MainDanhSachKhachHang {
    public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
       DanhSachKhachHang dskh=new DanhSachKhachHang();
       
        File f = new File("\\OOP-Java\\CuaHangSach\\data\\khachhang.txt");
        
                dskh.docDuLieuTuFile(f);

        int luaChon = 0;
       do{
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1.Tao Moi danh sach khach hang\n"
                    + "2.Them khach hang vao danh sach.\n"
                    + "3.In danh sach khach hang ra man hinh.\n"
                    + "4.Kiem tra khach hang co ton tai trong danh sach hay khong, dua tren ma khach hang.\n"
                    + "5. Xoa mot khach hang ra khoi danh sách dua tren ma khach hang.\n"
                    + "6.Xoa mot khach hang ra khoi danh sach dua tren STT .\n" 
                    + "7.Sua khach hang.\n"
                    + "8.Tim kiem khach hang dua theo ma khach hang. \n"
                    + "9.Luu Danh Sach.\n"
                    + "0.Thoat khoi chuong trinh.\n"
                    + "Ban muon lam gi:");
            luaChon = sc.nextInt();
            sc.nextLine();

               switch (luaChon) {
                   case 1:
                       dskh.nhap();
                       break;
                   case 2:
                       dskh.them();
                       break;
                   case 3:
                       dskh.xuat();
                       break;
                   case 4:
                       dskh.KiemtratontaiMakh();
                       break;
                   case 5:
                       dskh.xoaTheoMa();
     
                       break;
                   case 6:
                       dskh.xoaTheoSTT();
         
                       break;
                   case 7:
                       dskh.SuaKhachHang();
         
                       break;
                   case 8:
                       dskh.TimkiemMakh();
                       break;
                   case 9:
                       File s = new File("\\OOP-Java\\CuaHangSach\\khachhang.txt");
                       dskh.ghiDuLieuXuongFile(s);
                      
                       break;
                   
               }
            
        
       }while(luaChon!=0);
       test.menu();
}
}
