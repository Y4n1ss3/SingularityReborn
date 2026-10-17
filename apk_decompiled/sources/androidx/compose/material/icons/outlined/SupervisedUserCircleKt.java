package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SupervisedUserCircleKt {
    private static ImageVector _supervisedUserCircle;

    public static final ImageVector getSupervisedUserCircle(Icons.Outlined outlined) {
        ImageVector imageVector = _supervisedUserCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SupervisedUserCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.5f, 10.0f);
        b.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(-3.0f, 1.35f, -3.0f, 3.0f);
        b.reflectiveCurveToRelative(1.35f, 3.0f, 3.0f, 3.0f);
        b.reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f);
        b.close();
        b.moveTo(9.5f, 11.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        b.close();
        b.moveTo(16.0f, 13.0f);
        b.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        b.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        b.curveToRelative(-1.11f, 0.0f, -2.01f, 0.89f, -2.0f, 2.0f);
        b.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        b.close();
        b.moveTo(11.99f, 2.01f);
        b.curveToRelative(-5.52f, 0.0f, -10.0f, 4.48f, -10.0f, 10.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveToRelative(-4.48f, -10.0f, -10.0f, -10.0f);
        b.close();
        b.moveTo(5.84f, 17.12f);
        b.curveToRelative(0.68f, -0.54f, 2.27f, -1.11f, 3.66f, -1.11f);
        b.curveToRelative(0.07f, 0.0f, 0.15f, 0.01f, 0.23f, 0.01f);
        b.curveToRelative(0.24f, -0.64f, 0.67f, -1.29f, 1.3f, -1.86f);
        b.curveToRelative(-0.56f, -0.1f, -1.09f, -0.16f, -1.53f, -0.16f);
        b.curveToRelative(-1.3f, 0.0f, -3.39f, 0.45f, -4.73f, 1.43f);
        b.curveToRelative(-0.5f, -1.04f, -0.78f, -2.2f, -0.78f, -3.43f);
        b.curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b.curveToRelative(0.0f, 1.2f, -0.27f, 2.34f, -0.75f, 3.37f);
        b.curveToRelative(-1.0f, -0.59f, -2.36f, -0.87f, -3.24f, -0.87f);
        b.curveToRelative(-1.52f, 0.0f, -4.5f, 0.81f, -4.5f, 2.7f);
        b.verticalLineToRelative(2.78f);
        b.curveToRelative(-2.27f, -0.13f, -4.29f, -1.21f, -5.66f, -2.86f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _supervisedUserCircle = build;
        build.getClass();
        return build;
    }
}
