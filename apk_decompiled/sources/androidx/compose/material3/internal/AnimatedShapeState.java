package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import defpackage.hm;
import defpackage.p10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnimatedShapeState {
    public static final int $stable = 0;
    private Animatable<Float, AnimationVector1D> bottomEnd;
    private Animatable<Float, AnimationVector1D> bottomStart;
    private final RoundedCornerShape shape;
    private final FiniteAnimationSpec<Float> spec;
    private Animatable<Float, AnimationVector1D> topEnd;
    private Animatable<Float, AnimationVector1D> topStart;
    private long size = Size.Companion.m4594getZeroNHjbRc();
    private Density density = DensityKt.Density(0.0f, 0.0f);

    public AnimatedShapeState(RoundedCornerShape roundedCornerShape, FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.shape = roundedCornerShape;
        this.spec = finiteAnimationSpec;
    }

    /* renamed from: bottomEnd-TmRCtEA$default, reason: not valid java name */
    public static /* synthetic */ float m2879bottomEndTmRCtEA$default(AnimatedShapeState animatedShapeState, long j, Density density, int i, Object obj) {
        if ((i & 1) != 0) {
            j = animatedShapeState.size;
        }
        if ((i & 2) != 0) {
            density = animatedShapeState.density;
        }
        return animatedShapeState.m2883bottomEndTmRCtEA(j, density);
    }

    /* renamed from: bottomStart-TmRCtEA$default, reason: not valid java name */
    public static /* synthetic */ float m2880bottomStartTmRCtEA$default(AnimatedShapeState animatedShapeState, long j, Density density, int i, Object obj) {
        if ((i & 1) != 0) {
            j = animatedShapeState.size;
        }
        if ((i & 2) != 0) {
            density = animatedShapeState.density;
        }
        return animatedShapeState.m2884bottomStartTmRCtEA(j, density);
    }

    /* renamed from: topEnd-TmRCtEA$default, reason: not valid java name */
    public static /* synthetic */ float m2881topEndTmRCtEA$default(AnimatedShapeState animatedShapeState, long j, Density density, int i, Object obj) {
        if ((i & 1) != 0) {
            j = animatedShapeState.size;
        }
        if ((i & 2) != 0) {
            density = animatedShapeState.density;
        }
        return animatedShapeState.m2887topEndTmRCtEA(j, density);
    }

    /* renamed from: topStart-TmRCtEA$default, reason: not valid java name */
    public static /* synthetic */ float m2882topStartTmRCtEA$default(AnimatedShapeState animatedShapeState, long j, Density density, int i, Object obj) {
        if ((i & 1) != 0) {
            j = animatedShapeState.size;
        }
        if ((i & 2) != 0) {
            density = animatedShapeState.density;
        }
        return animatedShapeState.m2888topStartTmRCtEA(j, density);
    }

    public final Object animateToShape(CornerBasedShape cornerBasedShape, hm hmVar) {
        return p10.n(new AnimatedShapeState$animateToShape$2(this, cornerBasedShape, null), hmVar);
    }

    /* renamed from: bottomEnd-TmRCtEA, reason: not valid java name */
    public final float m2883bottomEndTmRCtEA(long j, Density density) {
        Animatable<Float, AnimationVector1D> animatable = this.bottomEnd;
        if (animatable == null) {
            animatable = AnimatableKt.Animatable$default(this.shape.getBottomEnd().mo1047toPxTmRCtEA(j, density), 0.0f, 2, null);
            this.bottomEnd = animatable;
        }
        return animatable.getValue().floatValue();
    }

    /* renamed from: bottomStart-TmRCtEA, reason: not valid java name */
    public final float m2884bottomStartTmRCtEA(long j, Density density) {
        Animatable<Float, AnimationVector1D> animatable = this.bottomStart;
        if (animatable == null) {
            animatable = AnimatableKt.Animatable$default(this.shape.getBottomStart().mo1047toPxTmRCtEA(j, density), 0.0f, 2, null);
            this.bottomStart = animatable;
        }
        return animatable.getValue().floatValue();
    }

    public final Density getDensity() {
        return this.density;
    }

    public final RoundedCornerShape getShape() {
        return this.shape;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m2885getSizeNHjbRc() {
        return this.size;
    }

    public final FiniteAnimationSpec<Float> getSpec() {
        return this.spec;
    }

    public final void setDensity(Density density) {
        this.density = density;
    }

    /* renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m2886setSizeuvyYCjk(long j) {
        this.size = j;
    }

    /* renamed from: topEnd-TmRCtEA, reason: not valid java name */
    public final float m2887topEndTmRCtEA(long j, Density density) {
        Animatable<Float, AnimationVector1D> animatable = this.topEnd;
        if (animatable == null) {
            animatable = AnimatableKt.Animatable$default(this.shape.getTopEnd().mo1047toPxTmRCtEA(j, density), 0.0f, 2, null);
            this.topEnd = animatable;
        }
        return animatable.getValue().floatValue();
    }

    /* renamed from: topStart-TmRCtEA, reason: not valid java name */
    public final float m2888topStartTmRCtEA(long j, Density density) {
        Animatable<Float, AnimationVector1D> animatable = this.topStart;
        if (animatable == null) {
            animatable = AnimatableKt.Animatable$default(this.shape.getTopStart().mo1047toPxTmRCtEA(j, density), 0.0f, 2, null);
            this.topStart = animatable;
        }
        return animatable.getValue().floatValue();
    }
}
