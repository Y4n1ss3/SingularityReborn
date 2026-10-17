package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DeviceFontFamilyName {
    private final String name;

    private /* synthetic */ DeviceFontFamilyName(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m7135boximpl(String str) {
        return new DeviceFontFamilyName(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m7136constructorimpl(String str) {
        if (!(str.length() > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("name may not be empty");
        }
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7137equalsimpl(String str, Object obj) {
        return (obj instanceof DeviceFontFamilyName) && q10.b(str, ((DeviceFontFamilyName) obj).m7141unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7138equalsimpl0(String str, String str2) {
        return q10.b(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7139hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7140toStringimpl(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m7137equalsimpl(this.name, obj);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return m7139hashCodeimpl(this.name);
    }

    public String toString() {
        return m7140toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m7141unboximpl() {
        return this.name;
    }
}
