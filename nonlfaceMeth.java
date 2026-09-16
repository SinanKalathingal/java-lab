interface callback{
void method1(int param);
}
class client implements callback{
public void method1(int p){
System.out.println("callback called with"+p);
}
void nonlfaceMeth(){
System.out.println("classesthe implement interfaces may also define other members,tooooo.");
}}
class Testiface{
public static void main(String args[]){
callback c=new client();
c.method1(142);
}
}