public class animales {
    //Atributos de la clase animales
    String nombre;
    int edad;
    char sexo;
    String duenio;
    //Constructor
    animales(String nombre, int edad, char sexo, String duenio){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.duenio=duenio;
    }
    //Sobrecarga de constructor
    animales(){
        System.out.println("Se creo un animal");
    }
    //Funcion comer
    public void comer() {
      System.out.println("Está comiendo");
    }
    public void nombre(){
        System.out.println("Nombre: "+ nombre);
    }
  }
  //Perro hereda los atributos y métodos de animales
  class perro extends animales {
    String raza;
    //Constructor de perro
    perro(String nombre, int edad, char sexo, String duenio,String raza){
        super(nombre,edad,sexo,duenio);
        this.raza=raza;
    }
    //Sobrecarga con constructor vacio
    perro(){
        super();
    }
    //método exclusivo de perro
    public void presentarplacacanina() {
      System.out.println("Mi nombre es " + nombre);
    }
  }
  class gato extends animales {
    String raza;
   gato(){
    super();
   }
   gato(String nombre, int edad, char sexo, String duenio,String raza){
    super(nombre,edad,sexo,duenio);
    this.raza=raza;
  }
}
  class Main {
    public static void main(String[] args) {
      // Creamos a perro llamando a su constructor
      perro manchas = new perro();
      //Accedemos a nombre y le asignamos uno
      manchas.nombre = "Manchas";
      manchas.raza="Dalmata";
      manchas.presentarplacacanina();
      manchas.comer();
      //Creamos un gato
      gato copodenieve = new gato();
      copodenieve.nombre="Copo de Nieve";
      copodenieve.sexo='M';
      System.out.println("El nombre del animal creado es " + copodenieve.nombre);
    }
  }