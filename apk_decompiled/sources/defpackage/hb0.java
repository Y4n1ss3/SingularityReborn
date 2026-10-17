package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class hb0 extends ij0 implements my {
    public dz d;
    public ib0 e;
    public long[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ib0 n;
    public final /* synthetic */ dz o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb0(ib0 ib0Var, dz dzVar, hm hmVar) {
        super(hmVar);
        this.n = ib0Var;
        this.o = dzVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        hb0 hb0Var = new hb0(this.n, this.o, hmVar);
        hb0Var.m = obj;
        return hb0Var;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((hb0) create((co0) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        co0 co0Var;
        ib0 ib0Var;
        long[] jArr;
        int length;
        dz dzVar;
        int i;
        long j;
        int i2 = this.l;
        if (i2 == 0) {
            p10.Q(obj);
            co0Var = (co0) this.m;
            ib0Var = this.n;
            jArr = ib0Var.e.a;
            length = jArr.length - 2;
            if (length >= 0) {
                dzVar = this.o;
                i = 0;
                j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return w01.a;
        }
        if (i2 != 1) {
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = this.j;
        int i4 = this.i;
        long j2 = this.k;
        int i5 = this.h;
        int i6 = this.g;
        long[] jArr2 = this.f;
        ib0 ib0Var2 = this.e;
        dz dzVar2 = this.d;
        co0 co0Var2 = (co0) this.m;
        p10.Q(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i6;
                jArr = jArr2;
                ib0Var = ib0Var2;
                co0Var = co0Var2;
                i = i5;
                dzVar = dzVar2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        co0Var2 = co0Var;
                        i3 = 0;
                        ib0Var2 = ib0Var;
                        jArr2 = jArr;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        dzVar2 = dzVar;
                        i5 = i;
                        i6 = length;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                int i7 = (i5 << 3) + i3;
                                dzVar2.e = i7;
                                Object obj2 = ib0Var2.e.b[i7];
                                this.m = co0Var2;
                                this.d = dzVar2;
                                this.e = ib0Var2;
                                this.f = jArr2;
                                this.g = i6;
                                this.h = i5;
                                this.k = j2;
                                this.i = i4;
                                this.j = i3;
                                this.l = 1;
                                co0Var2.a(this, obj2);
                                return vn.d;
                            }
                            j2 >>= 8;
                            i3++;
                            if (i3 < i4) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return w01.a;
        }
    }
}
