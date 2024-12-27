#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = false;
    int strSize = s.size();
    
    if(strSize == 4 || strSize == 6) {
        for(int i = 0; i < strSize; i++) {
            answer = static_cast<int>(s[i]) >= 48 && static_cast<int>(s[i]) <= 57 ? true : false;
            
            if(!answer) break;
        }
    }
     
    return answer;
}