// Iterable Class Definition

public class Iterable {


    // Instance Variable Declaration

    private int[] elements;
    private int i = -1;

    //


    // Class Methods
    
    public Iterable (int[] elements) {

        this.elements = elements;

    }

    public int getElementoSuccessivo() {

        i++;
        return elements[i];

    }

    public boolean hasAncoraElementi() {

        boolean hasAncoraElementi;

        if (i >= (elements.length - 1)) {

            hasAncoraElementi = false;
        
        } else {

            hasAncoraElementi = true;

        }

        return hasAncoraElementi;

    }

    //


}

//
