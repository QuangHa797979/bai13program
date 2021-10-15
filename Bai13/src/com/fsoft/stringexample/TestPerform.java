package com.fsoft.stringexample;

public class TestPerform{  
    public static void main(String[] args){  
        long startTime = System.currentTimeMillis();  
        StringBuffer buffer = new StringBuffer("Hello");  
        for (int i=0; i<100000; i++){  
            buffer.append("Word");  
        }  
        System.out.println("StringBuffer is: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        StringBuilder builder = new StringBuilder("Hello");  
        for (int i=0; i<100000; i++){  
        	builder.append("Word");  
        }  
        System.out.println("StringBuilder is: " + (System.currentTimeMillis() - startTime) + "ms");  
    }  
}

// StringBuffer là đồng bộ (synchronized) tức là luồng an toàn, không thể có 2 luồng cùng truy cập phương thức của lớp StringBuffer đồng thời.
// StringBuilder là không đồng bộ (non-synchronized) tức là luồng không an toàn, có thể có 2 luồng cùng truy cập phương thức của lớp StringBuilder đồng thời.

// Out put: StringBuffer is: 6ms, StringBuilder is: 3ms => tốc độ khi xử lý chuỗi của StringBuilder sẽ nhanh hơn StringBuffer!
// StringBuffer, StringBuilder có thể thay đổi (mutable)
// StringBuilder và StringBuffer là giống nhau, 
// nó chỉ khác biệt tình huống sử dụng có liên quan tới đa luồng (Multi Thread). => về tốc độ xử lý StringBuilder là tốt nhất, sau đó StringBuffer và cuối cùng mới là String.