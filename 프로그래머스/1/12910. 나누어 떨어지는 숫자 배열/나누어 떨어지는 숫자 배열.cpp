#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(int x, int y) {
    return x < y;
}

vector<int> solution(vector<int> arr, int divisor) {
    vector<int> answer;
    int answerSize = 0;
    
    for(int item : arr) {
        if(item % divisor == 0) {
            answer.push_back(item);
        }
    }
    
    if(answer.size() == 0) {
        answer.push_back(-1);
        
        return answer;
    }
    
    sort(answer.begin(), answer.end(), compare);
    
    return answer;
}