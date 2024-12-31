#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    vector<int> vec;
    
    while(n != 0) {
        if(n % 3 != 0) 
        {
            vec.push_back(n % 3);
        } else {
            vec.push_back(0);
        } 
        
        n /= 3;
    }
    
    int x = 1;
    size_t size = vec.size();
    
    for(int i = size - 1; i >= 0; i--)
    {
        answer += x * vec[i]; 
        x *= 3;
    }
    
    
    return answer;
}