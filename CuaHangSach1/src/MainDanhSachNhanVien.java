
import java.io.File;
import java.util.Scanner;

public class MainDanhSachNhanVien {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
       
        File f = new File("\\OOP-Java\\CuaHangSach\\data\\nhanvien.txt");
       
        dsnv.docDuLieuTuFile(f);
       
        
        int luaChon = 0;
        do{
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1.Tao Moi danh sach nhan vien\n"
                    + "2.Them nhan vien vao danh sach.\n"
                    + "3.In danh sach nhan vien ra man hinh.\n"
                    + "4.Kiem tra nhan vien co ton tai trong danh sach hay khong, dua tren ma nhan vien.\n"
                    + "5. Xoa mot nhan vien ra khoi danh sách dua tren ma nhan vien.\n"
                    + "6.Xoa mot nhan vien ra khoi danh sach dua tren STT .\n"
                    + "7.Sua nhan vien.\n"
                    + "8.Tim kiem nhan vien dua theo ma nhan vien. \n"
                    + "9.Luu Danh Sach.\n"
                    + "0.Thoat khoi chuong trinh.\n"
                    + "Ban muon lam gi:");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    dsnv.nhap();
                    break;
                case 2:
                    dsnv.them();
        
                    break;
                case 3:
                    dsnv.xuat();
                    break;
                case 4:
                    dsnv.KiemtratontaiManv();
                    break;
                case 5:
                    dsnv.xoaTheoMa();
              
                    break;
                case 6:
                    dsnv.xoaTheoSTT();
            
                    break;
                case 7:
                    dsnv.SuaNhanVien();
           
                    break;
                case 8:
                    dsnv.TimkiemManv();
                    break;
                case 9:
                       dsnv.ghiDuLieuXuongFile(f);
                       
                       break;
                
            }

        
    }while(luaChon!=0);
        test.menu();
        
}
}
