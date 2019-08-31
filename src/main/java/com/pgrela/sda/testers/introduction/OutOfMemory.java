package com.pgrela.sda.testers.introduction;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {

    private static final int MILLION = 1_000_000;
    private static final int NEW_OBJECT_SIZE_BYTES = 16;

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        while (true) {
            objects.add(new Object());
            int createdObjects = objects.size();
            if (createdObjects % MILLION == 0) {
                System.out.println(String.format("Created %d millions objects, they take %f GB",
                        createdObjects / MILLION, (createdObjects * NEW_OBJECT_SIZE_BYTES / 1024 / 1024) / 1024d));
            }
        }
    }
}
