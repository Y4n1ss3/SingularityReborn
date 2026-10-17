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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhishingKt {
    private static ImageVector _phishing;

    public static final ImageVector getPhishing(Icons.Rounded rounded) {
        ImageVector imageVector = _phishing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Phishing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.0f, 9.0f);
        b.curveToRelative(0.0f, -1.3f, -0.84f, -2.4f, -2.0f, -2.82f);
        b.verticalLineTo(3.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(3.18f);
        b.curveTo(13.84f, 6.6f, 13.0f, 7.7f, 13.0f, 9.0f);
        b.reflectiveCurveToRelative(0.84f, 2.4f, 2.0f, 2.82f);
        b.lineToRelative(0.0f, 3.01f);
        b.curveToRelative(0.0f, 2.09f, -1.52f, 3.96f, -3.6f, 4.16f);
        b.curveTo(9.02f, 19.21f, 7.0f, 17.34f, 7.0f, 15.0f);
        b.verticalLineToRelative(-1.0f);
        b.horizontalLineToRelative(1.79f);
        b.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        b.lineTo(5.85f, 9.85f);
        b.curveTo(5.54f, 9.54f, 5.0f, 9.76f, 5.0f, 10.21f);
        b.lineToRelative(0.0f, 4.58f);
        b.curveToRelative(0.0f, 3.05f, 2.19f, 5.77f, 5.21f, 6.16f);
        b.curveTo(13.87f, 21.42f, 17.0f, 18.57f, 17.0f, 15.0f);
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
