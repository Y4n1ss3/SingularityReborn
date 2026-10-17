package androidx.compose.material3;

import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuAnchorType {
    private final String name;
    public static final Companion Companion = new Companion(null);
    private static final String PrimaryNotEditable = m1950constructorimpl("PrimaryNotEditable");
    private static final String PrimaryEditable = m1950constructorimpl("PrimaryEditable");
    private static final String SecondaryEditable = m1950constructorimpl("SecondaryEditable");

    private /* synthetic */ ExposedDropdownMenuAnchorType(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ExposedDropdownMenuAnchorType m1949boximpl(String str) {
        return new ExposedDropdownMenuAnchorType(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1951equalsimpl(String str, Object obj) {
        return (obj instanceof ExposedDropdownMenuAnchorType) && q10.b(str, ((ExposedDropdownMenuAnchorType) obj).m1955unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1952equalsimpl0(String str, String str2) {
        return q10.b(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1953hashCodeimpl(String str) {
        return str.hashCode();
    }

    public boolean equals(Object obj) {
        return m1951equalsimpl(this.name, obj);
    }

    public int hashCode() {
        return m1953hashCodeimpl(this.name);
    }

    public String toString() {
        return m1954toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m1955unboximpl() {
        return this.name;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getPrimaryEditable-oYjWRB4, reason: not valid java name */
        public final String m1956getPrimaryEditableoYjWRB4() {
            return ExposedDropdownMenuAnchorType.PrimaryEditable;
        }

        /* renamed from: getPrimaryNotEditable-oYjWRB4, reason: not valid java name */
        public final String m1957getPrimaryNotEditableoYjWRB4() {
            return ExposedDropdownMenuAnchorType.PrimaryNotEditable;
        }

        /* renamed from: getSecondaryEditable-oYjWRB4, reason: not valid java name */
        public final String m1958getSecondaryEditableoYjWRB4() {
            return ExposedDropdownMenuAnchorType.SecondaryEditable;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static String m1950constructorimpl(String str) {
        return str;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1954toStringimpl(String str) {
        return str;
    }
}
