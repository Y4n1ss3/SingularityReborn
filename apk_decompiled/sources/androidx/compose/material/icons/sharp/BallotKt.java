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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BallotKt {
    private static ImageVector _ballot;

    public static final ImageVector getBallot(Icons.Sharp sharp) {
        ImageVector imageVector = _ballot;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Ballot", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(13.0f, 9.5f, 5.0f, -2.0f, -5.0f);
        bv.m(n, 2.0f, 13.0f, 16.5f, 5.0f);
        r6.p(n, -2.0f, -5.0f, 2.0f);
        n.moveTo(21.0f, 21.0f);
        n.lineTo(3.0f, 21.0f);
        r6.m(n, 3.0f, 3.0f, 18.0f, 18.0f);
        n.moveTo(6.0f, 11.0f);
        n.horizontalLineToRelative(5.0f);
        n.lineTo(11.0f, 6.0f);
        bv.r(n, 6.0f, 6.0f, 5.0f);
        k4.C(n, 7.0f, 7.0f, 3.0f, 3.0f);
        r6.C(n, 7.0f, 10.0f, 7.0f, 7.0f);
        k4.C(n, 6.0f, 18.0f, 5.0f, -5.0f);
        bv.r(n, 6.0f, 13.0f, 5.0f);
        k4.C(n, 7.0f, 14.0f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(n, 7.0f, 17.0f, -3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ballot = build;
        build.getClass();
        return build;
    }
}
