#include<stdio.h>
int main()
{
int Number, LastDigit;
 
  	
  	scanf("%d", & Number);
  	
  	LastDigit = (Number/10) % 10;
  
  	printf("%d",LastDigit);
 
  	
  return 0;
}