import java.util.Scanner;

public class ChildrenInFamily {
    public static void main(String[] args){
        System.out.println("Enter number of children in your family.");
        Scanner scanner = new Scanner(System.in);
        int numChildren;
        int childAge1;
        int childAge2;
        int childAge3;
        int childAge4;
        String childName1;
        String childName2;
        String childName3;
        String childName4;

        System.out.println("Enter first child's name.");

        childName1 = scanner.next();
        childName2 = scanner.next();
        childName3 = scanner.next();
        childName4 = scanner.next();
        childAge1 = scanner.nextInt();
        childAge2 = scanner.nextInt();
        childAge3 = scanner.nextInt();
        childAge4 = scanner.nextInt();

        System.out.println(childName1 + " is " + childAge1 + "!" );
        System.out.println(childName2 + " is " + childAge2 + "!" );
        System.out.println(childName3 + " is " + childAge3 + "!" );
        System.out.println(childName4 + " is " + childAge4 + "!" );
    }
}
