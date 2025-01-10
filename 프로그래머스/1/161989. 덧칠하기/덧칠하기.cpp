#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(int n, int m, vector<int> section) {
    int answer = 1;
    int temp = section[0];
    
    for(int item : section)
    {
        if(item < temp + m)
        {
            continue;
        } else
        {
            temp = item;
            answer++;
        }
    }
    
    return answer;
}