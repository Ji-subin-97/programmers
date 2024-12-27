#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    char temp;
    int lg;
    
    for(int i = 0; i < s.size() - 1; i++) {
        lg = i;
        
        for(int j = i + 1; j < s.size(); j++) {
            if(s[lg] < s[j]) {
                lg = j; 
            }       
        }
        
        if(i != lg) {
            temp = s[i];
            s[i] = s[lg];
            s[lg] = temp;
        }
    }
    
    answer += s;
    
    return answer;
}