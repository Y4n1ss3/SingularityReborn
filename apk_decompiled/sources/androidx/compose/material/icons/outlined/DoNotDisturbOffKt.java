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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoNotDisturbOffKt {
    private static ImageVector _doNotDisturbOff;

    public static final ImageVector getDoNotDisturbOff(Icons.Outlined outlined) {
        ImageVector imageVector = _doNotDisturbOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DoNotDisturbOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.94f, 5.12f);
        b.curveTo(9.14f, 4.41f, 10.52f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        b.curveToRelative(0.0f, 1.48f, -0.41f, 2.86f, -1.12f, 4.06f);
        b.lineToRelative(1.46f, 1.46f);
        b.curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        b.curveTo(9.96f, 2.0f, 8.07f, 2.61f, 6.49f, 3.66f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 7.94f, 5.12f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(2.81f, 2.81f, 1.39f, 4.22f);
        i.lineToRelative(2.27f, 2.27f);
        i.curveTo(2.61f, 8.07f, 2.0f, 9.96f, 2.0f, 12.0f);
        i.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        i.curveToRelative(2.04f, 0.0f, 3.93f, -0.61f, 5.51f, -1.66f);
        i.lineToRelative(2.27f, 2.27f);
        gy.B(i, 1.41f, -1.41f, 2.81f, 2.81f);
        i.moveTo(12.0f, 20.0f);
        i.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        i.curveToRelative(0.0f, -1.48f, 0.41f, -2.86f, 1.12f, -4.06f);
        r6.w(i, 8.17f, 11.0f, 7.0f, 2.0f);
        i.horizontalLineToRelative(3.17f);
        i.lineToRelative(5.88f, 5.88f);
        i.curveTo(14.86f, 19.59f, 13.48f, 20.0f, 12.0f, 20.0f);
        i.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(13.83f, 11.0f, 2.0f, 2.0f), 1.17f, 0.0f, 0.0f, -2.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotDisturbOff = build;
        build.getClass();
        return build;
    }
}
