package androidx.compose.material.icons.twotone;

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
import defpackage.j50;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WaterDamageKt {
    private static ImageVector _waterDamage;

    public static final ImageVector getWaterDamage(Icons.TwoTone twoTone) {
        ImageVector imageVector = _waterDamage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WaterDamage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(12.0f, 5.69f, -5.0f, 4.5f, 18.0f);
        j50.o(j, 10.0f, -7.81f, 12.0f, 5.69f);
        j.moveTo(12.0f, 16.0f);
        j.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        j.curveToRelative(0.0f, -1.1f, 2.0f, -4.0f, 2.0f, -4.0f);
        j.reflectiveCurveToRelative(2.0f, 2.9f, 2.0f, 4.0f);
        j.curveTo(14.0f, 15.1f, 13.1f, 16.0f, 12.0f, 16.0f);
        j.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(12.0f, 3.0f, 2.0f, 12.0f, 3.0f);
        r6.D(k, 8.0f, 14.0f, -8.0f, 3.0f);
        uo.l(k, 12.0f, 3.0f, 7.0f, 18.0f);
        k.verticalLineToRelative(-7.81f);
        k.lineToRelative(5.0f, -4.5f);
        kp0.k(k, 5.0f, 4.5f, 18.0f, 7.0f);
        k.moveTo(14.0f, 14.0f);
        k.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        k.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        k.curveToRelative(0.0f, -1.1f, 2.0f, -4.0f, 2.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(k, 14.0f, 12.9f, 14.0f, 14.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _waterDamage = build;
        build.getClass();
        return build;
    }
}
