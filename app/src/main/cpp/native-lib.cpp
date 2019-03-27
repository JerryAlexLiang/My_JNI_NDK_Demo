//
// Created by lyang on 2019/3/26.
//
#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring

JNICALL
Java_liang_com_my_1jni_1ndk_1demo_NDKTools_getStringFromNDK(
        JNIEnv *env, jclass type) {
    std::string hello = "(*^__^*) Java2JNI C++ My First JNI NDK Demo";
    return env->NewStringUTF(hello.c_str());
}
