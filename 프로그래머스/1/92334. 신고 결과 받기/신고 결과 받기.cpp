#include <string>
#include <vector>
#include <unordered_map>
#include <algorithm>

using namespace std;

vector<int> solution(vector<string> id_list, vector<string> report, int k) {
    vector<int> answer;
    unordered_map<string, vector<string>> report_list;
    unordered_map<string, int> mail;
    
    for(const string& e : report)
    {
        size_t pos = e.find(' ');
        
        string user_id = e.substr(0, pos);
        string report_id = e.substr(pos + 1);
        
        if(report_list.find(report_id) != report_list.end())
        {
            vector<string>& userList = report_list[report_id];
            if(find(userList.begin(), userList.end(), user_id) == userList.end())
            {
                userList.push_back(user_id);
            }
        }
        else
        {
            vector<string> userList;
            userList.push_back(user_id);
            
            report_list.insert({report_id, userList});
        }
        
    }
    
    for(const auto& [key, value] : report_list)
    {
        if(value.size() >= k)
        {
            for(const string& user : value)
            {
                mail[user]++;
            }
        }
    }
    
    for(const string& id : id_list)
    {
        answer.push_back(mail[id]);
    }
    
    return answer;
}