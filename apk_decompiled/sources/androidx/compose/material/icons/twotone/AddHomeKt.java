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
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddHomeKt {
    private static ImageVector _addHome;

    public static final ImageVector getAddHome(Icons.TwoTone twoTone) {
        ImageVector imageVector = _addHome;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AddHome", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(12.0f, 5.5f, 6.0f, 10.0f, 9.0f);
        s.horizontalLineToRelative(5.08f);
        s.curveToRelative(-0.62f, -4.3f, 2.72f, -8.0f, 6.92f, -8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(s, -1.0f, 12.0f, 5.5f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = kp0.n(6.0f, 19.0f, -9.0f, 6.0f, -4.5f);
        n.lineToRelative(6.0f, 4.5f);
        n.verticalLineToRelative(1.0f);
        n.curveToRelative(0.7f, 0.0f, 1.37f, 0.1f, 2.0f, 0.29f);
        n.verticalLineTo(9.0f);
        n.lineToRelative(-8.0f, -6.0f);
        af0.m(n, 4.0f, 9.0f, 12.0f, 7.68f);
        n.curveToRelative(-0.3f, -0.62f, -0.5f, -1.29f, -0.6f, -2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(n, 6.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 13.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b.reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f);
        af0.r(b, 21.0f, 18.5f, -2.5f, 21.0f);
        af0.z(b, -1.0f, -2.5f, 15.0f, -1.0f);
        af0.q(b, 2.5f, 15.0f, 1.0f, 2.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(b, 21.0f, 18.5f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addHome = build;
        build.getClass();
        return build;
    }
}
