package androidx.compose.runtime.tooling;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposeStackTraceMode {
    private static boolean isMinified;
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = m4168constructorimpl(0);
    private static final int GroupKeys = m4168constructorimpl(1);
    private static final int SourceInformation = m4168constructorimpl(2);

    private /* synthetic */ ComposeStackTraceMode(int i) {
        this.value = i;
    }

    public static final /* synthetic */ boolean access$isMinified$cp() {
        return true;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ComposeStackTraceMode m4167boximpl(int i) {
        return new ComposeStackTraceMode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4169equalsimpl(int i, Object obj) {
        return (obj instanceof ComposeStackTraceMode) && i == ((ComposeStackTraceMode) obj).m4173unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4170equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4171hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4172toStringimpl(int i) {
        return r6.b("ComposeStackTraceMode(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m4169equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4171hashCodeimpl(this.value);
    }

    public String toString() {
        return m4172toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4173unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getAuto-MD5MrJc, reason: not valid java name */
        public final int m4174getAutoMD5MrJc() {
            return ComposeStackTraceMode.access$isMinified$cp() ? m4175getGroupKeysMD5MrJc() : m4176getNoneMD5MrJc();
        }

        /* renamed from: getGroupKeys-MD5MrJc, reason: not valid java name */
        public final int m4175getGroupKeysMD5MrJc() {
            return ComposeStackTraceMode.GroupKeys;
        }

        /* renamed from: getNone-MD5MrJc, reason: not valid java name */
        public final int m4176getNoneMD5MrJc() {
            return ComposeStackTraceMode.None;
        }

        /* renamed from: getSourceInformation-MD5MrJc, reason: not valid java name */
        public final int m4177getSourceInformationMD5MrJc() {
            return ComposeStackTraceMode.SourceInformation;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m4168constructorimpl(int i) {
        return i;
    }
}
