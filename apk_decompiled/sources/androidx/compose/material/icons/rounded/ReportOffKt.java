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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReportOffKt {
    private static ImageVector _reportOff;

    public static final ImageVector getReportOff(Icons.Rounded rounded) {
        ImageVector imageVector = _reportOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ReportOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 7.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(1.33f);
        b.lineToRelative(7.2f, 7.2f);
        b.lineToRelative(0.51f, -0.51f);
        b.curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f);
        b.verticalLineTo(8.68f);
        b.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        b.lineToRelative(-4.68f, -4.68f);
        b.curveToRelative(-0.19f, -0.18f, -0.45f, -0.29f, -0.71f, -0.29f);
        b.horizontalLineTo(8.68f);
        b.curveToRelative(-0.26f, 0.0f, -0.52f, 0.11f, -0.7f, 0.29f);
        b.lineToRelative(-0.51f, 0.51f);
        b.lineToRelative(3.69f, 3.69f);
        b.curveToRelative(0.17f, -0.29f, 0.48f, -0.49f, 0.84f, -0.49f);
        k4.r(b, 2.41f, 1.58f, 1.0f, 2.99f);
        b.lineToRelative(3.64f, 3.64f);
        b.lineToRelative(-1.35f, 1.35f);
        b.curveToRelative(-0.18f, 0.18f, -0.29f, 0.44f, -0.29f, 0.7f);
        b.verticalLineToRelative(6.63f);
        b.curveToRelative(0.0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f);
        b.lineToRelative(4.68f, 4.68f);
        b.curveToRelative(0.19f, 0.19f, 0.45f, 0.3f, 0.71f, 0.3f);
        b.horizontalLineToRelative(6.63f);
        b.curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.71f, -0.29f);
        b.lineToRelative(1.35f, -1.35f);
        b.lineTo(21.01f, 23.0f);
        gy.B(b, 1.41f, -1.41f, 2.41f, 1.58f);
        b.moveTo(12.0f, 17.3f);
        b.curveToRelative(-0.72f, 0.0f, -1.3f, -0.58f, -1.3f, -1.3f);
        b.curveToRelative(0.0f, -0.72f, 0.58f, -1.3f, 1.3f, -1.3f);
        b.reflectiveCurveToRelative(1.3f, 0.58f, 1.3f, 1.3f);
        b.curveToRelative(0.0f, 0.72f, -0.58f, 1.3f, -1.3f, 1.3f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _reportOff = build;
        build.getClass();
        return build;
    }
}
