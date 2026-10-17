package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
@bq(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", f = "Clickable.kt", l = {1785}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AbstractClickableNode$emitHoverEnter$1$1 extends us0 implements my {
    final /* synthetic */ HoverInteraction.Enter $interaction;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$emitHoverEnter$1$1(MutableInteractionSource mutableInteractionSource, HoverInteraction.Enter enter, hm hmVar) {
        super(2, hmVar);
        this.$interactionSource = mutableInteractionSource;
        this.$interaction = enter;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new AbstractClickableNode$emitHoverEnter$1$1(this.$interactionSource, this.$interaction, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AbstractClickableNode$emitHoverEnter$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            HoverInteraction.Enter enter = this.$interaction;
            this.label = 1;
            Object emit = mutableInteractionSource.emit(enter, this);
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
        return w01.a;
    }
}
