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
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AreaChartKt {
    private static ImageVector _areaChart;

    public static final ImageVector getAreaChart(Icons.Rounded rounded) {
        ImageVector imageVector = _areaChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AreaChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(8.0f, 17.0f, 3.39f, -4.66f);
        e.curveToRelative(0.33f, -0.46f, 0.98f, -0.55f, 1.42f, -0.2f);
        e.lineTo(21.0f, 18.5f);
        e.verticalLineTo(19.0f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.horizontalLineTo(4.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.lineToRelative(0.0f, -5.72f);
        e.curveToRelative(0.22f, 0.0f, 0.44f, 0.07f, 0.62f, 0.22f);
        uo.l(e, 8.0f, 17.0f, 3.0f, 11.0f);
        e.curveToRelative(0.44f, 0.0f, 0.88f, 0.15f, 1.25f, 0.44f);
        e.lineToRelative(3.37f, 2.69f);
        e.lineToRelative(2.77f, -3.81f);
        e.curveToRelative(0.66f, -0.91f, 1.95f, -1.1f, 2.85f, -0.4f);
        e.lineTo(21.0f, 15.97f);
        e.verticalLineTo(8.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineToRelative(-3.0f);
        e.lineToRelative(-4.18f, -3.34f);
        e.curveToRelative(-0.45f, -0.36f, -1.1f, -0.27f, -1.44f, 0.2f);
        e.lineTo(7.0f, 10.0f);
        e.lineTo(3.6f, 7.45f);
        e.curveTo(3.42f, 7.32f, 3.21f, 7.25f, 3.0f, 7.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 3.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _areaChart = build;
        build.getClass();
        return build;
    }
}
