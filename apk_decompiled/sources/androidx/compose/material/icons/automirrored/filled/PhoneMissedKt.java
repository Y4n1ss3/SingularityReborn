package androidx.compose.material.icons.automirrored.filled;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneMissedKt {
    private static ImageVector _phoneMissed;

    public static final ImageVector getPhoneMissed(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _phoneMissed;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.PhoneMissed", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(6.5f, 5.5f, 12.0f, 11.0f);
        i.lineToRelative(7.0f, -7.0f);
        i.lineToRelative(-1.0f, -1.0f);
        i.lineToRelative(-6.0f, 6.0f);
        i.lineToRelative(-4.5f, -4.5f);
        i.lineTo(11.0f, 4.5f);
        i.lineTo(11.0f, 3.0f);
        af0.m(i, 5.0f, 3.0f, 6.0f, 1.5f);
        uo.l(i, 6.5f, 5.5f, 23.71f, 16.67f);
        i.curveTo(20.66f, 13.78f, 16.54f, 12.0f, 12.0f, 12.0f);
        i.curveTo(7.46f, 12.0f, 3.34f, 13.78f, 0.29f, 16.67f);
        i.curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f);
        i.reflectiveCurveToRelative(0.11f, 0.53f, 0.29f, 0.71f);
        i.lineToRelative(2.48f, 2.48f);
        i.curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f);
        i.curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.7f, -0.28f);
        i.curveToRelative(0.79f, -0.74f, 1.69f, -1.36f, 2.66f, -1.85f);
        i.curveToRelative(0.33f, -0.16f, 0.56f, -0.5f, 0.56f, -0.9f);
        i.verticalLineToRelative(-3.1f);
        i.curveToRelative(1.45f, -0.48f, 3.0f, -0.73f, 4.6f, -0.73f);
        i.curveToRelative(1.6f, 0.0f, 3.15f, 0.25f, 4.6f, 0.72f);
        i.verticalLineToRelative(3.1f);
        i.curveToRelative(0.0f, 0.39f, 0.23f, 0.74f, 0.56f, 0.9f);
        i.curveToRelative(0.98f, 0.49f, 1.87f, 1.12f, 2.67f, 1.85f);
        i.curveToRelative(0.18f, 0.18f, 0.43f, 0.28f, 0.7f, 0.28f);
        i.curveToRelative(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f);
        i.lineToRelative(2.48f, -2.48f);
        i.curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(i, -0.12f, -0.52f, -0.3f, -0.7f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneMissed = build;
        build.getClass();
        return build;
    }
}
