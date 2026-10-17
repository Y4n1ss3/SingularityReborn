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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SsidChartKt {
    private static ImageVector _ssidChart;

    public static final ImageVector getSsidChart(Icons.Rounded rounded) {
        ImageVector imageVector = _ssidChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SsidChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.0f, 9.03f);
        b.curveToRelative(0.0f, -0.32f, 0.15f, -0.62f, 0.41f, -0.81f);
        b.lineTo(7.14f, 5.5f);
        b.curveToRelative(0.4f, -0.29f, 0.95f, -0.25f, 1.3f, 0.1f);
        b.lineToRelative(3.78f, 3.78f);
        b.lineToRelative(7.2f, -5.23f);
        b.curveTo(20.07f, 3.67f, 21.0f, 4.14f, 21.0f, 4.96f);
        b.curveToRelative(0.0f, 0.32f, -0.15f, 0.62f, -0.41f, 0.81f);
        b.lineToRelative(-7.9f, 5.73f);
        b.curveToRelative(-0.4f, 0.29f, -0.95f, 0.25f, -1.29f, -0.1f);
        b.lineTo(7.62f, 7.62f);
        b.lineTo(4.59f, 9.84f);
        b.curveTo(3.93f, 10.32f, 3.0f, 9.85f, 3.0f, 9.03f);
        b.close();
        b.moveTo(21.0f, 16.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-3.35f);
        b.curveToRelative(-0.23f, 0.0f, -0.45f, 0.08f, -0.62f, 0.22f);
        b.lineToRelative(-3.9f, 3.12f);
        b.lineTo(6.6f, 12.99f);
        b.curveToRelative(-0.35f, -0.34f, -0.88f, -0.38f, -1.27f, -0.1f);
        b.lineToRelative(-1.9f, 1.35f);
        b.curveTo(3.16f, 14.43f, 3.0f, 14.74f, 3.0f, 15.06f);
        b.curveToRelative(0.0f, 0.81f, 0.92f, 1.29f, 1.58f, 0.81f);
        b.lineTo(5.8f, 15.0f);
        b.lineToRelative(5.57f, 5.39f);
        b.curveToRelative(0.36f, 0.35f, 0.93f, 0.38f, 1.32f, 0.06f);
        b.lineTo(17.0f, 17.0f);
        b.horizontalLineToRelative(3.0f);
        b.curveTo(20.55f, 17.0f, 21.0f, 16.55f, 21.0f, 16.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ssidChart = build;
        build.getClass();
        return build;
    }
}
