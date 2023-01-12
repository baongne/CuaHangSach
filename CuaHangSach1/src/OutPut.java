import java.util.Scanner;

public class OutPut {
    private int flat ;

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }
    public static int xuat(int flat){
        Scanner ip = new Scanner(System.in);
        System.out.println("-----------------------CUA HANG SACH-------------------------");
        System.out.println("Xin chao ban, ban can lam gi ?");
        System.out.println("Press 1 for Ban Hang.");
        System.out.println("Press 2 for quan li hoa don.");
        System.out.println("Press 3 for quan li nguon hang.");
        System.out.println("Press 4 for quan li thong tin khach hang.");
        System.out.println("Press 5 for quan li thong tin nhan vien.");
        System.out.println("Press 6 for quan li thong tin hang hoa.");
        System.out.println("Press 7 for Thong Ke.");
        System.out.println("Press 8 for Thong Tin Cua Hang.");
        System.out.println("Press 0 for ending program.");
        System.out.print("Ban muon lam gi : ");
        flat = ip.nextInt();
        return flat;
    }
}
