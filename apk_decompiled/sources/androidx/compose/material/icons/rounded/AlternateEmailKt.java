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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlternateEmailKt {
    private static ImageVector _alternateEmail;

    public static final ImageVector getAlternateEmail(Icons.Rounded rounded) {
        ImageVector imageVector = _alternateEmail;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AlternateEmail", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.72f, 2.03f);
        b.curveTo(6.63f, 1.6f, 1.6f, 6.63f, 2.03f, 12.72f);
        b.curveTo(2.39f, 18.01f, 7.01f, 22.0f, 12.31f, 22.0f);
        b.horizontalLineTo(16.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-3.67f);
        b.curveToRelative(-3.73f, 0.0f, -7.15f, -2.42f, -8.08f, -6.03f);
        b.curveToRelative(-1.49f, -5.8f, 3.91f, -11.21f, 9.71f, -9.71f);
        b.curveTo(17.58f, 5.18f, 20.0f, 8.6f, 20.0f, 12.33f);
        b.verticalLineToRelative(1.1f);
        b.curveToRelative(0.0f, 0.79f, -0.71f, 1.57f, -1.5f, 1.57f);
        b.reflectiveCurveToRelative(-1.5f, -0.78f, -1.5f, -1.57f);
        b.verticalLineToRelative(-1.25f);
        b.curveToRelative(0.0f, -2.51f, -1.78f, -4.77f, -4.26f, -5.12f);
        b.curveToRelative(-3.4f, -0.49f, -6.27f, 2.45f, -5.66f, 5.87f);
        b.curveToRelative(0.34f, 1.91f, 1.83f, 3.49f, 3.72f, 3.94f);
        b.curveToRelative(1.84f, 0.43f, 3.59f, -0.16f, 4.74f, -1.33f);
        b.curveToRelative(0.89f, 1.22f, 2.67f, 1.86f, 4.3f, 1.21f);
        b.curveToRelative(1.34f, -0.53f, 2.16f, -1.9f, 2.16f, -3.34f);
        b.verticalLineToRelative(-1.09f);
        b.curveToRelative(0.0f, -5.31f, -3.99f, -9.93f, -9.28f, -10.29f);
        b.close();
        b.moveTo(12.0f, 15.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -1.34f, 3.0f, -3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alternateEmail = build;
        build.getClass();
        return build;
    }
}
