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
import defpackage.af0;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RailwayAlertKt {
    private static ImageVector _railwayAlert;

    public static final ImageVector getRailwayAlert(Icons.Filled filled) {
        ImageVector imageVector = _railwayAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RailwayAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(23.0f, 8.0f);
        b.arcToRelative(7.0f, 7.0f, 0.0f, false, false, -11.95f, -4.95f);
        b.arcTo(33.8f, 33.8f, 0.0f, false, false, 9.0f, 3.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f);
        b.verticalLineToRelative(10.5f);
        b.arcTo(3.5f, 3.5f, 0.0f, false, false, 4.5f, 21.0f);
        af0.m(b, 3.0f, 22.5f, 0.5f, 12.0f);
        b.verticalLineToRelative(-0.5f);
        b.lineTo(13.5f, 21.0f);
        b.arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.5f, -3.5f);
        b.verticalLineToRelative(-2.58f);
        b.arcTo(7.0f, 7.0f, 0.0f, false, false, 23.0f, 8.0f);
        k4.r(b, 3.0f, 12.0f, 3.0f, 7.0f);
        b.horizontalLineToRelative(6.08f);
        b.arcToRelative(6.96f, 6.96f, 0.0f, false, false, 1.18f, 5.0f);
        uo.l(b, 3.0f, 12.0f, 9.0f, 19.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        k4.x(b, 16.71f, 12.94f, -0.2f, 0.03f);
        b.lineTo(16.0f, 13.0f);
        b.lineToRelative(-0.47f, -0.02f);
        b.lineToRelative(-0.16f, -0.02f);
        b.lineToRelative(-0.29f, -0.04f);
        b.lineToRelative(-0.2f, -0.04f);
        b.lineToRelative(-0.22f, -0.06f);
        b.arcToRelative(1.55f, 1.55f, 0.0f, false, true, -0.23f, -0.07f);
        b.lineToRelative(-0.13f, -0.05f);
        b.arcTo(4.99f, 4.99f, 0.0f, false, true, 11.1f, 7.0f);
        b.curveToRelative(0.04f, -0.19f, 0.09f, -0.37f, 0.15f, -0.54f);
        b.lineToRelative(0.05f, -0.14f);
        b.lineToRelative(0.15f, -0.38f);
        b.lineToRelative(0.07f, -0.15f);
        b.lineToRelative(0.2f, -0.36f);
        b.lineToRelative(0.07f, -0.12f);
        b.lineToRelative(0.3f, -0.42f);
        b.lineToRelative(0.02f, -0.02f);
        b.curveToRelative(0.24f, -0.3f, 0.52f, -0.57f, 0.82f, -0.81f);
        b.lineToRelative(0.01f, -0.01f);
        b.lineToRelative(0.46f, -0.32f);
        b.lineToRelative(0.03f, -0.02f);
        b.arcTo(5.25f, 5.25f, 0.0f, false, true, 16.0f, 3.0f);
        b.arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.71f, 9.94f);
        r6.B(b, 15.0f, 4.0f, 2.0f, 5.0f);
        kp0.A(b, -2.0f, 15.0f, 10.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(b, 2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _railwayAlert = build;
        build.getClass();
        return build;
    }
}
