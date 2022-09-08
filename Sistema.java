package empresa;

import java.util.*;

public class Sistema {

    private ArrayList<Empleado> listaEmpleados;

    public Sistema() {
        listaEmpleados = new ArrayList<Empleado>();
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return this.listaEmpleados;
    }

    public void addEmpleado(Empleado unEmpleado) {
        this.getListaEmpleados().add(unEmpleado);
    }

    public void removeEmpleado(Empleado unEmpleado) {
        this.getListaEmpleados().remove(unEmpleado);
    }

    public static Comparator<Empleado> ordenarNombreEmpleado = new Comparator<Empleado>() {
        public int compare(Empleado empleado1, Empleado empleado2) {
            String nombreEmpleado1 = empleado1.getNombre().toUpperCase();
            String nombreEmpleado2 = empleado2.getNombre().toUpperCase();
            return nombreEmpleado1.compareTo(nombreEmpleado2);
        }
    };

    public static Comparator<Empleado> ordenarApellidoEmpleado = new Comparator<Empleado>() {
        public int compare(Empleado empleado1, Empleado empleado2) {
            String apellidoEmpleado1 = empleado1.getApellido().toUpperCase();
            String apellidoEmpleado2 = empleado2.getApellido().toUpperCase();
            return apellidoEmpleado1.compareTo(apellidoEmpleado2);
        }
    };

    //Métodos
    //Pedir un número y verificar que es correcto
    public int pedirNumero(String texto, int min, int max) {
        Scanner input = new Scanner(System.in);
        int dato = 0;
        boolean ok = false;
        while (!ok) {
            try {
                System.out.println(texto);
                dato = input.nextInt();
                input.nextLine();
                if (dato >= min && dato <= max) {
                    ok = true;
                } else {
                    System.out.println("---------------------------------------------------------------------\nError, ingrese números entre " + min + " y " + max);
                }
            } catch (InputMismatchException e) {
                System.out.println("---------------------------------------------------------------------\nIngresar números entre " + min + " y " + max);
                input.nextLine();
            }
        }
        return dato;
    }

    //Pedir un String
    public String pedirString(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        String dato = input.nextLine();
        return dato;
    }

    //Calcular edad y antigüedad
    public int antiguedad(int ano, int mes, int dia) {
        int dato = 0;
        int anoActual = 2022;
        int mesActual = 9;
        int diaActual = 8;
        dato = anoActual - ano;
        if (mes > mesActual) {
            dato = dato - 1;
        } else {
            if (mes == mesActual) {
                if (dia > diaActual) {
                    dato = dato - 1;
                }
            }
        }
        return dato;
    }

    //Calcular salario actual
    public double actual(double salario, int antiguedad) {
        double dato = salario;
        if (antiguedad >= 3) {
            int multiplicador = antiguedad - 3;
            dato = dato + multiplicador * ((dato * 8) / 100);
        }
        return dato;
    }

    //Ingresar empleado
    public void ingresarEmpleado() {
        Empleado unEmpleado = new Empleado();
        String nombre = pedirString("---------------------------------------------------------------------\nNombre del empleado:");
        unEmpleado.setNombre(nombre);
        String apellido = pedirString("---------------------------------------------------------------------\nApellido del empleado:");
        unEmpleado.setApellido(apellido);
        int anoDeNacimiento = pedirNumero("---------------------------------------------------------------------\nAño de nacimiento:", 1900, 2022);
        unEmpleado.setAnoDeNacimiento(anoDeNacimiento);
        int mesDeNacimiento = pedirNumero("---------------------------------------------------------------------\nMes de nacimiento:", 1, 12);
        unEmpleado.setMesDeNacimiento(mesDeNacimiento);
        if (unEmpleado.getMesDeNacimiento() == 2) {
            if (unEmpleado.getAnoDeNacimiento() % 4 == 0) {
                int diaDeNacimiento = pedirNumero("---------------------------------------------------------------------\nDía de nacimiento:", 1, 29);
                unEmpleado.setDiaDeNacimiento(diaDeNacimiento);
            } else {
                int diaDeNacimiento = pedirNumero("---------------------------------------------------------------------\nDía de nacimiento:", 1, 28);
                unEmpleado.setDiaDeNacimiento(diaDeNacimiento);
            }
        } else {
            if (unEmpleado.getMesDeNacimiento() == 1 || unEmpleado.getMesDeNacimiento() == 3 || unEmpleado.getMesDeNacimiento() == 5 || unEmpleado.getMesDeNacimiento() == 7 || unEmpleado.getMesDeNacimiento() == 8 || unEmpleado.getMesDeNacimiento() == 10 || unEmpleado.getMesDeNacimiento() == 12) {
                int diaDeNacimiento = pedirNumero("---------------------------------------------------------------------\nDía de nacimiento:", 1, 31);
                unEmpleado.setDiaDeNacimiento(diaDeNacimiento);
            } else {
                int diaDeNacimiento = pedirNumero("---------------------------------------------------------------------\nDía de nacimiento:", 1, 30);
                unEmpleado.setDiaDeNacimiento(diaDeNacimiento);
            }
        }
        int documentoDeIdentidad = pedirNumero("---------------------------------------------------------------------\nDocumento de identidad:", 1, 60000000);
        unEmpleado.setDocumentoDeIdentidad(documentoDeIdentidad);
        double salarioInicial = pedirNumero("---------------------------------------------------------------------\nSalario inicial:", 1, 10000000);
        unEmpleado.setSalarioInicial(salarioInicial);
        int anoDeIngreso = pedirNumero("---------------------------------------------------------------------\nAño de ingreso:", 1900, 2022);
        unEmpleado.setAnoDeIngreso(anoDeIngreso);
        int mesDeIngreso = pedirNumero("---------------------------------------------------------------------\nMes de ingreso:", 1, 12);
        unEmpleado.setMesDeIngreso(mesDeIngreso);
        if (unEmpleado.getMesDeIngreso() == 2) {
            if (unEmpleado.getAnoDeIngreso() % 4 == 0) {
                int diaDeIngreso = pedirNumero("---------------------------------------------------------------------\nDía de ingreso:", 1, 29);
                unEmpleado.setDiaDeIngreso(diaDeIngreso);
            } else {
                int diaDeIngreso = pedirNumero("---------------------------------------------------------------------\nDía de ingreso:", 1, 28);
                unEmpleado.setDiaDeIngreso(diaDeIngreso);
            }
        } else {
            if (unEmpleado.getMesDeIngreso() == 1 || unEmpleado.getMesDeIngreso() == 3 || unEmpleado.getMesDeIngreso() == 5 || unEmpleado.getMesDeIngreso() == 7 || unEmpleado.getMesDeIngreso() == 8 || unEmpleado.getMesDeIngreso() == 10 || unEmpleado.getMesDeIngreso() == 12) {
                int diaDeIngreso = pedirNumero("---------------------------------------------------------------------\nDía de ingreso:", 1, 31);
                unEmpleado.setDiaDeIngreso(diaDeIngreso);
            } else {
                int diaDeIngreso = pedirNumero("---------------------------------------------------------------------\nDía de ingreso:", 1, 30);
                unEmpleado.setDiaDeIngreso(diaDeIngreso);
            }
        }
        unEmpleado.setEdad(antiguedad(unEmpleado.getAnoDeNacimiento(), unEmpleado.getMesDeNacimiento(), unEmpleado.getDiaDeNacimiento()));
        unEmpleado.setAntiguedadLaboral(antiguedad(unEmpleado.getAnoDeIngreso(), unEmpleado.getMesDeIngreso(), unEmpleado.getDiaDeIngreso()));
        unEmpleado.setSalarioActual(this.actual(unEmpleado.getSalarioInicial(), unEmpleado.getAntiguedadLaboral()));
        this.addEmpleado(unEmpleado);
        Collections.sort(this.getListaEmpleados(), this.ordenarNombreEmpleado);
        Collections.sort(this.getListaEmpleados(), this.ordenarApellidoEmpleado);
        System.out.println("---------------------------------------------------------------------\nSe ha ingresado a " + unEmpleado.getNombre() + " " + unEmpleado.getApellido());
    }

    //Eliminar empleado
    public void eliminarEmpleado() {
        if (this.getListaEmpleados().isEmpty()) {
            System.out.println("---------------------------------------------------------------------\nNo se han ingresado empleados");
        } else {
            System.out.println("---------------------------------------------------------------------");
            imprimirLista(this.getListaEmpleados());
            int empleadoEliminar = pedirNumero("---------------------------------------------------------------------\n¿Cuál empleado desea eliminar?", 1, this.getListaEmpleados().size());
            String nombreEliminado = this.getListaEmpleados().get(empleadoEliminar - 1).getNombre() + " " + this.getListaEmpleados().get(empleadoEliminar - 1).getApellido();
            this.removeEmpleado(this.getListaEmpleados().get(empleadoEliminar - 1));
            System.out.println("---------------------------------------------------------------------\n" + nombreEliminado + " ha sido eliminado con éxito");
        }
    }

    //Eliminar empleado
    public void modificarEmpleado() {
        if (this.getListaEmpleados().isEmpty()) {
            System.out.println("---------------------------------------------------------------------\nNo se han ingresado empleados");
        } else {
            System.out.println("---------------------------------------------------------------------");
            imprimirLista(this.getListaEmpleados());
            int empleadoModificar = pedirNumero("---------------------------------------------------------------------\n¿Cuál empleado desea modificar?", 1, this.getListaEmpleados().size());
            int opcion = 0;
            while (opcion != 6) {
                opcion = pedirNumero("---------------------------------------------------------------------\n1. Nombre y apellido\n2. Fecha de nacimiento\n3. Documento de identidad\n4. Salario inicial\n5. Fecha de ingreso\n6. Salir\n---------------------------------------------------------------------\nElegir opción:", 1, 6);
                switch (opcion) {
                    case 1: //Nombre y apellido
                        String nombre = pedirString("---------------------------------------------------------------------\nNombre del empleado:");
                        this.getListaEmpleados().get(empleadoModificar - 1).setNombre(nombre);
                        String apellido = pedirString("---------------------------------------------------------------------\nApellido del empleado:");
                        this.getListaEmpleados().get(empleadoModificar - 1).setApellido(apellido);
                        break;
                    case 2: //Fecha de nacimiento
                        int anoDeNacimiento = pedirNumero("---------------------------------------------------------------------\nAño de nacimiento:", 1900, 2022);
                        this.getListaEmpleados().get(empleadoModificar - 1).setAnoDeNacimiento(anoDeNacimiento);
                        int mesDeNacimiento = pedirNumero("---------------------------------------------------------------------\nMes de nacimiento:", 1, 12);
                        this.getListaEmpleados().get(empleadoModificar - 1).setMesDeNacimiento(mesDeNacimiento);
                        if (this.getListaEmpleados().get(empleadoModificar - 1).getMesDeNacimiento() == 2) {
                            if (this.getListaEmpleados().get(empleadoModificar - 1).getAnoDeNacimiento() % 4 == 0) {
                                int diaDeNacimiento = pedirNumero("---------------------------------------------------------------------\nDía de nacimiento:", 1, 29);
                                this.getListaEmpleados().get(empleadoModificar - 1).setDiaDeNacimiento(diaDeNacimiento);
                            } else {
                                int diaDeNacimiento = pedirNumero("---------------------------------------------------------------------\nDía de nacimiento:", 1, 28);
                                this.getListaEmpleados().get(empleadoModificar - 1).setDiaDeNacimiento(diaDeNacimiento);
                            }
                        } else {
                            if (this.getListaEmpleados().get(empleadoModificar - 1).getMesDeNacimiento() == 1 || this.getListaEmpleados().get(empleadoModificar - 1).getMesDeNacimiento() == 3 || this.getListaEmpleados().get(empleadoModificar - 1).getMesDeNacimiento() == 5 || this.getListaEmpleados().get(empleadoModificar - 1).getMesDeNacimiento() == 7 || this.getListaEmpleados().get(empleadoModificar - 1).getMesDeNacimiento() == 8 || this.getListaEmpleados().get(empleadoModificar - 1).getMesDeNacimiento() == 10 || this.getListaEmpleados().get(empleadoModificar - 1).getMesDeNacimiento() == 12) {
                                int diaDeNacimiento = pedirNumero("---------------------------------------------------------------------\nDía de nacimiento:", 1, 31);
                                this.getListaEmpleados().get(empleadoModificar - 1).setDiaDeNacimiento(diaDeNacimiento);
                            } else {
                                int diaDeNacimiento = pedirNumero("---------------------------------------------------------------------\nDía de nacimiento:", 1, 30);
                                this.getListaEmpleados().get(empleadoModificar - 1).setDiaDeNacimiento(diaDeNacimiento);
                            }
                        }
                        break;
                    case 3: //Documento de identidad
                        int documentoDeIdentidad = pedirNumero("---------------------------------------------------------------------\nDocumento de identidad:", 1, 60000000);
                        this.getListaEmpleados().get(empleadoModificar - 1).setDocumentoDeIdentidad(documentoDeIdentidad);
                        break;
                    case 4: //Salario inicial
                        double salarioInicial = pedirNumero("---------------------------------------------------------------------\nSalario inicial:", 1, 10000000);
                        this.getListaEmpleados().get(empleadoModificar - 1).setSalarioInicial(salarioInicial);
                        break;
                    case 5: //Fecha de ingreso
                        int anoDeIngreso = pedirNumero("---------------------------------------------------------------------\nAño de ingreso:", 1900, 2022);
                        this.getListaEmpleados().get(empleadoModificar - 1).setAnoDeIngreso(anoDeIngreso);
                        int mesDeIngreso = pedirNumero("---------------------------------------------------------------------\nMes de ingreso:", 1, 12);
                        this.getListaEmpleados().get(empleadoModificar - 1).setMesDeIngreso(mesDeIngreso);
                        if (this.getListaEmpleados().get(empleadoModificar - 1).getMesDeIngreso() == 2) {
                            if (this.getListaEmpleados().get(empleadoModificar - 1).getAnoDeIngreso() % 4 == 0) {
                                int diaDeIngreso = pedirNumero("---------------------------------------------------------------------\nDía de ingreso:", 1, 29);
                                this.getListaEmpleados().get(empleadoModificar - 1).setDiaDeIngreso(diaDeIngreso);
                            } else {
                                int diaDeIngreso = pedirNumero("---------------------------------------------------------------------\nDía de ingreso:", 1, 28);
                                this.getListaEmpleados().get(empleadoModificar - 1).setDiaDeIngreso(diaDeIngreso);
                            }
                        } else {
                            if (this.getListaEmpleados().get(empleadoModificar - 1).getMesDeIngreso() == 1 || this.getListaEmpleados().get(empleadoModificar - 1).getMesDeIngreso() == 3 || this.getListaEmpleados().get(empleadoModificar - 1).getMesDeIngreso() == 5 || this.getListaEmpleados().get(empleadoModificar - 1).getMesDeIngreso() == 7 || this.getListaEmpleados().get(empleadoModificar - 1).getMesDeIngreso() == 8 || this.getListaEmpleados().get(empleadoModificar - 1).getMesDeIngreso() == 10 || this.getListaEmpleados().get(empleadoModificar - 1).getMesDeIngreso() == 12) {
                                int diaDeIngreso = pedirNumero("---------------------------------------------------------------------\nDía de ingreso:", 1, 31);
                                this.getListaEmpleados().get(empleadoModificar - 1).setDiaDeIngreso(diaDeIngreso);
                            } else {
                                int diaDeIngreso = pedirNumero("---------------------------------------------------------------------\nDía de ingreso:", 1, 30);
                                this.getListaEmpleados().get(empleadoModificar - 1).setDiaDeIngreso(diaDeIngreso);
                            }
                        }
                        break;
                    case 6: //Salir
                        this.getListaEmpleados().get(empleadoModificar - 1).setEdad(antiguedad(this.getListaEmpleados().get(empleadoModificar - 1).getAnoDeNacimiento(), this.getListaEmpleados().get(empleadoModificar - 1).getMesDeNacimiento(), this.getListaEmpleados().get(empleadoModificar - 1).getDiaDeNacimiento()));
                        this.getListaEmpleados().get(empleadoModificar - 1).setAntiguedadLaboral(antiguedad(this.getListaEmpleados().get(empleadoModificar - 1).getAnoDeIngreso(), this.getListaEmpleados().get(empleadoModificar - 1).getMesDeIngreso(), this.getListaEmpleados().get(empleadoModificar - 1).getDiaDeIngreso()));
                        this.getListaEmpleados().get(empleadoModificar - 1).setSalarioActual(this.actual(this.getListaEmpleados().get(empleadoModificar - 1).getSalarioInicial(), this.getListaEmpleados().get(empleadoModificar - 1).getAntiguedadLaboral()));
                        String nombreModificado = this.getListaEmpleados().get(empleadoModificar - 1).getNombre() + " " + this.getListaEmpleados().get(empleadoModificar - 1).getApellido();
                        System.out.println("---------------------------------------------------------------------\n" + nombreModificado + " ha sido modificado con éxito");
                        Collections.sort(this.getListaEmpleados(), this.ordenarNombreEmpleado);
                        Collections.sort(this.getListaEmpleados(), this.ordenarApellidoEmpleado);
                        break;
                }
            }
        }
    }

    //Eliminar empleado
    public void verEmpleados() {
        if (this.getListaEmpleados().isEmpty()) {
            System.out.println("---------------------------------------------------------------------\nNo se han ingresado empleados");
        } else {
            System.out.println("---------------------------------------------------------------------");
            imprimirLista(this.getListaEmpleados());
        }
    }

    //Mostrar lista
    public void imprimirLista(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
    }
}
