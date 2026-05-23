import java.util.*;
public class JavaArrayFirstP01{
public static void main(String args[] ){
Scanner s=new Scanner(System.in);
System.out.println("Enter size of arrays ");
int size=s.nextInt();
int [] a = new int[size];
System.out.println("To enter the values of the arrays");
for(int i=0;i<a.length;i++){
a[i] =s.nextInt();
}
System.out.println("To display the values of arrays");
for(int i=0;i<size;i++){
System.out.println(a[i] + " ");
}









}
}