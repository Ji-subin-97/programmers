#include <string>
#include <vector>
#include <unordered_set>

using namespace std;

string solution(string s, string skip, int index) {
    string answer = "";
    unordered_set<char> skipSet(skip.begin(), skip.end());
    
    for(int i = 0; i < s.length(); i++)
    {
        size_t count = 0;
        char ch = s[i];
        
        while(count < index)
        {
            ch++;
            if(ch > 'z') ch = 'a';
            if(skipSet.find(ch) == skipSet.end())
            {
              count++;  
            }
            
        }
        
        answer += ch;
    }
    
    return answer;
}