#include <string>
#include <vector>

using namespace std;

int solution(string t, string p) {
    int answer = 0;
    int pSize = p.size();
    int count = 0;
    
    for(int i = 0; i < t.size() - pSize + 1; i++) {
        string x = t.substr(i, pSize);
        if(x <= p) {
            count++;
        }
    }
    
    answer = count;
    
    return answer;
}