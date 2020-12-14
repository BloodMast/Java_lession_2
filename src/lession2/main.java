package lession2;

public class main {
    public static void main(String[] args) {

        int result = 0;

        String[][] array = {{"1","2","3","4"},{"1","2","3","4"}};

        try {
            result = 0;
            result = check(array);
        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Сумма элементов массива равна "+ (result));
        }

    }

    public static int check(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int value = 0;
        int row = 0;
        int cell = 0;
        int summ = 0;

        if(array.length != 2 || array[0].length != 4 || array[1].length != 4) {
            throw new MyArraySizeException();
        }

        for(int r=1; r<3; r++){
            row = r;
            for(int c=1;c<5;c++){
                cell = c;
                try{
                    value = Integer.parseInt(array[r-1][c-1]);
                    summ += value;
                } catch (IllegalArgumentException e){
                    String message = "в "+ (row) + " ряду, "+ (cell) +" ячейке";
                    throw new MyArrayDataException(message);
                }
            }
        }

        return summ;
    }
}
