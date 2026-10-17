package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ws extends p10 {
    public final /* synthetic */ xs k;

    public ws(xs xsVar) {
        this.k = xsVar;
    }

    @Override // defpackage.p10
    public final void A(f90 f90Var) {
        xs xsVar = this.k;
        xsVar.c = f90Var;
        f90 f90Var2 = xsVar.c;
        at atVar = xsVar.a;
        xsVar.b = new c8(f90Var2, atVar.g, atVar.i, Build.VERSION.SDK_INT >= 34 ? gt.a() : q10.q());
        at atVar2 = xsVar.a;
        ArrayList arrayList = new ArrayList();
        atVar2.a.writeLock().lock();
        try {
            atVar2.c = 1;
            arrayList.addAll(atVar2.b);
            atVar2.b.clear();
            atVar2.a.writeLock().unlock();
            atVar2.d.post(new r7(arrayList, atVar2.c, (Throwable) null));
        } catch (Throwable th) {
            atVar2.a.writeLock().unlock();
            throw th;
        }
    }

    @Override // defpackage.p10
    public final void z(Throwable th) {
        this.k.a.f(th);
    }
}
