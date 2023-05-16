#include <stdio.h>

int main(void){
    int A,B;
//forditott szamok kiirasa while ciklussal
   /*A=1;
    while(A<10){
        B=0;
        while(B<10){
            printf("%d ", A*100+B*10+A);
            B++;
        }
        A++;
    }
    */ 
//ugyan ez csak for ciklussal
    for(A=1; A<10; A++){
        for(B=1; B<10; B++){
            printf("%d ",A*100+B*10+A);
        }
    }
    return 0;
}