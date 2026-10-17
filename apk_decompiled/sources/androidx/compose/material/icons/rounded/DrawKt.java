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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DrawKt {
    private static ImageVector _draw;

    public static final ImageVector getDraw(Icons.Rounded rounded) {
        ImageVector imageVector = _draw;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Draw", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.85f, 10.39f, 1.06f, -1.06f);
        e.curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f);
        e.lineTo(18.5f, 5.09f);
        e.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        gy.B(e, -1.06f, 1.06f, 18.85f, 10.39f);
        e.moveTo(13.19f, 7.56f);
        e.lineToRelative(-9.05f, 9.05f);
        e.curveTo(4.05f, 16.7f, 4.0f, 16.83f, 4.0f, 16.96f);
        e.verticalLineToRelative(3.54f);
        e.curveTo(4.0f, 20.78f, 4.22f, 21.0f, 4.5f, 21.0f);
        e.horizontalLineToRelative(3.54f);
        e.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
        gy.B(e, 9.05f, -9.05f, 13.19f, 7.56f);
        e.moveTo(19.0f, 17.5f);
        e.curveToRelative(0.0f, 2.19f, -2.54f, 3.5f, -5.0f, 3.5f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        e.curveToRelative(1.54f, 0.0f, 3.0f, -0.73f, 3.0f, -1.5f);
        e.curveToRelative(0.0f, -0.47f, -0.48f, -0.87f, -1.23f, -1.2f);
        e.lineToRelative(1.48f, -1.48f);
        e.curveTo(18.32f, 15.45f, 19.0f, 16.29f, 19.0f, 17.5f);
        e.close();
        e.moveTo(4.58f, 13.35f);
        e.curveTo(3.61f, 12.79f, 3.0f, 12.06f, 3.0f, 11.0f);
        e.curveToRelative(0.0f, -1.8f, 1.89f, -2.63f, 3.56f, -3.36f);
        e.curveTo(7.59f, 7.18f, 9.0f, 6.56f, 9.0f, 6.0f);
        e.curveToRelative(0.0f, -0.41f, -0.78f, -1.0f, -2.0f, -1.0f);
        e.curveTo(5.74f, 5.0f, 5.2f, 5.61f, 5.17f, 5.64f);
        e.curveTo(4.82f, 6.05f, 4.19f, 6.1f, 3.77f, 5.76f);
        e.curveTo(3.36f, 5.42f, 3.28f, 4.81f, 3.62f, 4.38f);
        e.curveTo(3.73f, 4.24f, 4.76f, 3.0f, 7.0f, 3.0f);
        e.curveToRelative(2.24f, 0.0f, 4.0f, 1.32f, 4.0f, 3.0f);
        e.curveToRelative(0.0f, 1.87f, -1.93f, 2.72f, -3.64f, 3.47f);
        e.curveTo(6.42f, 9.88f, 5.0f, 10.5f, 5.0f, 11.0f);
        e.curveToRelative(0.0f, 0.31f, 0.43f, 0.6f, 1.07f, 0.86f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 4.58f, 13.35f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _draw = build;
        build.getClass();
        return build;
    }
}
