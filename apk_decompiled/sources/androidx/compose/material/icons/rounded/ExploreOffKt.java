package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExploreOffKt {
    private static ImageVector _exploreOff;

    public static final ImageVector getExploreOff(Icons.Rounded rounded) {
        ImageVector imageVector = _exploreOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ExploreOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.0f, 6.0f, -2.91f, 6.26f);
        e.lineToRelative(5.25f, 5.25f);
        e.curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f);
        e.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        e.curveToRelative(-2.04f, 0.0f, -3.93f, 0.61f, -5.51f, 1.66f);
        gy.B(e, 5.25f, 5.25f, 18.0f, 6.0f);
        e.moveTo(2.81f, 5.64f);
        e.lineToRelative(0.85f, 0.85f);
        e.curveToRelative(-1.37f, 2.07f, -2.0f, 4.68f, -1.48f, 7.45f);
        e.curveToRelative(0.75f, 3.95f, 3.92f, 7.13f, 7.88f, 7.88f);
        e.curveToRelative(2.77f, 0.52f, 5.38f, -0.1f, 7.45f, -1.48f);
        e.lineToRelative(0.85f, 0.85f);
        e.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        e.lineTo(4.22f, 4.22f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
        k4.x(e, 8.91f, 11.74f, 3.35f, 3.35f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(e, 6.0f, 18.0f, 2.91f, -6.26f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _exploreOff = build;
        build.getClass();
        return build;
    }
}
