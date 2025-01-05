#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int funtion(int x, int y, int z, vector<int>& array) {
    int result = 0;
    vector<int> temp(array.begin() + x - 1, array.begin() + y);

    sort(temp.begin(), temp.end());
    result = temp[z - 1];
    
    return result;
}

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer;
    
    for (vector<int>& item : commands) {
        answer.push_back(funtion(item[0],item[1], item[2], array));
    }
    
    return answer;
}