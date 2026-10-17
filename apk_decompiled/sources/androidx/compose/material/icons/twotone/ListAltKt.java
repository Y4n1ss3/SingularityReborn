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
import defpackage.er;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ListAltKt {
    private static ImageVector _listAlt;

    public static final ImageVector getListAlt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _listAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ListAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(5.0f, 19.0f, 14.0f, 19.0f, 5.0f);
        bv.r(p, 5.0f, 5.0f, 14.0f);
        k4.C(p, 11.0f, 7.0f, 6.0f, 2.0f);
        gy.n(p, -6.0f, 11.0f, 7.0f);
        k4.C(p, 11.0f, 11.0f, 6.0f, 2.0f);
        fc.x(p, -6.0f, -2.0f, 11.0f, 15.0f);
        gy.D(p, 6.0f, 2.0f, -6.0f, -2.0f);
        k4.C(p, 7.0f, 7.0f, 2.0f, 2.0f);
        r6.C(p, 7.0f, 9.0f, 7.0f, 7.0f);
        k4.C(p, 7.0f, 11.0f, 2.0f, 2.0f);
        bv.r(p, 7.0f, 13.0f, -2.0f);
        k4.C(p, 7.0f, 15.0f, 2.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(p, 7.0f, 17.0f, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder q = uf.q(11.0f, 7.0f, 6.0f, 2.0f, -6.0f);
        k4.C(q, 11.0f, 11.0f, 6.0f, 2.0f);
        kp0.A(q, -6.0f, 11.0f, 15.0f, 6.0f);
        kf0.C(q, 2.0f, -6.0f, 7.0f, 7.0f);
        j50.o(q, 2.0f, 2.0f, 7.0f, 9.0f);
        k4.C(q, 7.0f, 11.0f, 2.0f, 2.0f);
        uo.l(q, 7.0f, 13.0f, 7.0f, 15.0f);
        j50.o(q, 2.0f, 2.0f, 7.0f, 17.0f);
        q.moveTo(20.1f, 3.0f);
        q.lineTo(3.9f, 3.0f);
        q.curveToRelative(-0.5f, 0.0f, -0.9f, 0.4f, -0.9f, 0.9f);
        q.verticalLineToRelative(16.2f);
        q.curveToRelative(0.0f, 0.4f, 0.4f, 0.9f, 0.9f, 0.9f);
        q.horizontalLineToRelative(16.2f);
        q.curveToRelative(0.4f, 0.0f, 0.9f, -0.5f, 0.9f, -0.9f);
        q.lineTo(21.0f, 3.9f);
        q.curveToRelative(0.0f, -0.5f, -0.5f, -0.9f, -0.9f, -0.9f);
        k4.r(q, 19.0f, 19.0f, 5.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(q, 5.0f, 5.0f, 14.0f, 14.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _listAlt = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getListAlt$annotations(Icons.TwoTone twoTone) {
    }
}
