package tugas4.src.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queuee {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.add("rara");
        queue.add("hafi");
        queue.add("Karin");
        queue.add("farhan");
        queue.add("rizki");

        System.out.println(queue);
        System.out.println("");

        //POLL
        System.out.println("----poll----");
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println("");

        //PEEK
        System.out.println("----peek----");
        System.out.println(queue.peek());
        System.out.println("");

        //POLL
        System.out.println("----poll----");
        queue.poll();
        System.out.println(queue);
        System.out.println("");

        //REMOVE
        System.out.println("----remove----");
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println("");

        //ISEMPTY
        System.out.println("----isempty-----");
        System.out.println(queue.isEmpty());
        System.out.println("");

        //ELEMENT
        System.out.println("---elemen----");
        System.out.println(queue.element());
        System.out.println("");
        
        //SIZE
        System.out.println("----size----");
        System.out.println(queue.size());
        System.out.println("");

        //CLEAR
        System.out.println("----clear----");
        queue.clear();



    }
     
    
}
