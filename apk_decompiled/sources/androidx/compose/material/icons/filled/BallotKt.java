package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BallotKt {
    private static ImageVector _ballot;

    public static final ImageVector getBallot(Icons.Filled filled) {
        ImageVector imageVector = _ballot;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Ballot", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int m5057getEvenOddRgk1Os = PathFillType.Companion.m5057getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(13.0f, 9.5f, 5.0f, -2.0f, -5.0f);
        k4.D(n, 9.5f, 13.0f, 16.5f, 5.0f);
        k4.p(n, -2.0f, -5.0f, 16.5f);
        n.moveTo(19.0f, 21.0f);
        n.horizontalLineTo(5.0f);
        n.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        n.verticalLineTo(5.0f);
        n.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        n.horizontalLineToRelative(14.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        n.verticalLineToRelative(14.0f);
        n.curveTo(21.0f, 20.1f, 20.1f, 21.0f, 19.0f, 21.0f);
        af0.r(n, 6.0f, 11.0f, 5.0f, 6.0f);
        bv.s(n, 6.0f, 11.0f, 7.0f, 7.0f);
        gy.t(n, 3.0f, 3.0f, 7.0f, 7.0f);
        k4.C(n, 6.0f, 18.0f, 5.0f, -5.0f);
        bv.s(n, 6.0f, 18.0f, 7.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.s(n, 3.0f, 3.0f, 7.0f, 14.0f), m5057getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ballot = build;
        build.getClass();
        return build;
    }
}
