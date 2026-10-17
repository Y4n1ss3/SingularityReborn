package androidx.compose.material.icons.outlined;

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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DinnerDiningKt {
    private static ImageVector _dinnerDining;

    public static final ImageVector getDinnerDining(Icons.Outlined outlined) {
        ImageVector imageVector = _dinnerDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DinnerDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(2.0f, 19.0f, 2.0f, 2.0f), 16.0f, 0.0f, 2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(3.0f, 18.0f, 16.97f);
        a.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        a.curveToRelative(0.29f, -3.26f, -2.28f, -6.0f, -5.48f, -6.0f);
        a.curveToRelative(-2.35f, 0.0f, -4.35f, 1.48f, -5.14f, 3.55f);
        a.curveTo(8.94f, 15.32f, 8.48f, 15.17f, 8.0f, 15.08f);
        a.verticalLineTo(9.0f);
        a.horizontalLineToRelative(1.75f);
        a.curveTo(10.99f, 9.0f, 12.0f, 7.99f, 12.0f, 6.75f);
        kf0.x(a, 9.0f, -1.5f, -9.0f);
        a.curveTo(12.0f, 4.01f, 10.99f, 3.0f, 9.75f, 3.0f);
        uf.k(a, 3.0f, 1.5f, 1.0f, 0.75f);
        af0.g(a, 3.0f, 1.5f, 1.0f, 7.5f);
        kf0.o(a, 3.0f, 9.0f, 1.0f, 7.39f);
        a.curveTo(3.56f, 16.85f, 3.22f, 17.39f, 3.0f, 18.0f);
        a.close();
        a.moveTo(14.5f, 14.0f);
        a.curveToRelative(0.99f, 0.0f, 1.91f, 0.4f, 2.58f, 1.14f);
        a.curveToRelative(0.24f, 0.26f, 0.44f, 0.55f, 0.58f, 0.86f);
        a.horizontalLineToRelative(-6.32f);
        a.curveTo(11.92f, 14.79f, 13.15f, 14.0f, 14.5f, 14.0f);
        r6.B(a, 8.0f, 4.5f, 2.0f, 0.75f);
        bv.s(a, 8.0f, 4.5f, 8.0f, 6.75f);
        kf0.i(a, 2.0f, 7.5f, 8.0f, 6.75f);
        k4.C(a, 5.5f, 4.5f, 1.0f, 0.75f);
        uo.r(a, -1.0f, 4.5f, 5.5f, 6.75f);
        j50.D(a, 1.0f, 7.5f, -1.0f, 6.75f);
        k4.C(a, 5.5f, 9.0f, 1.0f, 6.06f);
        a.curveToRelative(-0.35f, 0.06f, -0.68f, 0.17f, -1.0f, 0.3f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(a, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dinnerDining = build;
        build.getClass();
        return build;
    }
}
