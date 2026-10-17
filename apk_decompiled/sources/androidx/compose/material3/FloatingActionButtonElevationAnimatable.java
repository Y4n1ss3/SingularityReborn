package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.internal.ElevationKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import defpackage.dq;
import defpackage.hm;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class FloatingActionButtonElevationAnimatable {
    private final Animatable<Dp, AnimationVector1D> animatable;
    private float defaultElevation;
    private float focusedElevation;
    private float hoveredElevation;
    private Interaction lastTargetInteraction;
    private float pressedElevation;
    private Interaction targetInteraction;

    private FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
        this.animatable = new Animatable<>(Dp.m7609boximpl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
    }

    /* renamed from: calculateTarget-u2uoSUM, reason: not valid java name */
    private final float m2004calculateTargetu2uoSUM(Interaction interaction) {
        return interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object snapElevation(hm hmVar) {
        FloatingActionButtonElevationAnimatable$snapElevation$1 floatingActionButtonElevationAnimatable$snapElevation$1;
        int i;
        try {
            if (hmVar instanceof FloatingActionButtonElevationAnimatable$snapElevation$1) {
                floatingActionButtonElevationAnimatable$snapElevation$1 = (FloatingActionButtonElevationAnimatable$snapElevation$1) hmVar;
                int i2 = floatingActionButtonElevationAnimatable$snapElevation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    floatingActionButtonElevationAnimatable$snapElevation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = floatingActionButtonElevationAnimatable$snapElevation$1.result;
                    i = floatingActionButtonElevationAnimatable$snapElevation$1.label;
                    if (i != 0) {
                        p10.Q(obj);
                        float m2004calculateTargetu2uoSUM = m2004calculateTargetu2uoSUM(this.targetInteraction);
                        if (!Dp.m7616equalsimpl0(this.animatable.getTargetValue().m7625unboximpl(), m2004calculateTargetu2uoSUM)) {
                            Animatable<Dp, AnimationVector1D> animatable = this.animatable;
                            Dp m7609boximpl = Dp.m7609boximpl(m2004calculateTargetu2uoSUM);
                            floatingActionButtonElevationAnimatable$snapElevation$1.label = 1;
                            Object snapTo = animatable.snapTo(m7609boximpl, floatingActionButtonElevationAnimatable$snapElevation$1);
                            vn vnVar = vn.d;
                            if (snapTo == vnVar) {
                                return vnVar;
                            }
                        }
                        return w01.a;
                    }
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                    return w01.a;
                }
            }
            if (i != 0) {
            }
            return w01.a;
        } finally {
            this.lastTargetInteraction = this.targetInteraction;
        }
        floatingActionButtonElevationAnimatable$snapElevation$1 = new FloatingActionButtonElevationAnimatable$snapElevation$1(this, hmVar);
        Object obj2 = floatingActionButtonElevationAnimatable$snapElevation$1.result;
        i = floatingActionButtonElevationAnimatable$snapElevation$1.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, w01] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateElevation(Interaction interaction, hm hmVar) {
        FloatingActionButtonElevationAnimatable$animateElevation$1 floatingActionButtonElevationAnimatable$animateElevation$1;
        int i;
        try {
            if (hmVar instanceof FloatingActionButtonElevationAnimatable$animateElevation$1) {
                floatingActionButtonElevationAnimatable$animateElevation$1 = (FloatingActionButtonElevationAnimatable$animateElevation$1) hmVar;
                int i2 = floatingActionButtonElevationAnimatable$animateElevation$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    floatingActionButtonElevationAnimatable$animateElevation$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = floatingActionButtonElevationAnimatable$animateElevation$1.result;
                    i = floatingActionButtonElevationAnimatable$animateElevation$1.label;
                    if (i != 0) {
                        p10.Q(obj);
                        float m2004calculateTargetu2uoSUM = m2004calculateTargetu2uoSUM(interaction);
                        this.targetInteraction = interaction;
                        if (!Dp.m7616equalsimpl0(this.animatable.getTargetValue().m7625unboximpl(), m2004calculateTargetu2uoSUM)) {
                            Animatable<Dp, AnimationVector1D> animatable = this.animatable;
                            Interaction interaction2 = this.lastTargetInteraction;
                            floatingActionButtonElevationAnimatable$animateElevation$1.L$0 = interaction;
                            floatingActionButtonElevationAnimatable$animateElevation$1.label = 1;
                            Object m2898animateElevationrAjV9yQ = ElevationKt.m2898animateElevationrAjV9yQ(animatable, m2004calculateTargetu2uoSUM, interaction2, interaction, floatingActionButtonElevationAnimatable$animateElevation$1);
                            vn vnVar = vn.d;
                            if (m2898animateElevationrAjV9yQ == vnVar) {
                                return vnVar;
                            }
                        }
                    } else {
                        if (i != 1) {
                            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        interaction = (Interaction) floatingActionButtonElevationAnimatable$animateElevation$1.L$0;
                        p10.Q(obj);
                    }
                    this.lastTargetInteraction = interaction;
                    this = w01.a;
                    return this;
                }
            }
            if (i != 0) {
            }
            this.lastTargetInteraction = interaction;
            this = w01.a;
            return this;
        } catch (Throwable th) {
            this.lastTargetInteraction = interaction;
            throw th;
        }
        floatingActionButtonElevationAnimatable$animateElevation$1 = new FloatingActionButtonElevationAnimatable$animateElevation$1(this, hmVar);
        Object obj2 = floatingActionButtonElevationAnimatable$animateElevation$1.result;
        i = floatingActionButtonElevationAnimatable$animateElevation$1.label;
    }

    public final State<Dp> asState() {
        return this.animatable.asState();
    }

    /* renamed from: updateElevation-lDy3nrA, reason: not valid java name */
    public final Object m2005updateElevationlDy3nrA(float f, float f2, float f3, float f4, hm hmVar) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
        Object snapElevation = snapElevation(hmVar);
        return snapElevation == vn.d ? snapElevation : w01.a;
    }

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4, dq dqVar) {
        this(f, f2, f3, f4);
    }
}
