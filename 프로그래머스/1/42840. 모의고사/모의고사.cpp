#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    
    int num1[5] = {1, 2, 3, 4, 5};
    int num2[8] = {2, 1, 2, 3, 2, 4, 2, 5};
    int num3[10] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    vector<int> scores(3, 0);
    
    for(int i = 0; i < answers.size(); i++) {
        if(answers[i] == num1[i % 5]) scores[0]++;
        if(answers[i] == num2[i % 8]) scores[1]++;
        if(answers[i] == num3[i % 10]) scores[2]++;
    }
    
    int max = *max_element(scores.begin(), scores.end());
    
    for(int i = 0; i < scores.size(); i++) {
        if(max == scores[i]) {
            answer.emplace_back(i + 1);
        }
    }
    
    return answer;
}