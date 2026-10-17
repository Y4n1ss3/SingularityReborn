package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import defpackage.c21;
import defpackage.dq;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextDecoration {
    public static final int $stable = 0;
    private final int mask;
    public static final Companion Companion = new Companion(null);
    private static final TextDecoration None = new TextDecoration(0);
    private static final TextDecoration Underline = new TextDecoration(1);
    private static final TextDecoration LineThrough = new TextDecoration(2);

    public TextDecoration(int i) {
        this.mask = i;
    }

    public final boolean contains(TextDecoration textDecoration) {
        int i = this.mask;
        return (textDecoration.mask | i) == i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextDecoration) && this.mask == ((TextDecoration) obj).mask;
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    public final TextDecoration plus(TextDecoration textDecoration) {
        return new TextDecoration(this.mask | textDecoration.mask);
    }

    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & Underline.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & LineThrough.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return c21.a(new StringBuilder("TextDecoration["), ListUtilsKt.fastJoinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final TextDecoration combine(List<TextDecoration> list) {
            Integer num = 0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                num = Integer.valueOf(num.intValue() | list.get(i).getMask());
            }
            return new TextDecoration(num.intValue());
        }

        public final TextDecoration getLineThrough() {
            return TextDecoration.LineThrough;
        }

        public final TextDecoration getNone() {
            return TextDecoration.None;
        }

        public final TextDecoration getUnderline() {
            return TextDecoration.Underline;
        }

        public final TextDecoration valueOf(int i) {
            if (!((i | 3) == 3)) {
                InlineClassHelperKt.throwIllegalArgumentException("The given mask=" + i + " is not recognized by TextDecoration.");
            }
            return i != 0 ? i != 1 ? i != 2 ? new TextDecoration(i) : getLineThrough() : getUnderline() : getNone();
        }

        private Companion() {
        }

        public static /* synthetic */ void getLineThrough$annotations() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        public static /* synthetic */ void getUnderline$annotations() {
        }
    }
}
