package com.scottyab.rootbeer;

import com.scottyab.rootbeer.util.QLog;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class RootBeerNative {
    private static boolean libraryLoaded = false;

    static {
        try {
            System.loadLibrary("toolChecker");
            libraryLoaded = true;
        } catch (UnsatisfiedLinkError e) {
            QLog.e(e);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);

    public boolean wasNativeLibraryLoaded() {
        return libraryLoaded;
    }
}
