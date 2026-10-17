package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class gu implements Runnable, Comparable, qr {
    private volatile Object _heap;
    public long d;
    public int e = -1;

    public gu(long j) {
        this.d = j;
    }

    public final int b(long j, hu huVar, iu iuVar) {
        synchronized (this) {
            if (this._heap == y80.c) {
                return 2;
            }
            synchronized (huVar) {
                try {
                    gu[] guVarArr = huVar.a;
                    gu guVar = guVarArr != null ? guVarArr[0] : null;
                    int i = iu.k;
                    if (dc.a.getIntVolatile(iuVar, iu.i) != 0) {
                        return 1;
                    }
                    if (guVar == null) {
                        huVar.c = j;
                    } else {
                        long j2 = guVar.d;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = huVar.c;
                        if (j - j3 > 0) {
                            huVar.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.d - j < 0) {
                        this.d = j;
                    }
                    huVar.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(hu huVar) {
        if (this._heap != y80.c) {
            this._heap = huVar;
        } else {
            o.m("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.d - ((gu) obj).d;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // defpackage.qr
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                ox oxVar = y80.c;
                if (obj == oxVar) {
                    return;
                }
                hu huVar = obj instanceof hu ? (hu) obj : null;
                if (huVar != null) {
                    synchronized (huVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof yu0 ? (yu0) obj2 : null) != null) {
                            huVar.c(this.e);
                        }
                    }
                }
                this._heap = oxVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.d + ']';
    }
}
