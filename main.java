import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr1[]={1,2,5};
		int arr2[]={3,7,9,8};
		int index=0;
		int merged[]=new int [arr1.length+arr2.length];
		for (int i=0;i<arr1.length;i++){
		    merged[index++]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
		    merged[index++]=arr2[i];
		}
		for (int i=0;i<merged.length-1;i++){
		    for(int j=i+1;j<merged.length;j++){
		        if(merged[i]>merged[j]){
		            int temp=merged[i];
		            merged[i]=merged[j];
		            merged[j]=temp;
		        }
		    }
		}
		for(int num:merged){
		    System.out.print(num+" ");
		}
	}
}
