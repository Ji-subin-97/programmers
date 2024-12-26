#include <string>
#include <vector>
#include <sstream>
#include <iomanip>

using namespace std;

int timeSeconds(string timeStr);
void function1(const int& video_len_sec, int& pos_sec, const int op_start_sec, const int op_end_sec, const vector<string>& commands, size_t index);

string solution(string video_len, string pos, string op_start, string op_end, vector<string> commands) {
    string answer = "";
    string minStr, secStr;
    stringstream ssm;
    int min, sec;
    int video_len_sec = timeSeconds(video_len);
    int pos_sec = timeSeconds(pos);
    int op_start_sec = timeSeconds(op_start);
    int op_end_sec = timeSeconds(op_end);
    
    function1(video_len_sec, pos_sec, op_start_sec, op_end_sec, commands, 0);
    
    min = pos_sec / 60;
    sec = pos_sec % 60;
    
    ssm << setw(2) << setfill('0') << min;
    minStr = ssm.str();
    
    ssm.clear();
    ssm.str("");
    
    ssm << setw(2) << setfill('0') << sec;
    secStr = ssm.str();
    
    answer = minStr + ":" + secStr;
    
    return answer;
}

int timeSeconds(string timeStr) {
    stringstream ss;
    int min, sec;
    
    string minStr = timeStr.substr(0, 2);
    string secStr = timeStr.substr(3, 2);
    
    ss << minStr;
    ss >> min;
    
    ss.clear();
    ss.str("");
    
    ss << secStr;
    ss >> sec;
    
    return min * 60 + sec;
}

void function1(const int& video_len_sec, int& pos_sec, const int op_start_sec, const int op_end_sec, const vector<string>& commands, size_t index = 0) {
    if (index == commands.size()) {
        return;
    }

    if (pos_sec >= op_start_sec && pos_sec <= op_end_sec) {
        pos_sec = op_end_sec;
    }

    if (commands[index] == "next") {
        pos_sec += 10;
    } else {
        pos_sec -= 10;
    }
    
    if(pos_sec < 10) {
        pos_sec = 0;
    }
    
    if(video_len_sec - pos_sec < 10) {
        pos_sec = video_len_sec;
    }
    
    function1(video_len_sec, pos_sec, op_start_sec, op_end_sec, commands, index + 1);
    
    if (pos_sec >= op_start_sec && pos_sec <= op_end_sec) {
        pos_sec = op_end_sec;
    }
    

}