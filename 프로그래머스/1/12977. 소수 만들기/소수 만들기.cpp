#include <vector>
#include <iostream>
using namespace std;

bool function(int num) {
    if(num == 0 || num == 1) return false;
    for(int i = 2; i < num / 2; i++) {
        if(num % i == 0) return false;
    }
    return true;
}

int solution(vector<int> nums) {
    int answer = 0;
    int num = 0;
    
    for(int i = 0; i < nums.size(); i++) {
        for(int j = i + 1; j < nums.size(); j++) {
            for(int k = j + 1; k < nums.size(); k ++) {
                num = nums[i] + nums[j] + nums[k];
                if(function(num)) {
                    answer++;
                }
            }
        }
    }
    
    return answer;
}