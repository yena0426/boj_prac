#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

#include <stdio.h>

int main(){
	string str;
	int length;
	int j = 0; int i = 0;

	getline(cin, str);

	length = str.size();

	for (int n = 0; n <length-2; n++){
		if (str[n] == 'J' && str[n + 1] == 'O' && str[n + 2] == 'I') j++;
		if (str[n] == 'I' && str[n + 1] == 'O' && str[n + 2] == 'I') i++;
		if (str[n] == ' ') break;
	}

	printf("%d\n%d\n", j, i);
}