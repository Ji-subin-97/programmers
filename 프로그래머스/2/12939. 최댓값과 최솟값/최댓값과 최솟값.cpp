#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string s) {
    string answer = "";
    vector<int> temp;
    
    int start = 0;
    int end = 0;
    
    for(int i = 0; i < s.length(); i++)
    {
        end = s.find(' ', start);
        int num = stoi(s.substr(start, end - start));
        
        temp.push_back(num);
        start = end + 1;
    }
    
    int min = *min_element(temp.begin(), temp.end());
    int max = *max_element(temp.begin(), temp.end());
    
    answer = to_string(min) + " " + to_string(max);
    
    return answer;
}