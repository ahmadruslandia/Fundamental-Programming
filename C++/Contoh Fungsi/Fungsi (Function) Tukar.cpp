#include <iostream>
using namespace std;

void tukar(int& a, int& b) {
	int temp;
	temp = a;
	a = b;
	b = temp;

	cout << "a = " << a << endl;
	cout << "b = " << b << endl;
	
}

int main() {
	int a, b;

	a = 1;
	b = 2;

	tukar(a, b);

}
