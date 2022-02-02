#include <bits/stdc++.h>

using namespace std;

int a[300009], c[300009];

int countK(int L, int R) {
    return c[R] - c[L - 1];
}

int searchL(int R) {
    int ans = R;
    int l = 1, r = R;
    while (l <= r) {
        int m = (l + r) / 2;
        if (countK(m, R) <= 1) {
            ans = m;
            r = m - 1;
        } else {
            l = m + 1;
        }
    } 
    return ans;
}

int main() {
    int ans = 0;
    int n, k;
    cin >> n >> k;
    c[0] = 0;
    for (int i = 1; i <= n; i++)
        cin >> a[i];
    for (int i = 1; i <= n; i++)
        c[i] =  c[i - 1] + (a[i] % k == 0);
    for (int R = 1; R <= n; R++) {
        int L = searchL(R);
        ans += R - L + 1;
    }
    cout << ans;
}  
