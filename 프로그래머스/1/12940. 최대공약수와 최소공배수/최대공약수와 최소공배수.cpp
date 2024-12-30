#include <string>
#include <vector>

using namespace std;

int gcd(int n, int m) {
    int x;
    
    while(n % m != 0) {
        x = n % m;
        n = m;
        m = x;
    }
    
    return m;
}

vector<int> solution(int n, int m) {
    vector<int> answer;

    answer.push_back(gcd(n, m));
    answer.push_back((n * m) / gcd(n, m));
    
    return answer;
}