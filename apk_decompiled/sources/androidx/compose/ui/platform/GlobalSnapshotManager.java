package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import defpackage.d41;
import defpackage.of;
import defpackage.p01;
import defpackage.p10;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager INSTANCE = new GlobalSnapshotManager();
    private static final AtomicBoolean started = new AtomicBoolean(false);
    private static final AtomicBoolean sent = new AtomicBoolean(false);
    public static final int $stable = 8;

    private GlobalSnapshotManager() {
    }

    public final void ensureStarted() {
        if (started.compareAndSet(false, true)) {
            of b = d41.b(1, 6, null);
            p01.t(p10.a(AndroidUiDispatcher.Companion.getMain()), null, null, new GlobalSnapshotManager$ensureStarted$1(b, null), 3);
            Snapshot.Companion.registerGlobalWriteObserver(new GlobalSnapshotManager$ensureStarted$2(b));
        }
    }
}
