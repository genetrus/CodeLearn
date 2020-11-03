package codewars;


import java.util.HashMap;

public class StockList {

    public static void process(String[] lstOfArt, String[] lstOf1stLetter) {
        String[] bookCategories = getFirstLettsOfCode(lstOfArt);
        Integer[] listOfQuantity = getListOfQuantity(lstOfArt);
        HashMap<String, Integer> mapOfCategories = sumQuantitytoCat(bookCategories, listOfQuantity); // HashMap<String, Integer> summ quantity for each Letters
        getStockSummary(mapOfCategories, lstOf1stLetter);
        for (String s : getStockSummary(mapOfCategories, lstOf1stLetter)) {
            System.out.println(s);
        }
    }

    public static String[] getStockSummary(HashMap<String, Integer> mapOfCategories, String[] lstOf1stLetter) {
        String[] stockSummary = new String[lstOf1stLetter.length];
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            if (mapOfCategories.get(lstOf1stLetter[i]) == null) {
                return new String[]{"", ""};
            } else {
                stockSummary[i] = lstOf1stLetter[i] + ":" + mapOfCategories.get(lstOf1stLetter[i]);
            }
        }
        return stockSummary;
    }

    public static HashMap<String, Integer> sumQuantitytoCat(String[] categories, Integer[] quantity) {
        HashMap<String, Integer> categoriesMap = new HashMap<>();
        for (int i = 0; i < categories.length; i++) {
            if (categoriesMap.get(categories[i]) == null) {
                categoriesMap.put(categories[i], quantity[i]);
            }
            else {
                categoriesMap.put(categories[i], categoriesMap.get(categories[i]) + quantity[i]);
            }
        }
        return categoriesMap;
    }

    public static Integer[] getListOfQuantity(String[] lstOfArt) {
        Integer[] quantity = new Integer[lstOfArt.length];
        for (int i = 0; i < lstOfArt.length; i++) {
            quantity[i] = Integer.valueOf(splitIntoCodeAndQuantity(lstOfArt[i])[1]);
        }
        return quantity;
    }

    public static String[] getFirstLettsOfCode(String[] lstOfArt) {
        String[] firstLetterOfCode = new String[lstOfArt.length];
        for (int i = 0; i < lstOfArt.length; i++) {
            firstLetterOfCode[i] = splitIntoCodeAndQuantity(lstOfArt[i])[0].substring(0, 1);
        }
        return firstLetterOfCode;
    }

    public static String[] splitIntoCodeAndQuantity(String codeBookAndQuantity) {
        return codeBookAndQuantity.split(" ");
    }

    public static void main(String[] args) {
        String art[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String cd[] = new String[]{"A", "B"};
        //stockSummary(art, cd);
        process(art, cd);
    }
}
