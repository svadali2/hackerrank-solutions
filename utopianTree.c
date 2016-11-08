#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
int cases;

    scanf("%d",&cases);
    for(int i = 0;i<cases;i++) {
        int height = 1;
        int y = 0;
        scanf("%d",&y);
        for(int j = 0;j < y;j++) {
            if(j%2 == 0) height*= 2;
            if(j%2 == 1) height+=1;
        }
        printf("%d\n",height);
    }                                                                                                                     
    return 0;                                                        
}
