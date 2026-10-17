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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AreaChartKt {
    private static ImageVector _areaChart;

    public static final ImageVector getAreaChart(Icons.Outlined outlined) {
        ImageVector imageVector = _areaChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AreaChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.0f, 7.0f, -5.0f, -4.0f);
        e.lineToRelative(-5.0f, 7.0f);
        af0.m(e, 3.0f, 7.0f, 13.0f, 18.0f);
        bv.z(e, 7.0f, 17.0f, 19.0f, 16.95f);
        e.lineToRelative(-7.0f, -5.45f);
        e.lineTo(8.0f, 17.0f);
        e.lineToRelative(-3.0f, -2.4f);
        e.verticalLineTo(11.0f);
        e.lineToRelative(2.44f, 1.83f);
        e.lineToRelative(4.96f, -6.95f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.g(e, 16.3f, 9.0f, 19.0f, 16.95f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _areaChart = build;
        build.getClass();
        return build;
    }
}
