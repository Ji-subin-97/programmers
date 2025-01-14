#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int rankReturn(int count);

vector<int> solution(vector<int> lottos, vector<int> win_nums) {
    vector<int> answer;
    
    int count = 0;
    // 최고순위
    for(int item : lottos)
    {
        auto it = find(win_nums.begin(), win_nums.end(), item);
        if(it != win_nums.end() || item == 0)
        {
            count++;
        }
    }
    answer.emplace_back(rankReturn(count));
    count = 0;
    
    // 최저순위
    for(int item : lottos)
    {
        auto it = find(win_nums.begin(), win_nums.end(), item);
        if(it != win_nums.end())
        {
            count++;
        }
    }
    answer.emplace_back(rankReturn(count));
    
    return answer;
}

int rankReturn(int count)
{
    int rank = 6;
    
    switch(count)
    {
        case 2:
            rank = 5;
            break;
        case 3:
            rank = 4;
            break;
        case 4:
            rank = 3;
            break;
        case 5:
            rank = 2;
            break;
        case 6:
            rank = 1;
            break;
        default:
            break;
    }
    
    return rank;
}