public class Matrix{
    public static void main (String[] args) {
    int i,j;
    int[][] array1=new int[][]{{1,3,4},{2,4,3},{3,4,5}};
    int[][] array2=new int[][]{{1,3,4},{2,4,3},{1,2,4}};
    int[][] array3=new int[3][3];
    System.out.println("the first array consists of :");
    for (i=0;i<3;i++){
    for (j=0;j<3;j++){
    System.out.println(array1[i][j]);
    } 
    }
    System.out.println("the 2 array consists of the elements: ");
    for (i=0;i<3;i++){
    for (j=0;j<3;j++){
    System.out.println(array2[i][j]);
    } 
    }
    System.out.println("the sum of these two arrays are :");
    for (i=0;i<3;i++){
    for (j=0;j<3;j++){
    array3[i][j]=array1[i][j]+array2[i][j];
    System.out.println(array3[i][j]);
    } 
    }
    }
}
