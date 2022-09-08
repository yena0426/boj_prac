#define _CRT_SECURE_NO_WARNINGS

#include <iostream>
#include <string>
using namespace std;

#include <cstdio>

int main(){
	string arr;
	int n;
	getline(cin, arr);
	n = arr.size();

	int temp;
	for (int i = 0; i < n-1; i++){
		for (int j = i + 1; j < n; j++){
			if (arr[i]<arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;	
		}}
	}
	for (int i = 0; i < n; i++){
	printf("%c", arr[i]);}
	return 0;
}