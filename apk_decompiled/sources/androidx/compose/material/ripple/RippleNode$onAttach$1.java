package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import defpackage.bq;
import defpackage.hm;
import defpackage.iw;
import defpackage.jw;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {364}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class RippleNode$onAttach$1 extends us0 implements my {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RippleNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleNode$onAttach$1(RippleNode rippleNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = rippleNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        RippleNode$onAttach$1 rippleNode$onAttach$1 = new RippleNode$onAttach$1(this.this$0, hmVar);
        rippleNode$onAttach$1.L$0 = obj;
        return rippleNode$onAttach$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((RippleNode$onAttach$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        InteractionSource interactionSource;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final un unVar = (un) this.L$0;
            interactionSource = this.this$0.interactionSource;
            iw interactions = interactionSource.getInteractions();
            final RippleNode rippleNode = this.this$0;
            jw jwVar = new jw() { // from class: androidx.compose.material.ripple.RippleNode$onAttach$1.1
                @Override // defpackage.jw
                public final Object emit(Interaction interaction, hm hmVar) {
                    boolean z;
                    xa0 xa0Var;
                    boolean z2 = interaction instanceof PressInteraction;
                    RippleNode rippleNode2 = RippleNode.this;
                    if (z2) {
                        z = rippleNode2.hasValidSize;
                        RippleNode rippleNode3 = RippleNode.this;
                        if (z) {
                            rippleNode3.handlePressInteraction((PressInteraction) interaction);
                        } else {
                            xa0Var = rippleNode3.pendingInteractions;
                            xa0Var.g(interaction);
                        }
                    } else {
                        rippleNode2.updateStateLayer(interaction, unVar);
                    }
                    return w01.a;
                }
            };
            this.label = 1;
            Object collect = interactions.collect(jwVar, this);
            vn vnVar = vn.d;
            if (collect == vnVar) {
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
