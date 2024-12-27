#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    int strSize = s.size();
    
    if(strSize % 2 != 0) {
        answer = s[strSize / 2];
    } else {
        answer = string(1, s[strSize / 2 - 1]) + string(1, s[strSize / 2]);
    }
    
    return answer;
}