package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.fc;
import defpackage.gy;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PestControlKt {
    private static ImageVector _pestControl;

    public static final ImageVector getPestControl(Icons.Sharp sharp) {
        ImageVector imageVector = _pestControl;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PestControl", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(21.0f, 15.0f, -2.0f, -3.07f);
        m.curveToRelative(-0.05f, -0.39f, -0.12f, -0.77f, -0.22f, -1.14f);
        m.lineToRelative(2.58f, -1.49f);
        m.lineToRelative(-1.0f, -1.73f);
        m.lineTo(16.92f, 10.0f);
        m.curveToRelative(-0.28f, -0.48f, -0.62f, -0.91f, -0.99f, -1.29f);
        m.curveTo(15.97f, 8.48f, 16.0f, 8.25f, 16.0f, 8.0f);
        m.curveToRelative(0.0f, -0.8f, -0.24f, -1.55f, -0.65f, -2.18f);
        m.lineTo(17.0f, 4.17f);
        m.lineToRelative(-1.41f, -1.41f);
        m.lineToRelative(-1.72f, 1.72f);
        m.curveToRelative(-1.68f, -0.89f, -3.1f, -0.33f, -3.73f, 0.0f);
        m.lineTo(8.41f, 2.76f);
        m.lineTo(7.0f, 4.17f);
        m.lineToRelative(1.65f, 1.65f);
        m.curveTo(8.24f, 6.45f, 8.0f, 7.2f, 8.0f, 8.0f);
        m.curveToRelative(0.0f, 0.25f, 0.03f, 0.48f, 0.07f, 0.72f);
        m.curveTo(7.7f, 9.1f, 7.36f, 9.53f, 7.08f, 10.0f);
        m.lineTo(4.71f, 8.63f);
        m.lineToRelative(-1.0f, 1.73f);
        m.lineToRelative(2.58f, 1.49f);
        m.curveToRelative(-0.1f, 0.37f, -0.17f, 0.75f, -0.22f, 1.14f);
        af0.u(m, 3.0f, 2.0f, 3.07f);
        m.curveToRelative(0.05f, 0.39f, 0.12f, 0.77f, 0.22f, 1.14f);
        m.lineToRelative(-2.58f, 1.49f);
        m.lineToRelative(1.0f, 1.73f);
        m.lineTo(7.08f, 18.0f);
        m.curveToRelative(1.08f, 1.81f, 2.88f, 3.0f, 4.92f, 3.0f);
        m.reflectiveCurveToRelative(3.84f, -1.19f, 4.92f, -3.0f);
        m.lineToRelative(2.37f, 1.37f);
        m.lineToRelative(1.0f, -1.73f);
        m.lineToRelative(-2.58f, -1.49f);
        m.curveToRelative(0.1f, -0.37f, 0.17f, -0.75f, 0.22f, -1.14f);
        kp0.r(m, 21.0f, 13.0f, 17.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(m, -6.0f, 2.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pestControl = build;
        build.getClass();
        return build;
    }
}
