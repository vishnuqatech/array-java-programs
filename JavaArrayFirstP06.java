import java.util.*;
public class JavaArrayFirstP06{
public static void main(String args[ ]){
Scanner s=new Scanner(System.in);
System.out.println("To enter the size of arrays ");
int size=s.nextInt();
int [] a =new int[size];
System.out.println("Enter the arrays values ");
for(int i=0;i<a.length;i++){
a[i] =s.nextInt();
}
System.out.println("Enter the search arrays values ");
int skey=s.nextInt();
boolean found=false;
for(int i=0;i<a.length;i++){
if(skey==a[i]){
System.out.println("found" +skey + "Index  "+ i);
found=true;
break;
}
}
if(!found){
	System.out.println("not found  "+ skey );
}

}
}
