
# This makefile fragment calls for the building of subdirectories containing their own Android.mk

# In this case, it causes netdefs and hostdefs to be created.  In order to build an Android package, 
# those binaries must be uploaded onto an android device or emulator and executed.  
# The output of these programs become netdefs_android.ijs and hostdefs_android.ijs respectively.  
# They must be placed in <PROJECT_ROOT>/assets/system/defs in the final package in order to
# be installed at first boot along with the rest of the system files.

# For convenience, a copy of these 2 def files have already been generated and placed there.


LOCAL_PATH:=(call my-dir)

TARGET_PLATFORM := android-7

#include jni/openj-core/Android.mk
# bill is alternative, termporarily to openj-core
include jni/bill/Android.mk

# include jni/libm/Android.mk
#include jni/openj-core/Jconsole.mk
#include jni/openj-core/Tsdll.mk
include jni/pcre-8.21/Android.mk
