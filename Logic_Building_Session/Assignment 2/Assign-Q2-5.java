import java.util.Scanner;

class StudentPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter the marks for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter the marks for Subject 3: ");
        int subject3 = scanner.nextInt();

        int failedSubjects = 0;

        switch (subject1 >= 40 ? 1 : 0) {
            case 0:
                failedSubjects++;
                break;
        }

        switch (subject2 >= 40 ? 1 : 0) {
            case 0:
                failedSubjects++;
                break;
        }

        switch (subject3 >= 40 ? 1 : 0) {
            case 0:
                failedSubjects++;
                break;
        }

        if (failedSubjects == 0) {
            System.out.println("Student passed all subjects.");
        } else {
            System.out.println("Student failed in " + failedSubjects + " subject(s).");
        }

        scanner.close();
    }
}
