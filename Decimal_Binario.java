/*
     * Realiza la conversion de decimal a binario (escribiendola al revés)
     * 
     * @param dec, numero decimal que deseamos convertir
     * @return numero en binario dado la vuelta
     */
    public static void decimalBinario(int dec){
        if (dec < 2){
            System.out.print("0")   ; 
        }
            if (dec < 2){
                System.out.print("1");
             }
            else {
                 System.out.print(dec % 2);
                dec = dec / 2;
                decimalBinario(dec/2);
            }
    }
