#include <string>
#include <vector>

using namespace std;

int solution(vector<int> ingredient) {
    int answer = 0;
    vector<int> hambuger(1);
    
    for(int item : ingredient)
    {
        if(hambuger.back() == 1 && item == 2)
        {
            hambuger.back() = 12;
        }
        else if(hambuger.back() == 12 && item == 3)
        {
            hambuger.back() = 123;
        }
        else if(hambuger.back() == 123 && item == 1)
        {
            answer++;
            hambuger.pop_back();
        }
        else
        {       
            hambuger.emplace_back(item); 
        }
    }
    
    return answer;
}