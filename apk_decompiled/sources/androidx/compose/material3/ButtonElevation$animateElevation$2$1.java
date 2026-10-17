package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Dp;
import defpackage.bq;
import defpackage.hm;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", l = {998, 1007}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ButtonElevation$animateElevation$2$1 extends us0 implements my {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ ButtonElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$2$1(Animatable<Dp, AnimationVector1D> animatable, float f, boolean z, ButtonElevation buttonElevation, Interaction interaction, hm hmVar) {
        super(2, hmVar);
        this.$animatable = animatable;
        this.$target = f;
        this.$enabled = z;
        this.this$0 = buttonElevation;
        this.$interaction = interaction;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ButtonElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ButtonElevation$animateElevation$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r0.snapTo(r8, r7) == r4) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m2898animateElevationrAjV9yQ(r8, r0, r1, r3, r7) == r4) goto L28;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        float f3;
        int i = this.label;
        Interaction interaction = null;
        if (i == 0) {
            p10.Q(obj);
            if (!Dp.m7616equalsimpl0(this.$animatable.getTargetValue().m7625unboximpl(), this.$target)) {
                boolean z = this.$enabled;
                Animatable<Dp, AnimationVector1D> animatable = this.$animatable;
                vn vnVar = vn.d;
                if (z) {
                    float m7625unboximpl = animatable.getTargetValue().m7625unboximpl();
                    f = this.this$0.pressedElevation;
                    if (Dp.m7616equalsimpl0(m7625unboximpl, f)) {
                        interaction = new PressInteraction.Press(Offset.Companion.m4532getZeroF1C5BW0(), null);
                    } else {
                        f2 = this.this$0.hoveredElevation;
                        if (Dp.m7616equalsimpl0(m7625unboximpl, f2)) {
                            interaction = new HoverInteraction.Enter();
                        } else {
                            f3 = this.this$0.focusedElevation;
                            if (Dp.m7616equalsimpl0(m7625unboximpl, f3)) {
                                interaction = new FocusInteraction.Focus();
                            }
                        }
                    }
                    Animatable<Dp, AnimationVector1D> animatable2 = this.$animatable;
                    float f4 = this.$target;
                    Interaction interaction2 = this.$interaction;
                    this.label = 2;
                } else {
                    Dp m7609boximpl = Dp.m7609boximpl(this.$target);
                    this.label = 1;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}
