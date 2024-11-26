
import java.util.Scanner;

public class Main {
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        StudentDatabase studentDatabase = new StudentDatabase();

        while (true) {
            System.out.println("\n--- Student Database ---");
            System.out.println("1. Create Student");
            System.out.println("2. Read Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    // Create Student
                    System.out.print("Enter student name: ");
                    String name = input.nextLine();
                    System.out.print("Enter student ID: ");
                    String id = input.nextLine();
                    System.out.print("Enter student year: ");
                    int year = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter student section: ");
                    String section = input.nextLine();
                    studentDatabase.createStudent(name, id, year, section);
                    break;

                case 2:
                    /*
                     * read student from array list
                     * will be change to database either json or sql
                     */
                    studentDatabase.readStudents();
                    break;

                case 3: // update info
                    System.out.print("Enter student ID to update: ");
                    String updateId = input.nextLine();
                    System.out.print("Enter new name (or press Enter to keep current): ");
                    String updateName = input.nextLine();
                    System.out.print("Enter new year (or press Enter to keep current): ");
                    String yearInput = input.nextLine();
                    int updateYear = yearInput.isEmpty() ? -1 : Integer.parseInt(yearInput);
                    System.out.print("Enter new section (or press Enter to keep current): ");
                    String updateSection = input.nextLine();
                    studentDatabase.updateStudents(updateId, updateName, updateYear, updateSection);
                    break;

                case 4: // delete student
                    System.out.print("Enter student ID to delete: ");
                    String deleteId = input.nextLine();
                    studentDatabase.deleteStudent(deleteId);
                    break;

                case 5: // exit
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}