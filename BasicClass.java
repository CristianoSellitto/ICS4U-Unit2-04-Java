/*
* This class creates an array of integers
*
* @author  Cristiano Sellitto
* @version 1.0
* @since   2024-03-08
*/

/**
 * This is the class.
*/
public class BasicClass {
    /**
     * Adds strings to an array.
     *
     * @param array contains the array of strings
    */
    private String[] array = {};

    /**
     * Checks if the array is empty.
     *
     * @return the bool that says whether the array is empty or not
    */
    public boolean isEmpty() {
        boolean empty = false;

        if (this.array.length == 0) {
            empty = true;
        }

        return empty;
    }

    /**
     * Looks at the last item of the array.
     *
     * @return the last item in the array
    */
    public String peekItem() {
        String lastItem = "undefined";

        if (this.array.length != 0) {
            lastItem = this.array[this.array.length - 1];
        }

        return lastItem;
    }

    /**
     * Prints the array to the console.
     *
     * @return the values of the array formatted
    */
    public String showStack() {
        String stackValues = "This array is empty.";

        if (this.array.length > 0) {
            stackValues = this.array[0];

            for (int counter = 1; counter < this.array.length; counter++) {
                stackValues = stackValues + ", " + this.array[counter];
            }
        }

        return stackValues;
    }

    /**
     * Checks the size of the array.
     *
     * @return the array's length
    */
    public int size() {
        return this.array.length;
    }

    /**
     * Removes all elements of the array.
    */
    public void clearStack() {
        for (int counter = 0; counter < this.array.length + 1; counter++) {
            this.pop();
        }

        System.out.println("\nThe array has been cleared!");
    }

    /**
     * Pushes the string to an array.
     *
     * @param string the string that is going to be pushed
    */
    public void push(String string) {
        final String[] newArray = new String[this.array.length + 1];

        for (int counter = 0; counter < this.array.length; counter++) {
            newArray[counter] = this.array[counter];
        }

        newArray[this.array.length] = string;
        this.array = newArray;
    }

    /**
     * Removes the last item of an array.
     *
     * @return the value that was removed
    */
    public String pop() {
        String removedValue = "nothing";

        if (this.array.length > 0) {
            removedValue = '"' + this.array[this.array.length - 1] + '"';
            final String[] newArray = new String[this.array.length - 1];

            for (int counter = 0; counter < this.array.length - 1; counter++) {
                newArray[counter] = this.array[counter];
            }

            this.array = newArray;
        }

        return removedValue;
    }
}
