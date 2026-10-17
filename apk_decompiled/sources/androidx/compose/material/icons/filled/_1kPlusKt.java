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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class _1kPlusKt {
    private static ImageVector __1kPlus;

    public static final ImageVector get_1kPlus(Icons.Filled filled) {
        ImageVector imageVector = __1kPlus;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled._1kPlus", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 3.0f, 5.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 9.0f, 15.0f, 7.5f, 15.0f);
        i.verticalLineToRelative(-4.5f);
        i.lineTo(6.0f, 10.5f);
        r6.m(i, 6.0f, 9.0f, 3.0f, 6.0f);
        i.moveTo(13.75f, 15.0f);
        i.lineTo(12.0f, 12.75f);
        i.lineTo(12.0f, 15.0f);
        i.horizontalLineToRelative(-1.5f);
        i.lineTo(10.5f, 9.0f);
        i.lineTo(12.0f, 9.0f);
        uo.k(i, 2.25f, 13.75f, 9.0f, 1.75f);
        i.lineToRelative(-2.25f, 3.0f);
        uf.r(i, 2.25f, 3.0f, -1.75f);
        i.moveTo(19.5f, 12.5f);
        i.lineTo(18.0f, 12.5f);
        fc.w(i, 18.0f, 14.0f, -1.0f, -1.5f);
        bv.C(i, -1.5f, -1.0f, 17.0f, 11.5f);
        fc.w(i, 17.0f, 10.0f, 1.0f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(i, 1.5f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __1kPlus = build;
        build.getClass();
        return build;
    }
}
