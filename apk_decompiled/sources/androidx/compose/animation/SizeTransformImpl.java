package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import defpackage.dq;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class SizeTransformImpl implements SizeTransform {
    private final boolean clip;
    private final my sizeAnimationSpec;

    public /* synthetic */ SizeTransformImpl(boolean z, my myVar, int i, dq dqVar) {
        this((i & 1) != 0 ? true : z, myVar);
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: createAnimationSpec-TemP2vQ */
    public FiniteAnimationSpec<IntSize> mo109createAnimationSpecTemP2vQ(long j, long j2) {
        return (FiniteAnimationSpec) this.sizeAnimationSpec.invoke(IntSize.m7774boximpl(j), IntSize.m7774boximpl(j2));
    }

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.clip;
    }

    public final my getSizeAnimationSpec() {
        return this.sizeAnimationSpec;
    }

    public SizeTransformImpl(boolean z, my myVar) {
        this.clip = z;
        this.sizeAnimationSpec = myVar;
    }
}
