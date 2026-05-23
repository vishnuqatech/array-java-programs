import java.util.*;
public class JavaArrayFirstP05{
public static void main(String args[ ] ){
Scanner s= new Scanner(System.in);
System.out.println("Enter the size of arrays ");
int size =s.nextInt();
int [] a= new int[size] ;
System.out.println("Enter the arrays values ");
for(int i=0;i<a.length;i++){
a[i]= s.nextInt();
}
//System.out.println("To Display the Even  arrays values ");
int evencount=0;
int oddcount=0;
int count=0;
for(int i=0;i<a.length;i++){
if(a[i]%2==0){
//	System.out.println("to count even ");
evencount++;
}else{
	//System.out.println("to count odd ");
oddcount++;
}	
}
System.out.println("to count even number   :  " + evencount);
System.out.println("to count odd number  :  "+ oddcount);

}
}

