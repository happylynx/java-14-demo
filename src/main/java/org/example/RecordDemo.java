package org.example;

public record RecordDemo(int num, String text) {
    public static void main(String[] args) {
        record Other(int num, String text) {
            public static Other fromRecordDemo(RecordDemo source) {
                return new Other(source.num, source.text());
            }
        }
        final Other other = Other.fromRecordDemo(new RecordDemo(2, "foo"));
        System.out.println("other " + other);
    }
}
