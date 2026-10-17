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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClosedCaptionDisabledKt {
    private static ImageVector _closedCaptionDisabled;

    public static final ImageVector getClosedCaptionDisabled(Icons.Sharp sharp) {
        ImageVector imageVector = _closedCaptionDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ClosedCaptionDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(6.83f, 4.0f, 21.0f, 14.17f);
        r6.w(q, 17.83f, 15.0f, 18.0f, -2.0f);
        kf0.x(q, -1.5f, 0.5f, -0.17f);
        fc.u(q, -1.83f, -1.83f, 10.5f, 2.0f);
        uo.m(q, 11.0f, 18.0f, 9.0f, -5.0f);
        kf0.t(q, 1.17f, 6.83f, 4.0f);
        q.moveTo(19.78f, 22.61f);
        fc.v(q, 17.17f, 20.0f, 3.0f, 5.83f);
        q.lineTo(1.39f, 4.22f);
        q.lineToRelative(1.41f, -1.41f);
        gy.B(q, 18.38f, 18.38f, 19.78f, 22.61f);
        q.moveTo(11.0f, 13.83f);
        r6.w(q, 10.17f, 13.0f, 9.5f, 0.5f);
        kf0.x(q, -2.0f, -3.0f, 0.17f);
        r6.w(q, 6.17f, 9.0f, 6.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(q, 5.0f, 13.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _closedCaptionDisabled = build;
        build.getClass();
        return build;
    }
}
