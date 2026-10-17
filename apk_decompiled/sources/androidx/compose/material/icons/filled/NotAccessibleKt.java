package androidx.compose.material.icons.filled;

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
public final class NotAccessibleKt {
    private static ImageVector _notAccessible;

    public static final ImageVector getNotAccessible(Icons.Filled filled) {
        ImageVector imageVector = _notAccessible;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NotAccessible", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.0f, 11.05f, -3.42f, -3.42f);
        e.curveToRelative(0.32f, -0.34f, 0.74f, -0.57f, 1.23f, -0.61f);
        e.curveToRelative(0.48f, -0.04f, 0.84f, 0.07f, 1.2f, 0.26f);
        e.curveToRelative(0.19f, 0.1f, 0.39f, 0.22f, 0.63f, 0.46f);
        e.lineToRelative(1.29f, 1.43f);
        e.curveToRelative(0.98f, 1.08f, 2.53f, 1.85f, 4.07f, 1.83f);
        e.verticalLineToRelative(2.0f);
        e.curveTo(17.25f, 12.99f, 15.29f, 12.12f, 14.0f, 11.05f);
        e.close();
        e.moveTo(12.0f, 6.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e.reflectiveCurveTo(10.9f, 6.0f, 12.0f, 6.0f);
        k4.r(e, 2.81f, 2.81f, 1.39f, 4.22f);
        e.lineTo(10.0f, 12.83f);
        e.verticalLineTo(15.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(2.17f);
        e.lineToRelative(5.61f, 5.61f);
        gy.B(e, 1.41f, -1.41f, 2.81f, 2.81f);
        e.moveTo(10.0f, 20.0f);
        e.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        e.curveToRelative(0.0f, -1.31f, 0.84f, -2.41f, 2.0f, -2.83f);
        e.verticalLineTo(12.1f);
        e.curveToRelative(-2.28f, 0.46f, -4.0f, 2.48f, -4.0f, 4.9f);
        e.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        e.curveToRelative(2.42f, 0.0f, 4.44f, -1.72f, 4.9f, -4.0f);
        e.horizontalLineToRelative(-2.07f);
        e.curveTo(12.42f, 19.16f, 11.31f, 20.0f, 10.0f, 20.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notAccessible = build;
        build.getClass();
        return build;
    }
}
