package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.MutableState;
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
@bq(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2$1", f = "Chip.kt", l = {2562, 2564}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SelectableChipElevation$animateElevation$2$1 extends us0 implements my {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ MutableState<Interaction> $lastInteraction$delegate;
    final /* synthetic */ float $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableChipElevation$animateElevation$2$1(Animatable<Dp, AnimationVector1D> animatable, float f, boolean z, Interaction interaction, MutableState<Interaction> mutableState, hm hmVar) {
        super(2, hmVar);
        this.$animatable = animatable;
        this.$target = f;
        this.$enabled = z;
        this.$interaction = interaction;
        this.$lastInteraction$delegate = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SelectableChipElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.$interaction, this.$lastInteraction$delegate, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SelectableChipElevation$animateElevation$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r6.snapTo(r1, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m2898animateElevationrAjV9yQ(r2, r3, r6, r4, r5) == r0) goto L19;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Interaction animateElevation$lambda$2;
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            if (!Dp.m7616equalsimpl0(this.$animatable.getTargetValue().m7625unboximpl(), this.$target)) {
                boolean z = this.$enabled;
                vn vnVar = vn.d;
                if (z) {
                    animateElevation$lambda$2 = SelectableChipElevation.animateElevation$lambda$2(this.$lastInteraction$delegate);
                    Animatable<Dp, AnimationVector1D> animatable = this.$animatable;
                    float f = this.$target;
                    Interaction interaction = this.$interaction;
                    this.label = 2;
                } else {
                    Animatable<Dp, AnimationVector1D> animatable2 = this.$animatable;
                    Dp m7609boximpl = Dp.m7609boximpl(this.$target);
                    this.label = 1;
                }
            }
            return w01.a;
        }
        if (i != 1 && i != 2) {
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        this.$lastInteraction$delegate.setValue(this.$interaction);
        return w01.a;
    }
}
