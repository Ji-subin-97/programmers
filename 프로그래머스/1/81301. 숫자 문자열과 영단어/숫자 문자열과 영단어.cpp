#include <string>
#include <vector>

using namespace std;

int solution(string s) {
    int answer = 0;
    vector<string> vec = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    for(int i = 0; i < vec.size(); i++) {
       size_t index = 0;  
        
       while(1) {
           index = s.find(vec[i], index);
           
           if(index != string::npos) {
               s.replace(index, vec[i].length(), to_string(i));
           } else {
               break;
           }
       }
    }
    
    answer = stoi(s);
    
    return answer;
}