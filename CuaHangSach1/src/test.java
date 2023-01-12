
import java.awt.Menu;
import java.io.File;

public class test {

    private static String[] args;
    public static void menu()
    {
     
        int flat;
        flat = OutPut.xuat(0);
        do{
            if(flat == 1){
                System.out.println("----------------------------------------Mua Hang----------------------------------------------");
                BanHang.main(args);
            }    
            if (flat == 2) {
                   System.out.println("---------------------------------Quan li danh sach hoa don!------------------------------------");
                MainDanhSachHoaDon.main(args);
            }
            if (flat == 3) {
                System.out.println("---------------------------------Quan li danh sach nha cung cap!------------------------------------");
                MainDanhSachNhaCungCap.main(args);
            }
            if (flat == 4) {
                System.out.println("---------------------------------Quan li danh sach khach hang!------------------------------------");
                MainDanhSachKhachHang.main(args);
            }
            if (flat == 5) {
                System.out.println("---------------------------------Quan li danh sach nhan vien!------------------------------------");
                MainDanhSachNhanVien.main(args);
            }
            if (flat == 6) {
                System.out.println("---------------------------------Quan li danh sach sach!------------------------------------");
                MainDanhSachSach.main(args);
            }
            if(flat == 7){
                System.out.println("----------------------------------------Thong Ke----------------------------------------------");
                ThongKe.main(args);
            } 
            if(flat == 8){
                System.out.println("----------------------------------------Thong Tin Cua Hang----------------------------------------------");
                ThongTinCuaHang.main(args);
            } 
            if (flat == 0){                
                System.exit(0);
            }
        } while (flat != 0);
    }
    public static void main(String[] args) {
        LoGin.start();
       
        
    }
}
