
import java.util.Scanner;


public class SachGiaoKhoa  extends Sach{
    
    private String t;

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String masach, String tensach, int slton, long gianhap, long giaban, String nhaxb, int namxb, String matg, String tentg,String t) {
        super(masach, tensach, slton, gianhap, giaban, nhaxb, namxb, matg, tentg);
        this.t = t;
        
    }
    
    public SachGiaoKhoa(SachGiaoKhoa x){
        super((Sach)x);
        t=x.t;
        
      
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "" + "Ma sach:" + masach + "| Ten sach:" + tensach + "| Lop:"+t+"| So luong ton:" + slton + "| Gia nhap:" + gianhap + "| Gia ban:" + giaban + "| Nha xuat ban:" + nhaxb + "| Nam xuat ban:" + namxb + "| Ma tac gia:" + matg + "| Ten tac gia:" + tentg + "|";
    }
    
    @Override
     public void xuat(){
         
         System.out.println("" + "Ma sach:" + masach + "| Ten sach:" + tensach + "| Lop:"+t+"| So luong ton:" + slton + "| Gia nhap:" + gianhap + "| Gia ban:" + giaban + "| Nha xuat ban:" + nhaxb + "| Nam xuat ban:" + namxb + "| Ma tac gia:" + matg + "| Ten tac gia:" + tentg + "|");
  
     }

     public void SuaSach()
     {
         Scanner sc = new Scanner(System.in);
         
         super.SuaSach();
         System.out.print("Lop la: ");
         String lop = sc.nextLine() ;
         setT(lop);
     }
    
}
