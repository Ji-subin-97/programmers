using namespace std;

long long solution(int price, int money, int count)
{
    long long answer = 0;
    long long total = 1LL * price * count * (count + 1) / 2;
    
    if(money < total) {
        answer = (total - money);
    } else {
        answer = 0;
    }
    
    return answer;
}