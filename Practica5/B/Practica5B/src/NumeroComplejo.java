package unlp.info.math;
public final class NumeroComplejo {
    private double re;
    private double im;

    public Complex NumeroComplejo(double re, double im) {
    }

    public double realPart(){
    }
    public double imaginaryPart(){
    }
    public Complex Add(NumeroComplejo c){
        this.re = this.re + c.re;
        this.im = this.im + c.im;
        return Complex (this.re, this.im);
    }
    public Complex Sub(NumeroComplejo c){
        this.re = this.re - c.re;
        this.im = this.im - c.im;
        return Complex (this.re, this.im);
    }
    public Complex Mult(NumeroComplejo c){
    }
    public Complex Div(NumeroComplejo c){
    }

    @Override
    public boolean equals(Object o){
    }
    public int hashCode(){
    }
    @Override
    public String toString(){
    }
    public Complex ValueOf(double re, double im){
        double a = re;
        double b = im;
        return Complex (a,b);
    }
}
