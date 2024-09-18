package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DemoMain {
    public static void main(String[] args) {

        // java array
//        double[] numbers = {  1.0, 3.3, 4.9, 7.8 };
//
//        double sum = 0.0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        double avg = sum / numbers.length;
//        System.out.println(avg);

        // ArrayList
        ArrayList<String> composers = new ArrayList<>();
        composers.add("Chopin");
        composers.add("Bach");
        composers.add("Mozart");

        // enhanced loop
//        for (String comp : composers) {
//            System.out.println(comp);
//        }

        // reversed normal loop
//        for (int i = composers.size() - 1; i >= 0; i--) {
//            System.out.println(composers.get(i));
//        }

        // set
//        HashSet<Integer> bingo = new HashSet<>();
//        bingo.add(5);
//        bingo.add(23);
//        bingo.add(5);
//
//        System.out.println(bingo);

        // map
        HashMap<Integer, String> personnel = new HashMap<>();
        personnel.put(1001, "Jos");
        personnel.put(1002, "Annie");

        System.out.println(personnel.getOrDefault(1002, "unknown"));

        System.out.println(personnel);

        // switch
        String fileExtension = "bmp";
        switch(fileExtension.toLowerCase()) {
            case "gif":
            case "bmp":
            case "jpg":
                System.out.println("Image file");
                break;
            case "docx":
            case "txt":
            case "pdf":
                System.out.println("Document file");
            default:
                System.out.println("Unknown filetype");
        }

    }
}
