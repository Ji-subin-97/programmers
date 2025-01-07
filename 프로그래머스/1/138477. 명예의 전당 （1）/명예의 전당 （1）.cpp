#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(int a, int b) {
    return a > b;
}

vector<int> solution(int k, vector<int> score) {
    vector<int> answer;
    vector<int> vec;
    int result = 0;
    
    for(int& s : score) {
        vec.emplace_back(s);
        if(k >= vec.size()) {
            result = *min_element(vec.begin(), vec.end());
        } else {
            sort(vec.begin(), vec.end(), compare);
            result = vec[k - 1];
        }
        
        answer.push_back(result);
    }
    
    return answer;
}