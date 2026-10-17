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
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TvOffKt {
    private static ImageVector _tvOff;

    public static final ImageVector getTvOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _tvOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TvOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(3.0f, 19.0f, 13.46f, -12.0f, -12.0f);
        uo.l(i, 3.0f, 7.0f, 10.12f, 7.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 21.0f, 17.88f, 21.0f, 7.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(21.0f, 7.0f, 10.88f, 1.85f, 1.85f);
        n.curveToRelative(0.09f, -0.23f, 0.15f, -0.47f, 0.15f, -0.73f);
        n.lineTo(23.0f, 7.0f);
        n.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        n.horizontalLineToRelative(-7.58f);
        n.lineToRelative(3.29f, -3.3f);
        n.lineTo(16.0f, 1.0f);
        n.lineToRelative(-4.0f, 4.0f);
        n.lineToRelative(-4.0f, -4.0f);
        n.lineToRelative(-0.7f, 0.7f);
        n.lineTo(10.58f, 5.0f);
        n.lineTo(8.12f, 5.0f);
        gy.B(n, 2.0f, 2.0f, 21.0f, 7.0f);
        n.moveTo(20.46f, 23.0f);
        fc.C(n, 1.26f, -1.27f, -1.26f, 1.26f);
        n.moveTo(2.41f, 2.13f);
        n.lineToRelative(-0.14f, 0.14f);
        n.lineTo(1.0f, 3.54f);
        n.lineToRelative(1.53f, 1.53f);
        n.curveTo(1.65f, 5.28f, 1.0f, 6.06f, 1.0f, 7.0f);
        n.verticalLineToRelative(12.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(15.46f);
        n.lineToRelative(1.99f, 1.99f);
        n.lineToRelative(1.26f, -1.26f);
        gy.B(n, 0.15f, -0.15f, 2.41f, 2.13f);
        n.moveTo(3.0f, 19.0f);
        n.lineTo(3.0f, 7.0f);
        n.horizontalLineToRelative(1.46f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(n, 12.0f, 12.0f, 3.0f, 19.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tvOff = build;
        build.getClass();
        return build;
    }
}
