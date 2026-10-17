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
import defpackage.af0;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonelinkRingKt {
    private static ImageVector _phonelinkRing;

    public static final ImageVector getPhonelinkRing(Icons.Rounded rounded) {
        ImageVector imageVector = _phonelinkRing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PhonelinkRing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(14.0f, 1.0f, 4.0f, 1.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(18.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(10.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(16.0f, 3.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 14.0f, 20.0f, 4.0f, 20.0f);
        r6.m(i, 4.0f, 4.0f, 10.0f, 16.0f);
        i.moveTo(20.63f, 8.26f);
        i.curveToRelative(-0.26f, -0.32f, -0.74f, -0.36f, -1.04f, -0.06f);
        i.lineToRelative(-0.03f, 0.03f);
        i.curveToRelative(-0.25f, 0.25f, -0.26f, 0.65f, -0.05f, 0.93f);
        i.curveToRelative(1.26f, 1.64f, 1.25f, 3.87f, -0.02f, 5.57f);
        i.curveToRelative(-0.21f, 0.28f, -0.19f, 0.67f, 0.05f, 0.92f);
        i.lineToRelative(0.05f, 0.05f);
        i.curveToRelative(0.29f, 0.29f, 0.76f, 0.26f, 1.03f, -0.05f);
        i.curveToRelative(1.8f, -2.13f, 1.8f, -5.19f, 0.01f, -7.39f);
        k4.x(i, 17.42f, 10.37f, -0.06f, 0.06f);
        i.curveToRelative(-0.2f, 0.2f, -0.26f, 0.5f, -0.15f, 0.76f);
        i.curveToRelative(0.21f, 0.49f, 0.21f, 1.03f, 0.0f, 1.52f);
        i.curveToRelative(-0.11f, 0.26f, -0.05f, 0.56f, 0.15f, 0.76f);
        i.lineToRelative(0.08f, 0.08f);
        i.curveToRelative(0.32f, 0.32f, 0.87f, 0.25f, 1.09f, -0.15f);
        i.curveToRelative(0.49f, -0.89f, 0.49f, -1.94f, -0.01f, -2.86f);
        i.curveToRelative(-0.22f, -0.42f, -0.77f, -0.5f, -1.1f, -0.17f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelinkRing = build;
        build.getClass();
        return build;
    }
}
