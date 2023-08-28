
#include <iostream>

using namespace std;

int main()
{
    
    int n,c=0;
    cin>>n;
    int a=1;
    int b=1;
    cout<<a<<" "<<b<<" ";
    for(int i=0;i<n;i++)
    {
        c=a+b;
        cout<<c<<" ";
        a=b;
        b=c;
    }
    return 0;
}
