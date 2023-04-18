#include <iostream>
#include <stdlib.h>
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
        std::cout<<"I'm a constructor of Parent"<<std::endl;
    }
    ~Parent()
    {
        std::cout<<"Distructor of Parent"<<std::endl;
    }
    void show(){
        std::cout<<"I'm show of Parent and now I'm going to occupy 100 Bytes of space"<<std::endl;
        pt = (int*) malloc(100);

    }
};

class Child : public Parent{
    public:
      int c;
      int d;
    Child(){
        std::cout<<"I'm constructor of Child"<<std::endl;
    }
    Child(int p,int q){
        c = p;
        d = q;
    }
    ~Child(){
        std::cout<<"Distructor of Child"<<std::endl;
    }
};

int main(){
    Child c;
    //Child c2(100,200);
    c.show();
}