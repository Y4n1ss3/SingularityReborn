package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
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
@bq(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionCancel$1$1$1", f = "Clickable.kt", l = {1726}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AbstractClickableNode$handlePressInteractionCancel$1$1$1 extends us0 implements my {
    final /* synthetic */ PressInteraction.Cancel $endInteraction;
    final /* synthetic */ qr $handler;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionCancel$1$1$1(MutableInteractionSource mutableInteractionSource, PressInteraction.Cancel cancel, qr qrVar, hm hmVar) {
        super(2, hmVar);
        this.$interactionSource = mutableInteractionSource;
        this.$endInteraction = cancel;
        this.$handler = qrVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new AbstractClickableNode$handlePressInteractionCancel$1$1$1(this.$interactionSource, this.$endInteraction, this.$handler, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AbstractClickableNode$handlePressInteractionCancel$1$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            PressInteraction.Cancel cancel = this.$endInteraction;
            this.label = 1;
            Object emit = mutableInteractionSource.emit(cancel, this);
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
