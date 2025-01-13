#include <string>
#include <vector>

using namespace std;

int solution(int number, int limit, int power) {
    int answer = 0;
    
    vector<int> numbers;
    for(int i = 1; i <= number; i++)
    {
        int count = 1;
        for(int j = 1; j <= i / 2; j++)
        {
            if(i % j == 0) count++;
        }
        numbers.emplace_back(count);
        
        if(numbers[i - 1] > limit)
        {
            numbers[i - 1] = power;
        }
        answer+= numbers[i - 1];
    }

    return answer;
}