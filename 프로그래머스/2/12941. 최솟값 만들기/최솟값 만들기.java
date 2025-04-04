class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        quickSort(A, 0, A.length - 1, true);
        quickSort(B, 0, B.length - 1, false);
        
        for(int i = 0; i < A.length; i++)
        {
            answer += A[i] * B[i];
        }
        
        return answer;
    }
    
    public void quickSort(int[] arr, int left, int right, boolean flag)
    {
        if(left >= right) return;
        
        int pivotIndex = partition(arr, left, right, flag);
        quickSort(arr, left, pivotIndex - 1, flag);
        quickSort(arr, pivotIndex + 1, right, flag);
    }
    
    public int partition(int[] arr, int left, int right, boolean flag)
    {
        int pivot = arr[right];
        int i = left;
        
        for(int j = left; j < right; j++)
        {
            if(flag)
            {
                if(arr[j] < pivot)
                {
                    swap(arr, i, j);
                    i++;
                } 
            }
            else
            {
                if(arr[j] > pivot)
                {
                    swap(arr, i, j);
                    i++;
                }  
            }
        }
        
        swap(arr, i, right);
        return i;
    }
    
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}