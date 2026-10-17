package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import defpackage.bq;
import defpackage.hi0;
import defpackage.hm;
import defpackage.iw;
import defpackage.jw;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.ThumbNode$onAttach$1", f = "Switch.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ThumbNode$onAttach$1 extends us0 implements my {
    int label;
    final /* synthetic */ ThumbNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThumbNode$onAttach$1(ThumbNode thumbNode, hm hmVar) {
        super(2, hmVar);
        this.this$0 = thumbNode;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ThumbNode$onAttach$1(this.this$0, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ThumbNode$onAttach$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final hi0 hi0Var = new hi0();
            iw interactions = this.this$0.getInteractionSource().getInteractions();
            final ThumbNode thumbNode = this.this$0;
            jw jwVar = new jw() { // from class: androidx.compose.material3.ThumbNode$onAttach$1.1
                @Override // defpackage.jw
                public final Object emit(Interaction interaction, hm hmVar) {
                    boolean z;
                    if (interaction instanceof PressInteraction.Press) {
                        hi0.this.d++;
                    } else if (interaction instanceof PressInteraction.Release) {
                        hi0 hi0Var2 = hi0.this;
                        hi0Var2.d--;
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        hi0 hi0Var3 = hi0.this;
                        hi0Var3.d--;
                    }
                    boolean z2 = hi0.this.d > 0;
                    z = thumbNode.isPressed;
                    if (z != z2) {
                        thumbNode.isPressed = z2;
                        LayoutModifierNodeKt.invalidateMeasurement(thumbNode);
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
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
