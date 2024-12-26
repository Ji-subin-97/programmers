#include <string>
#include <vector>

using namespace std;

string solution(string phone_number) {
    string star;
    for(int i = 0; i < phone_number.size() - 4; i++) {
        star.push_back('*');
    }
    
    return phone_number.replace(0, phone_number.size() - 4, star);
}