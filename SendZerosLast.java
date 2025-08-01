public class SendZerosLast {
    public static void sendZeroes(int a[]){
        int j=0,temp;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==0){
                j=i;
                break;
            }
        }
       
        for (int i = j+1; i < a.length; i++) {
            if (a[i]!=0){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                  j++;
            }
          
            
        }
    }
    public static void print(int a[]){
        for(int key:a)
            System.out.print(key+" ");
        
    }
    public static void main(String[] args) {
        int a[]={1,0,2,3,4,0,0,5,0,6};
        sendZeroes(a);
        print(a);
    }
}