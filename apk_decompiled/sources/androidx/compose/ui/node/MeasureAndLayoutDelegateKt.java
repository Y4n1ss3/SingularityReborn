package androidx.compose.ui.node;

import android.os.Trace;
import androidx.compose.runtime.tooling.ComposeToolingFlags;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MeasureAndLayoutDelegateKt {
    public static final <T> T traceMeasureLayout(String str, iy iyVar) {
        if (!ComposeToolingFlags.isVerboseTracingEnabled) {
            return (T) iyVar.invoke();
        }
        Trace.beginSection(str);
        try {
            return (T) iyVar.invoke();
        } finally {
            Trace.endSection();
        }
    }

    public static final <T> T traceMeasureLayoutIf(boolean z, String str, iy iyVar) {
        if (!ComposeToolingFlags.isVerboseTracingEnabled || !z) {
            return (T) iyVar.invoke();
        }
        Trace.beginSection(str);
        try {
            return (T) iyVar.invoke();
        } finally {
            Trace.endSection();
        }
    }
}
