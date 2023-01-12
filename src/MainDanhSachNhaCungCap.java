
import java.io.File;
import java.util.Scanner;


public class MainDanhSachNhaCungCap {
    public static void main(String args[]) {
           Scanner sc = new Scanner(System.in);
        DanhSachNhaCungCap dsncc=new DanhSachNhaCungCap();
       
        File f = new File("\\OOP-Java\\CuaHangSach\\data\\nhacungcap.txt");
       
                dsncc.docDuLieuTuFile(f);
        int luaChon = 0;
      do{
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1.Tao Moi danh sach nha cung cap\n"
                    + "2.Them nha cung cap vao danh sach.\n"
                    + "3.In danh sach nha cung cap ra man hinh.\n"
                    + "4.Kiem tra nha cung cap co ton tai trong danh sach hay khong, dua tren ma nha cung cap.\n"
                    + "5. Xoa mot nha cung cap ra khoi danh sách dua tren ma nha cung cap.\n"
                    + "6.Xoa mot nha cung cap ra khoi danh sach dua tren STT .\n" 
                    + "7.Sua nha cung cap.\n"
                    + "8.Tim kiem nha cung cap dua theo ma nha cung cap. \n"
                    + "9.Luu Danh Sach.\n"
                    + "0.Thoat khoi chuong trinh.\n"
                    + "Ban muon lam gi:");
            luaChon = sc.nextInt();
            sc.nextLine();

               switch (luaChon) {
                   case 1:
                       dsncc.nhap();
                       break;
                   case 2:
                       dsncc.them();
                    
                       break;
                   case 3:
                       dsncc.xuat();
                       break;
                   case 4:
                       dsncc.KiemtratontaiMancc();
                       break;
                   case 5:
                       dsncc.xoaTheoMa();
                   
                       break;
                   case 6:
                       dsncc.xoaTheoSTT();
                       
                       break;
                   case 7:
                       dsncc.SuaNhaCungCap();
         
                       break;
                   case 8:
                       dsncc.TimkiemMancc();
                       break;
                   case 9:
                       dsncc.ghiDuLieuXuongFile(f);
                       
                       break;
                   
               }

    }while(luaChon!=0);
      test.menu();
    }


}