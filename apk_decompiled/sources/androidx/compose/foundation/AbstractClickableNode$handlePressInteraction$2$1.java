package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.ProgressIndicatorKt;
import defpackage.bq;
import defpackage.cq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1", f = "Clickable.kt", l = {ProgressIndicatorKt.LinearAnimationDuration, 1752, 1759, 1760, 1770}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AbstractClickableNode$handlePressInteraction$2$1 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-offset$0, reason: not valid java name */
    final /* synthetic */ long f2$$v$c$androidxcomposeuigeometryOffset$offset$0;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ PressGestureScope $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteraction$2$1(PressGestureScope pressGestureScope, long j, MutableInteractionSource mutableInteractionSource, AbstractClickableNode abstractClickableNode, hm hmVar) {
        super(2, hmVar);
        this.$this_handlePressInteraction = pressGestureScope;
        this.f2$$v$c$androidxcomposeuigeometryOffset$offset$0 = j;
        this.$interactionSource = mutableInteractionSource;
        this.this$0 = abstractClickableNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        AbstractClickableNode$handlePressInteraction$2$1 abstractClickableNode$handlePressInteraction$2$1 = new AbstractClickableNode$handlePressInteraction$2$1(this.$this_handlePressInteraction, this.f2$$v$c$androidxcomposeuigeometryOffset$offset$0, this.$interactionSource, this.this$0, hmVar);
        abstractClickableNode$handlePressInteraction$2$1.L$0 = obj;
        return abstractClickableNode$handlePressInteraction$2$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AbstractClickableNode$handlePressInteraction$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009b, code lost:
    
        if (r15.emit(r0, r14) == r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (r1.emit(r15, r14) == r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        if (r2.emit(r15, r14) == r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0059, code lost:
    
        if (r15 == r7) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z10 t;
        PressInteraction.Press press;
        boolean z;
        PressInteraction.Release release;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            t = p01.t((un) this.L$0, null, null, new AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.this$0, this.f2$$v$c$androidxcomposeuigeometryOffset$offset$0, this.$interactionSource, null), 3);
            PressGestureScope pressGestureScope = this.$this_handlePressInteraction;
            this.L$0 = t;
            this.label = 1;
            obj = pressGestureScope.tryAwaitRelease(this);
        } else if (i == 1) {
            t = (z10) this.L$0;
            p10.Q(obj);
        } else {
            if (i == 2) {
                z = this.Z$0;
                p10.Q(obj);
                if (z) {
                    PressInteraction.Press press2 = new PressInteraction.Press(this.f2$$v$c$androidxcomposeuigeometryOffset$offset$0, null);
                    release = new PressInteraction.Release(press2);
                    MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                    this.L$0 = release;
                    this.label = 3;
                }
                this.this$0.pressInteraction = null;
                return w01.a;
            }
            if (i != 3) {
                if (i != 4 && i != 5) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                this.this$0.pressInteraction = null;
                return w01.a;
            }
            release = (PressInteraction.Release) this.L$0;
            p10.Q(obj);
            MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
            this.L$0 = null;
            this.label = 4;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (!t.isActive()) {
            press = this.this$0.pressInteraction;
            if (press != null) {
                MutableInteractionSource mutableInteractionSource3 = this.$interactionSource;
                Interaction release2 = booleanValue ? new PressInteraction.Release(press) : new PressInteraction.Cancel(press);
                this.L$0 = null;
                this.label = 5;
            }
            this.this$0.pressInteraction = null;
            return w01.a;
        }
        this.L$0 = null;
        this.Z$0 = booleanValue;
        this.label = 2;
        if (cq.d(t, this) != vnVar) {
            z = booleanValue;
            if (z) {
            }
            this.this$0.pressInteraction = null;
            return w01.a;
        }
        return vnVar;
    }
}
