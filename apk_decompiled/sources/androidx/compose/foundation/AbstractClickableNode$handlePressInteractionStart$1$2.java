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
@bq(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$2", f = "Clickable.kt", l = {1638}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AbstractClickableNode$handlePressInteractionStart$1$2 extends us0 implements my {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ PressInteraction.Press $press;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionStart$1$2(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, hm hmVar) {
        super(2, hmVar);
        this.$interactionSource = mutableInteractionSource;
        this.$press = press;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new AbstractClickableNode$handlePressInteractionStart$1$2(this.$interactionSource, this.$press, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AbstractClickableNode$handlePressInteractionStart$1$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            PressInteraction.Press press = this.$press;
            this.label = 1;
            Object emit = mutableInteractionSource.emit(press, this);
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
