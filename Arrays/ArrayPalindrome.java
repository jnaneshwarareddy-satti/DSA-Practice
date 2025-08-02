public class ArrayPalindrome {
    public static boolean isPalindrome(int a[]){
        int i=0,j=a.length-1;
        boolean flag=true;
        while (i<j){
            if(a[i++]!=a[j--]){
             flag= false;
            }
            }
 return flag;
        
    }
    public static void main(String[] args) {
        int a[]={10,5,10};
        if(isPalindrome(a)){
            System.out.println("the given array is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

        }
}