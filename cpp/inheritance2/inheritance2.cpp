#include<iostream>
#include<stdlib.h>

class Parent{
    public:
        int a;
        int b;
    Parent(){
        std::cout<<"I'm constructor of Parent"<<std::endl;
    }
    virtual void show(){
        std::cout<<"This is plain show of Parent"<<std::endl;
    }
    void show(int p,double d){
        std::cout<<"I'm also show method but I'm printing whatever you have passed"<<" "<<p<<" "<<d<<std::endl;
    }

    void show(double p,int d){
        std::cout<<"I'm also show method but I'm printing whatever you have passed"<<" "<<p<<" "<<d<<std::endl;
    }
};

class Child: public Parent{
    int c,d;
    
    Parent *p;
    Child *ch;

    public:
    void show(){
        std::cout<<"This is plain show of Child"<<std::endl;
    }

};

int main(int argc, char const *argv[])
{
    Parent p;
    Child c;

    Parent *pt;
    Child *ch;


    pt = &p;

    pt->show();

    //ch = &c;

    //ch->show();

    pt = &c;

    pt->show();

    //std::cout<<"The size of Parent Object is"<<" "<<sizeof(p)<<std::endl;
    // std::cout<<"The size of Child Object is"<<" "<<sizeof(c)<<std::endl;
    // p.show();
    // p.show(10,20.30);
    // p.show(50.20,70); 
    //c.show();
    return 0;
}
