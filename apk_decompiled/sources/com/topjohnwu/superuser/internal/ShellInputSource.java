package com.topjohnwu.superuser.internal;

import java.io.Closeable;
import java.io.OutputStream;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
interface ShellInputSource extends Closeable {
    public static final String TAG = "SHELL_IN";

    void serve(OutputStream outputStream);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
    }
}
