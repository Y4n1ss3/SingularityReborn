package androidx.compose.runtime.snapshots.tooling;

import defpackage.dq;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SnapshotInstanceObservers {
    public static final int $stable = 0;
    private final ky readObserver;
    private final ky writeObserver;

    public /* synthetic */ SnapshotInstanceObservers(ky kyVar, ky kyVar2, int i, dq dqVar) {
        this((i & 1) != 0 ? null : kyVar, (i & 2) != 0 ? null : kyVar2);
    }

    public final ky getReadObserver() {
        return this.readObserver;
    }

    public final ky getWriteObserver() {
        return this.writeObserver;
    }

    public SnapshotInstanceObservers(ky kyVar, ky kyVar2) {
        this.readObserver = kyVar;
        this.writeObserver = kyVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotInstanceObservers() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
