class Practise7 {
    public static void main(String[] args) {
        Complex num = new Complex(34, 23);
        num.printComplex();
    }

}
class Complex {
    int img;
    int real;

    Complex(int r, int i) {
        img = i;
        real = r;
    }

    public static Complex add (Complex a, Complex b){
        return new Complex((a.real + b.real), (a.img + b.img));
    }

    public static Complex sub (Complex a, Complex b ){
        return new Complex((a.real - b.real), (a.img - b.img));
    }

    public static Complex product (Complex a, Complex b){
        return new Complex(((a.real * b.real) - (a.img * b.img)),((a.real * b.img) + (a.img * b.real)) );
    }

    public void printComplex(){
        if(real==0 && img!=0){
            System.out.println(img+"i");
        }
        else if(img==0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+img+"i");
        }
    }
}