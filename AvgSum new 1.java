/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.avgsum;

/**
 *
 * @author Денис
 */
class AvgSum {
    static class Result {
        double average;
        int sum;

        Result(double average, int sum) {
            this.average = average;
            this.sum = sum;
        }
    }

    static Result avgsum(int numbers[]) {
        if (numbers == null || numbers.length == 0) {
            return new Result(0.0, 0);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        return new Result(average, sum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        AvgSum avgSum = new AvgSum(); 
        Result result = avgSum.avgsum(numbers);

        System.out.println("Sum: " + result.sum);
        System.out.println("Average: " + result.average);
    }
}
