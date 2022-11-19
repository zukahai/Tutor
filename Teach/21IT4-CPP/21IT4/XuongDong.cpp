#include <bits/stdc++.h>

using namespace std;

int main() {
    string s;
    getline(cin, s);

    bool check = false;

    for (int i = 0; i < s.length(); i++)
        if (s[i] == ' ')
            check = true;

    if (check == false || s.length() > 100)
        cout << "N";
    else {
        for (int i = 0; i < s.length(); i++)
        if (s[i] == ' ')
            cout << endl;
        else
            cout << s[i];
    }
}