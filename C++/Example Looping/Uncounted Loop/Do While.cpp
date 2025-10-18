#include <iostream>
using namespace std;

int main(){
	
	char vartry = 'y';
	int i = 0;
	
	do {
	cout << " " << endl;
	cout << "Enter y for Example" << endl;
	cout << " " << endl;
	cout << "Enter : ";
	cin >> vartry;
	i++;
	}while(vartry == 'y');
	
	cout << " " << endl;
	cout << "Done" << endl;

	return 0;
}
