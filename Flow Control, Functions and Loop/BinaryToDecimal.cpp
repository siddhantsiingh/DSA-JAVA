#include <iostream>

using namespace std;
int binaryToDecimal(int n)
{
    int val=0;
    int lastDigit=0;
    int base=1;
    while(n>0)
    {
        lastDigit=n%10;
        val= val + (lastDigit*base);
        n= n/10;
        base= base*2;
    }
    return val;
}


int main()
{
    int n;
    cout<<"Enter a  number ";
    cin>>n;
    cout<<binaryToDecimal(n);
    return 0;
}
