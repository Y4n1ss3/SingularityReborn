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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LeaveBagsAtHomeKt {
    private static ImageVector _leaveBagsAtHome;

    public static final ImageVector getLeaveBagsAtHome(Icons.Filled filled) {
        ImageVector imageVector = _leaveBagsAtHome;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LeaveBagsAtHome", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(11.83f, 9.0f, 0.92f, 0.92f);
        uo.x(b, 1.75f, 1.75f, 9.0f, 16.0f);
        k4.z(b, 4.17f, 3.0f, 3.0f, 8.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineToRelative(-2.0f);
        b.verticalLineTo(3.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f);
        b.verticalLineToRelative(3.0f);
        b.horizontalLineTo(8.83f);
        b.lineTo(11.83f, 9.0f);
        b.close();
        k4.C(b, 11.0f, 4.0f, 2.0f, 2.0f);
        uo.r(b, -2.0f, 4.0f, 21.19f, 21.19f);
        b.lineTo(2.81f, 2.81f);
        b.lineTo(1.39f, 4.22f);
        b.lineToRelative(3.63f, 3.63f);
        b.curveTo(5.02f, 7.9f, 5.0f, 7.95f, 5.0f, 8.0f);
        b.verticalLineToRelative(11.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.curveToRelative(0.34f, 0.0f, 0.65f, -0.09f, 0.93f, -0.24f);
        gy.B(b, 1.85f, 1.85f, 21.19f, 21.19f);
        b.moveTo(8.0f, 18.0f);
        k4.z(b, -7.17f, 1.5f, 1.5f, 18.0f);
        kp0.D(b, 8.0f, 11.25f, 18.0f, -3.92f);
        kp0.k(b, 1.5f, 1.5f, 18.0f, 11.25f);
        b.moveTo(14.5f, 18.0f);
        b.verticalLineToRelative(-0.67f);
        b.lineTo(15.17f, 18.0f);
        b.horizontalLineTo(14.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leaveBagsAtHome = build;
        build.getClass();
        return build;
    }
}
