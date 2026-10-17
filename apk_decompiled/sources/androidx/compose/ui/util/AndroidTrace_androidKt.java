package androidx.compose.ui.util;

import android.os.Trace;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidTrace_androidKt {
    public static final <T> T trace(String str, iy iyVar) {
        Trace.beginSection(str);
        try {
            return (T) iyVar.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public static final void traceValue(String str, long j) {
        Trace.setCounter(str, j);
    }
}
