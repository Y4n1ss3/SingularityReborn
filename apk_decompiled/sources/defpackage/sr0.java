package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class sr0 extends us0 implements ny {
    public int d;
    public /* synthetic */ jw e;
    public /* synthetic */ int f;
    public final /* synthetic */ tr0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr0(tr0 tr0Var, hm hmVar) {
        super(3, hmVar);
        this.g = tr0Var;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        sr0 sr0Var = new sr0(this.g, (hm) obj3);
        sr0Var.e = (jw) obj;
        sr0Var.f = intValue;
        return sr0Var.invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r0.emit(defpackage.dp0.f, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (defpackage.y80.p(androidx.compose.runtime.snapshots.SnapshotId_jvmKt.SnapshotIdMax, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r0.emit(defpackage.dp0.e, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r0.emit(defpackage.dp0.d, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (defpackage.y80.p(0, r8) == r7) goto L32;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jw jwVar;
        int i = this.d;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            jwVar = this.e;
            if (this.f > 0) {
                this.d = 1;
            } else {
                this.e = jwVar;
                this.d = 2;
            }
            return vnVar;
        }
        if (i != 1) {
            if (i == 2) {
                jwVar = this.e;
                p10.Q(obj);
                this.e = jwVar;
                this.d = 3;
            } else if (i == 3) {
                jwVar = this.e;
                p10.Q(obj);
                this.e = jwVar;
                this.d = 4;
            } else if (i == 4) {
                jwVar = this.e;
                p10.Q(obj);
                this.e = null;
                this.d = 5;
            } else if (i != 5) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        p10.Q(obj);
        return w01.a;
    }
}
