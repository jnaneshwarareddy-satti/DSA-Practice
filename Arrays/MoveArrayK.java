public class MoveArrayK {
   
    public static void reverse(int a[],int start,int end){
         int temp;
        while (start<end){
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6},k=3,n=a.length;
        reverse(a, 0, k-1);
        reverse(a, k, n-1);
        reverse(a, 0, n-1);
    for( int key:a){
        System.out.print(key + " ");
    }
    }
}