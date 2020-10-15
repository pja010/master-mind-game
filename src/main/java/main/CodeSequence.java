/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2020
 * Instructor: Prof. Brian King
 *
 * Name: Guillermo Torres and Per Astrom
 * Section: 02/01
 * Date: 10/15/2020
 * Time: 3:29 PM
 *
 * Project: csci205_hw
 * Package: main
 * Class: CodeSequence
 *
 * Description:
 * Class that generates random code sequence of length 4.
 * ****************************************
 */

package main;

import java.util.Random;

/**
 * Implementation of code sequence for MasterMind game.
 * The code sequence consists of 4 "code pegs" represented by integers between 1-6.
 * The sequence is randomly generated by the program.
 */
public class CodeSequence {
    private final int CODE_LENGTH = 4;
    private int[] codeSequence = new int[CODE_LENGTH];
    private Random rand = new Random();
    private final int upperBound = 6;

    /**
     * Generate random integer sequence.
     * Sequence length and range of random numbers is pre-specified in fields.
     */
    public void setCodeSequence() {
        for (int i = 0; i < codeSequence.length; ++i) {
            codeSequence[i] = rand.nextInt(upperBound) + 1;
        }
    }

    /**
     * Returns value at given index
     * @param index - integer
     * @return value at index, an integer
     */
    public int valueAt(int index) {
        return codeSequence[index];
    }

    /**
     * Check if code sequence contains specified integer value
     * @param value - integer
     * @return boolean - true if value exists, false otherwise
     */
    public boolean contains(int value) {
        for (int i = 0; i < codeSequence.length; ++i) {
            if (codeSequence[i] == value) {
                return true;
            }

        }
        return false;
    }

    /**
     * String method representation of code sequence
     * @return s - String
     */
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < codeSequence.length; i++) {
            s += codeSequence[i];
        }
        return s;
    }

}
