package androidx.compose.ui.platform;

import androidx.compose.runtime.snapshots.Snapshot;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.nf;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.zg;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {64}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class GlobalSnapshotManager$ensureStarted$1 extends us0 implements my {
    final /* synthetic */ zg $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(zg zgVar, hm hmVar) {
        super(2, hmVar);
        this.$channel = zgVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[Catch: all -> 0x0014, TRY_LEAVE, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0010, B:7:0x0035, B:9:0x003d, B:10:0x0026, B:21:0x0021), top: B:2:0x0004 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:7:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zg zgVar;
        nf it;
        vn vnVar;
        AtomicBoolean atomicBoolean;
        int i = this.label;
        try {
            if (i == 0) {
                p10.Q(obj);
                zgVar = this.$channel;
                it = zgVar.iterator();
                this.L$0 = zgVar;
                this.L$1 = it;
                this.label = 1;
                obj = it.b(this);
                vnVar = vn.d;
                if (obj == vnVar) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (nf) this.L$1;
                zgVar = (zg) this.L$0;
                p10.Q(obj);
                if (((Boolean) obj).booleanValue()) {
                    atomicBoolean = GlobalSnapshotManager.sent;
                    atomicBoolean.set(false);
                    Snapshot.Companion.sendApplyNotifications();
                    this.L$0 = zgVar;
                    this.L$1 = it;
                    this.label = 1;
                    obj = it.b(this);
                    vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        zgVar.cancel(null);
                        return w01.a;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CancellationException cancellationException = th instanceof CancellationException ? th : null;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                    cancellationException.initCause(th);
                }
                zgVar.cancel(cancellationException);
                throw th2;
            }
        }
    }
}
