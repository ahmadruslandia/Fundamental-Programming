#include <iostream>

using namespace std;

int main()
{
	int pil;
	cout << "Menu :\n" << endl;
	cout << "Enter Number : 1 for Example If" << endl;
	cout << "Enter Number : 2 for Example Else If" << endl;
	cout << "Enter Number other 1 and 2 for Example Else\n" << endl;
	cout << "Please Enter Number : ";
	cin >> pil;

	if (pil == 1) {
		cout << "\nExample If" << endl;
	}
	else if (pil == 2) {
		cout << "\nExample Else If" << endl;
	}
	else {
		cout << "\nExample Else" << endl;
	}

	return 0;
}
