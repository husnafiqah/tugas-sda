import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
    
        LinkedList<String> saya = new LinkedList<String>();
        saya.add("H");
        saya.add("U");
        saya.add("S");
        saya.add("N");
        saya.add("A");
        saya.add("");
        saya.add("A");
        saya.add("F");
        saya.add("I");
        saya.add("Q");
        saya.add("A");
        saya.add("H");
        saya.add("");
        saya.add("Y");
        saya.add("O");
        saya.add("S");
        saya.add("S");
        saya.add("Y");
        saya.add("A");
        saya.add("F");
        saya.add("R");
        saya.add("A");

        System.out.println(saya);
        System.out.println("size = "+saya.size());

        //Add LinkedList
        saya.addFirst("A");
        saya.addLast("S");
        System.out.println("\noutput tambah = "+saya);
        System.out.println("size = "+saya.size());

        saya.add("D");
        saya.add("F");
        System.out.println("output tambah = "+saya);
        System.out.println("size = "+saya.size());

        //set linkedlist =
        saya.set(0,"G" );
        saya.set(2,"H" );
        saya.set(7,"J" );
        saya.set(22,"K" );
        saya.set(19,"L" );
        System.out.println("output sisip = "+saya);
        System.out.println("size = "+saya.size());

        //remove linkedlist
        saya.removeFirst();
        saya.removeLast();
        System.out.println("output hapus = "+saya);
        System.out.println("size = "+saya.size());

        saya.remove(21);
        saya.remove(6);
        System.out.println("output hapus = "+saya);
        System.out.println("size = "+saya.size());

        //pop and push
        saya.pop();
        System.out.println("output POP = "+saya);
        System.out.println("size = "+saya.size());

        saya.push("M");
        System.out.println("output PUSH = "+saya);
        System.out.println("size = "+saya.size());
        

    }
    
}
