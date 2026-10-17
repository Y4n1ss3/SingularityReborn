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
import defpackage.bv;
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RadioKt {
    private static ImageVector _radio;

    public static final ImageVector getRadio(Icons.Sharp sharp) {
        ImageVector imageVector = _radio;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Radio", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(2.0f, 6.67f, 2.0f, 22.0f, 20.0f);
        k.lineTo(22.0f, 6.0f);
        k.lineTo(8.3f, 6.0f);
        k.lineToRelative(8.26f, -3.34f);
        r6.C(k, 15.88f, 1.0f, 2.0f, 6.67f);
        k.moveTo(7.0f, 20.0f);
        k.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        k.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        k.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        k.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        r6.B(k, 20.0f, 12.0f, -2.0f, -2.0f);
        bv.C(k, -2.0f, 2.0f, 4.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(k, 4.0f, 8.0f, 16.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _radio = build;
        build.getClass();
        return build;
    }
}
