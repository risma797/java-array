 public class Main {
    
    static String roomArray[][] = {
        {"*", "*", "*", "*", "x"},
        {"*", "*", "*", "*", "*"},
        {"*", "*", "*", "*", "*"},
        {"*", "*", "*", "x", "*"},
    };

    public static void main(String[] args) {
        int availableRoom = 0;
        for(int i = 0; i < roomArray.length; i++) {
            for(int j = 0; j < roomArray[i].length; j++) {
                if(roomArray[i][j] == "*") {
                    availableRoom++;
                } else {
                    System.out.println("Tamu berada di Lantai " + (i + 1)  + " Kamar " + (j + 1));
                }
            }
        }
        System.out.println("Jumlah kamar yang tersedia adalah " + availableRoom + " kamar");
    }
}