package Praktikum.Pertemuan16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class LoopCollection {
    public static void main(String[] args) {
        //Stack<String> fruits = new Stack<>(); 
        //modif
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana"); //push -> add
        fruits.add("Orange"); 
        fruits.add("Watermelon"); 
        fruits.add("Leci"); 
        fruits.add("Salak");
        
        for (String fruit: fruits) { 
            System.out.printf("%s ", fruit);
        }
        
        System.out.println("\n" + fruits.toString());

        // Mengganti elemen terakhir dengan "Strawberry"
        if (!fruits.isEmpty()) {
            fruits.set(fruits.size() - 1, "Strawberry");
        }
        System.out.println(fruits);
        
        // Menambahkan tiga buah baru
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        // Melakukan pengurutan (sorting)
        Collections.sort(fruits);

        System.out.println("Sorted fruits:");
        System.out.println(fruits);

        //empty -> isEmpty
        // while (!fruits.isEmpty()) { 
        //     System.out.printf("%s ", fruits.pop());
        // }

        // modif
        // fruits.push("Melon");
        // fruits.push("Durian");
        // System.out.println("");
        // for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
        //     String fruit = it.next();
        //     System.out.printf("%s ", fruit);
        // }
        // System.out.println("");
        // fruits.stream().forEach(e -> {
        //     System.out.printf("%s ", e);
        // });
        // System.out.println("");
        // for (int i = 0; i < fruits.size(); i++) {
        //     System.out.printf("%s ", fruits.get(i));
        // }
        
    }
}
