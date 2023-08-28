
#include <iostream>
//check if the number is greater than 10, if yes then divide the number by 10, it will decrease the digit by one unti you get the number less than 10 which will be the
//only digit and the first digit as well

using namespace std;
void first_digit(int n)
{

    while(n>0)
    {
        n=n/10;
    }
    cout<<n;
}
int main()
{
    int n;
    cout<<"Enter the number ";
    cin>>n;
    first_digit(n);
    return 0;
}
