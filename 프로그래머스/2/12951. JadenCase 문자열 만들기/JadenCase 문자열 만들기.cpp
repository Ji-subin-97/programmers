#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    bool isEmpty = true;
    
    for(int i = 0; i < s.length(); i++)
    {
        if(isEmpty && s[i] >= 97 && s[i] <= 122)
        {
            s[i] -= 32;          
        }
        
        if(!isEmpty && s[i] >= 65 && s[i] <= 90)
        {
            s[i] += 32;
        }
        
        if(s[i] == ' ')
        {
            isEmpty = true;
            continue;
        }
        
        isEmpty = false;
    }
    
    answer = s;
    
    return answer;
}