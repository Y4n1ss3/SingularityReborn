package androidx.compose.runtime.composer.gapbuffer;

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
@bq(c = "androidx.compose.runtime.composer.gapbuffer.SlotTable$getSlots$1$iterator$1", f = "SlotTable.kt", l = {611}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SlotTable$getSlots$1$iterator$1 extends ij0 implements my {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SlotTable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotTable$getSlots$1$iterator$1(SlotTable slotTable, hm hmVar) {
        super(hmVar);
        this.this$0 = slotTable;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        SlotTable$getSlots$1$iterator$1 slotTable$getSlots$1$iterator$1 = new SlotTable$getSlots$1$iterator$1(this.this$0, hmVar);
        slotTable$getSlots$1$iterator$1.L$0 = obj;
        return slotTable$getSlots$1$iterator$1;
    }

    @Override // defpackage.my
    public final Object invoke(co0 co0Var, hm hmVar) {
        return ((SlotTable$getSlots$1$iterator$1) create(co0Var, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        co0 co0Var;
        int slotsSize;
        int i;
        int i2 = this.label;
        if (i2 == 0) {
            p10.Q(obj);
            co0Var = (co0) this.L$0;
            slotsSize = this.this$0.getSlotsSize();
            i = 0;
        } else {
            if (i2 != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            slotsSize = this.I$1;
            int i3 = this.I$0;
            co0Var = (co0) this.L$0;
            p10.Q(obj);
            i = i3 + 1;
        }
        if (i >= slotsSize) {
            return w01.a;
        }
        Object obj2 = this.this$0.m3964getSlots()[i];
        this.L$0 = co0Var;
        this.I$0 = i;
        this.I$1 = slotsSize;
        this.label = 1;
        co0Var.a(this, obj2);
        return vn.d;
    }
}
