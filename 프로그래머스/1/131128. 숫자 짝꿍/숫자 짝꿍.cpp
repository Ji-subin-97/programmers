#include <string>
#include <vector>
#include <queue>
#include <algorithm>

using namespace std;

string solution(string X, string Y) {
    string answer = "";
    priority_queue<int> pq;
    
    sort(X.begin(), X.end());
    sort(Y.begin(), Y.end());

    int index = 0;
    char before;
    
    for(char s : X)
    {  
        if(s != before)
        {
            index = 0;
        } else {
            index++;
        }
        
        if(Y.find(s, index) != string::npos) 
        {
            index = Y.find(s, index);
            pq.push(s);
        }
        
        before = s;
    }
    
    while(!pq.empty())
    {
        answer.push_back(pq.top());
        pq.pop();
    }
    
    if(answer.length() == 0)
    {
        answer += "-1";
    } else if(answer.find('0') == 0)
    {
        answer = "0";
    }
    
    return answer;
}