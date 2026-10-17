package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Interpolatable;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShadowKt {
    public static final Shadow lerp(Shadow shadow, Shadow shadow2, float f) {
        if (shadow == null && shadow2 == null) {
            return null;
        }
        if (shadow != null) {
            return shadow2 == null ? lerpNonNull(shadow, shadow.transparentCopy$ui_graphics(), f) : lerpNonNull(shadow, shadow2, f);
        }
        shadow2.getClass();
        return lerpNonNull(shadow2.transparentCopy$ui_graphics(), shadow2, f);
    }

    public static final Shadow lerpNonNull(Shadow shadow, Shadow shadow2, float f) {
        float m7654lerpMdfbLM = DpKt.m7654lerpMdfbLM(shadow.m5481getRadiusD9Ej5fM(), shadow2.m5481getRadiusD9Ej5fM(), f);
        float m7654lerpMdfbLM2 = DpKt.m7654lerpMdfbLM(shadow.m5482getSpreadD9Ej5fM(), shadow2.m5482getSpreadD9Ej5fM(), f);
        long m7655lerpxhh869w = DpKt.m7655lerpxhh869w(shadow.m5480getOffsetRKDOV3M(), shadow2.m5480getOffsetRKDOV3M(), f);
        long m4812lerpjxsXWHM = ColorKt.m4812lerpjxsXWHM(shadow.m5479getColor0d7_KjU(), shadow2.m5479getColor0d7_KjU(), f);
        Object lerp = Interpolatable.Companion.lerp(shadow.getBrush(), shadow2.getBrush(), f);
        return new Shadow(m7654lerpMdfbLM, m7654lerpMdfbLM2, m7655lerpxhh869w, m4812lerpjxsXWHM, lerp instanceof Brush ? (Brush) lerp : null, MathHelpersKt.lerp(shadow.getAlpha(), shadow2.getAlpha(), f), f < 0.5f ? shadow.m5478getBlendMode0nO6VwU() : shadow2.m5478getBlendMode0nO6VwU(), (dq) null);
    }
}
