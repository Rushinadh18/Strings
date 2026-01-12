public class fvk {
    static void main(String[] args){
        int[][] bim={{1,2,3},{4,5,6}};
        System.out.println(bim[1][2]);
        int[][] fo=new int[2][3];
        int index=0;

            for(int k=0;k<2;k++){
                for(int j=0;j<=2;j++)
            fo[k][j]=bim[k][j];
        
            
            }
            for(int[] k:fo){
                for (int m:k){
                    System.out.println(m);
                }
                
            }


    }
    
}

