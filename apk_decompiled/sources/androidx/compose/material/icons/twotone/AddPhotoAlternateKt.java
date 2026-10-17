package androidx.compose.material.icons.twotone;

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
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddPhotoAlternateKt {
    private static ImageVector _addPhotoAlternate;

    public static final ImageVector getAddPhotoAlternate(Icons.TwoTone twoTone) {
        ImageVector imageVector = _addPhotoAlternate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AddPhotoAlternate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.21f, 16.83f, -1.96f, -2.36f);
        e.lineTo(5.5f, 18.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.g(e, 11.0f, -3.54f, -4.71f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(16.5f, 18.0f, -11.0f, 2.75f, -3.53f);
        i.lineToRelative(1.96f, 2.36f);
        gy.B(i, 2.75f, -3.54f, 16.5f, 18.0f);
        j50.y(i, 17.0f, 7.0f, -3.0f, 6.0f);
        af0.g(i, 4.0f, 14.0f, 14.0f, 10.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(i, -1.0f, 7.0f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(20.0f, 4.0f, 20.0f, 1.0f, -2.0f);
        r6.D(k, 3.0f, -3.0f, 2.0f, 3.0f);
        uo.B(k, 2.99f, 2.0f, 20.0f, 6.0f);
        gy.n(k, 3.0f, 23.0f, 4.0f);
        k.moveTo(18.0f, 20.0f);
        k.lineTo(4.0f, 20.0f);
        k.lineTo(4.0f, 6.0f);
        k.horizontalLineToRelative(10.0f);
        k.lineTo(14.0f, 4.0f);
        k.lineTo(4.0f, 4.0f);
        k.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        k.verticalLineToRelative(14.0f);
        k.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k.horizontalLineToRelative(14.0f);
        k.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(k, 20.0f, 10.0f, -2.0f, 10.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addPhotoAlternate = build;
        build.getClass();
        return build;
    }
}
