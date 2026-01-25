class vim{
  private  int age;
  private char hi;
vim(int h,char b){
age=h;
hi=b;

}
int getname(){
    return age;

}
char getchar(){
    return hi;
}
}
public class encapsule {
    static void main(String[] args){

    vim num=new vim(29,'k');
    
    
    
    System.out.println(num.getname()+" "+num.getchar());

   

    }
}
