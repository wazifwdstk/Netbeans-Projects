/*Lab Skill 1 - Question 3
Name : SYED AHMAD WAZIF BIN SYED AHMAD MUNIF AL-IDRUS
Matric No. : DDCS22J008
Date : 7 September 2023*/
package labskill1_question3;

import java.util.Scanner;

public class LABSKILL1_QUESTION3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String nameInput = scanner.nextLine();

        System.out.print("Nickname: ");
        String nicknameInput = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        scanner.close();

        System.out.println("\nPersonal Information:");
        System.out.println("Name: " + nameInput);
        System.out.println("Nickname: " + nicknameInput);
        System.out.println("Age: " + age);
    }
}
