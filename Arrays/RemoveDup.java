public class RemoveDup {
    public static int remove(int a[]){
        int i=0,j=1;
        while(j<a.length){
            if (a[i]==a[j]){
                j++;
            }
            else{
                i++;
                a[i]=a[j];
            j++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int a[]={1,1,2,2,2,3,3,4,4,4};
        int index=remove(a);
        for (int i = 0; i < index; i++) {
            System.out.println(a[i]+" ");
            
        }
    }
}