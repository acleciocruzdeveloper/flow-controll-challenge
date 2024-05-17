import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("insert first value: ");
        int firstValue = sc.nextInt();
        System.out.print("insert second value: ");
        int secondValue = sc.nextInt();

        try {
            accountant(firstValue, secondValue);
        } catch (RuntimeException e) {
            throw new ValidationInputException("invalid entered values");
        }
    }

    static void accountant(int firstValue, int secondValue) throws ValidationInputException {
        if (firstValue > secondValue) {
            System.out.println("invalid values, first value must be less than second");
        } else {
            int countNumbers = secondValue - firstValue;
            for (int i = 1; i <= countNumbers; i++) {
                System.out.println("count: " + i);
            }
        }
    }
}