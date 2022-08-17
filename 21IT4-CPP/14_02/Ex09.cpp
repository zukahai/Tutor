#include <bits/stdc++.h>

using namespace std;

int main() {
    string s;
    getline(cin, s);
    for (int i = 0; i < s.length(); i++) {
        if (s[i]>='a' && s[i]<='z')
            s[i] -= 32;
    }
    cout << s;
}