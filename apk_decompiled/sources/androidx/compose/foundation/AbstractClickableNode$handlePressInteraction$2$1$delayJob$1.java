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
@bq(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", l = {1744, 1747}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-offset$0, reason: not valid java name */
    final /* synthetic */ long f3$$v$c$androidxcomposeuigeometryOffset$offset$0;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    Object L$0;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(AbstractClickableNode abstractClickableNode, long j, MutableInteractionSource mutableInteractionSource, hm hmVar) {
        super(2, hmVar);
        this.this$0 = abstractClickableNode;
        this.f3$$v$c$androidxcomposeuigeometryOffset$offset$0 = j;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.f3$$v$c$androidxcomposeuigeometryOffset$offset$0, this.$interactionSource, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AbstractClickableNode$handlePressInteraction$2$1$delayJob$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r8.emit(r0, r7) == r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (defpackage.y80.p(r5, r7) == r4) goto L17;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean delayPressInteraction;
        PressInteraction.Press press;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            delayPressInteraction = this.this$0.delayPressInteraction();
            if (delayPressInteraction) {
                long tapIndicationDelay = Clickable_androidKt.getTapIndicationDelay();
                this.label = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                press = (PressInteraction.Press) this.L$0;
                p10.Q(obj);
                this.this$0.pressInteraction = press;
                return w01.a;
            }
            p10.Q(obj);
        }
        press = new PressInteraction.Press(this.f3$$v$c$androidxcomposeuigeometryOffset$offset$0, null);
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        this.L$0 = press;
        this.label = 2;
    }
}
