package com.topjohnwu.superuser.internal;

import java.io.Closeable;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Closeable e;

    public /* synthetic */ b(Closeable closeable, int i) {
        this.d = i;
        this.e = closeable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ResultImpl exec0;
        Integer shellCheck;
        int i = this.d;
        Closeable closeable = this.e;
        switch (i) {
            case 0:
                exec0 = ((JobImpl) closeable).exec0();
                return exec0;
            default:
                shellCheck = ((ShellImpl) closeable).shellCheck();
                return shellCheck;
        }
    }
}
