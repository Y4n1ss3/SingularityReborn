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
import defpackage.j50;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KitchenKt {
    private static ImageVector _kitchen;

    public static final ImageVector getKitchen(Icons.TwoTone twoTone) {
        ImageVector imageVector = _kitchen;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Kitchen", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(8.0f, 5.0f, 2.0f, 3.0f);
        uo.l(b, 8.0f, 8.0f, 8.0f, 12.0f);
        j50.o(b, 2.0f, 5.0f, 8.0f, 17.0f);
        k4.C(b, 6.0f, 20.0f, 12.0f, -9.02f);
        r6.C(b, 6.0f, 10.98f, 6.0f, 20.0f);
        k4.C(b, 8.0f, 12.0f, 2.0f, 5.0f);
        bv.r(b, 8.0f, 17.0f, -5.0f);
        b.moveTo(6.0f, 9.0f);
        b.horizontalLineToRelative(12.0f);
        b.lineTo(18.0f, 4.0f);
        bv.r(b, 6.0f, 4.0f, 5.0f);
        k4.C(b, 8.0f, 5.0f, 2.0f, 3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 8.0f, 8.0f, 8.0f, 5.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.0f, 2.01f, 6.0f, 2.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        i.verticalLineToRelative(16.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(12.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(20.0f, 4.0f);
        i.curveToRelative(0.0f, -1.11f, -0.9f, -1.99f, -2.0f, -1.99f);
        k4.r(i, 18.0f, 20.0f, 6.0f, 20.0f);
        uo.D(i, -9.02f, 12.0f, 18.0f, 20.0f);
        i.moveTo(18.0f, 9.0f);
        i.lineTo(6.0f, 9.0f);
        r6.m(i, 6.0f, 4.0f, 12.0f, 5.0f);
        k4.C(i, 8.0f, 5.0f, 2.0f, 3.0f);
        uo.l(i, 8.0f, 8.0f, 8.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.h(i, 2.0f, 5.0f, 8.0f, 17.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _kitchen = build;
        build.getClass();
        return build;
    }
}
