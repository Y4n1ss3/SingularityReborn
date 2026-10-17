package androidx.compose.material.icons.filled;

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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MicExternalOffKt {
    private static ImageVector _micExternalOff;

    public static final ImageVector getMicExternalOff(Icons.Filled filled) {
        ImageVector imageVector = _micExternalOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MicExternalOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.19f, 21.19f, 2.81f, 2.81f);
        i.lineTo(1.39f, 4.22f);
        i.lineTo(5.17f, 8.0f);
        i.lineTo(4.0f, 8.0f);
        i.lineToRelative(1.0f, 10.0f);
        i.horizontalLineToRelative(1.0f);
        i.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        i.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        i.verticalLineToRelative(-1.17f);
        fc.C(i, 5.78f, 5.78f, 1.41f, -1.42f);
        i.moveTo(12.0f, 18.0f);
        i.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        i.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        i.horizontalLineToRelative(1.0f);
        i.lineToRelative(0.56f, -5.61f);
        r6.C(i, 12.0f, 14.83f, 12.0f, 18.0f);
        i.moveTo(14.0f, 6.0f);
        i.verticalLineToRelative(5.17f);
        i.lineToRelative(-2.0f, -2.0f);
        i.lineTo(12.0f, 6.0f);
        i.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        i.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        i.verticalLineToRelative(11.17f);
        i.lineToRelative(-2.0f, -2.0f);
        i.lineTo(18.0f, 6.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        i.close();
        i.moveTo(10.0f, 5.0f);
        i.curveToRelative(0.0f, 0.62f, -0.2f, 1.18f, -0.52f, 1.66f);
        i.lineTo(5.33f, 2.51f);
        i.curveTo(5.81f, 2.19f, 6.38f, 2.0f, 7.0f, 2.0f);
        i.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micExternalOff = build;
        build.getClass();
        return build;
    }
}
