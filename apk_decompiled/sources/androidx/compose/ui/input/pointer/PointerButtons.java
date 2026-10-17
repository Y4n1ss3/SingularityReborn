package androidx.compose.ui.input.pointer;

import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerButtons {
    private final int packedValue;

    private /* synthetic */ PointerButtons(int i) {
        this.packedValue = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerButtons m6024boximpl(int i) {
        return new PointerButtons(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6026equalsimpl(int i, Object obj) {
        return (obj instanceof PointerButtons) && i == ((PointerButtons) obj).m6030unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6027equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6028hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6029toStringimpl(int i) {
        return r6.b("PointerButtons(packedValue=", i, ')');
    }

    public boolean equals(Object obj) {
        return m6026equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6028hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6029toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6030unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6025constructorimpl(int i) {
        return i;
    }
}
