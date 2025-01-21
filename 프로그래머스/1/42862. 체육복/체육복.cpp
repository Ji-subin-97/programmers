#include <string>
#include <vector>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
    int answer = 0;
    
    vector<int> count(n, 1);
    for(int i = 0; i < lost.size(); i++)
    {
        count[lost[i] - 1] -= 1;
    }
    
    for(int i = 0; i < reserve.size(); i++)
    {
        count[reserve[i] - 1] += 1;
    }
    
    // 1 1 1 1 1
    // 1 0 1 0 1
    // 1 0 2 0 2
    
    // 2 1 0
    
    
    // 1 0 2 0 1
    
    for(int i = 0; i < count.size(); i++)
    {
        if(count[i] > 0)
        {
            answer++;
        } 
        else if(count[i] == 0 && count[i - 1] > 1)
        {
            answer++;
            count[i - 1] -= 1;
        }
        else if(count[i] == 0 && count[i + 1] > 1)
        {
            if(i + 1 == count.size())
            {
                break;
            }
            answer++;
            count[i + 1] -= 1;
        }
    }
    
    return answer;
}