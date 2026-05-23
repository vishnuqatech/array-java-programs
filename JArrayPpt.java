import java.util.*;
public class JArrayPpt{
public static void main(String args[]){
int a[] = {0,1,3,4};
int n=a.length;

int actual=0;
int expected =n*(n+1/2);
for(int num : a){
actual+= num;
}
int result2= expected-actual;
System.out.println(result2);
}
}