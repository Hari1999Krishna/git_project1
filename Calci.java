interface Calci
{
int sum(int a, int b);
}
class Subclass implements Calci
{
    public int sum(int a, int b){
        return a+b;
    }
}