public class RaggedArray {
    public static void main(String [] args){
        int[][] triangleArray = {{1},{1,2},{1,2,3},{1,2,3,4}};
        for (int i = 0;i<triangleArray.length;i++){
           for (int j = 0;j<triangleArray[i].length;j++){
               System.out.print(triangleArray[i][j] + " ");
           }
           System.out.println();
        }
    }
}
