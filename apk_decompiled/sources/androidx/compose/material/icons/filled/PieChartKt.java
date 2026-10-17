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
import defpackage.bv;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PieChartKt {
    private static ImageVector _pieChart;

    public static final ImageVector getPieChart(Icons.Filled filled) {
        ImageVector imageVector = _pieChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PieChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(11.0f, 2.0f, 20.0f);
        h.curveToRelative(-5.07f, -0.5f, -9.0f, -4.79f, -9.0f, -10.0f);
        h.reflectiveCurveToRelative(3.93f, -9.5f, 9.0f, -10.0f);
        bv.v(h, 13.03f, 2.0f, 8.99f);
        h.lineTo(22.0f, 10.99f);
        h.curveToRelative(-0.47f, -4.74f, -4.24f, -8.52f, -8.97f, -8.99f);
        k4.r(h, 13.03f, 13.01f, 13.03f, 22.0f);
        h.curveToRelative(4.74f, -0.47f, 8.5f, -4.25f, 8.97f, -8.99f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(h, -8.97f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pieChart = build;
        build.getClass();
        return build;
    }
}
