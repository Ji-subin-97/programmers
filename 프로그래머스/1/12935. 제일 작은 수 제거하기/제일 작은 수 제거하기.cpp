#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(int a, int b) {
    return a > b;
}

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    
    if(arr.size() == 1) {
        arr[0] = -1;
    } else {
        int min = min_element(arr.begin(), arr.end()) - arr.begin();
        arr.erase(arr.begin() + min);
    }
    
    return arr;
}