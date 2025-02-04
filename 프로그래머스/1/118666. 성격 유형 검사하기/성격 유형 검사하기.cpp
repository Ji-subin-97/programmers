#include <string>
#include <vector>
#include <map>

using namespace std;

int score[8] = {0, 3, 2, 1, 0, 1, 2, 3};

string solution(vector<string> survey, vector<int> choices) {
    string answer = "";
    map<char, int> typeMap;
    
    for(int i = 0; i < survey.size(); i++)
    {
        typeMap[survey[i][choices[i]/4]] += score[choices[i]];
    }
    
    answer += typeMap['R'] >= typeMap['T'] ? 'R' : 'T';
    answer += typeMap['C'] >= typeMap['F'] ? 'C' : 'F';
    answer += typeMap['J'] >= typeMap['M'] ? 'J' : 'M';
    answer += typeMap['A'] >= typeMap['N'] ? 'A' : 'N';
    
    return answer;
}