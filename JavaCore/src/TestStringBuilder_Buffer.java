public class TestStringBuilder_Buffer {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello");
        }
        System.out.println("Thời gian nối chuỗi của StringBuffer: "
                + (System.currentTimeMillis() - startTime) + "ms");
        
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 100000; i++) {
            sb2.append("Hello");
        }
        System.out.println("Thời gian nối chuỗi của StringBuilder: "
                + (System.currentTimeMillis() - startTime) + "ms");
    }
    }

