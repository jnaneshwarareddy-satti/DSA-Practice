public class ReverseArray {
    public static void reverseArray(int a[]){
        int start=0,end=a.length-1,temp;
        while(start<end){
            temp=a[start];
            a[start++]=a[end];
            a[end--]=temp;
            }
    }
    public static void print(int a[]){
        for (int key:a){
            System.err.print(key+" ");
        }

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        reverseArray(a);
        print(a);

    }
}