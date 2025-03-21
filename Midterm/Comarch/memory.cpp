#include <iostream>

void leakloop(){
    for (int i = 0; i < 10; i++)
        int * ptr = new int(i);
}

int main(){
    leakloop();
    return 0;
}