public class Ejemplo3 {

    Run|Debug
    public static void main(String[] args) {
        int numHijos = 3;
        int renta;
        if(numHijos == 0){
            renta = 0;
        }
        else if(numHijos == 1){
            renta = 50
        }
        else if(numHijos == 2){
            renta = 200
        }
        else {
            renta = 500
        }

        switch (numHijos){
            0: renta = 0; break;
            1: renta = 50; break;
            2: renta = 200; break;
            default: rento = 500; break;
        }
        System.out.println(renta);
    }
}