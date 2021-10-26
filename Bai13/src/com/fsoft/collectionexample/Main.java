package com.fsoft.collectionexample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Set<String> set = new HashSet<>();
        set.add("1"); set.add("2");set.add("3"); set.add("4");
        
        int sum = list.stream()
                .filter(value -> value > 0)
                .mapToInt(value -> value)
                .sum();
        
        set.stream().forEach(s -> System.out.println(s));
        System.out.println(sum);
    }
}


// Ta có ArrayList implements <interface> List, có hai cách khai báo và cách ở trên là hoàn toàn hợp lệ. Nhưng nên dùng cách dưới đây

// List<String> courses = new ArrayList<>();
// Vì nó thể hiện rõ phong cách hướng đối tượng của java. Ta có thể có các cách khác trong việc tạo các collection khác nhau implement từ interface List.

// List<String> arrayList = new ArrayList<>();
// List<String> linkedList = new LinkedList<>();
// List<StrictMath> vector = new Vector<>();