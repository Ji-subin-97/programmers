#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

vector<int> solution(vector<string> keymap, vector<string> targets) {
    vector<int> answer;
    unordered_map<char, int> tempMap;
    
    for(const string& keymapItem : keymap)
    {
        for(int i = 0; i < keymapItem.length(); i++)
        {
            if(tempMap.find(keymapItem[i]) != tempMap.end() && tempMap[keymapItem[i]] > i + 1)
            {
                tempMap[keymapItem[i]] = i + 1;  
            }
            else
            {
                tempMap.insert(make_pair(keymapItem[i], i + 1));  
            }
            
        }
    }
    
    for(const string& targetItem : targets)
    {
        int result = 0;
        
        for(int i = 0; i < targetItem.length(); i++)
        {
            if(tempMap.find(targetItem[i]) == tempMap.end())
            {
                result = 0;
                break;
            }
            
            result += tempMap[targetItem[i]];  
        }
        
        if(result > 0)
        {
            answer.emplace_back(result);  
        } 
        else
        {
            answer.emplace_back(-1);  
        }
    }
    
    return answer;
}