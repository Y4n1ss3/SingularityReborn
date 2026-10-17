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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpeakerPhoneKt {
    private static ImageVector _speakerPhone;

    public static final ImageVector getSpeakerPhone(Icons.Filled filled) {
        ImageVector imageVector = _speakerPhone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SpeakerPhone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.0f, 7.07f, 8.43f, 8.5f);
        i.curveToRelative(0.91f, -0.91f, 2.18f, -1.48f, 3.57f, -1.48f);
        i.reflectiveCurveToRelative(2.66f, 0.57f, 3.57f, 1.48f);
        i.lineTo(17.0f, 7.07f);
        i.curveTo(15.72f, 5.79f, 13.95f, 5.0f, 12.0f, 5.0f);
        i.reflectiveCurveToRelative(-3.72f, 0.79f, -5.0f, 2.07f);
        i.close();
        i.moveTo(12.0f, 1.0f);
        i.curveTo(8.98f, 1.0f, 6.24f, 2.23f, 4.25f, 4.21f);
        i.lineToRelative(1.41f, 1.41f);
        i.curveTo(7.28f, 4.0f, 9.53f, 3.0f, 12.0f, 3.0f);
        i.reflectiveCurveToRelative(4.72f, 1.0f, 6.34f, 2.62f);
        i.lineToRelative(1.41f, -1.41f);
        i.curveTo(17.76f, 2.23f, 15.02f, 1.0f, 12.0f, 1.0f);
        k4.r(i, 14.86f, 10.01f, 9.14f, 10.0f);
        i.curveTo(8.51f, 10.0f, 8.0f, 10.51f, 8.0f, 11.14f);
        i.verticalLineToRelative(9.71f);
        i.curveToRelative(0.0f, 0.63f, 0.51f, 1.14f, 1.14f, 1.14f);
        i.horizontalLineToRelative(5.71f);
        i.curveToRelative(0.63f, 0.0f, 1.14f, -0.51f, 1.14f, -1.14f);
        i.verticalLineToRelative(-9.71f);
        i.curveToRelative(0.01f, -0.63f, -0.5f, -1.13f, -1.13f, -1.13f);
        k4.r(i, 15.0f, 20.0f, 9.0f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.r(i, -8.0f, 6.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speakerPhone = build;
        build.getClass();
        return build;
    }
}
