package Sorting;
import java.util.*;
public class BubbleSort {
    public static int[] bubblesort(int num[],int n){
        for(int i=n-1;i>0;i--){
            int flag=0;
            for(int j=0;j<i;j++){
                System.out.println("hello");
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    flag=1;
                }
            }
            if (flag==0){
                break;
            }
        }
        return num;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        nums=bubblesort(nums,n);
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }
    }
}
