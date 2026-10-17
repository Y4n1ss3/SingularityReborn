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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatTextdirectionRToLKt {
    private static ImageVector _formatTextdirectionRToL;

    public static final ImageVector getFormatTextdirectionRToL(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _formatTextdirectionRToL;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.FormatTextdirectionRToL", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(10.0f, 10.0f, 4.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        fc.w(h, 12.0f, 4.0f, 2.0f, 10.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        h.lineTo(16.0f, 4.0f);
        h.horizontalLineToRelative(1.0f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        h.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        h.horizontalLineToRelative(-6.83f);
        h.curveTo(8.08f, 2.0f, 6.22f, 3.53f, 6.02f, 5.61f);
        h.curveTo(5.79f, 7.99f, 7.66f, 10.0f, 10.0f, 10.0f);
        bv.v(h, 8.0f, 17.0f, -1.79f);
        h.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        h.lineToRelative(-2.79f, 2.79f);
        h.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        h.lineToRelative(2.79f, 2.79f);
        h.curveToRelative(0.31f, 0.31f, 0.85f, 0.09f, 0.85f, -0.36f);
        h.lineTo(8.0f, 19.0f);
        h.horizontalLineToRelative(11.0f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        h.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(h, 8.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatTextdirectionRToL = build;
        build.getClass();
        return build;
    }
}
