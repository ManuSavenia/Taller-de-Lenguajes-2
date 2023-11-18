package Ej3;
public class ParOrdenadoComparable <X extends Comparable<X>,Y extends Comparable<Y>> {
    private X a;
    private Y b;
    public ParOrdenadoComparable (X a, Y b){
        this.a=a;
        this.b=b;
    }
    public X getA() {
        return a; }
    public void setA(X a) {
        this.a = a; }
    public Y getB() {
        return b; }
    public void setB(Y b) {
        this.b = b; }
}
