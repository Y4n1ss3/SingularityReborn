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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LoyaltyKt {
    private static ImageVector _loyalty;

    public static final ImageVector getLoyalty(Icons.Rounded rounded) {
        ImageVector imageVector = _loyalty;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Loyalty", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.41f, 11.58f, -9.0f, -9.0f);
        e.curveTo(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f);
        e.lineTo(4.0f, 2.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e.verticalLineToRelative(7.0f);
        e.curveToRelative(0.0f, 0.55f, 0.22f, 1.05f, 0.59f, 1.42f);
        e.lineToRelative(9.0f, 9.0f);
        e.curveToRelative(0.36f, 0.36f, 0.86f, 0.58f, 1.41f, 0.58f);
        e.reflectiveCurveToRelative(1.05f, -0.22f, 1.41f, -0.59f);
        e.lineToRelative(7.0f, -7.0f);
        e.curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        e.reflectiveCurveToRelative(-0.23f, -1.06f, -0.59f, -1.42f);
        e.close();
        e.moveTo(5.5f, 7.0f);
        e.curveTo(4.67f, 7.0f, 4.0f, 6.33f, 4.0f, 5.5f);
        e.reflectiveCurveTo(4.67f, 4.0f, 5.5f, 4.0f);
        e.reflectiveCurveTo(7.0f, 4.67f, 7.0f, 5.5f);
        e.reflectiveCurveTo(6.33f, 7.0f, 5.5f, 7.0f);
        k4.x(e, 17.27f, 15.27f, -3.92f, 3.92f);
        e.curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f);
        e.lineToRelative(-3.92f, -3.92f);
        e.curveToRelative(-0.57f, -0.58f, -0.87f, -1.43f, -0.67f, -2.34f);
        e.curveToRelative(0.19f, -0.88f, 0.89f, -1.61f, 1.76f, -1.84f);
        e.curveToRelative(0.94f, -0.25f, 1.85f, 0.04f, 2.44f, 0.65f);
        e.lineToRelative(0.75f, 0.72f);
        e.lineToRelative(0.73f, -0.73f);
        e.curveToRelative(0.45f, -0.45f, 1.08f, -0.73f, 1.77f, -0.73f);
        e.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        e.curveToRelative(0.0f, 0.69f, -0.28f, 1.32f, -0.73f, 1.77f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _loyalty = build;
        build.getClass();
        return build;
    }
}
