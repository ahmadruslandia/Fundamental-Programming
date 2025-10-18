#include <iostream>
using namespace std;

void addition(int a, int b) {
	cout << "--------- +" << endl;
	cout << "Result : " << a + b << endl;
}

void subtraction(int a, int b) {
	cout << "--------- -" << endl;
	cout << "Result : " << a - b << endl;
}

void multiplication(int a, int b) {
	cout << "--------- *" << endl;
	cout << "Result : " << a * b << endl;
}

void division(int a, int b) {
	cout << "--------- :" << endl;
	cout << "Result : " << a / b << endl;
}

int main() {
	int a, b;
	int varchc;

	cout << "Menu\n" << endl;
	cout << "1. Addition " << endl;
	cout << "2. Subtraction " << endl;
	cout << "3. Multiplication" << endl;
	cout << "4. Division \n" << endl;
	cout << "Enter : ";
	cin >> varchc;


	if (varchc == 1) {
		cout << "\nPlease Enter Number \n" << endl;
		cout << "Number : ";
		cin >> a;
		cout << "Number : ";
		cin >> b;
		addition(a, b);
	}
	else if (varchc == 2) {
		cout << "\nPlease Enter Number \n" << endl;
		cout << "Number : ";
		cin >> a;
		cout << "Number : ";
		cin >> b;
		subtraction(a, b);
	}
	else if (varchc == 3) {
		cout << "\nPlease Enter Number \n" << endl;
		cout << "Number : ";
		cin >> a;
		cout << "Number : ";
		cin >> b;
		multiplication(a, b);
	}
	else if (varchc == 4) {
		cout << "\nPlease Enter Number \n" << endl;
		cout << "Number : ";
		cin >> a;
		cout << "Number : ";
		cin >> b;
		division(a, b);
	}
	else {
		cout << "Enter Your Choice (1..4)" << endl;
	}

	return 0;

}
