    /*
     * Devuelve una linea dibujada con el caracter que pasemos por teclado
     * 
     * @param num, numero de veces que se ejecuta
     * @param car, caracter con el que se dibujará la linea
     * @return linea con el numero y los caracteres que deseemos
     * 
     */
    public static void pintalineaRecursivo(int num, char car){
        
        if(num > 0){
            System.out.print(car);
            pintalineaRecursivo(num-1,car);
        }
    }
