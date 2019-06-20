#include <stdio.h>
int main()
{
    int number,on,remainder, result = 0;
    scanf("%d", &number);
    on=number;
    while (on != 0)
    {
        remainder = on%10;
        result += remainder*remainder*remainder;
        on /= 10;
    }
    if(result == number)
        printf("Armstrong Number",number);
    else
        printf("Not an Armstrong Number",number);

    return 0;
}