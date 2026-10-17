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
import defpackage.bv;
import defpackage.c21;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoCellKt {
    private static ImageVector _noCell;

    public static final ImageVector getNoCell(Icons.TwoTone twoTone) {
        ImageVector imageVector = _noCell;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NoCell", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(7.0f, 21.0f, 10.0f, -1.0f, 7.0f);
        kf0.D(d, 21.0f, 7.0f, 3.0f, 1.0f);
        d.horizontalLineToRelative(10.0f);
        d.verticalLineTo(3.0f);
        d.horizontalLineTo(7.0f);
        d.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(17.0f, 6.0f, 8.17f, 2.0f, 2.0f);
        n.verticalLineTo(3.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        n.lineTo(7.0f, 1.0f);
        n.curveTo(6.15f, 1.0f, 5.42f, 1.55f, 5.13f, 2.3f);
        kf0.h(n, 8.83f, 6.0f, 17.0f);
        k4.C(n, 7.0f, 3.0f, 10.0f, 1.0f);
        bv.s(n, 7.0f, 3.0f, 21.19f, 21.19f);
        n.lineTo(2.81f, 2.81f);
        n.lineTo(1.39f, 4.22f);
        n.lineTo(5.0f, 7.83f);
        n.verticalLineTo(21.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(10.0f);
        n.curveToRelative(0.85f, 0.0f, 1.58f, -0.55f, 1.87f, -1.3f);
        gy.B(n, 0.91f, 0.91f, 21.19f, 21.19f);
        k4.A(n, 17.0f, 21.0f, 7.0f, -1.0f);
        uo.r(n, 10.0f, 21.0f, 7.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.b(n, 9.83f, 15.17f, 18.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noCell = build;
        build.getClass();
        return build;
    }
}
