import java.util.*;
public class StringExtract{
public static void main(String args [] ){
String str="abc123mno45pqr";
int sum=0;
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
if(ch>=48 && ch<=57){
sum=sum+(int)ch-48;
}
}
System.out.println(sum);
}
}