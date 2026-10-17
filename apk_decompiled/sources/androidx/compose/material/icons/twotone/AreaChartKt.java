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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AreaChartKt {
    private static ImageVector _areaChart;

    public static final ImageVector getAreaChart(Icons.TwoTone twoTone) {
        ImageVector imageVector = _areaChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AreaChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.0f, 16.95f, -7.0f, -5.45f);
        e.lineToRelative(-4.0f, 5.5f);
        e.lineToRelative(-3.0f, -2.4f);
        e.lineToRelative(0.0f, -3.6f);
        e.lineToRelative(2.44f, 1.83f);
        e.lineToRelative(4.96f, -6.95f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 3.9f, 3.12f, 2.7f, 0.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(17.0f, 7.0f, -5.0f, -4.0f);
        e2.lineToRelative(-5.0f, 7.0f);
        af0.m(e2, 3.0f, 7.0f, 13.0f, 18.0f);
        bv.z(e2, 7.0f, 17.0f, 19.0f, 16.95f);
        e2.lineToRelative(-7.0f, -5.45f);
        e2.lineTo(8.0f, 17.0f);
        e2.lineToRelative(-3.0f, -2.4f);
        e2.verticalLineTo(11.0f);
        e2.lineToRelative(2.44f, 1.83f);
        e2.lineToRelative(4.96f, -6.95f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.g(e2, 16.3f, 9.0f, 19.0f, 16.95f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _areaChart = build;
        build.getClass();
        return build;
    }
}
