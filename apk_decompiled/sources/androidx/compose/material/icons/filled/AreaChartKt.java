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
import defpackage.j50;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AreaChartKt {
    private static ImageVector _areaChart;

    public static final ImageVector getAreaChart(Icons.Filled filled) {
        ImageVector imageVector = _areaChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AreaChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(3.0f, 13.0f, 7.0f, 18.0f, -1.5f);
        s.lineToRelative(-9.0f, -7.0f);
        r6.C(s, 8.0f, 17.0f, 3.0f, 13.0f);
        s.moveTo(3.0f, 7.0f);
        s.lineToRelative(4.0f, 3.0f);
        s.lineToRelative(5.0f, -7.0f);
        r6.q(s, 5.0f, 4.0f, 4.0f, 8.97f);
        s.lineToRelative(-9.4f, -7.31f);
        s.lineToRelative(-3.98f, 5.48f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(s, 3.0f, 10.44f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _areaChart = build;
        build.getClass();
        return build;
    }
}
