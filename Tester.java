
/**
 * Tests your APHashMap class
 */
public class Tester
{
    public static void tester() {
        String[] items = {"apples", "bananas", "cherries", "dates", "elderberries", "figs", "grapefruit"};
        int[] counts = {10, 17, 32, 24, 6, 11, 3};
        
        APHashMap<String, Integer> map = new APHashMap<String, Integer>(4);
        System.out.println("*******************************************");
        System.out.println("* First loop: Adding new items to the map *");
        System.out.println("*******************************************");
        System.out.println();
        
        for(int i = 0; i < items.length; i++) {
            String item = items[i];
            int count = counts[i];
            
            System.out.println("Adding new key/value pair: (" + item + ", " + count + ")");
            map.put(item, count);
            
            System.out.println("Map is now: ");
            System.out.println("-----------------");
            map.printMap();
            System.out.println("-----------------");
            System.out.println("Size = " + map.size());
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        System.out.println("After adding all pairs, the state of the map is:");
        System.out.println("-----------------");
        map.printMap();
        System.out.println("-----------------");
        System.out.println();
        
        System.out.println("*****************************************");
        System.out.println("* Second loop: Testing the get() method *");
        System.out.println("*****************************************");
        System.out.println();
        
        
        
        for(String item : items) {
            System.out.println(item + " returns " + map.get(item));
        }
        
        System.out.println();
        System.out.println();

        System.out.println("*****************************************");
        System.out.println("* Third loop: Testing the remove() method *");
        System.out.println("*****************************************");
        System.out.println();
        
        for(String item : items) {
            System.out.println("Removing " + item + " returns " + map.remove(item));
            System.out.println("Map is now:");
            System.out.println("-----------------");
            map.printMap();
            System.out.println("-----------------");
            System.out.println("Size = " + map.size());
            System.out.println();
        }
        
        
    }
}
