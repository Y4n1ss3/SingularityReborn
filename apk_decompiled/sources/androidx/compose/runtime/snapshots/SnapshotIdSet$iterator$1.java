package androidx.compose.runtime.snapshots;

import androidx.compose.ui.graphics.Fields;
import defpackage.bq;
import defpackage.co0;
import defpackage.hm;
import defpackage.ij0;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, Fields.RotationX, 263}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SnapshotIdSet$iterator$1 extends ij0 implements my {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SnapshotIdSet this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotIdSet$iterator$1(SnapshotIdSet snapshotIdSet, hm hmVar) {
        super(hmVar);
        this.this$0 = snapshotIdSet;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        SnapshotIdSet$iterator$1 snapshotIdSet$iterator$1 = new SnapshotIdSet$iterator$1(this.this$0, hmVar);
        snapshotIdSet$iterator$1.L$0 = obj;
        return snapshotIdSet$iterator$1;
    }

    @Override // defpackage.my
    public final Object invoke(co0 co0Var, hm hmVar) {
        return ((SnapshotIdSet$iterator$1) create(co0Var, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00dc -> B:7:0x00dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0088 -> B:20:0x00a3). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        co0 co0Var;
        long[] jArr;
        int length;
        int i;
        int i2;
        co0 co0Var2;
        co0 co0Var3;
        int i3 = this.label;
        int i4 = 0;
        vn vnVar = vn.d;
        if (i3 == 0) {
            p10.Q(obj);
            co0Var = (co0) this.L$0;
            jArr = this.this$0.belowBound;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (this.this$0.lowerSet != 0) {
                i2 = 0;
                co0Var2 = co0Var;
                if (i2 >= 64) {
                }
            }
            if (this.this$0.upperSet != 0) {
            }
            return w01.a;
        }
        if (i3 == 1) {
            length = this.I$1;
            int i5 = this.I$0;
            jArr = (long[]) this.L$1;
            co0Var = (co0) this.L$0;
            p10.Q(obj);
            i = i5 + 1;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = this.I$0;
                co0Var3 = (co0) this.L$0;
                p10.Q(obj);
                i4 = i6 + 1;
                if (i4 < 64) {
                    if ((this.this$0.upperSet & (1 << i4)) != 0) {
                        Long l = new Long(this.this$0.lowerBound + i4 + 64);
                        this.L$0 = co0Var3;
                        this.L$1 = null;
                        this.I$0 = i4;
                        this.label = 3;
                        co0Var3.a(this, l);
                        return vnVar;
                    }
                    i6 = i4;
                    i4 = i6 + 1;
                    if (i4 < 64) {
                    }
                }
                return w01.a;
            }
            i2 = this.I$0;
            co0Var2 = (co0) this.L$0;
            p10.Q(obj);
            i2++;
            if (i2 >= 64) {
                co0Var = co0Var2;
                if (this.this$0.upperSet != 0) {
                    co0Var3 = co0Var;
                    if (i4 < 64) {
                    }
                }
                return w01.a;
            }
            if ((this.this$0.lowerSet & (1 << i2)) != 0) {
                Long l2 = new Long(this.this$0.lowerBound + i2);
                this.L$0 = co0Var2;
                this.L$1 = null;
                this.I$0 = i2;
                this.label = 2;
                co0Var2.a(this, l2);
                return vnVar;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.L$0 = co0Var;
            this.L$1 = jArr;
            this.I$0 = i;
            this.I$1 = length;
            this.label = 1;
            co0Var.a(this, l3);
            return vnVar;
        }
        if (this.this$0.lowerSet != 0) {
        }
        if (this.this$0.upperSet != 0) {
        }
        return w01.a;
    }
}
