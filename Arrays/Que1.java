/*

  Reverse the Array:
    Approach 1 : we will take temp array and store the value from last index.

    that is 
       input arr =  [1,2,3,4,5] initialize, i = arr.length-1

       output => array create and fill  all the value from arr[i] till i>=0 

       Time Complexity : O(n)
       Space Complexity : O(n)



    Approach 2:
    we will use two pointer one at the start and one at the end of the array and swap
    we will do until our start cross end at that time our array will completely reverse



*/


class Solution {

    public void bruteForce(int arr[]){
      int [] temp = new int[arr.length];

      int i = arr.length-1;
      int index = 0;

      while(i>=0){
        temp[index] = arr[i];
        index++;
        i++;
      }

      // copying temp value into array value 

      for(int j=0;j<arr.length;j++){
        arr[i] = temp[i];
      }
    }
    public void reverseArrayOptimize(int arr[]) {
        // code here
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }
}