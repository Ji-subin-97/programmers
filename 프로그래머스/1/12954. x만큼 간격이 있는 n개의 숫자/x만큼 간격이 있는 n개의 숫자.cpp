#include <string>
#include <vector>

using namespace std;

vector<long long> solution(int x, int n) {
    vector<long long> answer;
    
    for(int i = 0; i < n; i++) {
        answer.insert(answer.begin() + i, static_cast<long long>(x) * (i + 1));
    }
    
    return answer;
}