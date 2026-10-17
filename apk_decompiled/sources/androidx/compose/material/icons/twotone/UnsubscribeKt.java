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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UnsubscribeKt {
    private static ImageVector _unsubscribe;

    public static final ImageVector getUnsubscribe(Icons.TwoTone twoTone) {
        ImageVector imageVector = _unsubscribe;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Unsubscribe", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.99f, 5.0f, 5.0f, 5.0f);
        fc.B(i, 7.0f, 3.5f, 19.0f, 13.05f);
        i.lineTo(19.0f, 7.0f);
        i.lineToRelative(-7.0f, 3.5f);
        af0.m(i, 5.0f, 7.0f, 8.0f, 10.35f);
        i.curveToRelative(0.56f, -1.18f, 1.76f, -2.0f, 3.15f, -2.0f);
        i.curveToRelative(0.17f, 0.0f, 0.34f, 0.03f, 0.5f, 0.05f);
        i.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i2 = af0.i(20.99f, 14.04f, 20.99f, 5.0f);
        i2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i2.lineTo(5.0f, 3.0f);
        i2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i2.verticalLineToRelative(10.0f);
        i2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i2.horizontalLineToRelative(10.05f);
        i2.curveToRelative(0.28f, 1.92f, 2.1f, 3.35f, 4.18f, 2.93f);
        i2.curveToRelative(1.34f, -0.27f, 2.43f, -1.37f, 2.7f, -2.71f);
        i2.curveToRelative(0.25f, -1.24f, -0.16f, -2.39f, -0.94f, -3.18f);
        k4.r(i2, 18.99f, 5.0f, 12.0f, 8.5f);
        uf.j(i2, 5.0f, 5.0f, 13.99f);
        i2.moveTo(15.35f, 15.0f);
        i2.lineTo(5.0f, 15.0f);
        i2.lineTo(5.0f, 7.0f);
        i2.lineToRelative(7.0f, 3.5f);
        i2.lineTo(19.0f, 7.0f);
        i2.verticalLineToRelative(6.05f);
        i2.curveToRelative(-0.16f, -0.02f, -0.33f, -0.05f, -0.5f, -0.05f);
        i2.curveToRelative(-1.39f, 0.0f, -2.59f, 0.82f, -3.15f, 2.0f);
        r6.B(i2, 20.5f, 17.0f, -4.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(i2, 4.0f, 1.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unsubscribe = build;
        build.getClass();
        return build;
    }
}
