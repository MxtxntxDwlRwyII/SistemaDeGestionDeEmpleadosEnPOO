
class Empleado 
{
    // Aqui se declaran las variables
    protected String nombre;
    protected String apellido;
    protected String correoElectronico;
    protected String rfc;
    protected String contraseña;
    protected double sueldoBruto;
    protected int edad;
    protected String puesto;

    public Empleado(String nombre, String apellido, String correoElectronico, String rfc, String contraseña) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.rfc = rfc;
        this.contraseña = contraseña;
        this.sueldoBruto = 30000;
        this.edad = 33;
        this.puesto = "Acceso denegado";
    }
    // Aqui se les asigna
    public void asignarSueldoBruto(double sueldoBruto) { this.sueldoBruto = sueldoBruto; }

    public void asignarEdad(int edad) { this.edad = edad; }

    public void asignarPuesto(String puesto) { this.puesto = puesto; }

    public double obtenerSueldoNeto() { return sueldoBruto - (sueldoBruto * 0.1); }
    

    public void mostrarInformacion() 
    {
        // Y aqui se imprime tu información
        System.out.println("\n------------------------------------------");
        System.out.println("\n******* Información del empleado *******\n");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo Electrónico: " + correoElectronico);
        System.out.println("RFC: " + rfc);
        System.out.println("Sueldo Bruto: $" + sueldoBruto);
        System.out.println("Sueldo Neto: $" + obtenerSueldoNeto());
        System.out.println("Edad: " + edad + " Äños");
        System.out.println("Puesto: " + puesto);
        System.out.println("\n------------------------------------------\n");
    }
}