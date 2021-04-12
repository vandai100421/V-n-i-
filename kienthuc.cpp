#include<iostream>

using namespace std;

int main() {
	int a = 15;
	int b = 27;
	cout << "a AND b = " << (a & b) << endl;    // chi dung khi ca 2 cung dung
	cout << "a OR b = " << (a | b) << endl;     //   chi sai khi ca 2 cung sai
	cout << "a XOR b = " << (a ^ b) << endl;    //   dung khi 1 trong 2 dung
	cout << "~a = " << (~a) << endl;            //    phu dinh
	cout << "a << 2 = " << (a << 2) << endl;     // dich chuyen sang ben trai 
	cout << "a >> 2 = " << (a >> 2) << endl;     // dich chuyen sang ben phai 
	cout << " ~ -2 = " << ~-2  << endl;
	cout << " ~ 1 = " << ~1  << endl;
	cout << "a & 1 = " << (a & 1);  
	return 0;
}
