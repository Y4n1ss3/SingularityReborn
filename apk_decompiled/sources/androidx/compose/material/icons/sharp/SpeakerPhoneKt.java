package androidx.compose.material.icons.sharp;

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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpeakerPhoneKt {
    private static ImageVector _speakerPhone;

    public static final ImageVector getSpeakerPhone(Icons.Sharp sharp) {
        ImageVector imageVector = _speakerPhone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SpeakerPhone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        k4.r(i, 15.99f, 10.01f, 8.0f, 10.0f);
        uo.D(i, 11.99f, 7.99f, 15.99f, 10.01f);
        i.moveTo(15.0f, 20.0f);
        af0.m(i, 9.0f, 20.0f, -8.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(i, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speakerPhone = build;
        build.getClass();
        return build;
    }
}
