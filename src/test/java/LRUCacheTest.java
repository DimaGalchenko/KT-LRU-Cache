import com.djabapractice.LRUCache;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LRUCacheTest {

    @Test(expected = IllegalArgumentException.class)
    public void testShouldThrowExceptionIfCapacityIsZero() {
        new LRUCache(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testShouldThrowExceptionIfCapacityIsNegative() {
        new LRUCache(-1);
    }

    @Test
    public void testPutAndGet() {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);

        assertEquals(1, cache.get(1));
        assertEquals(2, cache.get(2));
    }

    @Test
    public void testEvictionPolicy() {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);
        cache.put(3, 3);
        assertEquals(-1, cache.get(2));
        assertEquals(1, cache.get(1));
        assertEquals(3, cache.get(3));
    }

    @Test
    public void testMoveToHeadWhenKeyExist() {
        LRUCache lruCache = new LRUCache(2);

        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(1, 3);
        lruCache.put(4, 4);

        assertEquals(lruCache.get(2), -1);
        assertEquals(lruCache.get(1), 3);
        assertEquals(lruCache.get(4), 4);
    }

    @Test
    public void testUpdateExistingKey() {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(1, 10);

        assertEquals(10, cache.get(1));
    }

    @Test
    public void testGetNonExistingKey() {
        LRUCache cache = new LRUCache(2);

        assertEquals(-1, cache.get(99));
    }

    @Test
    public void testLRUCacheOperations() {
        LRUCache cache = new LRUCache(2);

        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);

        assertEquals(-1, cache.get(1));
        assertEquals(3, cache.get(2));
    }

}