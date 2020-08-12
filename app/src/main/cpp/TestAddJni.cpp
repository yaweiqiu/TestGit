#include "jni.h"
#include "math.h"

extern "C" JNIEXPORT void JNICALL
Java_com_example_ndkdemo_MainActivity2_callStaticMethod(JNIEnv
                                                        *env,
                                                        jobject instance
) {
    jclass cls = env->FindClass("com/example/ndkdemo/MainActivity2");
    if (cls == NULL) return;
//    jmethodID mth_static_method = env->GetStaticMethodID(cls, "logMessage",
//                                                         "(Ljava/lang/String;)V");
//    if (mth_static_method == NULL) return;
//     构建String变量
//    jstring str = env->NewStringUTF("这是从JNI调用的Log");
//    env->CallStaticVoidMethod(cls, mth_static_method, str);
//    env->DeleteLocalRef(cls);
//    env->DeleteLocalRef(str);
}
