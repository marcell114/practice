#include <stdio.h>
#define _USE_MATH_DEFINES // a VC++-nak kell
#include <math.h>

/*bekeri a felhasznalotol egy ketdimenzios valos erteku vektor koordinatait, valamint egy szoget fokban,
es kiirja a kepernyore annak a vektornak a koordinatait, amely az eredeti vektor adott szoggel torteno 
elforgatasanak eredmenye*/

int main(void) {
    double xregi,yregi,xuj,yuj,alfa;

    printf("x="); scanf("%lg",&xregi);
    printf("Y="); scanf("%lg",&yregi);
    printf("alfa="); scanf("%lg",&alfa);

    alfa = alfa * M_PI / 180.0;

    xuj = xregi * cos(alfa) - yregi * sin(alfa);
    yuj = yregi * sin(alfa) + yregi * cos(alfa);
    printf("\nxuj=%g\nyuj=%g\n",xuj,yuj);
    return 0;
}