#include <stdio.h>
#include <math.h>

int main(void) {
    double a,b,c,diszkr,x1,x2;

    printf("masodfoku egyenlet gyokeinek" "szamitasa.\n\na = ");
    scanf("%lg", &a);
    printf("b = ");
    scanf("%lg", &b);
    printf("c = ");
    scanf("%lg", &c);

    diszkr = b*b - 4*a*c;

    if(diszkr >= 0.0) {
         x1 = (-b + sqrt(diszkr) / (2 * a));
         x2 = (-b - sqrt(diszkr) / (2 * a));
         printf("\nA gyokok:\n\n" "x1 = %g\nx2 = %g\n", x1,x2);
    }else{
        printf("Az egyenletnek nincsenek" "valos gyokei.\n");
    }
    return 0;
    }
