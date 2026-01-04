import java.util.Scanner;
class strpr{
static void main(String[] args){
Scanner sc=new Scanner(System.in);
String n=sc.next();
StringBuilder s1=new StringBuilder(n);
StringBuilder s=new StringBuilder(n).reverse();

System.out.println(s1==s);
}
}