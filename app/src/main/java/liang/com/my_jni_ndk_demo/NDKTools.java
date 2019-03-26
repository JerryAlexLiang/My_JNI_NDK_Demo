package liang.com.my_jni_ndk_demo;

public class NDKTools {

    //添加引用
    static {
        System.loadLibrary("native-lib");
    }

    public static native String getStringFromNDK();
}
