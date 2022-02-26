import java.util.ArrayList;

public class soal5 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("a");
        nama.add("f");
        nama.add("r");
        nama.add("a");

        System.out.println("sebelum remove:");
         for(String x: nama){
              System.out.println(x);
         }
        
        nama.remove(0);
        //nama.remove(3);
        nama.remove(2);
           
        System.out.println("setelah remove :");
           for(String y: nama){
             System.out.println(y);
           }

        //System.out.println(nama.remove(0));
        //System.out.println(nama.remove(3));
        //System.out.println(nama.remove(2));
    } 
}
