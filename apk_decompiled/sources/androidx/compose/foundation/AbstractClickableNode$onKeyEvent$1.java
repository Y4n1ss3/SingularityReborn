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
@bq(c = "androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1", f = "Clickable.kt", l = {1548}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AbstractClickableNode$onKeyEvent$1 extends us0 implements my {
    final /* synthetic */ PressInteraction.Press $press;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onKeyEvent$1(AbstractClickableNode abstractClickableNode, PressInteraction.Press press, hm hmVar) {
        super(2, hmVar);
        this.this$0 = abstractClickableNode;
        this.$press = press;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new AbstractClickableNode$onKeyEvent$1(this.this$0, this.$press, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AbstractClickableNode$onKeyEvent$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        MutableInteractionSource mutableInteractionSource;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            mutableInteractionSource = this.this$0.interactionSource;
            if (mutableInteractionSource != null) {
                PressInteraction.Press press = this.$press;
                this.label = 1;
                Object emit = mutableInteractionSource.emit(press, this);
                vn vnVar = vn.d;
                if (emit == vnVar) {
                    return vnVar;
                }
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
