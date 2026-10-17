package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class dt extends p10 {
    public final /* synthetic */ p10 k;
    public final /* synthetic */ ThreadPoolExecutor l;

    public dt(p10 p10Var, ThreadPoolExecutor threadPoolExecutor) {
        this.k = p10Var;
        this.l = threadPoolExecutor;
    }

    @Override // defpackage.p10
    public final void A(f90 f90Var) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.A(f90Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.p10
    public final void z(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.l;
        try {
            this.k.z(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
