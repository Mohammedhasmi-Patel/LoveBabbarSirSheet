/*

   => we need to find Max and Min element into the array:
  

  Approach 1 :
    doing sorting(ascending) and return first and last element.

    TC -> O(nlogn) where n is length of array.
    SC -> O(1) as we are not using any extra space.

  Approach 2 :
    Assume that first element is min and traverse the array if we 
    found other min element we will just update min.

    Assume that first element is max and traverse the array if we 
    found other max element we will just update max.

    TC -> O(n) where n is length of array








*/







class Solution {

   // this is bruteforce problem

       public Pair<Long, Long> getMinMaxOptimize(int[] arr) {
        Arrays.sort(arr);
        return new Pair<Long, Long>(arr[0], arr[arr.length - 1]);
       }


    // this is optimize problem
    public Pair<Long, Long> getMinMaxOptimize(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            else if(arr[i]>max){
                max = arr[i];
            }
        }
        
        return new Pair(min,max);
        
    }
}