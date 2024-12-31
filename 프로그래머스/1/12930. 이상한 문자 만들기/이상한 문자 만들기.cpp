#include <string>
#include <vector>

using namespace std;

int func(char c) 
{        
    return c >= 65 && c <= 90 ? 1 : 0;
}

string solution(string s) {
    string answer = "";
    int x = 0;
    int y;
    
    for(int i = 0; i < s.size(); i++)
    {
        if(s[i] == 32) {
            x = 0;
        } else 
        {
            y = func(s[i]);
            
            if(x % 2 == 0 && y == 0) 
            {
                s[i] -= 32;
            } else if(x % 2 != 0 && y == 1)
            {
                s[i] += 32;
            } 
            
            x++;
        }
    }
    
    answer = s;
    
    return answer;
}