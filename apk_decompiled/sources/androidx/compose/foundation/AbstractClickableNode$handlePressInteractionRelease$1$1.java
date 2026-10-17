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
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1", f = "Clickable.kt", l = {1669, 1674, 1675}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AbstractClickableNode$handlePressInteractionRelease$1$1 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-geometry-Offset$-offset$0, reason: not valid java name */
    final /* synthetic */ long f4$$v$c$androidxcomposeuigeometryOffset$offset$0;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ z10 $job;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionRelease$1$1(z10 z10Var, long j, MutableInteractionSource mutableInteractionSource, hm hmVar) {
        super(2, hmVar);
        this.$job = z10Var;
        this.f4$$v$c$androidxcomposeuigeometryOffset$offset$0 = j;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new AbstractClickableNode$handlePressInteractionRelease$1$1(this.$job, this.f4$$v$c$androidxcomposeuigeometryOffset$offset$0, this.$interactionSource, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AbstractClickableNode$handlePressInteractionRelease$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r9.emit(r0, r8) == r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r4.emit(r9, r8) == r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r9.n(r8) == r5) goto L20;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PressInteraction.Release release;
        int i = this.label;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            z10 z10Var = this.$job;
            this.label = 1;
        } else if (i == 1) {
            p10.Q(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    p10.Q(obj);
                    return w01.a;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            release = (PressInteraction.Release) this.L$0;
            p10.Q(obj);
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            this.L$0 = null;
            this.label = 3;
        }
        PressInteraction.Press press = new PressInteraction.Press(this.f4$$v$c$androidxcomposeuigeometryOffset$offset$0, null);
        release = new PressInteraction.Release(press);
        MutableInteractionSource mutableInteractionSource2 = this.$interactionSource;
        this.L$0 = release;
        this.label = 2;
    }
}
