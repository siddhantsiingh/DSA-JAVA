#include <iostream>
#include <vector>
using namespace std;
void decimalToBinary(int n)
{
    vector<int> v;
    while(n>0)
    {
        int t= n%2;
        v.push_back(t);
        n=n/2;
        
    }
    for(int i=v.size()-1;i>=0;i--)
    {
        cout<<v[i];
    }
}


int main()
{
    int n;
    cout<<"Enter a  number ";
    cin>>n;
    decimalToBinary(n);
    return 0;
}
