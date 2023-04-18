#include <iostream>

class Parent{
public:
    int a;
    int b;

    Parent(){
        std::cout << "I'm constructor of Parent" << std::endl;
    }

    void show(){
        std::cout << "This is plain show" << std::endl;
    }

    void show(int p){
        std::cout << "I'm also show method but I'm printing whatever you have passed" << p << std::endl;
    }
};

class Child : public Parent{
};

int main(int argc, char const *argv[]){

    Parent p;
    std::cout<<"The size of Parent object is "<< sizeof(p);
}
