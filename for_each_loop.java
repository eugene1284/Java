public class for_each_loop {


    public static void printAllGrades(int[] grades) { // метод, который распечатывает все оценки
        System.out.print("|");
        for (int num : grades) {

            System.out.print(num + "|");
        }
        System.out.println();
    }


    public static double midGrade(int[] numbers) { // метод, в котором выводится средняя оценка
        int grade = 0;

        for (int num : numbers) {
            grade = num + grade;
        }
        return ((double) grade / numbers.length);

    }

    
    public static int bestGrade(int[] numbers) { // метод в котором вычисляется лучшая (максимальная) оценка
        int maxGrade = numbers[0];

        for (int num : numbers) {
            if (num > maxGrade) {
                maxGrade = num;
            }
        }
        return maxGrade;
    }

    public static void main(String[] args) {

        // массив оценок
        int[] grades = { 5, 10, 7, 8, 9, 9, 10, 12 };

        int highest_marks = bestGrade(grades);
        System.out.print("All the grades: ");
        printAllGrades(grades);
        System.out.println("The highest grade is " + highest_marks);
        System.out.println("The average grade is " + midGrade(grades));
    }

}

/*
 * for (type iterVar : array) {
 * Блок операторов;
 * }
 * 
 * 
 * type — тип итерационной переменной (совпадает с типом данных в массиве!)
 * 
 * 
 */