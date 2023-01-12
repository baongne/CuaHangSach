
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;


public class TruyenTranh extends Sach{
     private String t;

    public TruyenTranh() {
    }

    public TruyenTranh(String masach, String tensach, int slton, long gianhap, long giaban, String nhaxb, int namxb, String matg, String tentg,String t) {
        super(masach, tensach, slton, gianhap, giaban, nhaxb, namxb, matg, tentg);
        this.t = t;
    }
    
    public TruyenTranh(TruyenTranh x){
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
        return "" + "Ma sach:" + masach + "| Ten sach:" + tensach + "| Tap:"+t+"| So luong ton:" + slton + "| Gia nhap:" + gianhap + "| Gia ban:" + giaban + "| Nha xuat ban:" + nhaxb + "| Nam xuat ban:" + namxb + "| Ma tac gia:" + matg + "| Ten tac gia:" + tentg + "|";
    }

   
 
    
    @Override
     public void xuat(){
         
         System.out.println("" + "Ma sach:" + masach + "| Ten sach:" + tensach + "| Tap:"+t+"| So luong ton:" + slton + "| Gia nhap:" + gianhap + "| Gia ban:" + giaban + "| Nha xuat ban:" + nhaxb + "| Nam xuat ban:" + namxb + "| Ma tac gia:" + matg + "| Ten tac gia:" + tentg + "|");
  
     }

     public void SuaSach()
     {
         Scanner ip = new Scanner(System.in);

         super.SuaSach();
         System.out.print("Tap la: ");
         String tap = ip.nextLine() ;
         setT(tap);
     }

}
