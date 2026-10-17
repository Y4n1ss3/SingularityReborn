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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ReceiptKt {
    private static ImageVector _receipt;

    public static final ImageVector getReceipt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _receipt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Receipt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(5.0f, 19.09f, 14.0f, 19.0f, 4.91f);
        bv.r(p, 5.0f, 4.91f, 14.18f);
        k4.C(p, 6.0f, 7.0f, 12.0f, 2.0f);
        r6.C(p, 6.0f, 9.0f, 6.0f, 7.0f);
        k4.C(p, 6.0f, 11.0f, 12.0f, 2.0f);
        bv.r(p, 6.0f, 13.0f, -2.0f);
        k4.C(p, 6.0f, 15.0f, 12.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(p, 6.0f, 17.0f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.5f, 3.5f, 18.0f, 2.0f);
        i.lineToRelative(-1.5f, 1.5f);
        i.lineTo(15.0f, 2.0f);
        i.lineToRelative(-1.5f, 1.5f);
        i.lineTo(12.0f, 2.0f);
        i.lineToRelative(-1.5f, 1.5f);
        i.lineTo(9.0f, 2.0f);
        i.lineTo(7.5f, 3.5f);
        i.lineTo(6.0f, 2.0f);
        i.lineTo(4.5f, 3.5f);
        i.lineTo(3.0f, 2.0f);
        i.verticalLineToRelative(20.0f);
        i.lineToRelative(1.5f, -1.5f);
        i.lineTo(6.0f, 22.0f);
        i.lineToRelative(1.5f, -1.5f);
        i.lineTo(9.0f, 22.0f);
        i.lineToRelative(1.5f, -1.5f);
        i.lineTo(12.0f, 22.0f);
        i.lineToRelative(1.5f, -1.5f);
        i.lineTo(15.0f, 22.0f);
        i.lineToRelative(1.5f, -1.5f);
        i.lineTo(18.0f, 22.0f);
        i.lineToRelative(1.5f, -1.5f);
        i.lineTo(21.0f, 22.0f);
        bv.o(i, 21.0f, 2.0f, -1.5f, 1.5f);
        i.moveTo(19.0f, 19.09f);
        i.lineTo(5.0f, 19.09f);
        r6.m(i, 5.0f, 4.91f, 14.0f, 14.18f);
        k4.C(i, 6.0f, 15.0f, 12.0f, 2.0f);
        uo.l(i, 6.0f, 17.0f, 6.0f, 11.0f);
        j50.o(i, 12.0f, 2.0f, 6.0f, 13.0f);
        k4.C(i, 6.0f, 7.0f, 12.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 6.0f, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _receipt = build;
        build.getClass();
        return build;
    }
}
