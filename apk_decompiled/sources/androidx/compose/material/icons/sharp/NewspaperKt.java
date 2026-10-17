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
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NewspaperKt {
    private static ImageVector _newspaper;

    public static final ImageVector getNewspaper(Icons.Sharp sharp) {
        ImageVector imageVector = _newspaper;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Newspaper", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.0f, 3.0f, -1.67f, 1.67f);
        e.lineTo(18.67f, 3.0f);
        e.lineTo(17.0f, 4.67f);
        e.lineTo(15.33f, 3.0f);
        e.lineToRelative(-1.66f, 1.67f);
        e.lineTo(12.0f, 3.0f);
        e.lineToRelative(-1.67f, 1.67f);
        e.lineTo(8.67f, 3.0f);
        e.lineTo(7.0f, 4.67f);
        e.lineTo(5.33f, 3.0f);
        e.lineTo(3.67f, 4.67f);
        e.lineTo(2.0f, 3.0f);
        e.verticalLineToRelative(18.0f);
        e.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        uf.x(e, 20.0f, 0.0f, 3.0f);
        k4.A(e, 11.0f, 19.0f, 4.0f, -6.0f);
        uo.r(e, 7.0f, 19.0f, 20.0f, 19.0f);
        bv.l(e, -7.0f, -2.0f, 7.0f, 19.0f);
        k4.C(e, 20.0f, 15.0f, -7.0f, -2.0f);
        uo.r(e, 7.0f, 15.0f, 20.0f, 11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.o(e, 4.0f, 8.0f, 16.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _newspaper = build;
        build.getClass();
        return build;
    }
}
