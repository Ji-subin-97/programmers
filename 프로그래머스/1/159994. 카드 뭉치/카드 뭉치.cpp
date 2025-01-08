#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(vector<string> cards1, vector<string> cards2, vector<string> goal) {
    string answer = "";
    size_t index1 = 0;
    size_t index2 = 0;
    size_t indexr = 0;
    size_t goalSize = goal.size();
    
    while(goalSize > 0)
    {
        if(goal[indexr] == cards1[index1]) {
            index1++;
            indexr++;
        } else if(goal[indexr] == cards2[index2]) {
            index2++;
            indexr++;
        } else {
            answer = "No";
            break;
        }
        answer = "Yes";
        goalSize--;
    }
    
    return answer;
}