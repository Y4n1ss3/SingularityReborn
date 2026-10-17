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
import defpackage.bv;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WheelchairPickupKt {
    private static ImageVector _wheelchairPickup;

    public static final ImageVector getWheelchairPickup(Icons.Rounded rounded) {
        ImageVector imageVector = _wheelchairPickup;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WheelchairPickup", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.5f, 4.0f);
        b.curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveTo(4.5f, 5.11f, 4.5f, 4.0f);
        bv.g(b, 10.0f, 10.95f, 9.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineTo(5.0f);
        b.curveTo(3.9f, 7.0f, 3.0f, 7.9f, 3.0f, 9.0f);
        b.verticalLineToRelative(5.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.0f);
        b.verticalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(2.5f);
        b.verticalLineToRelative(-0.11f);
        b.curveToRelative(-1.24f, -1.26f, -2.0f, -2.99f, -2.0f, -4.89f);
        b.curveTo(6.5f, 14.42f, 7.91f, 12.16f, 10.0f, 10.95f);
        b.close();
        b.moveTo(16.5f, 17.0f);
        b.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        b.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        b.curveToRelative(0.0f, -1.11f, 0.61f, -2.06f, 1.5f, -2.58f);
        b.verticalLineToRelative(-2.16f);
        b.curveTo(9.98f, 12.9f, 8.5f, 14.77f, 8.5f, 17.0f);
        b.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        kp0.r(b, 16.5f, 19.0f, 14.0f, -4.0f);
        b.verticalLineTo(9.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(4.46f);
        b.lineToRelative(1.92f, 2.88f);
        b.curveToRelative(0.31f, 0.46f, 0.93f, 0.58f, 1.39f, 0.28f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.46f, -0.31f, 0.58f, -0.93f, 0.28f, -1.39f);
        b.lineToRelative(-2.21f, -3.32f);
        b.curveTo(19.65f, 14.17f, 19.33f, 14.0f, 19.0f, 14.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wheelchairPickup = build;
        build.getClass();
        return build;
    }
}
