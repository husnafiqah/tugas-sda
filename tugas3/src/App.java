import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList <Integer> nim = new LinkedList<>();
        LinkedList <String> nama = new LinkedList<>(); 
        LinkedList <String> alamat = new LinkedList<>();

        nim.add(2111522030);
        nama.add("Husna Afiqah Y");
        alamat.add("kalawi");
        System.out.println("no bp \t\t= "+nim);
        System.out.println("nama mahasiswa \t= "+nama);
        System.out.println("alamat \t\t= "+alamat);

        //add() 
        System.out.println("\n=============== MENAMBAH DATA MAHASISWA ===============");
    
        nim.addFirst(2111522029);
        nim.addLast(2111522028);
        nim.add(2111522027);
        nim.add(2111522028);
        nim.add(2111522020);
        

        nama.addFirst("Tejo");
        nama.addLast("Brando");
        nama.add("Abin");
        nama.add("Dinda");
        nama.add("Aan");

        alamat.addFirst("kalumbuk");
        alamat.addLast("belimbing");
        alamat.add("alai");
        alamat.add("jati");
        alamat.add("bypass");

        System.out.println("no bp \t\t= "+nim+"\tukuran = "+nim.size());
        System.out.println("nama mahasiswa \t= "+nama+"\tukuran = "+nim.size());
        System.out.println("alamat \t\t= "+alamat+"\tukuran = "+nim.size());

        //set()
        System.out.println("\n=============== MENYISIPKAN DATA MAHASISWA ===============");

        nim.set(0,2111522026);
        nim.set(1,2111522025);
        nim.set(3,2111522024);
        nim.set(4,2111522023);

        nama.set(0,"Ipuk");
        nama.set(1,"Aisah");
        nama.set(3,"Baboo");
        nama.set(4,"Potter");

        alamat.set(0,"andalas");
        alamat.set(1,"khatib");
        alamat.set(3,"sudirman");
        alamat.set(4,"anduring");

        System.out.println("no bp \t\t= "+nim+"\tukuran = "+nim.size());
        System.out.println("nama mahasiswa \t= "+nama+"\tukuran = "+nim.size());
        System.out.println("alamat \t\t= "+alamat+"\tukuran = "+nim.size());

        //remove()
        System.out.println("\n=============== MENGHAPUS DATA MAHASISWA ===============");

        nim.remove(0);
        nim.remove(1);

        nama.remove(2);
        nama.remove(1);

        alamat.remove(0);
        alamat.remove(2);

        System.out.println("no bp \t\t= "+nim+"\tukuran = "+nim.size());
        System.out.println("nama mahasiswa \t= "+nama+"\tukuran = "+nim.size());
        System.out.println("alamat \t\t= "+alamat+"\tukuran = "+nim.size());

        //isEmpty()
        System.out.println("\n=============== PENGECEKAN DATA MAHASISWA ===============");

        System.out.println("apakah data nim ada yang kosong?\t"+nim.isEmpty());
        System.out.println("apakah data nama ada yang kosong?\t"+nama.isEmpty());
        System.out.println("apakah data alamat ada yang kosong?\t"+alamat.isEmpty());

        //get
        System.out.println("\nnim index ke 0 = "+nim.get(0));
        System.out.println("nama index ke 0 = "+nama.get(0));
        System.out.println("alamat index ke 0  = "+alamat.get(0));

        //indexof
        System.out.println("\nnim 2111522026 index ke = "+nim.indexOf(2111522026));
        System.out.println("nama Baboo index ke = "+nama.indexOf("Baboo"));
        System.out.println("alamat khatib index ke = "+alamat.indexOf("khatib"));

        //pop()
        System.out.println("\n=============== MENGHAPUS DATA AWAL MAHASISWA AWAL(POP) ===============");

        nim.pop();
        nama.pop();
        alamat.pop();

        System.out.println("no bp \t\t= "+nim+"\tukuran = "+nim.size());
        System.out.println("nama mahasiswa \t= "+nama+"\tukuran = "+nim.size());
        System.out.println("alamat \t\t= "+alamat+"\tukuran = "+nim.size());

        //push()
        System.out.println("\n=============== MENAMBAH DATA AWAL MAHASISWA (PUSH) ===============");

        nim.push(211152210);        
        nama.push("Hafi");
        alamat.push("siteba");

        System.out.println("no bp \t\t= "+nim+"\tukuran = "+nim.size());
        System.out.println("nama mahasiswa \t= "+nama+"\tukuran = "+nim.size());
        System.out.println("alamat \t\t= "+alamat+"\tukuran = "+nim.size());












        


    }
}
