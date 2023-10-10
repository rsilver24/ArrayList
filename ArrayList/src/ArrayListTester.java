// Roan Silver              Last Edits: October 10th, 2023
// Collaborators:
public class ArrayListTester {
    public static void main(String[] args) {
        ArrayList test = new ArrayList();

        // Tests Default Add Method

        test.add(1);
        test.add(2);
        test.add(4);
        test.add(5);
        System.out.print("Default Add Test (should print '1 2 4 5): ");
        System.out.print(test.get(0));
        System.out.print(" ");
        System.out.print(test.get(1));
        System.out.print(" ");
        System.out.print(test.get(2));
        System.out.print(" ");
        System.out.println(test.get(3));

        System.out.println("");

        // Test Add @ Index Method

        System.out.print("Add @ Index Test (should print '1 2 3 4 5'): ");
        test.add(2, 3);
        System.out.print(test.get(0));
        System.out.print(" ");
        System.out.print(test.get(1));
        System.out.print(" ");
        System.out.print(test.get(2));
        System.out.print(" ");
        System.out.print(test.get(3));
        System.out.print(" ");
        System.out.println(test.get(4));

        System.out.println("");

        // Test Remove Method

        System.out.print("Remove Test (should print '2 3 4 5'): ");
        test.remove(0);
        System.out.print(test.get(0));
        System.out.print(" ");
        System.out.print(test.get(1));
        System.out.print(" ");
        System.out.print(test.get(2));
        System.out.print(" ");
        System.out.println(test.get(3));

        System.out.println("");

        // Test Set Method

        System.out.print("Set Test (should print '20 3 4 5'): ");
        test.set(0, 20);
        System.out.print(test.get(0));
        System.out.print(" ");
        System.out.print(test.get(1));
        System.out.print(" ");
        System.out.print(test.get(2));
        System.out.print(" ");
        System.out.println(test.get(3));

        System.out.println("");

        // Test Size Method

        System.out.print("Size Test (should print '4'): ");
        System.out.println(test.size());
    }
}
