#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("a is the longest side of the triangle\n");
    int a;
    int b;
    int c;
    printf("enter sides of the triangle");
    scanf("%d%d%d",&a,&b,&c);



      if(a==b&&b==c){
        printf("the triangle is equilateral");
      }else if(a==b&&a!=c || a==c&a!=b || b==c&&b!=a || b==a&&b!=c || c==a&&c!=b || c==b&&c!=a ){
      printf("the triangle is isoseles");

      }else if(a!=b&&b!=c){
              if((a*a)==((b*b)+(c*c))){
      printf("the triangle is right angled");
      }else{

      printf("the triangle is scalene");
      }
      }

    return 0;
}
