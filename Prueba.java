package empresa;

public class Prueba {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        //Menú
        int opcion = 0;
        while (opcion != 5) {
            opcion = sistema.pedirNumero("---------------------------------------------------------------------\nSistema de Análisis de Empleados\n---------------------------------------------------------------------\n1. Agregar empleado\n2. Eliminar empleado\n3. Modificar empleado\n4. Ver empleados\n5. Salir\n---------------------------------------------------------------------\nElegir opción:", 1, 5);
            switch (opcion) {
                case 1: //Agregar empleado
                    sistema.ingresarEmpleado();
                    break;
                case 2: //Eliminar empleado
                    sistema.eliminarEmpleado();
                    break;
                case 3: //Modificar empleado
                    sistema.modificarEmpleado();
                    break;
                case 4: //Ver empleados
                    sistema.verEmpleados();
                    break;
                case 5: //Salir
                    break;
            }
        }
    }
}
