import java.util.*;
public class JPUsingArrayList10{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("Enter the size of arrays");
int size=s.nextInt();
ArrayList<Integer> list=new ArrayList<>();
System.out.println("Enter the arrays values ");
for(int i=0;i<size;i++){
list.add(s.nextInt());
}
System.out.println("Enter the position ");
int pos=s.nextInt();
if(pos<1 || pos>size){
	System.out.println("invalid position");
}else{
list.remove(pos-1);
System.out.println(list);
}

}
}