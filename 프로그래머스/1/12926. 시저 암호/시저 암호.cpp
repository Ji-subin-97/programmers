#include <string>
#include <vector>

using namespace std;

string solution(string s, int n) {
    string answer = "";
    int minA = 65;
    int maxA = 90;
    int mina = 97;
    int maxa = 122;
    
    for(int i = 0; i < s.size(); i++) {
        if(s[i] == 32)
            continue;     
        if(s[i] >= minA && s[i] <= maxA) {
            if(s[i] + n > maxA) {
                s[i] = minA + (s[i] + n - (maxA + 1));
            } else {
                s[i] += n;
            } 
        } else {
            if(s[i] + n > maxa) {
                s[i] = mina + (s[i] + n - (maxa + 1));
            } else {
                s[i] += n;
            } 
        }
    }
    
    answer = s;
    
    return answer;
}