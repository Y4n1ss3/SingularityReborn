package androidx.compose.ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import androidx.compose.ui.graphics.StampedPathEffectStyle;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidPathEffect_androidKt {
    public static final PathEffect actualChainPathEffect(PathEffect pathEffect, PathEffect pathEffect2) {
        pathEffect.getClass();
        android.graphics.PathEffect nativePathEffect = ((AndroidPathEffect) pathEffect).getNativePathEffect();
        pathEffect2.getClass();
        return new AndroidPathEffect(new ComposePathEffect(nativePathEffect, ((AndroidPathEffect) pathEffect2).getNativePathEffect()));
    }

    public static final PathEffect actualCornerPathEffect(float f) {
        return new AndroidPathEffect(new CornerPathEffect(f));
    }

    public static final PathEffect actualDashPathEffect(float[] fArr, float f) {
        return new AndroidPathEffect(new DashPathEffect(fArr, f));
    }

    /* renamed from: actualStampedPathEffect-7aD1DOk, reason: not valid java name */
    public static final PathEffect m4654actualStampedPathEffect7aD1DOk(Path path, float f, float f2, int i) {
        if (path instanceof AndroidPath) {
            return new AndroidPathEffect(new PathDashPathEffect(((AndroidPath) path).getInternalPath(), f, f2, m4655toAndroidPathDashPathEffectStyleoQv6xUo(i)));
        }
        lu0.a("Unable to obtain android.graphics.Path");
        return null;
    }

    public static final android.graphics.PathEffect asAndroidPathEffect(PathEffect pathEffect) {
        pathEffect.getClass();
        return ((AndroidPathEffect) pathEffect).getNativePathEffect();
    }

    /* renamed from: toAndroidPathDashPathEffectStyle-oQv6xUo, reason: not valid java name */
    public static final PathDashPathEffect.Style m4655toAndroidPathDashPathEffectStyleoQv6xUo(int i) {
        StampedPathEffectStyle.Companion companion = StampedPathEffectStyle.Companion;
        return StampedPathEffectStyle.m5121equalsimpl0(i, companion.m5125getMorphYpspkwk()) ? PathDashPathEffect.Style.MORPH : StampedPathEffectStyle.m5121equalsimpl0(i, companion.m5126getRotateYpspkwk()) ? PathDashPathEffect.Style.ROTATE : StampedPathEffectStyle.m5121equalsimpl0(i, companion.m5127getTranslateYpspkwk()) ? PathDashPathEffect.Style.TRANSLATE : PathDashPathEffect.Style.TRANSLATE;
    }

    public static final PathEffect toComposePathEffect(android.graphics.PathEffect pathEffect) {
        return new AndroidPathEffect(pathEffect);
    }
}
