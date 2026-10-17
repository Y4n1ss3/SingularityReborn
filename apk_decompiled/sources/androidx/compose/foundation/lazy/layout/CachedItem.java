package androidx.compose.foundation.lazy.layout;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CachedItem {
    private Object key;
    private int mainAxisSize;
    public static final NoKey NoKey = new NoKey(null);
    public static final int $stable = 8;

    public CachedItem(Object obj, int i) {
        this.key = obj;
        this.mainAxisSize = i;
    }

    public final Object getKey() {
        return this.key;
    }

    public final int getMainAxisSize() {
        return this.mainAxisSize;
    }

    public final void setKey(Object obj) {
        this.key = obj;
    }

    public final void setMainAxisSize(int i) {
        this.mainAxisSize = i;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class NoKey {
        public /* synthetic */ NoKey(dq dqVar) {
            this();
        }

        private NoKey() {
        }
    }
}
