#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>

int fibo(int n);

int main(){
	int i,j;
	scanf("%d", &i);
	j= fibo(i);
	printf("%d\n",j);
}

int fibo(int n){
	if (n <= 1) return n;
	else return fibo(n - 1) + fibo(n - 2);
}