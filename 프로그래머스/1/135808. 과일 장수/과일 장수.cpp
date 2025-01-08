#include <string>
#include <vector>
#include <queue>

using namespace std;

int solution(int k, int m, vector<int> score) {
    int answer = 0;
    int boxCount = 0;
    size_t scoreSize = score.size(); 

    priority_queue<int> que;
    for(int i = 0; i < score.size(); i++) {
        que.push(score[i]);
    }

    size_t index = 0;
    boxCount = scoreSize / m;
    while(boxCount > 0) { 
        if(index == m) {
            answer += k * m;
            index = 0;
            boxCount--;
        }

        k = que.top();
        que.pop();
        index++;
    }

    return answer;
}