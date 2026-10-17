package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class qj {
    public final Object a;
    public final dg b;
    public final ny c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ qj(Object obj, dg dgVar, ny nyVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : dgVar, (i & 4) != 0 ? null : nyVar, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static qj a(qj qjVar, dg dgVar, Throwable th, int i) {
        Object obj = qjVar.a;
        if ((i & 2) != 0) {
            dgVar = qjVar.b;
        }
        dg dgVar2 = dgVar;
        ny nyVar = qjVar.c;
        Object obj2 = qjVar.d;
        if ((i & 16) != 0) {
            th = qjVar.e;
        }
        return new qj(obj, dgVar2, nyVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj)) {
            return false;
        }
        qj qjVar = (qj) obj;
        return q10.b(this.a, qjVar.a) && q10.b(this.b, qjVar.b) && q10.b(this.c, qjVar.c) && q10.b(this.d, qjVar.d) && q10.b(this.e, qjVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        dg dgVar = this.b;
        int hashCode2 = (hashCode + (dgVar == null ? 0 : dgVar.hashCode())) * 31;
        ny nyVar = this.c;
        int hashCode3 = (hashCode2 + (nyVar == null ? 0 : nyVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public qj(Object obj, dg dgVar, ny nyVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = dgVar;
        this.c = nyVar;
        this.d = obj2;
        this.e = th;
    }
}
