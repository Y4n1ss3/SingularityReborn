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
import defpackage.bv;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SimCardKt {
    private static ImageVector _simCard;

    public static final ImageVector getSimCard(Icons.Outlined outlined) {
        ImageVector imageVector = _simCard;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SimCard", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(18.0f, 2.0f, -8.0f, 4.0f, 8.0f);
        p.verticalLineToRelative(12.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(12.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.lineTo(20.0f, 4.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        bv.v(p, 18.0f, 4.0f, 16.0f);
        p.lineTo(6.0f, 20.0f);
        p.lineTo(6.0f, 8.83f);
        r6.C(p, 10.83f, 4.0f, 18.0f, 4.0f);
        k4.C(p, 7.0f, 17.0f, 2.0f, 2.0f);
        uo.l(p, 7.0f, 19.0f, 15.0f, 17.0f);
        j50.n(p, 2.0f, 2.0f, -2.0f);
        k4.C(p, 7.0f, 11.0f, 2.0f, 4.0f);
        uo.l(p, 7.0f, 15.0f, 11.0f, 15.0f);
        j50.n(p, 2.0f, 4.0f, -2.0f);
        k4.C(p, 11.0f, 11.0f, 2.0f, 2.0f);
        kp0.A(p, -2.0f, 15.0f, 11.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.s(p, 4.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _simCard = build;
        build.getClass();
        return build;
    }
}
