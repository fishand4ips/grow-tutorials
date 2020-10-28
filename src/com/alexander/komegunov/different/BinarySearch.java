package com.alexander.komegunov.different;

import javax.swing.*;
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] sequence = new int[]{1, 2, 3, 4, 7, 8, 9, 9, 12, 15, 19, 22, 69, 98, 100};
        final String inputValue = JOptionPane.showInputDialog("Select desired elements of" + Arrays.toString(sequence));
        JOptionPane.showMessageDialog(null, "Selected elements(" + inputValue + ") has " + search(Integer.parseInt(inputValue), sequence) + " position");
    }

    public static int search(int value, int[] sequence) {
        Arrays.sort(sequence);
        int low = 0;
        int high = sequence.length - 1;
        while (high >= low) {
            int middle = (low + high) / 2;
            if (sequence[middle] == value) {
                return middle;
            } else if (value > sequence[middle]) {
                low = middle + 1;
            } else if (value < sequence[middle]) {
                high = middle - 1;
            }
        }
        return -1;
    }
}
