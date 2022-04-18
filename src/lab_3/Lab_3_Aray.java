package lab_3;

public class Lab_3_Aray {
    public static void main(String[] args) {
        int sum = 1;
        int j = 2;
        int[] massive_lab3 =new int[4];
      for (int i=0;i<4;i++){
          massive_lab3[i] = j;
          j++;
              sum = sum*massive_lab3[i];

      }
        System.out.println("Сумма элементов массива:  ");
        System.out.println(sum);
    }





}
