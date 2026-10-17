package androidx.compose.foundation.gestures.snapping;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FinalSnappingItem {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int ClosestItem = m578constructorimpl(0);
    private static final int NextItem = m578constructorimpl(1);
    private static final int PreviousItem = m578constructorimpl(2);

    private /* synthetic */ FinalSnappingItem(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FinalSnappingItem m577boximpl(int i) {
        return new FinalSnappingItem(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m579equalsimpl(int i, Object obj) {
        return (obj instanceof FinalSnappingItem) && i == ((FinalSnappingItem) obj).m583unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m580equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m581hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m582toStringimpl(int i) {
        return r6.b("FinalSnappingItem(value=", i, ')');
    }

    public boolean equals(Object obj) {
        return m579equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m581hashCodeimpl(this.value);
    }

    public String toString() {
        return m582toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m583unboximpl() {
        return this.value;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getClosestItem-bbeMdSM, reason: not valid java name */
        public final int m584getClosestItembbeMdSM() {
            return FinalSnappingItem.ClosestItem;
        }

        /* renamed from: getNextItem-bbeMdSM, reason: not valid java name */
        public final int m585getNextItembbeMdSM() {
            return FinalSnappingItem.NextItem;
        }

        /* renamed from: getPreviousItem-bbeMdSM, reason: not valid java name */
        public final int m586getPreviousItembbeMdSM() {
            return FinalSnappingItem.PreviousItem;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m578constructorimpl(int i) {
        return i;
    }
}
