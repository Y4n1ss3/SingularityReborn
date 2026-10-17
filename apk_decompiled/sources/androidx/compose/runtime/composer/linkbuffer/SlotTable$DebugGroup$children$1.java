package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.composer.linkbuffer.SlotTable;
import androidx.compose.runtime.composer.linkbuffer.SlotTable.DebugGroup;
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
@bq(c = "androidx.compose.runtime.composer.linkbuffer.SlotTable$DebugGroup$children$1", f = "SlotTable.kt", l = {592}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SlotTable$DebugGroup$children$1 extends ij0 implements my {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SlotTable this$0;
    final /* synthetic */ SlotTable.DebugGroup this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotTable$DebugGroup$children$1(SlotTable slotTable, SlotTable.DebugGroup debugGroup, hm hmVar) {
        super(hmVar);
        this.this$0 = slotTable;
        this.this$1 = debugGroup;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        SlotTable$DebugGroup$children$1 slotTable$DebugGroup$children$1 = new SlotTable$DebugGroup$children$1(this.this$0, this.this$1, hmVar);
        slotTable$DebugGroup$children$1.L$0 = obj;
        return slotTable$DebugGroup$children$1;
    }

    @Override // defpackage.my
    public final Object invoke(co0 co0Var, hm hmVar) {
        return ((SlotTable$DebugGroup$children$1) create(co0Var, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        co0 co0Var;
        SlotTable slotTable;
        int[] groups;
        int i;
        int i2 = this.label;
        if (i2 == 0) {
            p10.Q(obj);
            co0Var = (co0) this.L$0;
            SlotTable slotTable2 = this.this$0;
            int address = this.this$1.getAddress();
            slotTable = this.this$0;
            groups = slotTable2.getAddressSpace().getGroups();
            i = groups[address + 3];
        } else {
            if (i2 != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$0;
            groups = (int[]) this.L$2;
            slotTable = (SlotTable) this.L$1;
            co0Var = (co0) this.L$0;
            p10.Q(obj);
            i = groups[i3 + 1];
        }
        if (i <= 0) {
            return w01.a;
        }
        SlotTable.DebugGroup debugGroup = slotTable.new DebugGroup(i);
        this.L$0 = co0Var;
        this.L$1 = slotTable;
        this.L$2 = groups;
        this.I$0 = i;
        this.label = 1;
        co0Var.a(this, debugGroup);
        return vn.d;
    }
}
