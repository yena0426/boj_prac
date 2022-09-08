#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

#include <stdio.h>

int main(){
	string name;
	char ans[101] = { 0, };
	int len;
	int n = 1;

	getline(cin, name);

	len = name.size();

	for (int i = 1; i<len; i++){
		if (name[i] == 45){
			ans[n] = name[i+1];
			n++;
		}
	}
	ans[0] = name[0];
	
	for (int i = 0; i < n; i++){
		printf("%c", ans[i]);
	}
}