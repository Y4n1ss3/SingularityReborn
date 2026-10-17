package androidx.compose.ui.platform;

import defpackage.f30;
import defpackage.ky;
import defpackage.w01;
import defpackage.zg;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class GlobalSnapshotManager$ensureStarted$2 extends f30 implements ky {
    final /* synthetic */ zg $channel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$2(zg zgVar) {
        super(1);
        this.$channel = zgVar;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6757invoke(Object obj) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = GlobalSnapshotManager.sent;
        if (atomicBoolean.compareAndSet(false, true)) {
            this.$channel.m(w01.a);
        }
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m6757invoke(obj);
        return w01.a;
    }
}
