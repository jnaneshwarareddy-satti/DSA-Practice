public class SecondMaxElementArray {
    public static int secondMax(int[] a){
        int max1=0,max2=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if(a[i]>max2) max2=a[i];
        }
 return max2;
        }

    
    public static void main(String[] args) {
        int a[]={1,2,3,5,8,6,4};
        System.out.println("Second largest element is "+secondMax(a));
    }
}