package androidx.compose.material.icons.rounded;

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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WaterfallChartKt {
    private static ImageVector _waterfallChart;

    public static final ImageVector getWaterfallChart(Icons.Rounded rounded) {
        ImageVector imageVector = _waterfallChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WaterfallChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.5f, 4.0f, 19.5f, 4.0f);
        i.curveTo(20.33f, 4.0f, 21.0f, 4.67f, 21.0f, 5.5f);
        i.verticalLineToRelative(13.0f);
        i.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        i.verticalLineToRelative(-13.0f);
        i.curveTo(18.0f, 4.67f, 18.67f, 4.0f, 19.5f, 4.0f);
        k4.r(i, 4.5f, 13.0f, 4.5f, 13.0f);
        i.curveTo(5.33f, 13.0f, 6.0f, 13.67f, 6.0f, 14.5f);
        i.verticalLineToRelative(4.0f);
        i.curveTo(6.0f, 19.33f, 5.33f, 20.0f, 4.5f, 20.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveTo(3.67f, 20.0f, 3.0f, 19.33f, 3.0f, 18.5f);
        i.verticalLineToRelative(-4.0f);
        i.curveTo(3.0f, 13.67f, 3.67f, 13.0f, 4.5f, 13.0f);
        k4.r(i, 15.5f, 4.0f, 15.5f, 4.0f);
        i.curveTo(16.33f, 4.0f, 17.0f, 4.67f, 17.0f, 5.5f);
        i.verticalLineToRelative(0.0f);
        i.curveTo(17.0f, 6.33f, 16.33f, 7.0f, 15.5f, 7.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveTo(14.67f, 7.0f, 14.0f, 6.33f, 14.0f, 5.5f);
        i.verticalLineToRelative(0.0f);
        i.curveTo(14.0f, 4.67f, 14.67f, 4.0f, 15.5f, 4.0f);
        k4.r(i, 11.5f, 5.0f, 11.5f, 5.0f);
        i.curveTo(12.33f, 5.0f, 13.0f, 5.67f, 13.0f, 6.5f);
        i.verticalLineToRelative(1.0f);
        i.curveTo(13.0f, 8.33f, 12.33f, 9.0f, 11.5f, 9.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveTo(10.67f, 9.0f, 10.0f, 8.33f, 10.0f, 7.5f);
        i.verticalLineToRelative(-1.0f);
        i.curveTo(10.0f, 5.67f, 10.67f, 5.0f, 11.5f, 5.0f);
        k4.r(i, 8.5f, 10.0f, 8.5f, 10.0f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        i.verticalLineToRelative(1.0f);
        i.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        i.horizontalLineToRelative(0.0f);
        i.curveTo(7.67f, 14.0f, 7.0f, 13.33f, 7.0f, 12.5f);
        i.verticalLineToRelative(-1.0f);
        i.curveTo(7.0f, 10.67f, 7.67f, 10.0f, 8.5f, 10.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _waterfallChart = build;
        build.getClass();
        return build;
    }
}
