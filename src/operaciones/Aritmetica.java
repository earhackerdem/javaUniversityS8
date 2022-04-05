package operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a; // el argumento a se asigna al atributo this.a
    int b;

    //Metodo
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        return this.a + this.b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }

}
