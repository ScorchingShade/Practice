import java.util.Scanner;
import java.util.Arrays;

public class MyClass {
    public static void main(String args[]) {
        
        System.out.println("Enter the number of digits to be sorted:\n");
        int n;
        Scanner scan = new Scanner(System.in);
        
        n=scan.nextInt();
        
        System.out.println("Enter the numbers to be sorted:\n");
        
        int arr[]= new int[n];
        
        for(int i=0; i<n;i++){
            
            arr[i]=scan.nextInt();
            
        }
        
        
        System.out.println("Sorted data is:\n");
        
        
        for(int i=0;i<n-1;i++){
            for(int j =0; j<n-i-1;j++){
                if(arr[j]>arr[j+1])
                    swap(arr[j],arr[j+1]);
            }
        }
        
        

      System.out.println("Sorted data is\n" + Arrays.toString(arr));
    }
    
    static void swap(int i, int j){
        int k=0;
        k=i;
        i=j;
        j=k;
    }
}
