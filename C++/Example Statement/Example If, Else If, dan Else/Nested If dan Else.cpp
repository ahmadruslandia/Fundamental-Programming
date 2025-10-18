#include <iostream>
#include <string>

using namespace std;

int main()
{
	string data1, data2;
	cout << "Login \n" << endl;
	cout << "username : ";
	cin >> data1;
	cout << "password : ";
	cin >> data2;

	if (data1 == "user1") {
		if (data2 == "psw123") {
			cout << "\nyou succeeded" << endl;
		}
		else {
			cout << "\nwrong password" << endl;
		}
	}
	else {
		cout << "\nwrong username" << endl;
	}

	return 0;
}
