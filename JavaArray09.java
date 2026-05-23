import java.util.*;

public class JavaArray09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        // Input elements
        System.out.println("Enter elements of Array1:");
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
System.out.println("enter arrays values array2 ");
for(int i=0;i<n;i++){
	array2[i]=sc.nextInt();
}
        // Copy elements
        for (int i = 0; i < n; i++) {
            array2[i] = array1[i];
        }

        // Print Array2
        System.out.print("Array2 = { ");
        for (int i = 0; i < n; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("}");

        for(int i=0;i<n;i++){
			System.out.println(array2[i]);
		}
			
    }
}