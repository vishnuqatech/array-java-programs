import java.util.*;
public class Javaprogamss10{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter size of arrays ");
int size=s.nextInt();
int [] a=new int[size];

System.out.println("to enter the values of arrays");
for(int i=0;i<size;i++){
a[i]=s.nextInt();
}

System.out.println("Input position for delete");
int pos =s.nextInt();
if(pos<1 || pos >size){
System.out.println("to invalid position");
}else{
 // shift all element to left 
 for(int i=pos-1;i<size-1;i++){
 a[i]=a[i+1];
 }
}
 System.out.println("print new arrays size of n-1 ");
for(int i=0;i<size-1;i++){
System.out.println(a[i] + " ");
}

}
}