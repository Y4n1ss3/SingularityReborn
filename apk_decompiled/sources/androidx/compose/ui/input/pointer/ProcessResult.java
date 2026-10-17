package androidx.compose.ui.input.pointer;

import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ProcessResult {
    private final int value;

    private /* synthetic */ ProcessResult(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ProcessResult m6185boximpl(int i) {
        return new ProcessResult(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6187equalsimpl(int i, Object obj) {
        return (obj instanceof ProcessResult) && i == ((ProcessResult) obj).m6194unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6188equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getAnyChangeConsumed-impl, reason: not valid java name */
    public static final boolean m6189getAnyChangeConsumedimpl(int i) {
        return (i & 4) != 0;
    }

    /* renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m6190getAnyMovementConsumedimpl(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m6191getDispatchedToAPointerInputModifierimpl(int i) {
        return (i & 1) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6192hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6193toStringimpl(int i) {
        return r6.b("ProcessResult(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m6187equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m6192hashCodeimpl(this.value);
    }

    public String toString() {
        return m6193toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6194unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6186constructorimpl(int i) {
        return i;
    }
}
