/*Lab Skill 1 - Question 1
Name		: SYED AHMAD WAZIF BIN SYED AHMAD MUNIF AL-IDRUS
Matric No.	: DDCS22J008
Date		: 7 September 2023*/

import java.util.Scanner;

public class PersonalInfoInput {
    public static void main(String[] args) {
        
        String fullName;
        String nickname;
        String dateOfBirth;
        String gender;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your full name: ");
            fullName = scanner.nextLine();
            System.out.print("Enter your nickname: ");
            nickname = scanner.nextLine();
            System.out.print("Enter your date of birth: ");
            dateOfBirth = scanner.nextLine();
            System.out.print("Enter your gender: ");
            gender = scanner.nextLine();
        }

        System.out.println("\nPersonal Information:");
        System.out.println("Full Name: " + fullName);
        System.out.println("Nickname: " + nickname);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Gender: " + gender);
    }
}





