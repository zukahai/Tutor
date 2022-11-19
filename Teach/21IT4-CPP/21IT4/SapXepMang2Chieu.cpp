#include <bits/stdc++.h>

using namespace std;

int a[1009][1009];
int b[1000009];

int main() {
    int m, n;
    cin >> m >> n;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cin >> a[i][j];
        }
    }

    // chuyen mang 2 chieu ve mang 1 chieu
    int index = 0;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            b[index] = a[i][j];
            index = index + 1;
        }
    }

    // sap xep mang 1 chieu
    sort(b, b + m * n);

    // for (int i = 0; i < m * n; i++)
    //     cout << b[i] << " ";

    // Dua mang 1 chieu da sap xep ve mang 1 chieu
    index = 0;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            a[i][j] = b[index];
            index = index + 1;
        }
    }

    cout << "Mang sau khi da sap xep" << endl;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cout << a[i][j] << " ";
        }
        cout << endl;
    }
}