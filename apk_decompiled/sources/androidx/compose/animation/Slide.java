package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntOffset;
import defpackage.ky;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Slide {
    public static final int $stable = 0;
    private final FiniteAnimationSpec<IntOffset> animationSpec;
    private final ky slideOffset;

    public Slide(ky kyVar, FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.slideOffset = kyVar;
        this.animationSpec = finiteAnimationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Slide copy$default(Slide slide, ky kyVar, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            kyVar = slide.slideOffset;
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = slide.animationSpec;
        }
        return slide.copy(kyVar, finiteAnimationSpec);
    }

    public final ky component1() {
        return this.slideOffset;
    }

    public final FiniteAnimationSpec<IntOffset> component2() {
        return this.animationSpec;
    }

    public final Slide copy(ky kyVar, FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        return new Slide(kyVar, finiteAnimationSpec);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) obj;
        return q10.b(this.slideOffset, slide.slideOffset) && q10.b(this.animationSpec, slide.animationSpec);
    }

    public final FiniteAnimationSpec<IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    public final ky getSlideOffset() {
        return this.slideOffset;
    }

    public int hashCode() {
        return this.animationSpec.hashCode() + (this.slideOffset.hashCode() * 31);
    }

    public String toString() {
        return "Slide(slideOffset=" + this.slideOffset + ", animationSpec=" + this.animationSpec + ')';
    }
}
