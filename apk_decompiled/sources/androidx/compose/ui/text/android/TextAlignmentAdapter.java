package androidx.compose.ui.text.android;

import android.text.Layout;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextAlignmentAdapter {
    public static final int $stable = 0;
    private static final Layout.Alignment ALIGN_LEFT_FRAMEWORK;
    private static final Layout.Alignment ALIGN_RIGHT_FRAMEWORK;
    public static final TextAlignmentAdapter INSTANCE = new TextAlignmentAdapter();

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (q10.b(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (q10.b(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        ALIGN_LEFT_FRAMEWORK = alignment;
        ALIGN_RIGHT_FRAMEWORK = alignment2;
    }

    private TextAlignmentAdapter() {
    }

    public final Layout.Alignment get(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : ALIGN_RIGHT_FRAMEWORK : ALIGN_LEFT_FRAMEWORK : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
    }
}
