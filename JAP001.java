import java.util.*;
public class JAP001{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("Enter the size of the arrays");
int size=s.nextInt();
int a[] = new int [size] ;
System.out.println("Display the Arrays values ");
for(int i=0;i<a.length;i++){
a[i] =s.nextInt();
}
System.out.println("Display the arrays values ");
 for(int i=0;i<a.length;i++){
 System.out.println(a[i] + " " );
 
 }
 
}
}