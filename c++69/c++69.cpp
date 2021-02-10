#include<bits/stdc++.h>
using namespace std;

bool compare(vector<int> aa, vector<int> bb){
	if(aa.size() != bb.size()){
		return false;
	}else{
		for(int i = 0; i < aa.size(); i++){
			if(aa[i] != bb[i]){
				return false;
			}
		}
		return true;
	}
}

vector<int> change(vector<int> aa){
	int first = aa[0];
	aa.erase(aa.begin());
	int index = 0;
	while(first != 0 && index < aa.size()){
		aa[index++]++;
		first--;
	}
	while(first != 0){
		aa.push_back(1);
		first--;
	}
	return aa;
}

int main(){
	int friends = 0, a, b, x;
	cin >> a >> b;
	vector<int> aa, bb;
	for(int i = 0; i < a; i++){
		cin >> x;
		aa.push_back(x);
	}
	for(int i = 0; i < b; i++){
		cin >> x;
		bb.push_back(x);
	}
	while(!(compare(aa, bb))){
		friends++;
		aa = change(aa);
	}
	cout << friends;
}

