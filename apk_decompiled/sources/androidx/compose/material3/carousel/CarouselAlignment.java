package androidx.compose.material3.carousel;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarouselAlignment {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Start = m2853constructorimpl(-1);
    private static final int Center = m2853constructorimpl(0);
    private static final int End = m2853constructorimpl(1);

    private /* synthetic */ CarouselAlignment(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CarouselAlignment m2852boximpl(int i) {
        return new CarouselAlignment(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2854equalsimpl(int i, Object obj) {
        return (obj instanceof CarouselAlignment) && i == ((CarouselAlignment) obj).m2858unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2855equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2856hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2857toStringimpl(int i) {
        return r6.b("CarouselAlignment(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m2854equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2856hashCodeimpl(this.value);
    }

    public String toString() {
        return m2857toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2858unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getCenter-NUL3oTo, reason: not valid java name */
        public final int m2859getCenterNUL3oTo() {
            return CarouselAlignment.Center;
        }

        /* renamed from: getEnd-NUL3oTo, reason: not valid java name */
        public final int m2860getEndNUL3oTo() {
            return CarouselAlignment.End;
        }

        /* renamed from: getStart-NUL3oTo, reason: not valid java name */
        public final int m2861getStartNUL3oTo() {
            return CarouselAlignment.Start;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2853constructorimpl(int i) {
        return i;
    }
}
