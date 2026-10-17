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
public final class StackedLineChartKt {
    private static ImageVector _stackedLineChart;

    public static final ImageVector getStackedLineChart(Icons.Rounded rounded) {
        ImageVector imageVector = _stackedLineChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.StackedLineChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.79f, 14.78f, 2.7f, 14.69f);
        i.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        i.lineToRelative(6.09f, -6.1f);
        i.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        i.lineToRelative(3.29f, 3.29f);
        i.lineToRelative(6.39f, -7.18f);
        i.curveToRelative(0.38f, -0.43f, 1.05f, -0.44f, 1.45f, -0.04f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(0.37f, 0.38f, 0.39f, 0.98f, 0.04f, 1.37f);
        i.lineToRelative(-7.17f, 8.07f);
        i.curveToRelative(-0.38f, 0.43f, -1.04f, 0.45f, -1.45f, 0.04f);
        i.lineTo(9.5f, 9.48f);
        i.lineToRelative(-5.3f, 5.3f);
        i.curveTo(3.82f, 15.17f, 3.18f, 15.17f, 2.79f, 14.78f);
        k4.x(i, 4.2f, 20.78f, 5.3f, -5.3f);
        i.lineToRelative(3.25f, 3.25f);
        i.curveToRelative(0.41f, 0.41f, 1.07f, 0.39f, 1.45f, -0.04f);
        i.lineToRelative(7.17f, -8.07f);
        i.curveToRelative(0.35f, -0.39f, 0.33f, -0.99f, -0.04f, -1.37f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(-0.4f, -0.4f, -1.07f, -0.39f, -1.45f, 0.04f);
        i.lineToRelative(-6.39f, 7.18f);
        i.lineToRelative(-3.29f, -3.29f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineToRelative(-6.09f, 6.1f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(0.09f, 0.09f);
        i.curveTo(3.18f, 21.17f, 3.82f, 21.17f, 4.2f, 20.78f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stackedLineChart = build;
        build.getClass();
        return build;
    }
}
