package androidx.compose.ui.input.pointer;

import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PointerKeyboardModifiers {
    private final int packedValue;

    private /* synthetic */ PointerKeyboardModifiers(int i) {
        this.packedValue = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PointerKeyboardModifiers m6164boximpl(int i) {
        return new PointerKeyboardModifiers(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6166equalsimpl(int i, Object obj) {
        return (obj instanceof PointerKeyboardModifiers) && i == ((PointerKeyboardModifiers) obj).m6170unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6167equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6168hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6169toStringimpl(int i) {
        return r6.b("PointerKeyboardModifiers(packedValue=", i, ')');
    }

    public boolean equals(Object obj) {
        return m6166equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m6168hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m6169toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6170unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6165constructorimpl(int i) {
        return i;
    }
}
