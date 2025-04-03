import java.util.*;

class Solution {
    public long solution(long n) {
        char[] charArr = String.valueOf(n).toCharArray();
        
        quickSort(charArr, 0, charArr.length - 1);
        
        return Long.parseLong(new String(charArr));
    }
    
    public void quickSort(char[] arr, int left, int right)
    {
        if(left >= right) return;
        
        int pivot = partition(arr, left, right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }
    
    public int partition(char[] arr, int left, int right)
    {
        char pivot = arr[right];
        int i = left - 1;
        
        for(int j = left; j < right; j++)
        {
            if(arr[j] > pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        
        swap(arr, i + 1, right);
        return i + 1;
    }
    
    public void swap(char[] arr, int i, int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}