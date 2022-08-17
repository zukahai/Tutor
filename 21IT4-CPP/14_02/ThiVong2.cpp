#include <iostream>
#include <cmath>
using namespace std;

int main() {
	int n,k;
	cin>>n>>k;
	
	int a[n];
	
	for (int i =0;i<n;i++){
		cin >>a[i];
	}
	
	for(int i =0;i<n;i++){
		for(int j = i+1 ;j<n;j++){
			if(a[i] < a[j]){
				swap(a[i],a[j]);
			}
		}
	}	
	int dem =0;
	int hang=0;
	int t=0;
	for(int i =0;i<n;i++){
		
		if(a[i]!=0){
			t=t+a[i];
			dem++;
			hang++;
		}
			
		if(hang >= k){
			break;
		}
	}
	if(t==0) cout<<"0";
	else
	cout <<dem;
}