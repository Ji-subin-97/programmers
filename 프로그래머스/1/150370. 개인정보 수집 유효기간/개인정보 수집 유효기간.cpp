#include <string>
#include <vector>
#include <map>

using namespace std;

int stringToDate(const string& str)
{
    int result = 0;
    
    int year = stoi(str.substr(0, 4));
    int month = stoi(str.substr(5, 2));
    int date = stoi(str.substr(8, 2));
    
    result = year * 12 * 28 + (month - 1) * 28 + date;
    
    return result;
}
    

vector<int> solution(string today, vector<string> terms, vector<string> privacies) {
    vector<int> answer;
    int todayDate = stringToDate(today);
    map<string, int> info;
    
    for(int i = 0; i < privacies.size(); i++)
    {
        string privaciy = privacies[i].substr(privacies[i].find(" ") + 1);
        string date = privacies[i].substr(0, 10);
        
        info.insert({privaciy, stringToDate(date)});
        
        for(const auto& ele : info)
        {
            int date = ele.second;
            for(string s: terms)
            {
                string privaciy = string() + s[0];
                int month = stoi(s.substr(s.find(" ") + 1));

                if(ele.first == privaciy)
                {
                    date += month * 28;
                    break;
                }
            }
            
            if(date <= todayDate)
            {
                answer.emplace_back(i + 1);
            }
        }
        
        info.clear();
    }
    
    return answer;
}