package androidx.compose.material.icons.sharp;

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

    public static final ImageVector getDinnerDining(Icons.Sharp sharp) {
        ImageVector imageVector = _dinnerDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DinnerDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        PathBuilder e = k4.e(3.0f, 18.0f, 16.97f, 0.0f);
        e.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        e.curveToRelative(0.29f, -3.26f, -2.28f, -6.0f, -5.48f, -6.0f);
        e.curveToRelative(-2.35f, 0.0f, -4.35f, 1.48f, -5.14f, 3.55f);
        e.curveTo(8.94f, 15.32f, 8.48f, 15.17f, 8.0f, 15.08f);
        gy.z(e, 9.0f, 4.0f, 6.75f, 9.0f);
        bv.B(e, -1.5f, -9.0f, 3.0f, 3.0f);
        uf.s(e, 1.5f, 1.0f, 0.75f, 3.0f);
        bv.B(e, 1.5f, 1.0f, 7.5f, 3.0f);
        kf0.r(e, 9.0f, 1.0f, 7.39f);
        e.curveTo(3.56f, 16.85f, 3.22f, 17.39f, 3.0f, 18.0f);
        fc.A(e, 8.0f, 7.5f, 6.75f, 2.0f);
        bv.z(e, 7.5f, 8.0f, 10.0f, 5.25f);
        uo.o(e, 8.0f, 4.5f, 2.0f, 5.25f);
        k4.C(e, 5.5f, 4.5f, 1.0f, 0.75f);
        uo.r(e, -1.0f, 4.5f, 5.5f, 6.75f);
        j50.D(e, 1.0f, 7.5f, -1.0f, 6.75f);
        e.moveTo(6.5f, 9.0f);
        e.verticalLineToRelative(6.06f);
        e.curveToRelative(-0.35f, 0.06f, -0.68f, 0.17f, -1.0f, 0.3f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(e, 9.0f, 6.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dinnerDining = build;
        build.getClass();
        return build;
    }
}
