package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhishingKt {
    private static ImageVector _phishing;

    public static final ImageVector getPhishing(Icons.TwoTone twoTone) {
        ImageVector imageVector = _phishing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Phishing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.0f, 9.0f);
        b.curveToRelative(0.0f, -1.3f, -0.84f, -2.4f, -2.0f, -2.82f);
        kf0.r(b, 2.0f, -2.0f, 4.18f);
        b.curveTo(13.84f, 6.6f, 13.0f, 7.7f, 13.0f, 9.0f);
        b.reflectiveCurveToRelative(0.84f, 2.4f, 2.0f, 2.82f);
        b.verticalLineTo(15.0f);
        b.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        b.reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f);
        uo.B(b, -1.0f, 3.0f, 5.0f, 9.0f);
        b.verticalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        b.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        b.verticalLineToRelative(-3.18f);
        b.curveTo(18.16f, 11.4f, 19.0f, 10.3f, 19.0f, 9.0f);
        b.close();
        b.moveTo(16.0f, 10.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 16.55f, 10.0f, 16.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phishing = build;
        build.getClass();
        return build;
    }
}
