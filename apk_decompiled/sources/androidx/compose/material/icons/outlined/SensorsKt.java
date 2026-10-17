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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SensorsKt {
    private static ImageVector _sensors;

    public static final ImageVector getSensors(Icons.Outlined outlined) {
        ImageVector imageVector = _sensors;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Sensors", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.76f, 16.24f);
        b.curveTo(6.67f, 15.16f, 6.0f, 13.66f, 6.0f, 12.0f);
        b.reflectiveCurveToRelative(0.67f, -3.16f, 1.76f, -4.24f);
        b.lineToRelative(1.42f, 1.42f);
        b.curveTo(8.45f, 9.9f, 8.0f, 10.9f, 8.0f, 12.0f);
        b.curveToRelative(0.0f, 1.1f, 0.45f, 2.1f, 1.17f, 2.83f);
        uo.l(b, 7.76f, 16.24f, 16.24f, 16.24f);
        b.curveTo(17.33f, 15.16f, 18.0f, 13.66f, 18.0f, 12.0f);
        b.reflectiveCurveToRelative(-0.67f, -3.16f, -1.76f, -4.24f);
        b.lineToRelative(-1.42f, 1.42f);
        b.curveTo(15.55f, 9.9f, 16.0f, 10.9f, 16.0f, 12.0f);
        b.curveToRelative(0.0f, 1.1f, -0.45f, 2.1f, -1.17f, 2.83f);
        uo.l(b, 16.24f, 16.24f, 12.0f, 10.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f);
        b.close();
        b.moveTo(20.0f, 12.0f);
        b.curveToRelative(0.0f, 2.21f, -0.9f, 4.21f, -2.35f, 5.65f);
        b.lineToRelative(1.42f, 1.42f);
        b.curveTo(20.88f, 17.26f, 22.0f, 14.76f, 22.0f, 12.0f);
        b.reflectiveCurveToRelative(-1.12f, -5.26f, -2.93f, -7.07f);
        b.lineToRelative(-1.42f, 1.42f);
        b.curveTo(19.1f, 7.79f, 20.0f, 9.79f, 20.0f, 12.0f);
        k4.r(b, 6.35f, 6.35f, 4.93f, 4.93f);
        b.curveTo(3.12f, 6.74f, 2.0f, 9.24f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(1.12f, 5.26f, 2.93f, 7.07f);
        b.lineToRelative(1.42f, -1.42f);
        b.curveTo(4.9f, 16.21f, 4.0f, 14.21f, 4.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 4.9f, 7.79f, 6.35f, 6.35f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sensors = build;
        build.getClass();
        return build;
    }
}
