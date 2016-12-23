#include <jni.h>
#include "myadd.h"
#include "com_jni_demo_JNIDemo.h"

JNIEXPORT jint JNICALL Java_com_jni_demo_JNIDemo_nativeAdd
  (JNIEnv *env, jobject thiz, jint a, jint b)
{
    return myadd(a, b);
}