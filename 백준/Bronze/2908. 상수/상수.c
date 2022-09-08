#include <stdio.h>

int main(){
	char num1[3], num2[3];

	scanf("%c%c%c %c%c%c", &num1[0], &num1[1], &num1[2], &num2[0], &num2[1], &num2[2]);

	for (int n = 2; n >= 0; n--){
		if (num1[n] > num2[n]){
			printf("%c%c%c", num1[2], num1[1], num1[0]); break;
		}
		else if (num1[n] < num2[n]){
			printf("%c%c%c", num2[2], num2[1], num2[0]); break;
		}
	}
}