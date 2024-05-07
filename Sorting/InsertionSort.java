package Sorting;
import java.util.*;
public class InsertionSort {
    public static int[] insertionsort(int num[], int n){
        for(int i=1;i<n;i++){
            //can be done this way but for best case the time complexity will be O(n^2) which we can reduce so while loop is used
          /*for(int j=i; j>0;j--){
                if(num[j]<num[j-1]){
                    int temp=num[j];
                    num[j]=num[j-1];
                    num[j-1]=temp;
                }
            }*/
            int j=i;
            while(j>0 && num[j-1]>num[j]){
                int temp=num[j];
                num[j]=num[j-1];
                num[j-1]=temp;
                j--;
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
        nums=insertionsort(nums,n);
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }
        sc.close();
    }
}
