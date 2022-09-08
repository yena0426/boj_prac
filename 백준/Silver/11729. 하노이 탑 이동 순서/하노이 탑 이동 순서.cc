#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <cmath>

void hanoi(int n, int start, int end){
	if (n == 1){
		printf("%d %d\n", start, end);
		return;
	}
	int mark;
	for (int i = 1; i <= 3; i++)
		if (i != start && i != end)
			mark = i;

	hanoi(n - 1, start, mark);

	printf("%d %d\n", start, end);

	hanoi(n - 1, mark, end);
	

}

int main(){
	int n,cnt;
	scanf("%d", &n);
	cnt = pow(2, n) - 1;
	printf("%d\n", cnt);
	hanoi(n, 1, 3);
}