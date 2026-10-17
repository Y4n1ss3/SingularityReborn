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
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhishingKt {
    private static ImageVector _phishing;

    public static final ImageVector getPhishing(Icons.Outlined outlined) {
        ImageVector imageVector = _phishing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Phishing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(17.0f, 6.18f, 2.0f, -2.0f, 4.18f);
        c.curveTo(13.84f, 6.6f, 13.0f, 7.7f, 13.0f, 9.0f);
        c.reflectiveCurveToRelative(0.84f, 2.4f, 2.0f, 2.82f);
        c.verticalLineTo(15.0f);
        c.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        c.reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f);
        c.verticalLineToRelative(-1.17f);
        c.lineToRelative(1.59f, 1.59f);
        c.lineTo(10.0f, 14.0f);
        c.lineTo(5.0f, 9.0f);
        c.verticalLineToRelative(6.0f);
        c.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        c.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        c.verticalLineToRelative(-3.18f);
        c.curveToRelative(1.16f, -0.41f, 2.0f, -1.51f, 2.0f, -2.82f);
        c.reflectiveCurveTo(18.16f, 6.6f, 17.0f, 6.18f);
        c.close();
        c.moveTo(16.0f, 10.0f);
        c.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        c.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        c.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(c, 16.55f, 10.0f, 16.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phishing = build;
        build.getClass();
        return build;
    }
}
