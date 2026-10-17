package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.unit.Density;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EdgeEffectCompat {
    public static final int $stable = 0;
    public static final EdgeEffectCompat INSTANCE = new EdgeEffectCompat();

    private EdgeEffectCompat() {
    }

    public final float absorbToRelaxIfNeeded(EdgeEffect edgeEffect, float f, float f2, Density density) {
        float flingDistance;
        flingDistance = EdgeEffectCompat_androidKt.flingDistance(density, f);
        if (flingDistance > getDistanceCompat(edgeEffect) * f2) {
            return 0.0f;
        }
        onAbsorbCompat(edgeEffect, y80.P(f));
        return f;
    }

    public final EdgeEffect create(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.INSTANCE.create(context, null) : new GlowEdgeEffectCompat(context);
    }

    public final float getDistanceCompat(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public final void onAbsorbCompat(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public final float onPullDistanceCompat(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.INSTANCE.onPullDistance(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public final void onReleaseWithOppositeDelta(EdgeEffect edgeEffect, float f) {
        if (edgeEffect instanceof GlowEdgeEffectCompat) {
            ((GlowEdgeEffectCompat) edgeEffect).releaseWithOppositeDelta(f);
        } else {
            edgeEffect.onRelease();
        }
    }
}
