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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BallotKt {
    private static ImageVector _ballot;

    public static final ImageVector getBallot(Icons.TwoTone twoTone) {
        ImageVector imageVector = _ballot;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Ballot", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(7.0f, 14.0f, 3.0f, 3.0f);
        uo.l(b, 7.0f, 17.0f, 7.0f, 7.0f);
        j50.o(b, 3.0f, 3.0f, 7.0f, 10.0f);
        b.moveTo(5.0f, 19.0f);
        b.horizontalLineToRelative(14.0f);
        b.lineTo(19.0f, 5.0f);
        bv.r(b, 5.0f, 5.0f, 14.0f);
        k4.C(b, 13.0f, 7.5f, 5.0f, 2.0f);
        fc.x(b, -5.0f, -2.0f, 13.0f, 14.5f);
        gy.D(b, 5.0f, 2.0f, -5.0f, -2.0f);
        k4.C(b, 6.0f, 6.0f, 5.0f, 5.0f);
        r6.C(b, 6.0f, 11.0f, 6.0f, 6.0f);
        k4.C(b, 6.0f, 13.0f, 5.0f, 5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(b, 6.0f, 18.0f, -5.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder q = uf.q(13.0f, 7.5f, 5.0f, 2.0f, -5.0f);
        k4.C(q, 13.0f, 14.5f, 5.0f, 2.0f);
        j50.t(q, -5.0f, 19.0f, 3.0f);
        q.lineTo(5.0f, 3.0f);
        q.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        q.verticalLineToRelative(14.0f);
        q.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        q.horizontalLineToRelative(14.0f);
        q.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        q.lineTo(21.0f, 5.0f);
        q.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(q, 19.0f, 19.0f, 5.0f, 19.0f);
        r6.m(q, 5.0f, 5.0f, 14.0f, 14.0f);
        q.moveTo(11.0f, 6.0f);
        af0.m(q, 6.0f, 6.0f, 5.0f, 5.0f);
        uo.l(q, 11.0f, 6.0f, 10.0f, 10.0f);
        q.lineTo(7.0f, 10.0f);
        r6.m(q, 7.0f, 7.0f, 3.0f, 3.0f);
        q.moveTo(11.0f, 13.0f);
        af0.m(q, 6.0f, 13.0f, 5.0f, 5.0f);
        r6.l(q, -5.0f, 10.0f, 17.0f);
        af0.m(q, 7.0f, 17.0f, -3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(q, 3.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ballot = build;
        build.getClass();
        return build;
    }
}
