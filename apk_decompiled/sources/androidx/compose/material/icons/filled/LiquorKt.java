package androidx.compose.material.icons.filled;

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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LiquorKt {
    private static ImageVector _liquor;

    public static final ImageVector getLiquor(Icons.Filled filled) {
        ImageVector imageVector = _liquor;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Liquor", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.0f, 14.0f);
        b.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        bv.A(b, 20.0f, 3.0f, 2.0f, 6.0f);
        r6.s(b, -2.0f, 7.0f, -3.18f);
        b.curveTo(8.16f, 16.4f, 9.0f, 15.3f, 9.0f, 14.0f);
        k4.t(b, 6.0f, 3.0f, 14.0f);
        k4.C(b, 5.0f, 8.0f, 2.0f, 3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(b, 5.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.63f, 8.54f, -0.95f, -0.32f);
        e.curveTo(19.28f, 8.09f, 19.0f, 7.71f, 19.0f, 7.28f);
        e.verticalLineTo(3.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineToRelative(-3.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(4.28f);
        e.curveToRelative(0.0f, 0.43f, -0.28f, 0.81f, -0.68f, 0.95f);
        e.lineToRelative(-0.95f, 0.32f);
        e.curveTo(11.55f, 8.82f, 11.0f, 9.58f, 11.0f, 10.44f);
        e.verticalLineTo(20.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(7.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineToRelative(-9.56f);
        e.curveTo(22.0f, 9.58f, 21.45f, 8.82f, 20.63f, 8.54f);
        r6.B(e, 16.0f, 4.0f, 1.0f, 1.0f);
        uo.r(e, -1.0f, 4.0f, 13.0f, 10.44f);
        e.lineToRelative(0.95f, -0.32f);
        e.curveTo(15.18f, 9.72f, 16.0f, 8.57f, 16.0f, 7.28f);
        kf0.r(e, 7.0f, 1.0f, 0.28f);
        e.curveToRelative(0.0f, 1.29f, 0.82f, 2.44f, 2.05f, 2.85f);
        fc.t(e, 20.0f, 10.44f, 12.0f, -7.0f);
        k4.D(e, 10.44f, 20.0f, 20.0f, -7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(e, -2.0f, 7.0f, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _liquor = build;
        build.getClass();
        return build;
    }
}
