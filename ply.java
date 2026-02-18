class rushi{
    int bom(){
        return 5;
    }
}
class siva extends rushi{
    int bom(){
        return 8;
    }
}

class nadh extends rushi{
int bom(){
    return 78;
    }
}
public class ply {


public static void main(String[] args){
    rushi hi =new rushi();
    siva hk=new siva();
  nadh hy=new nadh();

    System.out.println(hi.bom()+hk.bom()+hy.bom());
}
}
