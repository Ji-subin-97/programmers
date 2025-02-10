#include <string>
#include <vector>
#include <map>

using namespace std;

vector<string> solution(vector<string> players, vector<string> callings) {
    vector<string> answer;
    map<string, int> rank;

    for(int i = 0; i < players.size(); i++)
    {
        rank.emplace(players[i], i);
    }
    
    for(int i = 0; i < callings.size(); i++)
    {
        string callName = callings[i];
        int rankNum = rank[callName];
        
        string temp = players[rankNum - 1];
        players[rankNum - 1] = players[rankNum];
        players[rankNum] = temp;
        
        rank[callName] = rankNum - 1;
        rank[temp] = rankNum;
    }
    
    answer = players;
    
    return answer;
}