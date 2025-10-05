package Assignment4;

class MinMaxFinder<T extends Comparable<T>> {
    private java.util.List<T> list;

    public MinMaxFinder(java.util.List<T> list) {
        this.list = list;
    }

    public T findMin() { return java.util.Collections.min(list); }
    public T findMax() { return java.util.Collections.max(list); }
}

class Main {
    public static void main(String[] args) {
        java.util.List<Integer> intList = java.util.Arrays.asList(5, 2, 8, 1);
        MinMaxFinder<Integer> intFinder = new MinMaxFinder<>(intList);
        System.out.println("Min: " + intFinder.findMin() + ", Max: " + intFinder.findMax());

        java.util.List<String> strList = java.util.Arrays.asList("Apple", "Mango", "Banana");
        MinMaxFinder<String> strFinder = new MinMaxFinder<>(strList);
        System.out.println("Min: " + strFinder.findMin() + ", Max: " + strFinder.findMax());
    }
}

