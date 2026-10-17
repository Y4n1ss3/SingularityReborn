package androidx.compose.material.icons.automirrored.twotone;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MultilineChartKt {
    private static ImageVector _multilineChart;

    public static final ImageVector getMultilineChart(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _multilineChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.MultilineChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.0f, 6.92f, -1.41f, -1.41f);
        e.lineToRelative(-2.85f, 3.21f);
        e.curveTo(15.68f, 6.4f, 12.83f, 5.0f, 9.61f, 5.0f);
        e.curveTo(6.72f, 5.0f, 4.07f, 6.16f, 2.0f, 8.0f);
        e.lineToRelative(1.42f, 1.42f);
        e.curveTo(5.12f, 7.93f, 7.27f, 7.0f, 9.61f, 7.0f);
        e.curveToRelative(2.74f, 0.0f, 5.09f, 1.26f, 6.77f, 3.24f);
        e.lineToRelative(-2.88f, 3.24f);
        e.lineToRelative(-4.0f, -4.0f);
        e.lineTo(2.0f, 16.99f);
        e.lineToRelative(1.5f, 1.5f);
        e.lineToRelative(6.0f, -6.01f);
        e.lineToRelative(4.0f, 4.0f);
        e.lineToRelative(4.05f, -4.55f);
        e.curveToRelative(0.75f, 1.35f, 1.25f, 2.9f, 1.44f, 4.55f);
        e.horizontalLineTo(21.0f);
        e.curveToRelative(-0.22f, -2.3f, -0.95f, -4.39f, -2.04f, -6.14f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 22.0f, 6.92f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _multilineChart = build;
        build.getClass();
        return build;
    }
}
