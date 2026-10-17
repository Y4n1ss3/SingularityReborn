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
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AtmKt {
    private static ImageVector _atm;

    public static final ImageVector getAtm(Icons.TwoTone twoTone) {
        ImageVector imageVector = _atm;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Atm", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(3.5f, 13.5f, 2.0f, 5.5f, 15.0f);
        p.lineTo(7.0f, 15.0f);
        p.verticalLineToRelative(-5.0f);
        p.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        p.lineTo(3.0f, 9.0f);
        p.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        r6.p(p, 5.0f, 1.5f, -1.5f);
        p.moveTo(3.5f, 10.5f);
        uo.n(p, 2.0f, 5.5f, 12.0f, -2.0f);
        bv.m(p, -1.5f, 17.0f, 10.5f, 1.0f);
        fc.w(p, 18.0f, 14.0f, 1.5f, -3.51f);
        p.horizontalLineToRelative(1.0f);
        p.lineTo(20.5f, 15.0f);
        p.lineTo(22.0f, 15.0f);
        p.verticalLineToRelative(-5.0f);
        p.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        p.horizontalLineToRelative(-4.5f);
        p.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        bv.n(p, 5.0f, 17.0f, 15.0f, -4.5f);
        k4.C(p, 10.25f, 15.0f, 1.5f, -4.5f);
        p.lineTo(14.0f, 10.5f);
        p.lineTo(14.0f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.w(p, 8.0f, 9.0f, 1.5f, 2.25f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _atm = build;
        build.getClass();
        return build;
    }
}
