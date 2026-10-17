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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FiberNewKt {
    private static ImageVector _fiberNew;

    public static final ImageVector getFiberNew(Icons.TwoTone twoTone) {
        ImageVector imageVector = _fiberNew;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FiberNew", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(9.12f, 14.47f, 9.12f, 9.53f);
        i.lineTo(8.09f, 9.53f);
        i.verticalLineToRelative(2.88f);
        i.lineTo(6.03f, 9.53f);
        af0.m(i, 5.0f, 9.53f, 4.94f, 1.03f);
        uo.t(i, -2.88f, 2.1f, 2.88f);
        i.moveTo(13.24f, 10.57f);
        fc.w(i, 13.24f, 9.53f, -3.3f, 4.94f);
        af0.v(i, 3.3f, -1.03f, -2.06f, -0.91f);
        gy.D(i, 2.06f, -1.04f, -2.06f, -0.92f);
        i.moveTo(14.06f, 9.53f);
        i.verticalLineToRelative(4.12f);
        i.curveToRelative(0.0f, 0.45f, 0.37f, 0.82f, 0.82f, 0.82f);
        i.horizontalLineToRelative(3.29f);
        i.curveToRelative(0.45f, 0.0f, 0.82f, -0.37f, 0.82f, -0.82f);
        fc.w(i, 18.99f, 9.53f, -1.03f, 3.71f);
        af0.v(i, -0.92f, -2.89f, -1.03f, 2.9f);
        i.horizontalLineToRelative(-0.93f);
        i.lineTo(15.08f, 9.53f);
        i.horizontalLineToRelative(-1.02f);
        i.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.f(4.0f, 6.0f, 16.0f, 12.0f, 4.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i2 = af0.i(20.0f, 4.0f, 4.0f, 4.0f);
        i2.curveToRelative(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        i2.lineTo(2.0f, 18.0f);
        i2.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        i2.horizontalLineToRelative(16.0f);
        i2.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        i2.lineTo(22.0f, 6.0f);
        i2.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        k4.r(i2, 20.0f, 18.0f, 4.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(i2, 4.0f, 6.0f, 16.0f, 12.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberNew = build;
        build.getClass();
        return build;
    }
}
