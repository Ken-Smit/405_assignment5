//Kenneth Smith
//9-7-2024
//Assignment 5

import java.util.ArrayList;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Naruto: Shippuden,");
        stringList.add("DragonBall Z,");
        stringList.add("Pokemon,");
        stringList.add("Digimon,");
        stringList.add("Neon Genesis Evangelion,");
        stringList.add("Bleach,");
        stringList.add("Jujitsu Kaisen,");
        stringList.add("Demon Slayer,");
        stringList.add("Ghost in the Shell,");
        stringList.add("Attack on Titan,");

        System.out.println("ArrayList:");
        for (String str : stringList) {
            System.out.print(str + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index the anime you'd like to see again: ");
        int index;
        try {
            index = Integer.parseInt(scanner.nextLine());
            System.out.println("You chose: " + stringList.get(index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        }

        scanner.close();
    }
}