#include <bits/stdc++.h>

using namespace std;

int main() {
    long long n;
    cin >> n;
    // n = 123
    int sum = 0;

    while (n > 0) {
        int d = n % 10;
        sum = sum + d;
        n = n / 10;
    }

    cout << sum;
}