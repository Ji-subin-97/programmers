#include <string>
#include <vector>

using namespace std;

vector<int> solution(string s) {
    vector<int> answer;
    string temp = "";

    for (int i = 0; i < s.size(); i++) {
        bool flag = true;

        if (temp.size() != 0) {
            for (int j = temp.size() - 1; j >= 0; j--) {
                if (s[i] == temp[j]) {
                    answer.push_back(i - j);
                    flag = false;
                    break;
                }
            }
        }

        temp.push_back(s[i]);

        if (flag) {
            answer.push_back(-1);
        }
    }
    
    return answer;
}