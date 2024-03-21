import java.util.Scanner;

public class BitwiseOperatorsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value for 'a': ");
        int a = scanner.nextInt();

        System.out.print("Enter the value for 'b': ");
        int b = scanner.nextInt();

        // Bitwise AND operator (&)
        int bitwiseAnd = a & b;
        System.out.println("Bitwise AND: " + bitwiseAnd);

        // Bitwise OR operator (|)
        int bitwiseOr = a | b;
        System.out.println("Bitwise OR: " + bitwiseOr);

        // Bitwise XOR operator (^)
        int bitwiseXor = a ^ b;
        System.out.println("Bitwise XOR: " + bitwiseXor);

        // Bitwise NOT operator (~)
        int bitwiseNotA = ~a;
        System.out.println("Bitwise NOT of a: " + bitwiseNotA);

        // Left shift operator (<<)
        int leftShifted = a << 2;
        System.out.println("Left shift of a: " + leftShifted);

        // Right shift operator (>>)
        int rightShifted = a >> 1;
        System.out.println("Right shift of a: " + rightShifted);

        scanner.close();
    }
}
