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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StackedLineChartKt {
    private static ImageVector _stackedLineChart;

    public static final ImageVector getStackedLineChart(Icons.Filled filled) {
        ImageVector imageVector = _stackedLineChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.StackedLineChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(2.0f, 19.99f, 7.5f, -7.51f);
        e.lineToRelative(4.0f, 4.0f);
        e.lineToRelative(7.09f, -7.97f);
        e.lineTo(22.0f, 9.92f);
        e.lineToRelative(-8.5f, 9.56f);
        e.lineToRelative(-4.0f, -4.0f);
        gy.B(e, -6.0f, 6.01f, 2.0f, 19.99f);
        e.moveTo(3.5f, 15.49f);
        e.lineToRelative(6.0f, -6.01f);
        e.lineToRelative(4.0f, 4.0f);
        e.lineTo(22.0f, 3.92f);
        e.lineToRelative(-1.41f, -1.41f);
        e.lineToRelative(-7.09f, 7.97f);
        e.lineToRelative(-4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 2.0f, 13.99f, 3.5f, 15.49f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stackedLineChart = build;
        build.getClass();
        return build;
    }
}
