#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<string> name, vector<int> yearning, vector<vector<string>> photo) {
    vector<int> answer;
    int score = 0;
    
    for(auto& vec : photo) {
        for(int i = 0; i < name.size(); i++) {
            auto it = find(vec.begin(), vec.end(), name[i]);
            
            if(it != vec.end()) {
                score += yearning[i];
            }
        }
        
        answer.push_back(score);
        score = 0;
    }
    
    return answer;
}