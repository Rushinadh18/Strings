class vowle{
static int sol(String s){
int count=0;
for(int i=0;i<=s.length()-1;i++){
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
count+=1;
}
}
return count;
}

static void main(String[] args){
System.out.println(sol("rushinadh"));
}
}
