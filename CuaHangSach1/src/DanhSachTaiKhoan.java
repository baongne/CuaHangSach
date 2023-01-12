
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;


public class DanhSachTaiKhoan extends taikhoan{
    taikhoan[] dstk = new taikhoan[0];
    int n;

    public DanhSachTaiKhoan() {
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
//nhập n từ bàn phím dùng scanner 
        System.out.println("nhap n:");
        n = sc.nextInt();

//nhập n sv như sau
        dstk = new taikhoan[n];

        for (int i = 0; i < n; i++) {

            dstk[i] = new taikhoan();

            dstk[i].nhap();
        }

    }
    public void xuat() {

        for (int i = 0; i < n; i++) {
            System.out.println("Tai khoan "+i+" la:");
            System.out.println(dstk[i]);
            

        }
    }
    public void them() {
        System.out.println("Sach can them:");
        n = dstk.length;

        dstk = Arrays.copyOf(dstk, n + 1);

        dstk[n] = new taikhoan();

        dstk[n].nhap();

        n++;

    }

    public boolean CheckTK(String user){
        int n = dstk.length;
        int index =0;
        for (int i = 0; i < n; i++) {
            if (user.equals(dstk[i].getUser())==true) {
                return true;
            }
        }
        return false;
    
    }
    public boolean CheckMK(String pass){
        int n = dstk.length;
        int index =0;
        for (int i = 0; i < n; i++) {
            if (pass.equals(dstk[i].getPass())==true) {
                return true;
            }
        }
        return false;
    
    }
    public void them(taikhoan x) {

        n = dstk.length;

        dstk = Arrays.copyOf(dstk, n + 1);

        dstk[n] = new taikhoan(x);
        n++;

    }
    public void xoaTheoUser() {
        Scanner sc = new Scanner(System.in);
        n = dstk.length;
        System.out.println("nhap ma:");
        String ma = sc.nextLine();
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (dstk[i].getUser().equalsIgnoreCase(ma)) {
                index = i;
                for (int j = index; j < n - 1; j++) {
                    dstk[j] = dstk[j + 1];
                }
            }
        }
        dstk = Arrays.copyOf(dstk, n - 1);
        n--;
    }
     public void SuaTK() {

        Scanner sc = new Scanner(System.in);

        n = dstk.length;

        System.out.println("User can sua:");
        String us = sc.nextLine();
        System.out.println("pass cu la:");
        String oldpass = sc.nextLine();
        System.out.println("pass la:");
        String pass = sc.nextLine();
     
        for (int j = 0; j < n; j++) {
            if (us.equals(dstk[j].getUser())== true) {
                if (oldpass.equals(dstk[j].getPass())== true) {
                    dstk[j].setPass(pass);
                
                }
            }
        }

    }
    public void ghiDuLieuXuongFile(File file) {
        try {
            OutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (taikhoan S : dstk) {
                oos.writeObject(S);

            }

            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void docDuLieuTuFile(File f) {
        try {
            InputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {
                taikhoan obj = (taikhoan) ois.readObject();
                them(obj);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

















































































































































































}
