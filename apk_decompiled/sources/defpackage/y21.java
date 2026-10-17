package defpackage;

import android.view.WindowInsetsAnimation;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class y21 extends z21 {
    public final WindowInsetsAnimation e;

    public y21(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.z21
    public final float a() {
        float alpha;
        alpha = this.e.getAlpha();
        return alpha;
    }

    @Override // defpackage.z21
    public final long b() {
        long durationMillis;
        durationMillis = this.e.getDurationMillis();
        return durationMillis;
    }

    @Override // defpackage.z21
    public final float c() {
        float interpolatedFraction;
        interpolatedFraction = this.e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // defpackage.z21
    public final int d() {
        int typeMask;
        typeMask = this.e.getTypeMask();
        return typeMask;
    }

    @Override // defpackage.z21
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
