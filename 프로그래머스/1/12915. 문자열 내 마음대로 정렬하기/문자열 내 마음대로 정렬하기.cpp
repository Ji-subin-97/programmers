#include <string>
#include <vector>

using namespace std;

vector<string> solution(vector<string> strings, int n) {
    vector<string> answer;
    string temp = "";

    for (int i = 0; i < strings.size() - 1; i++) {
        for (int j = 0; j < strings.size() - i - 1; j++) {
            if(strings[j][n] == strings[j + 1][n]) {
                if(strings[j] > strings[j + 1]) {
                    temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
            
            if (strings[j][n] > strings[j + 1][n]) {
                temp = strings[j];
                strings[j] = strings[j + 1];
                strings[j + 1] = temp;
            }
        }
    }
    
    answer = strings;
    
    return answer;
}