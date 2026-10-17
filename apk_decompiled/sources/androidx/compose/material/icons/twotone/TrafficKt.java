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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TrafficKt {
    private static ImageVector _traffic;

    public static final ImageVector getTraffic(Icons.TwoTone twoTone) {
        ImageVector imageVector = _traffic;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Traffic", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(9.0f, 19.0f, 6.0f, 15.0f, 5.0f);
        bv.r(p, 9.0f, 5.0f, 14.0f);
        p.moveTo(12.0f, 6.0f);
        p.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        p.reflectiveCurveTo(12.83f, 9.0f, 12.0f, 9.0f);
        p.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        p.reflectiveCurveTo(11.17f, 6.0f, 12.0f, 6.0f);
        p.close();
        p.moveTo(12.0f, 10.5f);
        p.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        p.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        p.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        p.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        p.close();
        p.moveTo(12.0f, 15.0f);
        p.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        p.reflectiveCurveTo(12.83f, 18.0f, 12.0f, 18.0f);
        p.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(p, 0.67f, -1.5f, 1.5f, -1.5f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p2 = kf0.p(20.0f, 5.0f, -3.0f, 17.0f, 4.0f);
        p2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        p2.lineTo(8.0f, 3.0f);
        p2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        p2.verticalLineToRelative(1.0f);
        p2.lineTo(4.0f, 5.0f);
        p2.curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f);
        p2.lineTo(7.0f, 10.0f);
        p2.lineTo(4.0f, 10.0f);
        p2.curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f);
        p2.lineTo(7.0f, 15.0f);
        p2.lineTo(4.0f, 15.0f);
        p2.curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f);
        p2.lineTo(7.0f, 20.0f);
        p2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        p2.horizontalLineToRelative(8.0f);
        p2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        p2.verticalLineToRelative(-1.14f);
        p2.curveToRelative(1.72f, -0.45f, 3.0f, -2.0f, 3.0f, -3.86f);
        p2.horizontalLineToRelative(-3.0f);
        p2.verticalLineToRelative(-1.14f);
        p2.curveToRelative(1.72f, -0.45f, 3.0f, -2.0f, 3.0f, -3.86f);
        p2.horizontalLineToRelative(-3.0f);
        p2.lineTo(17.0f, 8.86f);
        p2.curveToRelative(1.72f, -0.45f, 3.0f, -2.0f, 3.0f, -3.86f);
        k4.r(p2, 15.0f, 19.0f, 9.0f, 19.0f);
        r6.m(p2, 9.0f, 5.0f, 6.0f, 14.0f);
        p2.moveTo(12.0f, 18.0f);
        p2.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        p2.reflectiveCurveTo(12.83f, 15.0f, 12.0f, 15.0f);
        p2.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        p2.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        p2.close();
        p2.moveTo(12.0f, 13.5f);
        p2.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        p2.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        p2.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        p2.reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f);
        p2.close();
        p2.moveTo(12.0f, 9.0f);
        p2.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        p2.reflectiveCurveTo(12.83f, 6.0f, 12.0f, 6.0f);
        p2.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(p2, 11.17f, 9.0f, 12.0f, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _traffic = build;
        build.getClass();
        return build;
    }
}
