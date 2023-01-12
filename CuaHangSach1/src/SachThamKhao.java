
import java.util.Scanner;


public class SachThamKhao extends Sach{
    
    private String t;

    public SachThamKhao() {
    }

    public SachThamKhao(String masach, String tensach, int slton, long gianhap, long giaban, String nhaxb, int namxb, String matg, String tentg,String t) {
        super(masach, tensach, slton, gianhap, giaban, nhaxb, namxb, matg, tentg);
        this.t = t;
        
    }
    
    public SachThamKhao(SachThamKhao x){
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
        return "" + "Ma sach:" + masach + "| Ten sach:" + tensach + "| Mon:"+t+"| So luong ton:" + slton + "| Gia nhap:" + gianhap + "| Gia ban:" + giaban + "| Nha xuat ban:" + nhaxb + "| Nam xuat ban:" + namxb + "| Ma tac gia:" + matg + "| Ten tac gia:" + tentg + "|";
    }
     
    @Override
     public void xuat(){
        
         System.out.println("" + "Ma sach:" + masach + "| Ten sach:" + tensach + "| Mon:"+t+"| So luong ton:" + slton + "| Gia nhap:" + gianhap + "| Gia ban:" + giaban + "| Nha xuat ban:" + nhaxb + "| Nam xuat ban:" + namxb + "| Ma tac gia:" + matg + "| Ten tac gia:" + tentg + "|");
  
     }

     public void SuaSach()
     {
         Scanner ip = new Scanner(System.in);

         super.SuaSach();
         System.out.print("Mon la: ");
         String mon = ip.nextLine() ;
         setT(mon);
     }
}