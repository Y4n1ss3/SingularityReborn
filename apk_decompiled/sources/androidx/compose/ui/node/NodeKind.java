package androidx.compose.ui.node;

import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NodeKind<T> {
    private final int mask;

    private /* synthetic */ NodeKind(int i) {
        this.mask = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeKind m6572boximpl(int i) {
        return new NodeKind(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6574equalsimpl(int i, Object obj) {
        return (obj instanceof NodeKind) && i == ((NodeKind) obj).m6580unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6575equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6576hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: or-H91voCI, reason: not valid java name */
    public static final int m6577orH91voCI(int i, int i2) {
        return i | i2;
    }

    /* renamed from: or-impl, reason: not valid java name */
    public static final int m6578orimpl(int i, int i2) {
        return i | i2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6579toStringimpl(int i) {
        return r6.b("NodeKind(mask=", i, ')');
    }

    public boolean equals(Object obj) {
        return m6574equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m6576hashCodeimpl(this.mask);
    }

    public String toString() {
        return m6579toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6580unboximpl() {
        return this.mask;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m6573constructorimpl(int i) {
        return i;
    }
}
