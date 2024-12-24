using namespace std;

long long solution(int price, int money, int count)
{
    long long answer = 0;
    long long total = 0;
    
    for(int i = 1; i <= count; i++) {
        total += price * i;
    }
    
    if(money < total) {
        answer = (total - money);
    } else {
        answer = 0;
    }
    
    return answer;
}