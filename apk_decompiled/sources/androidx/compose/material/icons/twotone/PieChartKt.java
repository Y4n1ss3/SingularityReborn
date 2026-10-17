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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PieChartKt {
    private static ImageVector _pieChart;

    public static final ImageVector getPieChart(Icons.TwoTone twoTone) {
        ImageVector imageVector = _pieChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PieChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.0f, 12.0f);
        b.curveToRelative(0.0f, 4.07f, 3.06f, 7.44f, 7.0f, 7.93f);
        b.lineTo(11.0f, 4.07f);
        b.curveTo(7.06f, 4.56f, 4.0f, 7.93f, 4.0f, 12.0f);
        b.close();
        b.moveTo(13.0f, 19.93f);
        b.curveToRelative(3.61f, -0.45f, 6.48f, -3.32f, 6.93f, -6.93f);
        bv.r(b, 13.0f, 13.0f, 6.93f);
        b.moveTo(13.0f, 4.07f);
        b.lineTo(13.0f, 11.0f);
        b.horizontalLineToRelative(6.93f);
        b.curveToRelative(-0.45f, -3.61f, -3.32f, -6.48f, -6.93f, -6.93f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.0f);
        b2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(11.0f, 19.93f);
        b2.curveToRelative(-3.94f, -0.49f, -7.0f, -3.86f, -7.0f, -7.93f);
        b2.reflectiveCurveToRelative(3.06f, -7.44f, 7.0f, -7.93f);
        r6.l(b2, 15.86f, 13.0f, 19.93f);
        b2.lineTo(13.0f, 13.0f);
        b2.horizontalLineToRelative(6.93f);
        b2.curveToRelative(-0.45f, 3.61f, -3.32f, 6.48f, -6.93f, 6.93f);
        k4.r(b2, 13.0f, 11.0f, 13.0f, 4.07f);
        b2.curveToRelative(3.61f, 0.45f, 6.48f, 3.32f, 6.93f, 6.93f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b2, 13.0f, 11.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pieChart = build;
        build.getClass();
        return build;
    }
}
