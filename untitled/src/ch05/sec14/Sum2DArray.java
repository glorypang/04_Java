package ch05.sec14;

public class Sum2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        int sum = 0;
        int totalCnt = 0;
        for(int i = 0; i<array.length; i++){
            totalCnt += array[i].length;
            for(int j = 0; j<array[i].length; j++){
                sum += array[i][j];
            }
        }
        double avg = sum/totalCnt;
        System.out.println(sum);
        System.out.println(avg);
    }
}
