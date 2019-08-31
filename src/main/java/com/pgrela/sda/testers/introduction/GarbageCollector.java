package com.pgrela.sda.testers.introduction;

public class GarbageCollector {

    private static final int TEN_MILLION = 10_000_000;
    private static final int NEW_OBJECT_SIZE_BYTES = 16;

    public static void main(String[] args) {
        long createdObjects = 0;
        while (true) {
            Object newObject = new Object();
            if (newObject != null) {
                ++createdObjects;
            }
            if (createdObjects % TEN_MILLION == 0) {
                System.out.println(String.format("Created %d millions objects, they take %f GB",
                        createdObjects / TEN_MILLION * 10, createdObjects * NEW_OBJECT_SIZE_BYTES / (1024. * 1024 * 1024)));
            }
        }
    }
}
