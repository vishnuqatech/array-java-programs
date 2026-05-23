import java.util.*;
public class JavaArrayFirstP04{
public static void main(String args[ ] ){
Scanner s= new Scanner(System.in);
System.out.println("Enter the size of arrays ");
int size =s.nextInt();
int [] a= new int[size] ;
System.out.println("Enter the arrays values ");
for(int i=0;i<a.length;i++){
a[i]= s.nextInt();
}
System.out.println("To Display the Even  arrays values ");
for(int i=0;i<a.length;i++){
  if(i%2==0){
  System.out.println("Even :" +a[i]);
  }
}

System.out.println("To Display the Odd  arrays values ");
for(int i=0;i<a.length;i++){
  if(i%2!=0){
  System.out.println("odd :" +a[i]);
  }
}



}
}