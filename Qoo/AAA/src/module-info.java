module AAA { // open module AAA { exports 的包都可用反射的 setAccessible(true);
//    requires java.base;
    exports qoo.aaa; // 匯出
//    exports qoo.aaa to eee.fff, ccc.ddd; // 匯出到指定的模組
//    opens qoo.aaa; // 某個包才可以用反射的 setAccessible(true);
//    opens qoo.aaa to eee.fff; // 指定的模組才可用某個包的 setAccessible(true);

}