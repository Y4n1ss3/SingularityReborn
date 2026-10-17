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
import defpackage.bv;
import defpackage.gy;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlagKt {
    private static ImageVector _flag;

    public static final ImageVector getFlag(Icons.TwoTone twoTone) {
        ImageVector imageVector = _flag;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Flag", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(12.36f, 6.0f, 7.0f, 6.0f, 7.24f);
        kp0.v(i, 0.4f, 2.0f, 18.0f, 8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(i, -5.24f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i2 = af0.i(14.4f, 6.0f, 14.0f, 4.0f);
        af0.m(i2, 5.0f, 4.0f, 17.0f, 2.0f);
        gy.C(i2, -7.0f, 5.6f, 0.4f, 2.0f);
        uf.C(i2, 7.0f, 20.0f, 6.0f, -5.6f);
        i2.moveTo(18.0f, 14.0f);
        i2.horizontalLineToRelative(-3.36f);
        i2.lineToRelative(-0.4f, -2.0f);
        i2.lineTo(7.0f, 12.0f);
        i2.lineTo(7.0f, 6.0f);
        i2.horizontalLineToRelative(5.36f);
        i2.lineToRelative(0.4f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(i2, 18.0f, 8.0f, 6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flag = build;
        build.getClass();
        return build;
    }
}
