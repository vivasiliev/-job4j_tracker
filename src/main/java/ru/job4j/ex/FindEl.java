package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }
            if (rsl == -1) {
                throw new ElementNotFoundException("Element not found");
            }

        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] value = {"one", "two", "three"};
        try {
            System.out.println(indexOf(value, "three"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
