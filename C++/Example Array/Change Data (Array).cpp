#include <iostream>
#include <string>

using namespace std;

int main()
{

	char varlttr[10] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
	varlttr[1] = 'x';
	varlttr[9] = 'z';
	
	cout << "Letter : " << varlttr[1] << endl;
	cout << "Letter : " << varlttr[9] << endl;

}
