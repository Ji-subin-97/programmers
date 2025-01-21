#include <string>
#include <vector>

using namespace std;

int solution(string s) {
    int answer = 0;
    size_t cnt1 = 0;    // 다른경우
    size_t cnt2 = 0;    // 같은경우
    char x = 'A';
    
    for(int i = 0; i < s.length(); i++)
    {
        if(cnt1 == cnt2)
        {
            x = s[i];
            answer++;
        }
        
        if(x == s[i])
        {
            cnt2++;
        }
        else
        {
            cnt1++;
        }
    }
    
    
    return answer;
}