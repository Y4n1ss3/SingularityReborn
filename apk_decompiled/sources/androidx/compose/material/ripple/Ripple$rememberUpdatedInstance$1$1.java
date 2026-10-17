package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.ComposerKt;
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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", l = {ComposerKt.reuseKey}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class Ripple$rememberUpdatedInstance$1$1 extends us0 implements my {
    final /* synthetic */ RippleIndicationInstance $instance;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1$1(InteractionSource interactionSource, RippleIndicationInstance rippleIndicationInstance, hm hmVar) {
        super(2, hmVar);
        this.$interactionSource = interactionSource;
        this.$instance = rippleIndicationInstance;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        Ripple$rememberUpdatedInstance$1$1 ripple$rememberUpdatedInstance$1$1 = new Ripple$rememberUpdatedInstance$1$1(this.$interactionSource, this.$instance, hmVar);
        ripple$rememberUpdatedInstance$1$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((Ripple$rememberUpdatedInstance$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final un unVar = (un) this.L$0;
            iw interactions = this.$interactionSource.getInteractions();
            final RippleIndicationInstance rippleIndicationInstance = this.$instance;
            jw jwVar = new jw() { // from class: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1.1
                @Override // defpackage.jw
                public final Object emit(Interaction interaction, hm hmVar) {
                    if (interaction instanceof PressInteraction.Press) {
                        RippleIndicationInstance.this.addRipple((PressInteraction.Press) interaction, unVar);
                    } else if (interaction instanceof PressInteraction.Release) {
                        RippleIndicationInstance.this.removeRipple(((PressInteraction.Release) interaction).getPress());
                    } else {
                        boolean z = interaction instanceof PressInteraction.Cancel;
                        RippleIndicationInstance rippleIndicationInstance2 = RippleIndicationInstance.this;
                        if (z) {
                            rippleIndicationInstance2.removeRipple(((PressInteraction.Cancel) interaction).getPress());
                        } else {
                            rippleIndicationInstance2.updateStateLayer$material_ripple(interaction, unVar);
                        }
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
