
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;


public class taikhoan implements Serializable{
    private String user;
    private String pass;

    public taikhoan() {
    }

    public taikhoan(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }
     public taikhoan(taikhoan x) {
        user=x.user;
       pass=x.pass;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "" + "user:" + user + "| pass:" + pass + "";
    }

   public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("User:");
        user=sc.nextLine();
        System.out.println("Password:");
        pass=sc.nextLine();
       
         
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
        final taikhoan other = (taikhoan) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return Objects.equals(this.pass, other.pass);
    }
    
    
    
}
