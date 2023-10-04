package Recursion;
//find the first occurence of an element in an array
public class RcrBsics7 {
    public static int firstOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8, 4, 3, 5, 2, 7, 2};
        System.out.println(firstOccurence(arr, 2, 0));

    }
    
}
