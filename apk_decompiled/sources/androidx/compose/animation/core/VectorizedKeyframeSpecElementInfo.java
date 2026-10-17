package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorizedKeyframeSpecElementInfo<V extends AnimationVector> {
    public static final int $stable = 0;
    private final int arcMode;
    private final Easing easing;
    private final V vectorValue;

    private VectorizedKeyframeSpecElementInfo(V v, Easing easing, int i) {
        this.vectorValue = v;
        this.easing = easing;
        this.arcMode = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-2NF0KzA$default, reason: not valid java name */
    public static /* synthetic */ VectorizedKeyframeSpecElementInfo m187copy2NF0KzA$default(VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo, AnimationVector animationVector, Easing easing, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            animationVector = vectorizedKeyframeSpecElementInfo.vectorValue;
        }
        if ((i2 & 2) != 0) {
            easing = vectorizedKeyframeSpecElementInfo.easing;
        }
        if ((i2 & 4) != 0) {
            i = vectorizedKeyframeSpecElementInfo.arcMode;
        }
        return vectorizedKeyframeSpecElementInfo.m189copy2NF0KzA(animationVector, easing, i);
    }

    public final V component1() {
        return this.vectorValue;
    }

    public final Easing component2() {
        return this.easing;
    }

    /* renamed from: component3--9T-Mq4, reason: not valid java name */
    public final int m188component39TMq4() {
        return this.arcMode;
    }

    /* renamed from: copy-2NF0KzA, reason: not valid java name */
    public final VectorizedKeyframeSpecElementInfo<V> m189copy2NF0KzA(V v, Easing easing, int i) {
        return new VectorizedKeyframeSpecElementInfo<>(v, easing, i, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VectorizedKeyframeSpecElementInfo)) {
            return false;
        }
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) obj;
        return q10.b(this.vectorValue, vectorizedKeyframeSpecElementInfo.vectorValue) && q10.b(this.easing, vectorizedKeyframeSpecElementInfo.easing) && ArcMode.m145equalsimpl0(this.arcMode, vectorizedKeyframeSpecElementInfo.arcMode);
    }

    /* renamed from: getArcMode--9T-Mq4, reason: not valid java name */
    public final int m190getArcMode9TMq4() {
        return this.arcMode;
    }

    public final Easing getEasing() {
        return this.easing;
    }

    public final V getVectorValue() {
        return this.vectorValue;
    }

    public int hashCode() {
        return ArcMode.m146hashCodeimpl(this.arcMode) + ((this.easing.hashCode() + (this.vectorValue.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.vectorValue + ", easing=" + this.easing + ", arcMode=" + ((Object) ArcMode.m147toStringimpl(this.arcMode)) + ')';
    }

    public /* synthetic */ VectorizedKeyframeSpecElementInfo(AnimationVector animationVector, Easing easing, int i, dq dqVar) {
        this(animationVector, easing, i);
    }
}
