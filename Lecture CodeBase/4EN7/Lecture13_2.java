interface I1 {}
interface I2 {}
interface I3 extends I1, I2 {
    void fun();
}
class A {}
class B extends A implements I3{
    public void fun(){
        
    }
}