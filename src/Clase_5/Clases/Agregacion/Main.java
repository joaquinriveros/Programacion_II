package Clase_5.Clases.Agregacion;

public class Main {
    public static void main(String[] args) {
        // Crear empresa
        Empresa miEmpresa = new Empresa();

        // Crear departamentos
        Departamento ventas = new Departamento("Ventas");
        Departamento contabilidad = new Departamento("Contabilidad");

        // Crear empleados
        Empleado empleado1 = new Empleado("Vendedor", "Juan");
        Empleado empleado2 = new Empleado("Contador", "María");

        // Agregar empleados a los departamentos
        ventas.AgregarEmpleado(empleado1);
        contabilidad.AgregarEmpleado(empleado2);

        // Agregar departamentos a la empresa
        miEmpresa.AgregarDepartamento(contabilidad);
        miEmpresa.AgregarDepartamento(ventas);

        // Mostrar departamentos de la empresa
        miEmpresa.MostrarDepartamentos();
    }
}
