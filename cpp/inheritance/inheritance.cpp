#include <iostream>


class A {
    public:
    A()
    {
        std::cout<<"This is the constructor of class A"<<std::endl;
    }
    ~A()
    {
        std::cout<<"This is the destructor of class A"<<std::endl;
    }
};

class B: public A {
    public:
        B(){
            std::cout<<"This is the constructor of class B"<<std::endl;
        }
        ~B(){
            std::cout<<"This is the destructor of class B"<<std::endl;
        }

};

class C: public A {
    public:
        C(){
            std::cout<<"This is the constructor of class C"<<std::endl;
        }
        ~C(){
            std::cout<<"This is the destructor of class C"<<std::endl;
        }
};

class D: public B {
    public:
        D(){
            std::cout<<"This is the constructor of class D"<<std::endl;
        }
        ~D(){
            std::cout<<"This is the destructor of class D"<<std::endl;
        }
};

class E: public B {
    public:
        E(){
            std::cout<<"This is the constructor of class E"<<std::endl;
        }
        ~E(){
            std::cout<<"This is the destructor of class E"<<std::endl;
        }
};


class F: public C {
    public:
        F(){
            std::cout<<"This is the constructor of class F"<<std::endl;
        }
        ~F(){
            std::cout<<"This is the destructor of class F"<<std::endl;
        }
};

class G: public C {
    public:
        G(){
            std::cout<<"This is the constructor of class G"<<std::endl;
        }
        ~G(){
            std::cout<<"This is the destructor of class G"<<std::endl;
        }
};


class H: public D, public E{
    public:
        H(){
            std::cout<<"This is the constructor of class H"<<std::endl;
        }
        ~H(){
            std::cout<<"This is the destructor of class H"<<std::endl;
        }
};

class I: public F, public G {
    public:
        I(){
            std::cout<<"This is the constructor of class I"<<std::endl;
        }
        ~I(){
            std::cout<<"This is the destructor of class I"<<std::endl;
        }
};

class J: public H, public I {
    public:
        J(){
            std::cout<<"This is the constructor of class J"<<std::endl;
        }
        ~J(){
            std::cout<<"This is the destructor of class J"<<std::endl;
        }
};



int main(int argc, char const *argv[])
{
    /* code */
    J j;
    return 0;
}
