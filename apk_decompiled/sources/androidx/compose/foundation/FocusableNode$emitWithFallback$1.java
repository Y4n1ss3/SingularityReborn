package androidx.compose.foundation;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.qr;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", l = {322}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class FocusableNode$emitWithFallback$1 extends us0 implements my {
    final /* synthetic */ qr $handler;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ MutableInteractionSource $this_emitWithFallback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$emitWithFallback$1(MutableInteractionSource mutableInteractionSource, Interaction interaction, qr qrVar, hm hmVar) {
        super(2, hmVar);
        this.$this_emitWithFallback = mutableInteractionSource;
        this.$interaction = interaction;
        this.$handler = qrVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new FocusableNode$emitWithFallback$1(this.$this_emitWithFallback, this.$interaction, this.$handler, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((FocusableNode$emitWithFallback$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            MutableInteractionSource mutableInteractionSource = this.$this_emitWithFallback;
            Interaction interaction = this.$interaction;
            this.label = 1;
            Object emit = mutableInteractionSource.emit(interaction, this);
            vn vnVar = vn.d;
            if (emit == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        qr qrVar = this.$handler;
        if (qrVar != null) {
            qrVar.dispose();
        }
        return w01.a;
    }
}
