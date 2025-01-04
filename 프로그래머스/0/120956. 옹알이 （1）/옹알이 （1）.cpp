#include <string>
#include <vector>

using namespace std;

int solution(vector<string> babbling) {
    int answer = 0;
   
    for(int i = 0; i < babbling.size(); i++) {
        int length = 0;
        bool flag = true;
        
        while(flag) {
            if(length >= babbling[i].size()) break;
            
            if(babbling[i].substr(length, 3) == "aya") length += 3;
            else if(babbling[i].substr(length, 2) == "ye") length += 2;
            else if(babbling[i].substr(length, 3) == "woo") length += 3;
            else if(babbling[i].substr(length, 2) == "ma") length += 2;
            else {
                flag = false;
                break;
            }
            
            if(length == babbling[i].size()) {
                answer++;
                break;   
            }
        }
    }
    
    return answer;
}