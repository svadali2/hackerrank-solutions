#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    int spacesize = 0;
    int hexsize = 0;
    scanf("%d",&spacesize);
    int temp = spacesize;
    
    while (spacesize>=0) {
        int i=0,j=0;
    while (i <spacesize-1) {
        printf(" ");
        i++;
    } 
    while (j < hexsize) {
        printf("#");
        j++;
    }
    printf("#\n");
    hexsize++;
    spacesize--;
    if (hexsize == temp) return 0;
    }
    
}
