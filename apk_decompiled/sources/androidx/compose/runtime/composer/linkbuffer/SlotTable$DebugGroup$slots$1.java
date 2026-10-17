package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.composer.linkbuffer.SlotTable;
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
@bq(c = "androidx.compose.runtime.composer.linkbuffer.SlotTable$DebugGroup$slots$1", f = "SlotTable.kt", l = {600}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SlotTable$DebugGroup$slots$1 extends ij0 implements my {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SlotTable.DebugGroup this$0;
    final /* synthetic */ SlotTable this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotTable$DebugGroup$slots$1(SlotTable.DebugGroup debugGroup, SlotTable slotTable, hm hmVar) {
        super(hmVar);
        this.this$0 = debugGroup;
        this.this$1 = slotTable;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        SlotTable$DebugGroup$slots$1 slotTable$DebugGroup$slots$1 = new SlotTable$DebugGroup$slots$1(this.this$0, this.this$1, hmVar);
        slotTable$DebugGroup$slots$1.L$0 = obj;
        return slotTable$DebugGroup$slots$1;
    }

    @Override // defpackage.my
    public final Object invoke(co0 co0Var, hm hmVar) {
        return ((SlotTable$DebugGroup$slots$1) create(co0Var, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        co0 co0Var;
        int utilitySlotsCountForFlags;
        int end;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            co0Var = (co0) this.L$0;
            SlotTable.DebugSlotRange slotRange = this.this$0.getSlotRange();
            utilitySlotsCountForFlags = GroupFlagsKt.utilitySlotsCountForFlags(this.this$0.getFlags()) + slotRange.getAddress();
            end = slotRange.getEnd();
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            end = this.I$1;
            int i2 = this.I$0;
            co0Var = (co0) this.L$0;
            p10.Q(obj);
            utilitySlotsCountForFlags = i2 + 1;
        }
        if (utilitySlotsCountForFlags >= end) {
            return w01.a;
        }
        Object obj2 = this.this$1.getSlots()[utilitySlotsCountForFlags];
        this.L$0 = co0Var;
        this.I$0 = utilitySlotsCountForFlags;
        this.I$1 = end;
        this.label = 1;
        co0Var.a(this, obj2);
        return vn.d;
    }
}
