public class MaximumElementArray {
    public static int maxElement(int a[]){
        int max=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={1,2,5,3,7,8};
        System.out.println("The maximum element is "+maxElement(a));
    }
}