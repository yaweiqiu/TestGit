//
// Created by qiuyawei on 2020/7/29.
//
#include <jni.h>

extern "C" JNIEXPORT jint JNICALL
Java_com_example_ndkdemo_MainActivity2_getSum(JNIEnv *env,
jobject thiz, jint
a,
jint b
) {

return a+
b;
}

