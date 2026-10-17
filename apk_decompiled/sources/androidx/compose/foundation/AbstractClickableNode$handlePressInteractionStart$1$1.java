package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1", f = "Clickable.kt", l = {1624, 1625}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AbstractClickableNode$handlePressInteractionStart$1$1 extends us0 implements my {
    final /* synthetic */ boolean $indirectPointer;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ PressInteraction.Press $press;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionStart$1$1(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, boolean z, AbstractClickableNode abstractClickableNode, hm hmVar) {
        super(2, hmVar);
        this.$interactionSource = mutableInteractionSource;
        this.$press = press;
        this.$indirectPointer = z;
        this.this$0 = abstractClickableNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new AbstractClickableNode$handlePressInteractionStart$1$1(this.$interactionSource, this.$press, this.$indirectPointer, this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AbstractClickableNode$handlePressInteractionStart$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r7.emit(r0, r6) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
    
        if (defpackage.y80.p(r4, r6) == r3) goto L15;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            long tapIndicationDelay = Clickable_androidKt.getTapIndicationDelay();
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                boolean z = this.$indirectPointer;
                AbstractClickableNode abstractClickableNode = this.this$0;
                if (z) {
                    abstractClickableNode.indirectPointerPressInteraction = this.$press;
                } else {
                    abstractClickableNode.pressInteraction = this.$press;
                }
                return w01.a;
            }
            p10.Q(obj);
        }
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        PressInteraction.Press press = this.$press;
        this.label = 2;
    }
}
