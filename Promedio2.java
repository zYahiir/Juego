import java.util.Scanner;
public class Promedio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre_alumno,materia1,materia2,materia3,materia4,grupo,materia_alta,materia_baja;
        double cal1,cal2,cal3,cal4,promedio;
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
        if(cal1 > 10 || cal1 < 0 || materia1.length()!=4 || ! grupo.equals("A")){
            System.out.println("Dato invalido");
        }else{
            System.out.println("Ingresa el nombre de la materia");
            materia2 = entrada.nextLine();
            System.out.println("Ingresa la calificacion");
            cal2 = entrada.nextDouble();
            entrada.nextLine();
            if (cal2>cal_alta) {
              materia_alta = materia2;
              cal_alta = cal2;
            }else if (cal2<cal_baja) {
              materia_baja = materia2;
              cal_baja = cal2;
            }
            if(cal2 > 10 || cal2 < 0 || materia2.length()!=4){
                  System.out.println("Dato invalido");
             }else{
                  System.out.println("Ingresa el nombre de la materia");
                  materia3 = entrada.nextLine();
                  System.out.println("Ingresa la calificacion");
                  cal3 = entrada.nextDouble();
                  entrada.nextLine();
                  if (cal3>cal_alta) {
                    materia_alta = materia3;
                    cal_alta = cal3;
                  }else if (cal3<cal_baja) {
                    materia_baja = materia3;
                    cal_baja = cal3;
            }
                  if(cal3 > 10 || cal3 < 0 || materia3.length()!=4){
                     System.out.println("Dato invalido");
                  }else{
                     System.out.println("Ingresa el nombre de la materia");
                     materia4 = entrada.nextLine();
                     System.out.println("Ingresa la calificacion");
                     cal4 = entrada.nextDouble();
                     entrada.nextLine();
                    if (cal4>cal_alta) {
                      materia_alta = materia4;
                      cal_alta = cal4;
                    }else if (cal4<cal_baja) {
                      materia_baja = materia4;
                      cal_baja = cal4;
                    }
                      if(cal4 > 10 || cal4 < 0 || materia4.length()!=4){
                        System.out.println("Dato invalido");
                      }else{
                        promedio=(cal1+cal2+cal3+cal4)/4;
        
        //CONDICIONAL AÑADIDA
                       if(promedio>=9){
                         System.out.println("EXCELENTE");
                       }else if(promedio >=8){
                         System.out.println("MUY BIEN");
                       }else if(promedio>=6){
                         System.out.println("BIEN");
                       }else{
                        System.out.println("REPROBADO");
                       }
                       //Que muestre el nombre de la materia mas alta y la mas baja
                       System.out.println("La calificacion mas alta es " + materia_alta + " :"+cal_alta); 
                       System.out.println("La calificacion mas baja es " + materia_baja + " :"+cal_baja); 
                      }

                     
                  }
                  
             }
           
        }
        


        
        //calcular edad
        // int anioActual = java.time.Year.now().getValue();
        //length longitud si
        
     
      }  
    }
}