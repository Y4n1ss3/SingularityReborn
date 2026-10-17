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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PivotTableChartKt {
    private static ImageVector _pivotTableChart;

    public static final ImageVector getPivotTableChart(Icons.Filled filled) {
        ImageVector imageVector = _pivotTableChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PivotTableChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(10.0f, 8.0f, 11.0f, 21.0f, 5.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        fc.x(p, -9.0f, 5.0f, 3.0f, 8.0f);
        p.horizontalLineToRelative(5.0f);
        p.lineTo(8.0f, 3.0f);
        p.lineTo(5.0f, 3.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        bv.m(p, 3.0f, 5.0f, 21.0f, 3.0f);
        p.lineTo(8.0f, 10.0f);
        p.lineTo(3.0f, 10.0f);
        p.verticalLineToRelative(9.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k4.x(p, 13.0f, 22.0f, -4.0f, -4.0f);
        fc.B(p, 4.0f, -4.0f, 14.0f, 13.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(p, 4.0f, -4.0f, 4.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(14.58f, 19.0f, 13.0f, -2.0f, 1.58f);
        i.curveToRelative(1.33f, 0.0f, 2.42f, -1.08f, 2.42f, -2.42f);
        kf0.r(i, 13.0f, 2.0f, 1.58f);
        i.curveToRelative(0.0f, 2.44f, -1.98f, 4.42f, -4.42f, 4.42f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pivotTableChart = build;
        build.getClass();
        return build;
    }
}
