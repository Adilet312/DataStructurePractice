import java.util.Arrays;
/**
 * Write a description of class Sorting here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sorting
{
      public static void main(String[] ars){
          int [] arr = {1,2,4,5,7,8,11,13,14};
          /*System.out.println(Arrays.toString(insertionSort(arr)));*/
          System.out.println(Arrays.toString(mergeSort(arr)));
          System.out.println(Arrays.toString(arr));
          
      }
      public static int[] selectionSort(int[] array){
          for(int outIdx = 0; outIdx<array.length-1; outIdx++){
              int minIdx = outIdx;
              for(int inIdx = outIdx +1; inIdx<array.length; inIdx++){
                  if(array[minIdx]>array[inIdx]){
                     minIdx = inIdx;
                  }
              }
              int temp = array[outIdx];
              array[outIdx] = array[minIdx];
              array[minIdx] = temp;
            }
            return array;
      }
      public static int [] insertionSort(int [] array){
          for(int outIdx = 1; outIdx < array.length-1; outIdx++){
              for (int inIdx = 0 ; inIdx < outIdx; inIdx++){
                  if(array[inIdx]>array[inIdx +1]){
                      int temp = array[inIdx +1];
                      array[inIdx + 1] = array[inIdx];
                      array[inIdx] = temp;
                  }
              }
          }
          return array;
      }
      public static int binarySearch(int [] array,int target){
          int leftIdx = 0;
          int rightIdx = array.length -1;
          while(leftIdx <=rightIdx){
              int mid = (leftIdx + rightIdx)/2;
              if(array[mid]==target){
                  return mid;
              }
              else if (array[mid] < target ){
                  leftIdx = mid +1;
              }
              else if(array[mid] > target){
                rightIdx = mid - 1;
               
              }
             
          }
          return -1;
      }
      /*Binary Search iterative and recursive way to find target*/
      public static int binarySearchR (int [] array, int target){
          return binarySearchR(array,target,0,array.length-1);
      }
      private static  int binarySearchR(int [] array, int target, int left, int right){
          int mid = (left + right)/2;
          if(array[mid]==target){
              return mid;
          }
          else if(array[mid] < target){
              return binarySearchR(array,target, mid +1,right);
          }
          else if(array[mid] > target){
              return binarySearchR(array,target,left,mid-1);
          }
          else{
              return -1;
            }
          
      }
      /*Merge Sort*/
      public static int [] mergeSort(int [] array){
          int [] left = copyRange(array,0,array.length/2);
          int [] right = copyRange(array,array.length/2,array.length);
          return mergeSort(array,left,right);
      }
      private static int [] mergeSort(int [] array, int [] left, int [] right){
          int leftIdx = 0;
          int rightIdx = 0;
          for(int idx = 0; idx < array.length; idx++){
              if(leftIdx < left.length || rightIdx >= right.length && left[leftIdx] <= right[rightIdx]){
                  array[idx] = left[leftIdx];
                  leftIdx++;
              }else{
                  array[idx] = right[rightIdx];
                  rightIdx++;
              }
          }
          return array;
      }
      private static int [] copyRange(int [] array,int startIdx, int endIdx){
          int [] newArr = new int [(endIdx - startIdx)];//9-4 = 5
          int index = 0;
          for(int idx = startIdx; idx <endIdx; idx++){ //4,5,6,7,8
              newArr[index] = array[idx];
             index++;
          }
          return newArr;
      }
}
