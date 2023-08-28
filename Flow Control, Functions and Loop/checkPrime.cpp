#include <iostream>

using namespace std;
void checkPrime(int n)
{
    int i;
    if(n == 0 || n == 1)
    {
        cout<<"Neither a prime nor a composite";
    }
    else
    {
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                cout<<"Not a prime";
                break;
            }
            
        }
        if(i==n)
        {
            cout<<"Prime No.";
        }
    
    }
}


int main()
{
    int n;
    cout<<"Enter a  number ";
    cin>>n;
    checkPrime(n);
    return 0;
}
