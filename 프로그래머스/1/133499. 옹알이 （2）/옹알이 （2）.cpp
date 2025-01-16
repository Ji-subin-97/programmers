#include <string>
#include <vector>

using namespace std;

int solution(vector<string> babbling) {
    int answer = 0;
    
    for(const string& item : babbling)
    {
        int i = 0;
        int before = 0;
        
        while(1)
        {
            if(item.substr(i, 3) == "aya" && before != 1)
            {
                before = 1;
                i += 3;
            } 
            else if(item.substr(i, 2) == "ye" && before != 2)
            {
                before = 2;
                i += 2;    
            }
            else if(item.substr(i, 3) == "woo" && before != 3)
            {
                before = 3;
                i += 3;    
            }
            else if(item.substr(i, 2) == "ma" && before != 4)
            {
                before = 4;
                i += 2;    
            } 
            else
            {
                break;
            }    
        }
        
        if(i == item.length()) answer++;
    }
    
    return answer;
}