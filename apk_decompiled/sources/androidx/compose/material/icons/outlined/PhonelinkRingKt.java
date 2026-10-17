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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonelinkRingKt {
    private static ImageVector _phonelinkRing;

    public static final ImageVector getPhonelinkRing(Icons.Outlined outlined) {
        ImageVector imageVector = _phonelinkRing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PhonelinkRing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.1f, 7.7f, -1.0f, 1.0f);
        e.curveToRelative(1.8f, 1.8f, 1.8f, 4.6f, 0.0f, 6.5f);
        e.lineToRelative(1.0f, 1.0f);
        e.curveToRelative(2.5f, -2.3f, 2.5f, -6.1f, 0.0f, -8.5f);
        k4.x(e, 18.0f, 9.8f, -1.0f, 1.0f);
        e.curveToRelative(0.5f, 0.7f, 0.5f, 1.6f, 0.0f, 2.3f);
        e.lineToRelative(1.0f, 1.0f);
        e.curveToRelative(1.2f, -1.2f, 1.2f, -3.0f, 0.0f, -4.3f);
        k4.r(e, 14.0f, 1.0f, 4.0f, 1.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e.verticalLineToRelative(18.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(10.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.lineTo(16.0f, 3.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(e, 14.0f, 20.0f, 4.0f, 20.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(e, 4.0f, 4.0f, 10.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkRing = build;
        build.getClass();
        return build;
    }
}
