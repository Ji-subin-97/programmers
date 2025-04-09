class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        quickSort(citations, 0, citations.length - 1);
        
        for(int i = 0; i < citations.length; i++)
        {
            if(citations[i] >= i + 1)
            {
                answer = i + 1;
            }
            else
            {
                break;
            }
        }
        
        return answer;
    }
    
    public void quickSort(int[] arr, int left, int right)
    {
        if (left >= right) return;

        int pivot = arr[right];
        int index = left;

        for (int i = left; i < right; i++) {
            if (arr[i] > pivot) {
                swap(arr, index, i);
                index++;
            }
        }

        swap(arr, index, right);

        quickSort(arr, left, index - 1);
        quickSort(arr, index + 1, right);
    }
    
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}