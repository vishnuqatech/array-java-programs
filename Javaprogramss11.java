import java.util.*;
public class Javaprograms11{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("Enter the Size of arrays");
int size=s.nextInt();
int a[]=new int [size];
System.out.println("Enter the values of arrays");
for(int i=0;i<size;i++){
a[i]=s.nextInt();
}

int largest=Integer.MIN_VALUE;
int secondlargest=Integer.MIN_VALUE;

// find the largest and secondlargest number 

for(int i=0;i<size;i++){
if(a[i] >largest){
secondlargest=largest;
largest=a[i];
}
else if(a[i]>secondlargest && a[i] !=largest){
secondlargest=a[i];
}
}
if(secondlargest ==Integer.MIN_VALUE){
System.out.println("No secondLargest element");
}else{
System.out.println("secondLargest ==  " +secondlargest);

}

}
}