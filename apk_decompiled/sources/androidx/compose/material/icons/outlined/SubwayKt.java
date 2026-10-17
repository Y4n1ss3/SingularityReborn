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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SubwayKt {
    private static ImageVector _subway;

    public static final ImageVector getSubway(Icons.Outlined outlined) {
        ImageVector imageVector = _subway;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Subway", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.8f, 2.8f);
        b.curveTo(16.0f, 2.09f, 13.86f, 2.0f, 12.0f, 2.0f);
        b.reflectiveCurveToRelative(-4.0f, 0.09f, -5.8f, 0.8f);
        b.curveTo(3.53f, 3.84f, 2.0f, 6.05f, 2.0f, 8.86f);
        b.lineTo(2.0f, 22.0f);
        b.horizontalLineToRelative(20.0f);
        b.lineTo(22.0f, 8.86f);
        b.curveToRelative(0.0f, -2.81f, -1.53f, -5.02f, -4.2f, -6.06f);
        k4.x(b, 9.17f, 20.0f, 1.5f, -1.5f);
        b.horizontalLineToRelative(2.66f);
        gy.B(b, 1.5f, 1.5f, 9.17f, 20.0f);
        b.moveTo(7.01f, 14.0f);
        fc.w(b, 7.01f, 9.0f, 10.0f, 5.0f);
        j50.t(b, -10.0f, 16.5f, 16.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b.close();
        b.moveTo(8.5f, 15.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        r6.B(b, 20.0f, 20.0f, -3.5f, -0.38f);
        b.lineToRelative(-1.15f, -1.16f);
        b.curveToRelative(1.49f, -0.17f, 2.65f, -1.42f, 2.65f, -2.96f);
        b.lineTo(18.0f, 9.0f);
        b.curveToRelative(0.0f, -2.63f, -3.0f, -3.0f, -6.0f, -3.0f);
        b.reflectiveCurveToRelative(-6.0f, 0.37f, -6.0f, 3.0f);
        b.verticalLineToRelative(6.5f);
        b.curveToRelative(0.0f, 1.54f, 1.16f, 2.79f, 2.65f, 2.96f);
        b.lineTo(7.5f, 19.62f);
        b.lineTo(7.5f, 20.0f);
        b.lineTo(4.0f, 20.0f);
        b.lineTo(4.0f, 8.86f);
        b.curveToRelative(0.0f, -2.0f, 1.01f, -3.45f, 2.93f, -4.2f);
        b.curveTo(8.41f, 4.08f, 10.32f, 4.0f, 12.0f, 4.0f);
        b.reflectiveCurveToRelative(3.59f, 0.08f, 5.07f, 0.66f);
        b.curveToRelative(1.92f, 0.75f, 2.93f, 2.2f, 2.93f, 4.2f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 20.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _subway = build;
        build.getClass();
        return build;
    }
}
