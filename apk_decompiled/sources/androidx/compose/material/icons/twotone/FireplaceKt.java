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
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FireplaceKt {
    private static ImageVector _fireplace;

    public static final ImageVector getFireplace(Icons.TwoTone twoTone) {
        ImageVector imageVector = _fireplace;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Fireplace", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(4.0f, 20.0f, 2.0f, -2.0f, 2.23f);
        n.curveToRelative(-0.75f, -0.93f, -1.2f, -2.04f, -1.23f, -3.0f);
        n.curveToRelative(-0.02f, -0.53f, -0.73f, -4.43f, 6.0f, -8.0f);
        n.curveToRelative(0.0f, 0.0f, -0.8f, 2.61f, 2.15f, 4.63f);
        n.curveTo(15.91f, 12.15f, 17.0f, 13.11f, 17.0f, 15.0f);
        n.curveToRelative(0.0f, 1.13f, -0.39f, 2.16f, -1.02f, 3.0f);
        af0.g(n, 18.0f, 2.0f, 2.0f, 4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(n, 4.0f, 20.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.01f, 12.46f);
        b.curveToRelative(-0.15f, 0.42f, -0.15f, 0.82f, -0.08f, 1.28f);
        b.curveToRelative(0.1f, 0.55f, 0.33f, 1.04f, 0.2f, 1.6f);
        b.curveToRelative(-0.13f, 0.59f, -0.77f, 1.38f, -1.53f, 1.63f);
        b.curveToRelative(1.28f, 1.05f, 3.2f, 0.37f, 3.39f, -1.32f);
        b.curveTo(14.16f, 14.11f, 12.55f, 13.67f, 12.01f, 12.46f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(2.0f, 2.0f, 20.0f, 20.0f, 2.0f);
        k4.w(w, 2.0f, 12.0f, 18.0f);
        w.curveToRelative(-1.58f, 0.0f, -2.97f, -1.88f, -3.0f, -3.06f);
        w.curveToRelative(0.0f, -0.05f, -0.01f, -0.13f, -0.01f, -0.22f);
        w.curveToRelative(-0.13f, -1.73f, 1.0f, -3.2f, 2.47f, -4.37f);
        w.curveToRelative(0.47f, 1.01f, 1.27f, 2.03f, 2.57f, 2.92f);
        w.curveTo(14.61f, 13.69f, 15.0f, 14.13f, 15.0f, 15.0f);
        w.curveTo(15.0f, 16.65f, 13.65f, 18.0f, 12.0f, 18.0f);
        r6.B(w, 20.0f, 20.0f, -2.0f, -2.0f);
        w.horizontalLineToRelative(-2.02f);
        w.curveToRelative(0.63f, -0.84f, 1.02f, -1.87f, 1.02f, -3.0f);
        w.curveToRelative(0.0f, -1.89f, -1.09f, -2.85f, -1.85f, -3.37f);
        w.curveTo(12.2f, 9.61f, 13.0f, 7.0f, 13.0f, 7.0f);
        w.curveToRelative(-6.73f, 3.57f, -6.02f, 7.47f, -6.0f, 8.0f);
        w.curveToRelative(0.03f, 0.96f, 0.49f, 2.07f, 1.23f, 3.0f);
        uf.B(w, 6.0f, 2.0f, 4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(w, 16.0f, 20.0f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fireplace = build;
        build.getClass();
        return build;
    }
}
