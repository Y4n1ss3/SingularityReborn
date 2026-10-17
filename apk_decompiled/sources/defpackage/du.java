package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class du extends mn {
    public static final /* synthetic */ int g = 0;
    public long d;
    public boolean e;
    public qb f;

    public final void g(boolean z) {
        long j = this.d - (z ? 4294967296L : 1L);
        this.d = j;
        if (j <= 0 && this.e) {
            shutdown();
        }
    }

    public final void i(mr mrVar) {
        qb qbVar = this.f;
        if (qbVar == null) {
            qbVar = new qb();
            this.f = qbVar;
        }
        qbVar.addLast(mrVar);
    }

    public final void j(boolean z) {
        this.d = (z ? 4294967296L : 1L) + this.d;
        if (z) {
            return;
        }
        this.e = true;
    }

    public abstract long k();

    public final boolean l() {
        qb qbVar = this.f;
        if (qbVar == null) {
            return false;
        }
        mr mrVar = (mr) (qbVar.isEmpty() ? null : qbVar.removeFirst());
        if (mrVar == null) {
            return false;
        }
        mrVar.run();
        return true;
    }

    @Override // defpackage.mn
    public final mn limitedParallelism(int i, String str) {
        cq.e(i);
        return str != null ? new pb0(this, str) : this;
    }

    public abstract void shutdown();
}
