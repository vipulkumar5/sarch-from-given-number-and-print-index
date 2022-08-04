import java.util.*;

public class Arrays{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value of size: ");
        int size=sc.nextInt();
        int[]arr=new int[size];
        
        for(int i=0;i<size;i++){
           // ("Enter a value of input number  ");
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter a value of x  :");
        int x=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("x found of index :"+i);
            }
        }
    }
}