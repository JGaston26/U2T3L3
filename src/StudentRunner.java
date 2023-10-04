import java.util.Scanner;
public class StudentRunner {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();

        System.out.print("Enter your first name: ");
        String askFirstName = scan.nextLine();
        System.out.print("Enter your last name: ");
        String askLastName = scan.nextLine();
        System.out.print("Enter your graduation year: ");
        int askGradYear = scan.nextInt();

        Student student1 = new Student(askFirstName, askLastName, askGradYear);

        int menuAsk = 0;
        while (menuAsk != 6)
        {
            menu.printMenu();
            System.out.print("Enter your option: ");
            menuAsk = scan.nextInt();

            if(menuAsk == 1)
            {
                System.out.print("Enter new graduation year: ");
                int newGradYear = scan.nextInt();
                student1.setGradYear(newGradYear);

            }
            else if(menuAsk == 2)
            {
                System.out.print("Add test score: ");
                int addTestScore = scan.nextInt();
                student1.addTestScore(addTestScore);
            }
            else if(menuAsk == 3)
            {
                System.out.println(student1.averageTestScore());
            }
            else if(menuAsk == 4)
            {
                System.out.println(student1.getHighestScore());
            }
            else if(menuAsk == 5)
            {
                student1.printStudentInfo();
            }
            else if(menuAsk == 6)
            {
                System.out.println("Goodbye!");
            }else{
                System.out.println("That menu option does not exist, please enter a correct input. ");
            }
        }
    }
}
