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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReportKt {
    private static ImageVector _report;

    public static final ImageVector getReport(Icons.Rounded rounded) {
        ImageVector imageVector = _report;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Report", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.32f, 3.0f, 8.68f, 3.0f);
        i.curveToRelative(-0.26f, 0.0f, -0.52f, 0.11f, -0.7f, 0.29f);
        i.lineTo(3.29f, 7.98f);
        i.curveToRelative(-0.18f, 0.18f, -0.29f, 0.44f, -0.29f, 0.7f);
        i.verticalLineToRelative(6.63f);
        i.curveToRelative(0.0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f);
        i.lineToRelative(4.68f, 4.68f);
        i.curveToRelative(0.19f, 0.19f, 0.45f, 0.3f, 0.71f, 0.3f);
        i.horizontalLineToRelative(6.63f);
        i.curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.71f, -0.29f);
        i.lineToRelative(4.68f, -4.68f);
        i.curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f);
        i.lineTo(20.99f, 8.68f);
        i.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        i.lineToRelative(-4.68f, -4.68f);
        i.curveToRelative(-0.18f, -0.18f, -0.44f, -0.29f, -0.7f, -0.29f);
        i.close();
        i.moveTo(12.0f, 17.3f);
        i.curveToRelative(-0.72f, 0.0f, -1.3f, -0.58f, -1.3f, -1.3f);
        i.reflectiveCurveToRelative(0.58f, -1.3f, 1.3f, -1.3f);
        i.reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f);
        i.reflectiveCurveToRelative(-0.58f, 1.3f, -1.3f, 1.3f);
        i.close();
        i.moveTo(12.0f, 13.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.lineTo(11.0f, 8.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        i.verticalLineToRelative(4.0f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _report = build;
        build.getClass();
        return build;
    }
}
