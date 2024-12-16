#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    unsigned int x = 1;
    
    while(n%x != 1) {
        x++;
    }
    
    answer = x;
    
    return answer;
}