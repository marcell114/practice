#include <stdio.h>
int main (void) {
  double szam, osszeg = 0.0;
  int N = 0;

  printf("Adj egy szamot (vege:0) : ");
  scanf("%lg",szam);
  while(szam != 0.0) {
    osszeg += szam;
    N++;
    printf("Adj egy szamot (vege:0) : ");
    scanf("%lg",&szam);
  }
  if(N>0)
    printf("Atlag: %g\n", osszeg/N);
    else printf("NINCS ATLAG.");
    return 0;
}
