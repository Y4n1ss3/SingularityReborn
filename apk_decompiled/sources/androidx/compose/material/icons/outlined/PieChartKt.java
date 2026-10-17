package androidx.compose.material.icons.outlined;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PieChartKt {
    private static ImageVector _pieChart;

    public static final ImageVector getPieChart(Icons.Outlined outlined) {
        ImageVector imageVector = _pieChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PieChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        k4.r(b, 19.93f, 11.0f, 13.0f, 11.0f);
        b.lineTo(13.0f, 4.07f);
        b.curveToRelative(3.61f, 0.45f, 6.48f, 3.32f, 6.93f, 6.93f);
        b.close();
        b.moveTo(4.0f, 12.0f);
        b.curveToRelative(0.0f, -4.07f, 3.06f, -7.44f, 7.0f, -7.93f);
        b.verticalLineToRelative(15.86f);
        b.curveToRelative(-3.94f, -0.49f, -7.0f, -3.86f, -7.0f, -7.93f);
        k4.r(b, 13.0f, 19.93f, 13.0f, 13.0f);
        b.horizontalLineToRelative(6.93f);
        b.curveToRelative(-0.45f, 3.61f, -3.32f, 6.48f, -6.93f, 6.93f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pieChart = build;
        build.getClass();
        return build;
    }
}
