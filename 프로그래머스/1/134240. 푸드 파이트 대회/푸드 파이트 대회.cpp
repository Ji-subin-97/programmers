#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(int a, int b) {
    return a > b;
}

string solution(vector<int> food) {
    string answer = "";
    
    for(int i = 1; i < food.size(); i++) {
        for(int j = 0; j < food[i] / 2; j++) {
            answer += to_string(i);
        }
    }
    
    string temp = "";
    temp += answer;
    sort(answer.begin(), answer.end(), compare);
    
    temp += "0";
    temp += answer;
    
    return temp;
}