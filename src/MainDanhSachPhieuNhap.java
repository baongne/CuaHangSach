
import java.io.File;
import java.util.Scanner;

public class MainDanhSachPhieuNhap {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        DanhSachPhieuNhap dspn = new DanhSachPhieuNhap();
     
        File f = new File("\\OOP-Java\\CuaHangSach\\data\\phieunhap.txt");
      
        dspn.docDuLieuTuFile(f);
        int luaChon = 0;
       do{
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1.Tao Moi danh sach phieu nhap\n"
                    + "2.Them phieu nhap vao danh sach.\n"
                    + "3.In danh sach phieu nhap ra man hinh.\n"
                    + "4.Kiem tra phieu nhap co ton tai trong danh sach hay khong, dua tren ma phieu nhap.\n"
                    + "5. Xoa mot phieu nhap ra khoi danh sách dua tren ma phieu nhap.\n"
                    + "6.Xoa mot phieu nhap ra khoi danh sach dua tren STT .\n"
                    + "7.Sua phieu nhap.\n"
                    + "8.Tim kiem phieu nhap dua theo ma phieu nhap. \n"
                    + "9.Luu Danh Sach.\n"
                    + "0.Thoat khoi chuong trinh.\n"
                    + "Ban muon lam gi:");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    dspn.nhap();
                    break;
                case 2:
                    dspn.them();
          
                    break;
                case 3:
                    dspn.xuat();
                    break;
                case 4:
                    dspn.KiemtratontaiMapn();
                    break;
                case 5:
                    dspn.xoaTheoMa();
           
                    break;
                case 6:
                    dspn.xoaTheoSTT();
            
                    break;
                case 7:
                    dspn.SuaPhieuNhap();

                    break;
                case 8:
                    dspn.TimkiemMapn();
                    break;
                case 9:
                       dspn.ghiDuLieuXuongFile(f);
                      
                       break;
                  
            }

  
    }while(luaChon!=0);
       test.menu();
}
}
