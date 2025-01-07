#include <string>
#include <vector>

using namespace std;

int solution(int a, int b, int n) {
    int answer = 0;
    int temp = 0;
    
    // 
    
    while(1) {    
        if(n >= a) {
            if(n % a != 0) {
                temp += n % a;
            }
            n /= a;
            n *= b;
            answer += n;
        } else if(n + temp >= a) {
            n += temp;
            temp = 0;
        } else {
            break;
        }
    }
    
    return answer;
}