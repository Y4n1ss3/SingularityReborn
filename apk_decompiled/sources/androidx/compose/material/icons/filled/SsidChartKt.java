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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SsidChartKt {
    private static ImageVector _ssidChart;

    public static final ImageVector getSsidChart(Icons.Filled filled) {
        ImageVector imageVector = _ssidChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SsidChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.0f, 5.47f, 12.0f, 12.0f);
        i.lineTo(7.62f, 7.62f);
        i.lineTo(3.0f, 11.0f);
        i.verticalLineTo(8.52f);
        i.lineTo(7.83f, 5.0f);
        i.lineToRelative(4.38f, 4.38f);
        r6.C(i, 21.0f, 3.0f, 21.0f, 5.47f);
        i.moveTo(21.0f, 15.0f);
        i.horizontalLineToRelative(-4.7f);
        i.lineToRelative(-4.17f, 3.34f);
        i.lineTo(6.0f, 12.41f);
        i.lineToRelative(-3.0f, 2.13f);
        i.lineTo(3.0f, 17.0f);
        i.lineToRelative(2.8f, -2.0f);
        i.lineToRelative(6.2f, 6.0f);
        i.lineToRelative(5.0f, -4.0f);
        i.horizontalLineToRelative(4.0f);
        i.verticalLineTo(15.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ssidChart = build;
        build.getClass();
        return build;
    }
}
