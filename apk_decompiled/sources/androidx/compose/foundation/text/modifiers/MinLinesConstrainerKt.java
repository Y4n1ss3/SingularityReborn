package androidx.compose.foundation.text.modifiers;

import defpackage.ks0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MinLinesConstrainerKt {
    private static final int DefaultWidthCharCount = 10;
    private static final String EmptyTextReplacement;
    private static final String TwoLineTextReplacement;

    static {
        String a0 = ks0.a0(10, "H");
        EmptyTextReplacement = a0;
        TwoLineTextReplacement = a0 + '\n' + a0;
    }
}
