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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RealEstateAgentKt {
    private static ImageVector _realEstateAgent;

    public static final ImageVector getRealEstateAgent(Icons.Outlined outlined) {
        ImageVector imageVector = _realEstateAgent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RealEstateAgent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = uf.c(21.0f, 6.5f, 14.0f, -2.0f, 7.5f);
        c.lineTo(14.0f, 4.0f);
        uf.u(c, 9.0f, 7.5f, 9.0f, 7.0f);
        c.verticalLineTo(6.5f);
        gy.B(c, 7.0f, -5.0f, 21.0f, 6.5f);
        k4.C(c, 15.5f, 7.0f, -1.0f, 1.0f);
        uo.r(c, 1.0f, 7.0f, 13.5f, 7.0f);
        bv.l(c, -1.0f, 1.0f, 1.0f, 7.0f);
        k4.C(c, 15.5f, 9.0f, -1.0f, 1.0f);
        uo.r(c, 1.0f, 9.0f, 13.5f, 9.0f);
        bv.l(c, -1.0f, 1.0f, 1.0f, 9.0f);
        c.moveTo(19.0f, 16.0f);
        c.horizontalLineToRelative(-2.0f);
        c.curveToRelative(0.0f, -1.2f, -0.75f, -2.28f, -1.87f, -2.7f);
        r6.w(c, 8.97f, 11.0f, 1.0f, 11.0f);
        bv.p(c, 6.0f, -1.44f, 7.0f, 1.94f);
        c.lineToRelative(8.0f, -2.5f);
        c.verticalLineToRelative(-1.0f);
        c.curveTo(22.0f, 17.34f, 20.66f, 16.0f, 19.0f, 16.0f);
        uo.C(c, 3.0f, 20.0f, -7.0f, 2.0f);
        kf0.n(c, 7.0f, 3.0f, 13.97f, 20.41f);
        fc.t(c, 7.0f, 18.48f, 13.0f, 1.61f);
        c.lineToRelative(5.82f, 2.17f);
        c.curveTo(14.77f, 15.3f, 15.0f, 15.63f, 15.0f, 16.0f);
        c.curveToRelative(0.0f, 0.0f, -1.99f, -0.05f, -2.3f, -0.15f);
        c.lineToRelative(-2.38f, -0.79f);
        c.lineToRelative(-0.63f, 1.9f);
        c.lineToRelative(2.38f, 0.79f);
        c.curveToRelative(0.51f, 0.17f, 1.04f, 0.26f, 1.58f, 0.26f);
        c.horizontalLineTo(19.0f);
        c.curveToRelative(0.39f, 0.0f, 0.74f, 0.23f, 0.9f, 0.56f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(c, 13.97f, 20.41f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _realEstateAgent = build;
        build.getClass();
        return build;
    }
}
