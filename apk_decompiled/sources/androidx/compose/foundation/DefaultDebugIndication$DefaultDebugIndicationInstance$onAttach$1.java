package androidx.compose.foundation;

import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.node.DrawModifierNodeKt;
import defpackage.bq;
import defpackage.hi0;
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
@bq(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {228}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1 extends us0 implements my {
    int label;
    final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance, hm hmVar) {
        super(2, hmVar);
        this.this$0 = defaultDebugIndicationInstance;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        InteractionSource interactionSource;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final hi0 hi0Var = new hi0();
            final hi0 hi0Var2 = new hi0();
            final hi0 hi0Var3 = new hi0();
            interactionSource = this.this$0.interactionSource;
            iw interactions = interactionSource.getInteractions();
            final DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = this.this$0;
            jw jwVar = new jw() { // from class: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1.1
                @Override // defpackage.jw
                public final Object emit(Interaction interaction, hm hmVar) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean z4 = true;
                    if (interaction instanceof PressInteraction.Press) {
                        hi0.this.d++;
                    } else if (interaction instanceof PressInteraction.Release) {
                        hi0 hi0Var4 = hi0.this;
                        hi0Var4.d--;
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        hi0 hi0Var5 = hi0.this;
                        hi0Var5.d--;
                    } else if (interaction instanceof HoverInteraction.Enter) {
                        hi0Var2.d++;
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        hi0 hi0Var6 = hi0Var2;
                        hi0Var6.d--;
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        hi0Var3.d++;
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        hi0 hi0Var7 = hi0Var3;
                        hi0Var7.d--;
                    }
                    boolean z5 = false;
                    boolean z6 = hi0.this.d > 0;
                    boolean z7 = hi0Var2.d > 0;
                    boolean z8 = hi0Var3.d > 0;
                    z = defaultDebugIndicationInstance.isPressed;
                    if (z != z6) {
                        defaultDebugIndicationInstance.isPressed = z6;
                        z5 = true;
                    }
                    z2 = defaultDebugIndicationInstance.isHovered;
                    if (z2 != z7) {
                        defaultDebugIndicationInstance.isHovered = z7;
                        z5 = true;
                    }
                    z3 = defaultDebugIndicationInstance.isFocused;
                    if (z3 != z8) {
                        defaultDebugIndicationInstance.isFocused = z8;
                    } else {
                        z4 = z5;
                    }
                    if (z4) {
                        DrawModifierNodeKt.invalidateDraw(defaultDebugIndicationInstance);
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
