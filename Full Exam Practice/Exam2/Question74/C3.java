package Exam2.Question74;
interface I1{}
interface I2{}
class C1 implements I1{}
class C2 implements I2{}
public class C3 extends C1 implements I2{
    
}
class Ceck
{
    C1 o1;
    C2 O2;
    C3 o3;
    // o3 = 01;
    I1 b = o3;
}