package p3;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\jredrup\\IdeaProjects\\textfiledemo\\src\\input.txt");
        System.out.println("Does it exist? " + file.exists());

        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                try {
                    double grade = input.nextDouble();
                    System.out.println("Grade: " + grade);
                } catch (Exception e) {
                    System.out.println("Bad data.");
                    input.nextLine();
                }
            }


        } catch (Exception e) {
            System.out.println("Oops.");
        }
    }
}