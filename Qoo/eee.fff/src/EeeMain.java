import qoo.aaa.User;

public class EeeMain {
    /**
     * java.lang.module.InvalidModuleDescriptorException: EeeMain.class found in top-level directory (unnamed package not allowed in module)
     * 表示此類別不可放在 src 下，多建一個包，然後將此類別放在裡面就可解決
     * 或者刪除 module-info.java，但如果要用另外的模組就不能用這招了
     */
    public static void main(String[] args) {
        new User();
    }
}
