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
import defpackage.fc;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CastConnectedKt {
    private static ImageVector _castConnected;

    public static final ImageVector getCastConnected(Icons.TwoTone twoTone) {
        ImageVector imageVector = _castConnected;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CastConnected", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(17.0f, 9.0f, 5.95f);
        d.curveToRelative(2.83f, 1.17f, 5.15f, 3.3f, 6.56f, 6.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(d, 17.0f, 9.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(1.0f, 18.0f, 3.0f, 3.0f);
        m.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        bv.v(m, 1.0f, 14.0f, 2.0f);
        m.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        m.horizontalLineToRelative(2.0f);
        m.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        bv.v(m, 1.0f, 10.0f, 2.0f);
        m.curveToRelative(4.97f, 0.0f, 9.0f, 4.03f, 9.0f, 9.0f);
        m.horizontalLineToRelative(2.0f);
        m.curveToRelative(0.0f, -6.08f, -4.93f, -11.0f, -11.0f, -11.0f);
        k4.r(m, 21.0f, 3.0f, 3.0f, 3.0f);
        m.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        uo.B(m, 3.0f, 2.0f, 3.0f, 5.0f);
        af0.v(m, 18.0f, 14.0f, -7.0f, 2.0f);
        m.horizontalLineToRelative(7.0f);
        m.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        m.lineTo(23.0f, 5.0f);
        m.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        bv.v(m, 5.0f, 7.0f, 1.63f);
        m.curveToRelative(0.32f, 0.1f, 0.63f, 0.24f, 0.95f, 0.37f);
        af0.m(m, 17.0f, 9.0f, 6.0f, -4.49f);
        m.curveToRelative(0.15f, 0.29f, 0.29f, 0.58f, 0.42f, 0.88f);
        m.curveToRelative(0.16f, 0.36f, 0.31f, 0.74f, 0.44f, 1.12f);
        m.lineTo(19.0f, 17.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(m, 19.0f, 7.0f, 5.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _castConnected = build;
        build.getClass();
        return build;
    }
}
