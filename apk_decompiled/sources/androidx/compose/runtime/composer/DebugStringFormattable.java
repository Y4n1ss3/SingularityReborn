package androidx.compose.runtime.composer;

import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class DebugStringFormattable {
    public static final int $stable = 0;

    public static /* synthetic */ String toDebugString$default(DebugStringFormattable debugStringFormattable, String str, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: toDebugString");
            return null;
        }
        if ((i & 1) != 0) {
            str = "  ";
        }
        return debugStringFormattable.toDebugString(str);
    }

    public abstract String toDebugString(String str);
}
