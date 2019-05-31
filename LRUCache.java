import java.util.HashMap;
import java.util.Map;

/**
 * Created by heena.madan on 31/10/16.
 */
public class LRUCache {

    LRUCache(){


    }

private DoublyLinkedList doublyLinkedList;
    private Map<Integer,Node> pageMap;
private   int  cacheSize;

    public LRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
        pageMap= new HashMap<>();
        doublyLinkedList =  new DoublyLinkedList(cacheSize);
    }

    public void accessPage(int pagNo) {
        if (pageMap.containsKey(pagNo)) {
            Node pageNode = pageMap.get(pagNo);
            //If page is present in the cache, move the page to the start of list
            doublyLinkedList.moveAhead(pageNode);
        }
        else{

            // If cache is full, we will remove the tail from the cache pageList. Remove it from map too
            if(doublyLinkedList.getCurrentSize() == doublyLinkedList.getSize()){
                pageMap.remove(doublyLinkedList.getTail().getPageNumber());
            }

            Node pageNode= doublyLinkedList.addPageToStartOfList(pagNo);
            pageMap.put(pagNo,pageNode);
        }
    }

    public void printCacheState() {
             doublyLinkedList.printList();
            System.out.println();
    }


    public static void main(String[] args) {
        int cacheSize = 4;
        LRUCache cache = new LRUCache(cacheSize);
        cache.accessPage(4);
        cache.printCacheState();
        cache.accessPage(2);
        cache.printCacheState();
        cache.accessPage(1);
        cache.printCacheState();
        cache.accessPage(1);
        cache.printCacheState();
        cache.accessPage(4);
        cache.printCacheState();
        cache.accessPage(3);
        cache.printCacheState();
        cache.accessPage(7);
        cache.printCacheState();
        cache.accessPage(8);
        cache.printCacheState();
        cache.accessPage(3);
        cache.printCacheState();
}

    }

    /*When a page is accessed, there can be 2 cases:
        1. Page is present in the cache - If the page is already present in the cache, we move the page to the start of the list.
        2. Page is not present in the cache - If the page is not present in the cache, we add the page to the list.
        How to add a page to the list:
        a. If the cache is not full, add the new page to the start of the list.
        b. If the cache is full, remove the last node of the linked list and move the new page to the start of the list.*/