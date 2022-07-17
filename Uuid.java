package org.example;

import java.util.UUID;

/**
 * UUID获取
 */

public class Uuid {

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            String uuid= UUID.randomUUID().toString().replace("-","");
            System.out.println(uuid);
        }
    }
}
