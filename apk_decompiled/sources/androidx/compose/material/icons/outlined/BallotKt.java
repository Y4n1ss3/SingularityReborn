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
import defpackage.af0;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BallotKt {
    private static ImageVector _ballot;

    public static final ImageVector getBallot(Icons.Outlined outlined) {
        ImageVector imageVector = _ballot;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Ballot", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
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
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(q, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ballot = build;
        build.getClass();
        return build;
    }
}
