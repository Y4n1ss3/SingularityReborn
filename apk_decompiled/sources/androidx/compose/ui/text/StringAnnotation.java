package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class StringAnnotation implements AnnotatedString.Annotation {
    private final String value;

    private /* synthetic */ StringAnnotation(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StringAnnotation m7008boximpl(String str) {
        return new StringAnnotation(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7010equalsimpl(String str, Object obj) {
        return (obj instanceof StringAnnotation) && q10.b(str, ((StringAnnotation) obj).m7014unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7011equalsimpl0(String str, String str2) {
        return q10.b(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7012hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7013toStringimpl(String str) {
        return "StringAnnotation(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m7010equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m7012hashCodeimpl(this.value);
    }

    public String toString() {
        return m7013toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m7014unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m7009constructorimpl(String str) {
        return str;
    }
}
