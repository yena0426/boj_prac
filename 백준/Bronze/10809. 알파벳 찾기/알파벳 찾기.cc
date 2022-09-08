#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

#include <stdio.h>

int main(){
	int al[26] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	string word;
	int len;

	getline(cin, word);
	len = word.size();

	for (int i = len-1; i >= 0; i--){
		al[word[i] - 97] = i;
	}

	for (int i = 0; i < 26; i++){
		printf("%d ", al[i]);
	}
}