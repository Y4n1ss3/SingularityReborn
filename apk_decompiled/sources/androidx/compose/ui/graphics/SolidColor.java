package androidx.compose.ui.graphics;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SolidColor extends Brush implements Interpolatable {
    public static final int $stable = 0;
    private final long value;

    private SolidColor(long j) {
        super(null);
        this.value = j;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public void mo4706applyToPq9zytI(long j, Paint paint, float f) {
        paint.setAlpha(1.0f);
        long j2 = this.value;
        if (f != 1.0f) {
            j2 = Color.m4760copywmQWz5c$default(j2, Color.m4763getAlphaimpl(j2) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        paint.mo4637setColor8_81llA(j2);
        if (paint.getShader() != null) {
            paint.setShader(null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolidColor) && Color.m4762equalsimpl0(this.value, ((SolidColor) obj).value);
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m5117getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m4768hashCodeimpl(this.value);
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f) {
        dq dqVar = null;
        if (obj == null) {
            obj = new SolidColor(Color.Companion.m4796getTransparent0d7_KjU(), dqVar);
        }
        if (obj instanceof SolidColor) {
            return new SolidColor(ColorKt.m4812lerpjxsXWHM(this.value, ((SolidColor) obj).value, f), dqVar);
        }
        return null;
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m4769toStringimpl(this.value)) + ')';
    }

    public /* synthetic */ SolidColor(long j, dq dqVar) {
        this(j);
    }
}
