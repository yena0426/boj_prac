#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

#include <stdio.h>

int main(){
	string word;
	int len;
	int cnt=0;

	getline(cin, word);
	len = word.size();

	for (int i = 0; i < len; i++){
		if (word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u') cnt++;
	}
	printf("%d\n", cnt);
}