#include<bits/stdc++.h>

using namespace std;
int main()
{
	int n, n1, sum = 0, count = 0;
	cin >> n;
	while(n != 0){
		count++;
		n1 = n;
		sum = 0;
		while(n1 != 0){
			sum += n1 % 10;
			n1 /= 10;
		}
		n -= sum;
	}
	cout << count << endl;
	return 0;
}
