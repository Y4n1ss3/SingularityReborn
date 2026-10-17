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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WatchKt {
    private static ImageVector _watch;

    public static final ImageVector getWatch(Icons.TwoTone twoTone) {
        ImageVector imageVector = _watch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Watch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = gy.p(14.72f, 4.48f, 14.31f, 2.0f, 9.7f);
        p.lineToRelative(-0.41f, 2.47f);
        p.curveTo(10.13f, 4.17f, 11.05f, 4.0f, 12.0f, 4.0f);
        p.curveToRelative(0.96f, 0.0f, 1.87f, 0.17f, 2.72f, 0.48f);
        k4.r(p, 9.29f, 19.53f, 9.7f, 22.0f);
        p.horizontalLineToRelative(4.61f);
        p.lineToRelative(0.41f, -2.48f);
        p.curveToRelative(-0.85f, 0.31f, -1.76f, 0.48f, -2.72f, 0.48f);
        p.curveToRelative(-0.95f, 0.0f, -1.87f, -0.17f, -2.71f, -0.47f);
        p.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(16.96f, 5.73f, 16.0f, 0.0f);
        i.lineTo(8.0f, 0.0f);
        i.lineToRelative(-0.95f, 5.73f);
        i.curveTo(5.19f, 7.19f, 4.0f, 9.45f, 4.0f, 12.0f);
        i.reflectiveCurveToRelative(1.19f, 4.81f, 3.05f, 6.27f);
        i.lineTo(8.0f, 24.0f);
        i.horizontalLineToRelative(8.0f);
        i.lineToRelative(0.96f, -5.73f);
        i.curveTo(18.81f, 16.81f, 20.0f, 14.54f, 20.0f, 12.0f);
        i.reflectiveCurveToRelative(-1.19f, -4.81f, -3.04f, -6.27f);
        af0.l(i, 9.7f, 2.0f, 4.61f);
        i.lineToRelative(0.41f, 2.48f);
        i.curveTo(13.87f, 4.17f, 12.96f, 4.0f, 12.0f, 4.0f);
        i.curveToRelative(-0.95f, 0.0f, -1.87f, 0.17f, -2.71f, 0.47f);
        uo.l(i, 9.7f, 2.0f, 14.31f, 22.0f);
        i.lineTo(9.7f, 22.0f);
        i.lineToRelative(-0.41f, -2.47f);
        i.curveToRelative(0.84f, 0.3f, 1.76f, 0.47f, 2.71f, 0.47f);
        i.curveToRelative(0.96f, 0.0f, 1.87f, -0.17f, 2.72f, -0.48f);
        uo.l(i, 14.31f, 22.0f, 12.0f, 18.0f);
        i.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        i.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        i.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -2.69f, 6.0f, -6.0f, 6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _watch = build;
        build.getClass();
        return build;
    }
}
