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
import defpackage.af0;
import defpackage.fc;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DialerSipKt {
    private static ImageVector _dialerSip;

    public static final ImageVector getDialerSip(Icons.Sharp sharp) {
        ImageVector imageVector = _dialerSip;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DialerSip", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = uf.q(16.0f, 3.0f, 1.0f, 5.0f, -1.0f);
        q.moveTo(15.0f, 5.0f);
        uo.n(q, -2.0f, 13.0f, 4.0f, 2.0f);
        fc.w(q, 15.0f, 3.0f, -3.0f, 3.0f);
        af0.v(q, 2.0f, 1.0f, -2.0f, 1.0f);
        q.horizontalLineToRelative(3.0f);
        q.close();
        q.moveTo(18.0f, 3.0f);
        q.verticalLineToRelative(5.0f);
        uo.n(q, 1.0f, 19.0f, 6.0f, 2.0f);
        uf.j(q, 21.0f, 3.0f, -3.0f);
        q.moveTo(20.0f, 5.0f);
        uo.n(q, -1.0f, 19.0f, 4.0f, 1.0f);
        r6.l(q, 1.0f, 21.0f, 15.46f);
        q.lineToRelative(-5.27f, -0.61f);
        q.lineToRelative(-2.52f, 2.52f);
        q.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        q.lineToRelative(2.53f, -2.53f);
        q.lineTo(8.54f, 3.0f);
        q.lineTo(3.03f, 3.0f);
        q.curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21.0f, 20.97f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(q, -5.51f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dialerSip = build;
        build.getClass();
        return build;
    }
}
