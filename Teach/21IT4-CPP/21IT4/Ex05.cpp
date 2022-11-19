#include <bits/stdc++.h>

using namespace std;

int a[100009];

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
        cin >> a[i];
    
    for (int i = 0; i < n; i++)
        if (a[i] % 2 == 0 && i % 2 == 1)
            cout << a[i] << endl;
}