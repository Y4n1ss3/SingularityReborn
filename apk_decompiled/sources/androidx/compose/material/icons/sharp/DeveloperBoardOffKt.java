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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DeveloperBoardOffKt {
    private static ImageVector _developerBoardOff;

    public static final ImageVector getDeveloperBoardOff(Icons.Sharp sharp) {
        ImageVector imageVector = _developerBoardOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DeveloperBoardOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(7.83f, 5.0f, 18.0f, 10.17f);
        r6.w(q, 19.83f, 17.0f, 22.0f, -2.0f);
        af0.v(q, -2.0f, -2.0f, 2.0f, -2.0f);
        af0.n(q, -2.0f, 9.0f, 2.0f, 7.0f);
        uo.f(q, -2.0f, 3.0f, 5.83f);
        uo.l(q, 7.83f, 5.0f, 12.0f, 9.17f);
        uf.p(q, 7.0f, 4.0f, 3.0f, -3.17f);
        uo.l(q, 12.0f, 9.17f, 9.83f, 7.0f);
        q.horizontalLineTo(11.0f);
        q.verticalLineToRelative(1.17f);
        q.lineTo(9.83f, 7.0f);
        q.close();
        k4.A(q, 13.83f, 11.0f, 16.0f, 2.17f);
        uo.l(q, 13.83f, 11.0f, 18.17f, 21.0f);
        q.lineToRelative(2.31f, 2.31f);
        q.lineToRelative(1.41f, -1.41f);
        q.lineTo(2.1f, 2.1f);
        q.lineTo(0.69f, 3.51f);
        j50.z(q, 2.0f, 4.83f, 21.0f, 18.17f);
        q.moveTo(4.0f, 19.0f);
        q.verticalLineTo(6.83f);
        q.lineToRelative(2.0f, 2.0f);
        q.verticalLineTo(12.0f);
        r6.t(q, 3.17f, 1.0f, 1.0f, 6.0f);
        kf0.z(q, 4.0f, 5.0f, -3.17f);
        fc.u(q, 1.0f, 1.0f, 17.0f, 2.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(q, 2.0f, 2.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _developerBoardOff = build;
        build.getClass();
        return build;
    }
}
