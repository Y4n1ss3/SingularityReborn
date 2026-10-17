package androidx.compose.ui.autofill;

import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AndroidContentDataType implements ContentDataType {
    private final int androidAutofillType;

    private /* synthetic */ AndroidContentDataType(int i) {
        this.androidAutofillType = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidContentDataType m4252boximpl(int i) {
        return new AndroidContentDataType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4254equalsimpl(int i, Object obj) {
        return (obj instanceof AndroidContentDataType) && i == ((AndroidContentDataType) obj).m4258unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4255equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4256hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4257toStringimpl(int i) {
        return r6.b("AndroidContentDataType(androidAutofillType=", i, ')');
    }

    public boolean equals(Object obj) {
        return m4254equalsimpl(this.androidAutofillType, obj);
    }

    public final int getAndroidAutofillType() {
        return this.androidAutofillType;
    }

    public int hashCode() {
        return m4256hashCodeimpl(this.androidAutofillType);
    }

    public String toString() {
        return m4257toStringimpl(this.androidAutofillType);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4258unboximpl() {
        return this.androidAutofillType;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4253constructorimpl(int i) {
        return i;
    }
}
