#include <string>
#include <vector>

using namespace std;

string toBinary(int num)
{
    string binary = "";
    while(num > 0)
    {
        binary = to_string(num % 2) + binary;
        num /= 2;
    }
    
    return binary;
}

vector<int> solution(string s) {
    vector<int> answer;
    int count = 0;
    int zeroCount = 0;
    
    while(s.length() > 1)
    {
        int temp = 0;
        int zeroIndex = s.find('0');
        
        if(zeroIndex != string::npos)
        {
            s.erase(s.begin() + zeroIndex);
            zeroCount++;
            
            if(s == "1")
            {
                count++;
            }
        }
        else
        {
            temp = s.length();
            s = toBinary(temp);
            count++;
        }
    }
    
    answer.push_back(count);
    answer.push_back(zeroCount);
    
    return answer;
}