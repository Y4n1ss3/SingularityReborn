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
import defpackage.af0;
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatTextdirectionLToRKt {
    private static ImageVector _formatTextdirectionLToR;

    public static final ImageVector getFormatTextdirectionLToR(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _formatTextdirectionLToR;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.FormatTextdirectionLToR", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(9.0f, 10.0f, 4.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        fc.w(h, 11.0f, 4.0f, 2.0f, 10.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        h.lineTo(15.0f, 4.0f);
        h.horizontalLineToRelative(1.0f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        h.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        h.lineTo(9.17f, 2.0f);
        h.curveTo(7.08f, 2.0f, 5.22f, 3.53f, 5.02f, 5.61f);
        h.curveTo(4.79f, 7.99f, 6.66f, 10.0f, 9.0f, 10.0f);
        k4.x(h, 20.65f, 17.65f, -2.79f, -2.79f);
        h.curveToRelative(-0.32f, -0.32f, -0.86f, -0.1f, -0.86f, 0.35f);
        h.lineTo(17.0f, 17.0f);
        h.lineTo(6.0f, 17.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        h.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        h.horizontalLineToRelative(11.0f);
        h.verticalLineToRelative(1.79f);
        h.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        h.lineToRelative(2.79f, -2.79f);
        h.curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.7f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatTextdirectionLToR = build;
        build.getClass();
        return build;
    }
}
