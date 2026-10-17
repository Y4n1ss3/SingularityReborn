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
import defpackage.af0;
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PivotTableChartKt {
    private static ImageVector _pivotTableChart;

    public static final ImageVector getPivotTableChart(Icons.Outlined outlined) {
        ImageVector imageVector = _pivotTableChart;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PivotTableChart", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 5.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        bv.l(b, -9.0f, 5.0f, 11.0f, 5.0f);
        b.moveTo(3.0f, 19.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        kf0.i(b, 3.0f, 10.0f, 3.0f, 19.0f);
        bv.y(b, 3.0f, 5.0f, 3.0f, 5.0f);
        b.verticalLineTo(3.0f);
        b.horizontalLineTo(5.0f);
        b.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        k4.r(b, 18.0f, 8.99f, 14.0f, 13.0f);
        b.lineToRelative(1.41f, 1.41f);
        b.lineToRelative(1.59f, -1.6f);
        b.verticalLineTo(15.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.horizontalLineToRelative(-2.17f);
        b.lineToRelative(1.59f, -1.59f);
        b.lineTo(13.0f, 14.0f);
        b.lineToRelative(-4.0f, 4.0f);
        b.lineToRelative(4.0f, 4.0f);
        b.lineToRelative(1.41f, -1.41f);
        b.lineTo(12.83f, 19.0f);
        b.horizontalLineTo(15.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.verticalLineToRelative(-2.18f);
        b.lineToRelative(1.59f, 1.6f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 22.0f, 13.0f, 18.0f, 8.99f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pivotTableChart = build;
        build.getClass();
        return build;
    }
}
