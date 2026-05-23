import java.util.*;
public class JavaArrayFirstP03{
public static void main(String args[ ] ){
Scanner s= new Scanner(System.in);
System.out.println("Enter the size of arrays ");
int size =s.nextInt();
int [] a= new int[size] ;
System.out.println("Enter the arrays values ");
for(int i=0;i<a.length;i++){
a[i]= s.nextInt();
}

//System.out.println("Display the arrays values even value  ");
/*for(int i=0;i<size;i++){
if(a[i]%2==0){
System.out.println( a[i] );
}
}
System.out.println("Display the odd values");
for(int i=0;i<size;i++){
if(a[i%2!=0){
System.out.println( a[i] );
}
}*/


System.out.println("Display the arrays values even value  ");
String even=" ";
String odd=" ";
for(int i=0;i<size;i++){
if(a[i]%2==0){
even+=a[i] + " ";
}else{
	odd+=a[i] + " ";
}
}
System.out.println("Even  =  " +  even);
System.out.println("odd  =" +  odd);



}
}