
import java.io.File;
import java.util.Scanner;

public class MainDanhSachHoaDon {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        DanhSachHoaDon dshd = new DanhSachHoaDon();
        
        File f = new File("\\OOP-Java\\CuaHangSach\\data\\hoadon.txt");
        dshd.docDuLieuTuFile(f);

        int luaChon = 0;
        do{
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1.Tao Moi danh sach hoa don\n"
                    + "2.Them hoa don vao danh sach.\n"
                    + "3.In danh sach hoa don ra man hinh.\n"
                    + "4.Kiem tra hoa don co ton tai trong danh sach hay khong, dua tren ma hoa don.\n"
                    + "5. Xoa mot hoa don ra khoi danh sách dua tren ma hoa don.\n"
                    + "6.Xoa mot hoa don ra khoi danh sach dua tren STT .\n"
                    + "7.Sua hoa don.\n"
                    + "8.Tim kiem hoa don dua theo ma hoa don. \n"
                    + "9.Luu Danh Sach.\n"
                    + "0.Thoat khoi chuong trinh.\n"
                    + "Ban muon lam gi:");
                    
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    dshd.nhap();
                    break;
                case 2:
                    dshd.them();
                  
                    break;
                case 3:
                    dshd.xuat();
                    break;
                case 4:
                    dshd.KiemtratontaiMahd();
                    break;
                case 5:
                    dshd.xoaTheoMa();
                    
                    break;
                case 6:
                    dshd.xoaTheoSTT();
         
                    break;
                case 7:
                    dshd.SuaHoaDon();
         
                    break;
                case 8:
                    dshd.TimkiemMahd();
                    break;
                case 9:
                       dshd.ghiDuLieuXuongFile(f);
                       
                       break;
                
            }
            }while(luaChon!=0);
        
        test.menu();
    }
}



     
    

