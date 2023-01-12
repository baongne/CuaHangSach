import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class LoGin {
    private static String pass;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LoGin other = (LoGin) obj;
        return Objects.equals(this.pass, other.pass);
    }

  
    
    public static void log(){
        DanhSachTaiKhoan dstk = new DanhSachTaiKhoan();
        File d = new File("\\OOP-Java\\CuaHangSach\\data\\login.txt");
        dstk.docDuLieuTuFile(d);
        
        
        Scanner ip = new Scanner(System.in);
        System.out.println("____________________________________________LOGIN____________________________________________");
        String user;
         
        System.out.print("User: ");
        user = ip.nextLine();
        System.out.print("Password: ");
        String passCheck = ip.nextLine();
        
        if (dstk.CheckTK(user)== true) {
            if (dstk.CheckMK(passCheck)== true) {
            System.out.println("---->Dang Nhap Thanh Cong!!! ");
            test.menu();
            }
            if(dstk.CheckMK(passCheck)== false){
            System.out.println("---->Password ban vua nhap khong dung! ");
            start();
            }
            
        }
        if (dstk.CheckTK(user)== false) {
            System.out.println("Tai khoan hoac mat khau khong dung!\nVui long nhap lai!");
            start();
        }
    }
    public static void DangKy(){
        Scanner ip = new Scanner(System.in);
        DanhSachTaiKhoan dstk = new DanhSachTaiKhoan();
        File c = new File("\\OOP-Java\\CuaHangSach\\data\\login.txt");
        //dscthd.ghiDuLieuXuongFile(c);
        dstk.docDuLieuTuFile(c);
        
        System.out.println("____________________________________________Dang Ky Tai Khoan____________________________________________");
        String user;
        System.out.print("User: ");
        user = ip.nextLine();
        System.out.print("Password: ");
        String passCheck = ip.nextLine();
        
        if (dstk.CheckTK(user)== true) {
            System.out.println("User da co!");
            DangKy();
        }else if(dstk.CheckTK(user)== false){
            taikhoan tk=new taikhoan(user,passCheck);
            dstk.them(tk);
            dstk.ghiDuLieuXuongFile(c);
            
        }
    }
    public static void start(){
        Scanner ip = new Scanner(System.in);
        System.out.println("_________________________________(^_^)___CUA HANG SACH___(^_^)________________________________________");
        System.out.println("1. Dang nhap!");
        System.out.println("2. Dang ky!");
        System.out.print("Ban muon: ");
        int i = ip.nextInt();
        if(i == 1)
        {
            log();
        }
        if(i == 2)
        {
            DangKy();
            log();
        }
        if (i != 1 || i != 2) {
            start();
        }
        
    }

}
