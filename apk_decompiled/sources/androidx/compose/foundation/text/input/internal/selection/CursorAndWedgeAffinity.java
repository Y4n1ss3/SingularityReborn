package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CursorAndWedgeAffinity {
    private final long value;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WedgeAffinity.values().length];
            try {
                iArr[WedgeAffinity.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WedgeAffinity.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private /* synthetic */ CursorAndWedgeAffinity(long j) {
        this.value = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CursorAndWedgeAffinity m1373boximpl(long j) {
        return new CursorAndWedgeAffinity(j);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m1374component1impl(long j) {
        return m1381getCursorimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final WedgeAffinity m1375component2impl(long j) {
        return m1382getWedgeAffinityimpl(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1377constructorimpl(int i, WedgeAffinity wedgeAffinity) {
        int i2 = -1;
        int i3 = wedgeAffinity == null ? -1 : WhenMappings.$EnumSwitchMapping$0[wedgeAffinity.ordinal()];
        if (i3 != -1) {
            i2 = 1;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 != 2) {
                o.n();
                return 0L;
            }
        }
        return m1378constructorimpl((i << 32) | (i2 & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1379equalsimpl(long j, Object obj) {
        return (obj instanceof CursorAndWedgeAffinity) && j == ((CursorAndWedgeAffinity) obj).m1385unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1380equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getCursor-impl, reason: not valid java name */
    public static final int m1381getCursorimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: getWedgeAffinity-impl, reason: not valid java name */
    public static final WedgeAffinity m1382getWedgeAffinityimpl(long j) {
        int i = (int) (j & 4294967295L);
        if (i < 0) {
            return null;
        }
        return i == 0 ? WedgeAffinity.Start : WedgeAffinity.End;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1383hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1384toStringimpl(long j) {
        return "CursorAndWedgeAffinity(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m1379equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m1383hashCodeimpl(this.value);
    }

    public String toString() {
        return m1384toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1385unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1376constructorimpl(int i) {
        return m1378constructorimpl((i << 32) | 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1378constructorimpl(long j) {
        return j;
    }
}
