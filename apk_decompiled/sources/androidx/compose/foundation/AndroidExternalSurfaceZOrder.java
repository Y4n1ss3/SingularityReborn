package androidx.compose.foundation;

import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidExternalSurfaceZOrder {
    private final int zOrder;
    public static final Companion Companion = new Companion(null);
    private static final int Behind = m212constructorimpl(0);
    private static final int MediaOverlay = m212constructorimpl(1);
    private static final int OnTop = m212constructorimpl(2);

    private /* synthetic */ AndroidExternalSurfaceZOrder(int i) {
        this.zOrder = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AndroidExternalSurfaceZOrder m211boximpl(int i) {
        return new AndroidExternalSurfaceZOrder(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m213equalsimpl(int i, Object obj) {
        return (obj instanceof AndroidExternalSurfaceZOrder) && i == ((AndroidExternalSurfaceZOrder) obj).m217unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m214equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m215hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m216toStringimpl(int i) {
        return r6.b("AndroidExternalSurfaceZOrder(zOrder=", i, ')');
    }

    public boolean equals(Object obj) {
        return m213equalsimpl(this.zOrder, obj);
    }

    public final int getZOrder() {
        return this.zOrder;
    }

    public int hashCode() {
        return m215hashCodeimpl(this.zOrder);
    }

    public String toString() {
        return m216toStringimpl(this.zOrder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m217unboximpl() {
        return this.zOrder;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: getBehind-B_4ceCc, reason: not valid java name */
        public final int m218getBehindB_4ceCc() {
            return AndroidExternalSurfaceZOrder.Behind;
        }

        /* renamed from: getMediaOverlay-B_4ceCc, reason: not valid java name */
        public final int m219getMediaOverlayB_4ceCc() {
            return AndroidExternalSurfaceZOrder.MediaOverlay;
        }

        /* renamed from: getOnTop-B_4ceCc, reason: not valid java name */
        public final int m220getOnTopB_4ceCc() {
            return AndroidExternalSurfaceZOrder.OnTop;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m212constructorimpl(int i) {
        return i;
    }
}
