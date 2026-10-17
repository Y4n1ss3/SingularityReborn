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
import defpackage.gy;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoFoodKt {
    private static ImageVector _noFood;

    public static final ImageVector getNoFood(Icons.TwoTone twoTone) {
        ImageVector imageVector = _noFood;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NoFood", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.16f, 11.0f);
        b.curveToRelative(-1.43f, 0.07f, -3.52f, 0.57f, -4.54f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(b, 6.55f, 8.16f, 11.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = bv.b(1.0f, 21.0f, 15.01f, 0.98f);
        b2.curveToRelative(0.0f, 0.56f, -0.45f, 1.01f, -1.01f, 1.01f);
        b2.horizontalLineTo(2.01f);
        b2.curveTo(1.45f, 22.99f, 1.0f, 22.54f, 1.0f, 21.98f);
        bv.t(b2, 21.0f, 20.49f, 23.31f);
        uf.u(b2, 16.0f, 18.83f, 19.0f, 1.0f);
        gy.C(b2, -2.0f, 13.17f, -2.0f, -2.0f);
        b2.horizontalLineTo(1.0f);
        b2.curveToRelative(0.0f, -3.24f, 2.46f, -5.17f, 5.38f, -5.79f);
        b2.lineToRelative(-5.7f, -5.7f);
        b2.lineTo(2.1f, 2.1f);
        b2.lineTo(13.0f, 13.0f);
        b2.lineToRelative(2.0f, 2.0f);
        gy.B(b2, 6.9f, 6.9f, 20.49f, 23.31f);
        b2.moveTo(10.17f, 13.0f);
        b2.lineToRelative(-2.0f, -2.0f);
        b2.curveToRelative(-1.42f, 0.06f, -3.52f, 0.56f, -4.55f, 2.0f);
        kp0.r(b2, 10.17f, 23.0f, 5.0f, -5.0f);
        uf.p(b2, 1.0f, -2.0f, 4.0f, -5.0f);
        b2.lineToRelative(0.23f, 2.0f);
        b2.horizontalLineToRelative(9.56f);
        b2.lineToRelative(-1.0f, 9.97f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b2, 1.83f, 1.83f, 23.0f, 5.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFood = build;
        build.getClass();
        return build;
    }
}
