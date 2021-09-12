public class letter {
    public static void main(String[] args) {
        String[][] letter =new String[6][4];

        for (int i = 0; i < letter.length; i++){
            for (int j = 0; j < letter[i].length; j++){
                if (i == 3 || i == 5 || i == 0){
                    letter[i][j] = " * ";
                }
                else if (j == 0){
                    letter[i][j] = " * ";
                }else if ((j == 3)){
                    letter[i][j] = " * ";
                    letter[3][3] = "-";
                }else{
                    letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
