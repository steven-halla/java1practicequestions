import java.util.Scanner;

public class NonDecreasingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int int1 = input.nextInt();
        int int2 = input.nextInt();
        int int3 = input.nextInt();

        int leastAmount, middleAmount, mostAmount;

        if (int1 <= int2 && int1 <= int3) {
            leastAmount = int1;
            if (int2 <= int3) {
                middleAmount = int2;
                mostAmount = int3;
            } else {
                middleAmount = int3;
                mostAmount = int2;
            }
        } else if (int2 <= int1 && int2 <= int3) {
            leastAmount = int2;
            if (int1 <= int3) {
                middleAmount = int1;
                mostAmount = int3;
            } else {
                middleAmount = int3;
                mostAmount = int1;
            }
        } else {
            leastAmount = int3;
            if (int1 <= int2) {
                middleAmount = int1;
                mostAmount = int2;
            } else {
                middleAmount = int2;
                mostAmount = int1;
            }
        }

        System.out.println("Non-decreasing order: " + leastAmount + " " + middleAmount + " " + mostAmount);
    }
}
