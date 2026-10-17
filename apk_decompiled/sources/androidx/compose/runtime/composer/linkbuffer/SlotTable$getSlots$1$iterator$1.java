package androidx.compose.runtime.composer.linkbuffer;

import defpackage.bq;
import defpackage.co0;
import defpackage.hm;
import defpackage.ij0;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.runtime.composer.linkbuffer.SlotTable$getSlots$1$iterator$1", f = "SlotTable.kt", l = {580}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class SlotTable$getSlots$1$iterator$1 extends ij0 implements my {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
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

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0089  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x006a -> B:12:0x00bc). Please report as a decompilation issue!!! */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.composer.linkbuffer.SlotTable$getSlots$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
