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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WcKt {
    private static ImageVector _wc;

    public static final ImageVector getWc(Icons.Rounded rounded) {
        ImageVector imageVector = _wc;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Wc", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(5.5f, 21.0f, -6.5f, 5.0f, 14.5f);
        y.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        y.lineTo(4.0f, 9.0f);
        y.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        y.horizontalLineToRelative(3.0f);
        y.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        y.verticalLineToRelative(4.5f);
        y.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        y.horizontalLineToRelative(-0.5f);
        y.lineTo(9.5f, 21.0f);
        y.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        y.horizontalLineToRelative(-2.0f);
        y.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        uo.C(y, 18.0f, 21.0f, -5.0f, 1.61f);
        y.curveToRelative(0.68f, 0.0f, 1.16f, -0.67f, 0.95f, -1.32f);
        y.lineToRelative(-2.1f, -6.31f);
        y.curveTo(18.18f, 7.55f, 17.42f, 7.0f, 16.56f, 7.0f);
        y.horizontalLineToRelative(-0.12f);
        y.curveToRelative(-0.86f, 0.0f, -1.63f, 0.55f, -1.9f, 1.37f);
        y.lineToRelative(-2.1f, 6.31f);
        y.curveToRelative(-0.22f, 0.65f, 0.26f, 1.32f, 0.95f, 1.32f);
        y.lineTo(15.0f, 16.0f);
        y.verticalLineToRelative(5.0f);
        y.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        y.horizontalLineToRelative(1.0f);
        y.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        y.close();
        y.moveTo(7.5f, 6.0f);
        y.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        y.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        y.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        y.reflectiveCurveToRelative(0.89f, 2.0f, 2.0f, 2.0f);
        y.close();
        y.moveTo(16.5f, 6.0f);
        y.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        y.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        y.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(y, 0.89f, 2.0f, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wc = build;
        build.getClass();
        return build;
    }
}
