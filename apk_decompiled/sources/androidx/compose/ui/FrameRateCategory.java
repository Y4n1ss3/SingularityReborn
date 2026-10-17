package androidx.compose.ui;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FrameRateCategory {
    private final float value;
    public static final Companion Companion = new Companion(null);
    private static final float Default = m4180constructorimpl(Float.NaN);
    private static final float Normal = m4180constructorimpl(-3.0f);
    private static final float High = m4180constructorimpl(-4.0f);

    private /* synthetic */ FrameRateCategory(float f) {
        this.value = f;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FrameRateCategory m4179boximpl(float f) {
        return new FrameRateCategory(f);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4181equalsimpl(float f, Object obj) {
        return (obj instanceof FrameRateCategory) && Float.compare(f, ((FrameRateCategory) obj).m4185unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4182equalsimpl0(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4183hashCodeimpl(float f) {
        return Float.hashCode(f);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4184toStringimpl(float f) {
        return f == -3.0f ? "Normal" : f == -4.0f ? "High" : "Default";
    }

    public boolean equals(Object obj) {
        return m4181equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4183hashCodeimpl(this.value);
    }

    public String toString() {
        return m4184toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m4185unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getDefault-NSsRyOo, reason: not valid java name */
        public final float m4186getDefaultNSsRyOo() {
            return FrameRateCategory.Default;
        }

        /* renamed from: getHigh-NSsRyOo, reason: not valid java name */
        public final float m4187getHighNSsRyOo() {
            return FrameRateCategory.High;
        }

        /* renamed from: getNormal-NSsRyOo, reason: not valid java name */
        public final float m4188getNormalNSsRyOo() {
            return FrameRateCategory.Normal;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static float m4180constructorimpl(float f) {
        return f;
    }
}
