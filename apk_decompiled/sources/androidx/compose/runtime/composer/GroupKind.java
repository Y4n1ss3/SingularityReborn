package androidx.compose.runtime.composer;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GroupKind {
    public static final Companion Companion = new Companion(null);
    private static final int Group = m3939constructorimpl(0);
    private static final int Node = m3939constructorimpl(1);
    private static final int ReusableNode = m3939constructorimpl(2);
    private final int value;

    private /* synthetic */ GroupKind(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GroupKind m3938boximpl(int i) {
        return new GroupKind(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3940equalsimpl(int i, Object obj) {
        return (obj instanceof GroupKind) && i == ((GroupKind) obj).m3946unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3941equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3942hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m3943isNodeimpl(int i) {
        return i != Companion.m3947getGroup9udXigM();
    }

    /* renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m3944isReusableimpl(int i) {
        return i != Companion.m3948getNode9udXigM();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3945toStringimpl(int i) {
        return r6.b("GroupKind(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m3940equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m3942hashCodeimpl(this.value);
    }

    public String toString() {
        return m3945toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3946unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getGroup-9udXigM, reason: not valid java name */
        public final int m3947getGroup9udXigM() {
            return GroupKind.Group;
        }

        /* renamed from: getNode-9udXigM, reason: not valid java name */
        public final int m3948getNode9udXigM() {
            return GroupKind.Node;
        }

        /* renamed from: getReusableNode-9udXigM, reason: not valid java name */
        public final int m3949getReusableNode9udXigM() {
            return GroupKind.ReusableNode;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m3939constructorimpl(int i) {
        return i;
    }
}
