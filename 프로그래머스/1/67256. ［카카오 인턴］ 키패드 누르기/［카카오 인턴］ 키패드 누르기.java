class Solution {
    
    int[] left = {3, 0};
    int[] right = {3, 2};
    
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        
        int[][] keypad = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {-1, 0, -1}
        };

        for(int number : numbers)
        {
            if(number % 3 == 1)
            {
                sb.append("L");
                findCoordinate(keypad, number, "left", true);
            }
            else if(number % 3 == 0 && number != 0)
            {
                sb.append("R");
                findCoordinate(keypad, number, "right", true);
            }
            else if(number == 0 || number % 3 == 2)
            {
                String clickHand = findCloserHand(keypad, number, hand);
                sb.append(clickHand);
            }
        }
        
        String answer = sb.toString();
        
        return answer;
    }
    
    public int[] findCoordinate(int[][] keypad, int number, String hand, boolean updateFlag)
    {
        for(int i = 0; i < keypad.length; i++)
        {
            for(int j = 0; j < keypad[i].length; j++)
            {
                if(keypad[i][j] == number)
                {
                    if(hand.equals("left") && updateFlag)
                    {
                        left[0] = i;
                        left[1] = j;
                        
                        return left;
                    }
                    else if(hand.equals("right") && updateFlag)
                    {
                        right[0] = i;
                        right[1] = j;
                        
                        return right;
                    }
                    else
                    {
                        return new int[] {i, j};
                    }
                }
            }
        }
        
        return new int[] {-1, -1};
    }
    
    public String findCloserHand(int[][] keypad, int number, String hand)
    {
        int[] target = findCoordinate(keypad, number, hand, false);
        
        int leftDistance = Math.abs(left[0] - target[0]) + Math.abs(left[1] - target[1]);
        int rightDistance = Math.abs(right[0] - target[0]) + Math.abs(right[1] - target[1]);
        
        if(leftDistance > rightDistance)
        {
            right = target;
            return "R";
        }
        else if(leftDistance < rightDistance)
        {
            left = target;
            return "L";
        }
        else
        {
            if(hand.equals("right"))
            {
                right = target;
                return "R";
            }
            else
            {
                left = target;
                return "L"; 
            } 
        }
    }
}