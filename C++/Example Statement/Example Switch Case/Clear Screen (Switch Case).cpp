#include <iostream>
#include <conio.h>

using namespace std;

int main() {

    int varchc;

    cout << "Menu :\n" << endl;
    cout << "1. First Example             " << endl;
    cout << "2. Second Example            " << endl;
    cout << "3. Third Example             " << endl;
    cout << "4. Fourth Example	        \n" << endl;
    cout << "Enter your Choice : ";
    cin >> varchc;
    switch (varchc)
    {
    case 1: system("cls"); {
        cout << "Example 1st Succeed" << endl;
        break;
    }
    case 2: system("cls"); {
        cout << "Example 2nd Succeed" << endl;
        break;
    }
    case 3: system("cls"); {
        cout << "Example 3rd Succeed" << endl;
        break;
    }
    case 4: system("cls"); {
        cout << "Example 4th Succeed" << endl;
        break;
    }
    default: system("cls"); {
        cout << "Enter your Choice Correctly" << endl;
        break;
    }
    }_getch();

    return 0;

}
