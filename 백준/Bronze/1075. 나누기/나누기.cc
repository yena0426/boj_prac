#define _CRT_SECURE_NO_WARNINGS

#include <cstdio>

int main(){
	int m, n, f,i;
	scanf("%d %d", &n, &f);

	m = ((int)(n / 100)) * 100;

	int j = -1;

	for (i = 0; i < 100; i++){
		int a;
		a = (m + i) % f;
		if (a == 0){
			if (i < 10 && j == -1){ j = i; printf("%d%d", 0, j); }
			else if (i >= 10 && j == -1){ j = i; printf("%d", j); }
			else return 0;
		}
	}
	return 0;
}