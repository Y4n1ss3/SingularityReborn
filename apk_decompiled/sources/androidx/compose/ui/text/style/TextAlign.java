package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.dq;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TextAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Left = m7483constructorimpl(1);
    private static final int Right = m7483constructorimpl(2);
    private static final int Center = m7483constructorimpl(3);
    private static final int Justify = m7483constructorimpl(4);
    private static final int Start = m7483constructorimpl(5);
    private static final int End = m7483constructorimpl(6);
    private static final int Unspecified = m7483constructorimpl(0);

    private /* synthetic */ TextAlign(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextAlign m7482boximpl(int i) {
        return new TextAlign(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7484equalsimpl(int i, Object obj) {
        return (obj instanceof TextAlign) && i == ((TextAlign) obj).m7488unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7485equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7486hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7487toStringimpl(int i) {
        return m7485equalsimpl0(i, Left) ? "Left" : m7485equalsimpl0(i, Right) ? "Right" : m7485equalsimpl0(i, Center) ? "Center" : m7485equalsimpl0(i, Justify) ? "Justify" : m7485equalsimpl0(i, Start) ? "Start" : m7485equalsimpl0(i, End) ? "End" : m7485equalsimpl0(i, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7484equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7486hashCodeimpl(this.value);
    }

    public String toString() {
        return m7487toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7488unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m7489getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m7490getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m7491getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m7492getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m7493getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m7494getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* renamed from: getUnspecified-e0LSkKk, reason: not valid java name */
        public final int m7495getUnspecifiede0LSkKk() {
            return TextAlign.Unspecified;
        }

        /* renamed from: valueOf-IgVj0fw, reason: not valid java name */
        public final int m7496valueOfIgVj0fw(int i) {
            boolean z = false;
            if (i >= 0 && i < 7) {
                z = true;
            }
            if (!z) {
                InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i + " is not recognized by TextAlign.");
            }
            return TextAlign.m7483constructorimpl(i);
        }

        public final List<TextAlign> values() {
            return y80.E(TextAlign.m7482boximpl(m7492getLefte0LSkKk()), TextAlign.m7482boximpl(m7493getRighte0LSkKk()), TextAlign.m7482boximpl(m7489getCentere0LSkKk()), TextAlign.m7482boximpl(m7491getJustifye0LSkKk()), TextAlign.m7482boximpl(m7494getStarte0LSkKk()), TextAlign.m7482boximpl(m7490getEnde0LSkKk()));
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7483constructorimpl(int i) {
        return i;
    }
}
