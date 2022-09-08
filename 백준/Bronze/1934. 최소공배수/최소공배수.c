#include <stdio.h>

int main()
{
	int t;
	int number[1000][2];
	int n;

	scanf("%d\n", &t);

	for (n = 0; n < t; n++)
	{
		int x, y;

		scanf("%d %d\n", &x, &y);
		number[n][0] = x;
		number[n][1] = y;
	}

	for (n = 0; n < t; n++)
	{
		gongbs(number[n][0], number[n][1]);
	}

	return 0;
}

int gongbs(int a, int b)
{
	int m, z;

	for (m = 1; m <= a; m++)
	{
		if (a%m == 0 && b%m == 0)
		{
			z = a*b / m;
		}
	}
	printf("%d\n", z);

}