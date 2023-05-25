#include <iostream>
#include <stdlib.h>
#include <stdio.h>

class Parent
{
private:
    int a;
    int b;
    int *pt;

public:
    Parent(int p, int q)
    {
        a = p;
        b = q;
    }
    Parent()
    {
        std::cout <<"I'm constructor of Parent" << std::endl;
    }
    ~Parent(){
        free(pt);
        std::cout<<"Destructor of Parent"<<std::endl;
    }
    void show()
    {
        pt = (int*) malloc(100);
        // std::cout<< a << b <<std::endl;
        std::cout << "I'm show of parent" << std::endl;
        //std::cout << "Value of A and B are " << a << " " << b << std::endl;

        
    }
    void setValues(int p, int q)
    {
        a = p;
        b = q;
    }
};

class Child : public Parent
{
public:
    int c;
    int d;
    Child(){
        std::cout<<"I'm constrctor of Child"<<std::endl;
    }
    Child(int p,int q){
        c = p;
        d = q;
    }
    ~Child(){
        std::cout<<"Destructor of Child"<<std::endl;
    }
};

int main(int argc, char const *argv[])
{
    /* code */
    // Parent p(10,20);
    //Child ch;
    Child ch2(100,200);
    ch2.show();
    return 0;
}
