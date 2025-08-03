import java.util.HashMap;
public class FrequencyArray {
    public static void print(HashMap<Integer,Integer> map){
        for (int key:map.keySet()){
            System.out.print("Element : "+key+" ");
            System.out.println("Frequency: "+ map.get(key));
        }

    }
    public static void main(String args[]){
        int a[]={1,1,2,2,3,3,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i]))
             {
                map.put(a[i], map.get(a[i])+1);
             }
             else{
                map.put(a[i],1);
             }
        }
        print(map);

    }
}