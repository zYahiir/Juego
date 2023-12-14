import java.util.Scanner;
public class Promedio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre_alumno,materia1,grupo,materia_alta,materia_baja;
        double cal1,promedio;
        double cal_alta,cal_baja;
        
        System.out.println("De cuando alumnos deseas capturar informacion");
        int num_alumn = entrada.nextInt();
        entrada.nextLine();

        for(int i=1; i<=num_alumn; i++){

            System.out.println("Ingresa el nombre del alumno " + i);
            nombre_alumno = entrada.nextLine();
            nombre_alumno=nombre_alumno.toUpperCase();
            System.out.println("Ingresa el grupo al que pertenece el alumno "+nombre_alumno);
            grupo=entrada.nextLine();
            grupo = grupo.toUpperCase();
        
            System.out.println("Cuantas materias deseas ingresar");
            int num_materias = entrada.nextInt();
            entrada.nextLine();
            
            for(int j=1; i<=num_materias; i++)

                System.out.println("Ingresa el nombre de la materia");
                materia1 = entrada.nextLine();
                materia1=materia1.toUpperCase();
                materia1.length();
                System.out.println("Ingresa la calificacion");
                cal1 = entrada.nextDouble();
                entrada.nextLine();
                materia_baja = materia1;
                cal_baja = cal1;
                materia_alta = materia1;
                cal_alta = cal1;
        

                     
                  }
                  
             }
           
        }
        


        
        //calcular edad
        // int anioActual = java.time.Year.now().getValue();
        //length longitud si
        
