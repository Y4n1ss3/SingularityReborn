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
import defpackage.er;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ShowChartKt {
    private static ImageVector _showChart;

    public static final ImageVector getShowChart(Icons.Rounded rounded) {
        ImageVector imageVector = _showChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ShowChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(4.2f, 17.78f, 5.3f, -5.3f);
        e.lineToRelative(3.25f, 3.25f);
        e.curveToRelative(0.41f, 0.41f, 1.07f, 0.39f, 1.45f, -0.04f);
        e.lineToRelative(7.17f, -8.07f);
        e.curveToRelative(0.35f, -0.39f, 0.33f, -0.99f, -0.04f, -1.37f);
        e.curveToRelative(-0.4f, -0.4f, -1.07f, -0.39f, -1.45f, 0.04f);
        e.lineToRelative(-6.39f, 7.18f);
        e.lineToRelative(-3.29f, -3.29f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.lineToRelative(-6.09f, 6.1f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.lineToRelative(0.09f, 0.09f);
        e.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.41f, 0.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _showChart = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getShowChart$annotations(Icons.Rounded rounded) {
    }
}
