import java.util.*;
public class JavaArrayFirstP07{
public static void main(String args[ ]){
Scanner s=new Scanner(System.in);
System.out.println("To enter the size of arrays ");
int size=s.nextInt();
int [] a =new int[size];
System.out.println("Enter the arrays values ");
for(int i=0;i<a.length;i++){
a[i] =s.nextInt();
}
System.out.println("Arrays value Before Reverse ");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}

/*System.out.println("To print arrays values after the Reverse");
for(int i=a.length-1;i>=0;i--){
System.out.println(a[i]);
}*/
while(temp>0){
int temp=a[i];
a[i]=a[a[i]+1];
a[a[i]+1]=temp;
}

for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
}
}
}
