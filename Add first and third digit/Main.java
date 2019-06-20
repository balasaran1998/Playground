#include<stdio.h>
int main()
{
 	int Number, FirstDigit, Count, LastDigit, Sum = 0;
 
  
  	scanf("%d", & Number);
  	
  	Count = log10(Number); 	
  	FirstDigit = Number / pow(10, Count);
  	
  	LastDigit = Number % 10;
  	
  	Sum = FirstDigit + LastDigit;
	    
	printf("%d",Sum);
 
  	return 0;
  
  return 0;
}