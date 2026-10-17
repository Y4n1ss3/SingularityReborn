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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PestControlRodentKt {
    private static ImageVector _pestControlRodent;

    public static final ImageVector getPestControlRodent(Icons.Filled filled) {
        ImageVector imageVector = _pestControlRodent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PestControlRodent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.31f, 17.38f, -2.39f, -2.13f);
        e.curveTo(19.44f, 12.89f, 17.56f, 11.0f, 15.5f, 11.0f);
        e.curveToRelative(-1.16f, 0.0f, -3.5f, 0.9f, -3.5f, 3.5f);
        e.curveToRelative(0.0f, 0.97f, 0.39f, 1.84f, 1.03f, 2.47f);
        e.lineToRelative(-0.71f, 0.71f);
        e.curveTo(11.5f, 16.87f, 11.0f, 15.74f, 11.0f, 14.5f);
        e.curveToRelative(0.0f, -1.7f, 0.96f, -3.17f, 2.35f, -3.93f);
        e.curveToRelative(-0.7f, -0.36f, -1.48f, -0.57f, -2.28f, -0.57f);
        e.curveToRelative(-2.38f, 0.0f, -4.37f, 1.65f, -4.91f, 3.87f);
        e.curveTo(4.91f, 13.5f, 4.0f, 12.36f, 4.0f, 11.0f);
        e.curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        e.curveToRelative(0.94f, 0.0f, 1.56f, 0.0f, 2.5f, 0.0f);
        e.curveTo(10.88f, 8.0f, 12.0f, 6.88f, 12.0f, 5.5f);
        e.curveTo(12.0f, 4.12f, 10.88f, 3.0f, 9.5f, 3.0f);
        e.horizontalLineTo(8.0f);
        e.curveTo(7.45f, 3.0f, 7.0f, 3.45f, 7.0f, 4.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(1.5f);
        e.curveTo(9.78f, 5.0f, 10.0f, 5.22f, 10.0f, 5.5f);
        e.curveTo(10.0f, 5.78f, 9.78f, 6.0f, 9.5f, 6.0f);
        e.curveTo(9.47f, 6.0f, 9.0f, 6.0f, 7.0f, 6.0f);
        e.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        e.curveToRelative(0.0f, 2.42f, 1.72f, 4.44f, 4.0f, 4.9f);
        e.verticalLineToRelative(0.03f);
        e.curveTo(6.0f, 18.73f, 8.27f, 21.0f, 11.07f, 21.0f);
        e.horizontalLineToRelative(8.86f);
        e.curveTo(21.8f, 21.0f, 22.74f, 18.66f, 21.31f, 17.38f);
        e.close();
        e.moveTo(18.0f, 19.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        e.curveTo(19.0f, 18.55f, 18.55f, 19.0f, 18.0f, 19.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pestControlRodent = build;
        build.getClass();
        return build;
    }
}
