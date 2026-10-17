package defpackage;

import com.topjohnwu.superuser.internal.UiThreadHandler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class hg0 implements Executor {
    public final /* synthetic */ int d;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.d) {
            case 0:
                runnable.run();
                break;
            default:
                UiThreadHandler.run(runnable);
                break;
        }
    }
}
