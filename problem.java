public class problem {
    static void main(String[] args){
        int[] a={1,3,5};
        for (int i:a){
            System.out.println(i);
        }
        System.out.println(a.length);
        int[] bim={};
        for(int j=a.length-1;j>=0;j--){
            for(int z=0;z<a.length;z++){
                bim[z]=a[j];
                
            }
            }
            for(int q:bim){
                System.out.print(q);
            }

        }
    }
    

