package androidx.compose.runtime.collection;

import defpackage.bq;
import defpackage.co0;
import defpackage.hm;
import defpackage.ij0;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.rl0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", f = "ScatterSetWrapper.kt", l = {31}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ScatterSetWrapper$iterator$1 extends ij0 implements my {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScatterSetWrapper<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterSetWrapper$iterator$1(ScatterSetWrapper<T> scatterSetWrapper, hm hmVar) {
        super(hmVar);
        this.this$0 = scatterSetWrapper;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ScatterSetWrapper$iterator$1 scatterSetWrapper$iterator$1 = new ScatterSetWrapper$iterator$1(this.this$0, hmVar);
        scatterSetWrapper$iterator$1.L$0 = obj;
        return scatterSetWrapper$iterator$1;
    }

    @Override // defpackage.my
    public final Object invoke(co0 co0Var, hm hmVar) {
        return ((ScatterSetWrapper$iterator$1) create(co0Var, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:14:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0054 -> B:6:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006e -> B:5:0x008d). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        co0 co0Var;
        Object[] objArr;
        long[] jArr;
        int length;
        int i;
        long j;
        int i2 = this.label;
        if (i2 == 0) {
            p10.Q(obj);
            co0Var = (co0) this.L$0;
            rl0 set$runtime = this.this$0.getSet$runtime();
            objArr = set$runtime.b;
            jArr = set$runtime.a;
            length = jArr.length - 2;
            if (length >= 0) {
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
        int i3 = this.I$3;
        int i4 = this.I$2;
        long j2 = this.J$0;
        i = this.I$1;
        int i5 = this.I$0;
        long[] jArr2 = (long[]) this.L$2;
        Object[] objArr2 = (Object[]) this.L$1;
        co0 co0Var2 = (co0) this.L$0;
        p10.Q(obj);
        j2 >>= 8;
        i3++;
        if (i3 < i4) {
            if (i4 == 8) {
                length = i5;
                jArr = jArr2;
                objArr = objArr2;
                co0Var = co0Var2;
                if (i != length) {
                    i++;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        co0Var2 = co0Var;
                        i3 = 0;
                        jArr2 = jArr;
                        i5 = length;
                        i4 = 8 - ((~(i - length)) >>> 31);
                        objArr2 = objArr;
                        j2 = j;
                        if (i3 < i4) {
                            if ((255 & j2) < 128) {
                                Object obj2 = objArr2[(i << 3) + i3];
                                this.L$0 = co0Var2;
                                this.L$1 = objArr2;
                                this.L$2 = jArr2;
                                this.I$0 = i5;
                                this.I$1 = i;
                                this.J$0 = j2;
                                this.I$2 = i4;
                                this.I$3 = i3;
                                this.label = 1;
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
