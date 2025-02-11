#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<string> park, vector<string> routes) {
    vector<int> answer;
    int max_x = park[0].size();
    int max_y = park.size();
    
    int cur_x = 0;
    int cur_y = 0;
    
    for(const string& e : park)
    {
        cur_x = e.find("S");
        
        if(cur_x != string::npos)
        {
            break;    
        } 

        cur_y++;
    }
    
    for(const string& e : routes)
    {
        int temp_x = cur_x;
        int temp_y = cur_y;
        
        char direction = e[0];
        int distance = stoi(e.substr(2));
        
        for(int i = 0; i < distance; i++)
        {
            switch(direction)
            {
                case 'N':
                    cur_y -= 1;
                    break;
                case 'S':
                    cur_y += 1;
                    break;
                case 'W':
                    cur_x -= 1;
                    break;
                case 'E':
                    cur_x += 1;
                    break;
                default:
                    break;
            }
            
            if((cur_x > max_x - 1 || cur_y > max_y - 1 || cur_x < 0 || cur_y < 0) || park[cur_y][cur_x] == 'X')
            {
                cur_x = temp_x;
                cur_y = temp_y;
                
                break;
            }
              
        }
    }
    
    answer.emplace_back(cur_y);
    answer.emplace_back(cur_x);
    
    return answer;
}