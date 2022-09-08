#include <stdio.h>

int func(int n, int k){
	if (n == k || k == 0) return 1;
	else return func(n - 1, k) + func(n - 1, k - 1);
}

int main(){
	int n, k;
	int ans;
	scanf("%d %d", &n, &k);
	ans = func(n, k);
	printf("%d\n", ans);
}