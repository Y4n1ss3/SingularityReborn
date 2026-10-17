package androidx.compose.material.icons.automirrored.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MultilineChartKt {
    private static ImageVector _multilineChart;

    public static final ImageVector getMultilineChart(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _multilineChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.MultilineChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.36f, 6.28f, -0.06f, -0.06f);
        e.curveToRelative(-0.39f, -0.39f, -1.03f, -0.37f, -1.39f, 0.04f);
        e.lineToRelative(-2.18f, 2.45f);
        e.curveTo(15.68f, 6.4f, 12.83f, 5.0f, 9.61f, 5.0f);
        e.curveToRelative(-2.5f, 0.0f, -4.83f, 0.87f, -6.75f, 2.3f);
        e.curveToRelative(-0.47f, 0.35f, -0.52f, 1.04f, -0.11f, 1.45f);
        e.lineToRelative(0.06f, 0.06f);
        e.curveToRelative(0.33f, 0.33f, 0.86f, 0.39f, 1.23f, 0.11f);
        e.curveTo(5.63f, 7.72f, 7.54f, 7.0f, 9.61f, 7.0f);
        e.curveToRelative(2.74f, 0.0f, 5.09f, 1.26f, 6.77f, 3.24f);
        e.lineToRelative(-2.88f, 3.24f);
        e.lineToRelative(-3.29f, -3.29f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.lineToRelative(-6.12f, 6.13f);
        e.curveToRelative(-0.37f, 0.37f, -0.37f, 0.98f, 0.0f, 1.35f);
        e.lineToRelative(0.15f, 0.15f);
        e.curveToRelative(0.37f, 0.37f, 0.98f, 0.37f, 1.35f, 0.0f);
        e.lineToRelative(5.32f, -5.33f);
        e.lineToRelative(3.25f, 3.25f);
        e.curveToRelative(0.41f, 0.41f, 1.07f, 0.39f, 1.45f, -0.04f);
        e.lineToRelative(3.35f, -3.76f);
        e.curveToRelative(0.62f, 1.12f, 1.08f, 2.39f, 1.32f, 3.73f);
        e.curveToRelative(0.08f, 0.47f, 0.47f, 0.82f, 0.95f, 0.82f);
        e.horizontalLineToRelative(0.09f);
        e.curveToRelative(0.6f, 0.0f, 1.05f, -0.55f, 0.94f, -1.14f);
        e.curveToRelative(-0.32f, -1.85f, -0.98f, -3.54f, -1.89f, -5.0f);
        e.lineTo(21.4f, 7.6f);
        e.curveToRelative(0.34f, -0.38f, 0.32f, -0.96f, -0.04f, -1.32f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _multilineChart = build;
        build.getClass();
        return build;
    }
}
